package com.passcop.source.util;

import com.fitbank.common.FileHelper;
import com.fitbank.common.properties.PropertiesHandler;
import com.fitbank.dto.GeneralResponse;
import com.fitbank.dto.management.Detail;
import com.fitbank.dto.management.Record;
import com.fitbank.dto.management.Table;
import com.fitbank.util.Clonador;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import org.apache.commons.configuration.Configuration;

/**
 * Clase que permite envio de mensajes a UCI mediante sockets
 * 
 * @author Fit-Bank
 */
public class UCIClient {

	/**
	 * Metodo que permite cerrar los puertos abiertos.
	 */
	private static void close(Socket client, InputStream in, OutputStream out) {
		if (out != null) {
			try {
				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if (in != null) {
			try {
				in.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		if (client != null) {
			try {
				client.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static Detail send(Detail message) {
		Configuration conf = PropertiesHandler.getConfig("uciclient");
		String host = conf.getString("uci.host");
		Integer port = conf.getInt("uci.port");
		Integer timeout = conf.getInt("uci.timeout");

		return (Detail) UCIClient.send(message, host, port, timeout);
	}

	/**
	 * Metodo que permite enviar mensajes a UCI, dado un host:puerto.
	 * 
	 * @param message Mensaje de entrada
	 * @param host    Host de destino
	 * @param port    Puerto del host de destino
	 * @param timeout Tiempo maximo de espera
	 * @return Mensaje de respuesta en formato Detail
	 */
	public static Object send(Object message, String host, Integer port, Integer timeout) {
		Socket client = null;
		InputStream in = null;
		OutputStream out = null;
		Object response;

		try {
			client = new Socket(host, port);
			client.setSoTimeout(timeout * 1000);
			in = client.getInputStream();
			out = client.getOutputStream();
			ObjectOutputStream oout = new ObjectOutputStream(out);

			oout.writeObject(message);
			oout.flush();

			ObjectInputStream oin = new ObjectInputStream(in);
			response = oin.readObject();
		} catch (ConnectException e) {
			response = "NO HAY CONECCION CON UCI: " + e.getMessage();
		} catch (SocketTimeoutException e) {
			response = "TIMEOUT DE CONECCION CON UCI: " + e.getMessage();
		} catch (IOException e) {
			response = "ERROR DE INPUT / OUTPUT: " + e.getMessage();
		} catch (ClassNotFoundException e) {
			response = "ERROR DE CLASSLOADER: " + e.getMessage();
		} finally {
			close(client, in, out);
		}

		return response;
	}

	/**
	 * Metodo que permite enviar mensajes a UCI, dado un host:puerto.
	 * 
	 * @param message Mensaje a enviar en formato Detail
	 * @return Respuesta en formato Detail
	 */
	public static Detail sendBytes(Detail message) {
		Configuration conf = PropertiesHandler.getConfig("uciclient");
		String host = conf.getString("uci.host");
		Integer port = conf.getInt("uci.port");
		Integer timeout = conf.getInt("uci.timeout");

		Socket socket = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		String response;
		Detail detailOut = Clonador.clonar(message);

		try {
			InetAddress address = InetAddress.getByName(host);
			SocketAddress socketAddress = new InetSocketAddress(address, port);
			socket = new Socket();
			socket.connect(socketAddress, timeout);
			socket.setSoTimeout(timeout * 1000);

			// Obtener el stream de entrada y salida
			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());

			// Obtener el mensaje en bytes
			byte[] messageBytes = UCIClient.getMessageBytes(message.toXml(), true);

			// Enviar el mensaje
			out.write(messageBytes);

			// Recibir la respuesta
			short l = in.readShort();
			byte[] responseBytes = new byte[l];
			in.read(responseBytes);

			// Transformar la respuesta, asumiendo UTF-8
			response = new String(responseBytes, "ISO-8859-1");

			// Transformar la respuesta String a Detail
			detailOut = Detail.valueOf(response.trim());
		} catch (ConnectException e) {
			response = "NO HAY CONECCION CON UCI: " + e.getMessage();
			GeneralResponse gr = new GeneralResponse("001", response);
			detailOut.setResponse(gr);
		} catch (SocketTimeoutException e) {
			response = "TIMEOUT DE CONECCION CON UCI: " + e.getMessage();
			GeneralResponse gr = new GeneralResponse("002", response);
			detailOut.setResponse(gr);
		} catch (Exception e) {
			response = "ERROR GENERAL: " + e.getMessage();
			GeneralResponse gr = new GeneralResponse("003", response);
			detailOut.setResponse(gr);
		} finally {
			close(socket, in, out);
		}

		return detailOut;
	}

	/**
	 * Obtener un arreglo de bytes de representa el mensaje (includa la cabecera)
	 *
	 * @param message         Mensaje JSON
	 * @param addHeaderLength Enviar o no, los 2 bytes del tamaño de la cabecera
	 * @return byte[] representando el Mensaje JSON
	 */
	private static byte[] getMessageBytes(String message, boolean addHeaderLength) throws UnsupportedEncodingException {
		// Bytes del mensaje original
		byte[] messageBytes = message.getBytes("UTF-8");

		// Bytes del mensaje final, con 2 bytes extras para la cabecera del mismo
		byte[] completeMessage = new byte[messageBytes.length + 2];

		// El tamaño final del array va a contener o no los 2 bytes de la cabecera?
		int newLength = messageBytes.length + (addHeaderLength ? 2 : 0);

		// Cabecera del mensaje que indica la longitud del mismo en 2 bytes
		byte[] header = new byte[] { (byte) (newLength / 256), (byte) (newLength % 256) };

		// Copiar los arrays al array final del mensaje completo
		System.arraycopy(header, 0, completeMessage, 0, header.length);
		System.arraycopy(messageBytes, 0, completeMessage, 2, messageBytes.length);

		return completeMessage;
	}

	public static void main(String[] args) throws Exception {

		String pDestinoFondos = "OT";
		String pProductFit = "02";
		//String pDestinoFondos1 = "OT";

		String message = FileHelper.readFile("/home/fitbank/FitBank/score/3-lv-tasa.xml");
		Detail inDetail = Detail.valueOf(message);

		Table tpro = inDetail.findTableByName("TPRODUCTOTASAS");
		if (tpro != null) {
			tpro.findCriterionByName("MONTO").setValue(2000);
			tpro.findCriterionByName("CGRUPOPRODUCTO").setValue("02");
			tpro.findCriterionByName("CPRODUCTO").setValue("620");
			tpro.findCriterionByName("FRECUENCIA").setValue("5");
			tpro.findCriterionByName("PLAZO").setValue(540);
			tpro.findCriterionByName("CPERSONA_CLIENTE").setValue(112);
			String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
			Detail outDetail = Detail.valueOf(request);
			if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
				Table tproTasas = outDetail.findTableByName("TPRODUCTOTASAS");
				if (tproTasas.getRecordCount() > 0) {
					
					System.out.println(tproTasas.getRecords().iterator().next().findFieldByNameCreate("TASA").getStringValue());
				}
			}
		}
		System.out.println("Termino");

	}
}
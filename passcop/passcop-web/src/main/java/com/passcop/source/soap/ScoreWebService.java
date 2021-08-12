package com.passcop.source.soap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.jws.WebService;

import org.slf4j.Logger;

import com.fitbank.common.FileHelper;

import com.fitbank.dto.management.Detail;

import com.fitbank.dto.management.Record;
import com.fitbank.dto.management.Table;
import com.passcop.source.dao.VpersonaDao;
import com.passcop.source.request.Persona;
import com.passcop.source.model.Vpersona;
import com.passcop.source.request.Respuesta;
import com.passcop.source.util.Response;
import com.passcop.source.util.UCIClient;

@WebService()
public class ScoreWebService {

	@Inject
	private VpersonaDao personaDao;

	@Inject
	@SuppressWarnings("unused")
	private Logger log;

	
	@WebMethod
	public Persona ConsultarServicioPersona(@WebParam(name = "identificacion") String identificacion,
			@WebParam(name = "UsuarioID") Short usuarioID) {

		try {
			log.info("Iniciando Consulta para la identificacion: " + identificacion);
			List<Vpersona> personas = personaDao.findAllByIdentificacion(identificacion);
			if (personas.size() > 0) {
				Response response = new Response();
				Persona persona = response.consultarPersona(personas);
				log.info("PersonaId: " + personas.get(0).getPersonaid().intValueExact());
				log.info("Consulta exitosa para la identificación: " + identificacion);
				return persona;
			} else {
				log.info("No existen Registros para la identificación: " + identificacion);
				Persona persona = new Persona();
				persona.setTieneError(true);
				persona.setMensaje("D103");
				return persona;
			}
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			//e.printStackTrace();
			Persona persona = new Persona();
			persona.setTieneError(true);
			persona.setMensaje("D411");
			return persona;
		}
	}

/*	@WebMethod
	public List<Persona> consultarPersonaNuevo2(@WebParam(name = "identificacion") String identificacion) {

		System.out.println(personaDao != null ? "Esta instanciado" : "nulo");
		List<Vpersona> personas = personaDao.findAll();
		System.out.println("Numero personas: " + personas.size());

		Response response = new Response();
		List<Persona> persona = response.consultarPersona2(personas);

		return persona;

	}

	@WebMethod
	public String contultaDetail(@WebParam(name = "identificacion") String identificacion) throws Exception {
		String nombre = "";
		// Detail de entrada
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/in.xml");
		Detail inDetail = Detail.valueOf(message);
		Table table = inDetail.findTableByName("TPERSONA");
		if (table != null) {
			table.findCriterionByName("identificacion").setValue(identificacion);
			System.out.println("Seteando el valor del criterio con: " + identificacion);
		}
		System.out.println("Detail IN: " + inDetail.toErrorXml());
		// Detail de salida
		String res = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20090, 30);
		Detail outDetail = Detail.valueOf(res);
		System.out.println("Detail OUT: " + inDetail.toErrorXml());
		Table outTable = outDetail.findTableByName("TPERSONA");
		if (outTable != null) {
			for (Record record : outTable.getRecords()) {
				nombre = record.findFieldByNameCreate("nombrelegal").getStringValue();
			}
		}
		return nombre;
	}
*/
	
	
	@WebMethod
	public String EnviarDatosOperacion(@WebParam(name = "operacion") Respuesta operacion) throws Exception {
		String nombre = "EjecuciónCorrecta";

		return nombre;
	}

}

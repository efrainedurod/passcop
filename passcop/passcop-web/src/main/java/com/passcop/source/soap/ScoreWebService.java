package com.passcop.source.soap;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;

import javax.jws.WebService;

import org.slf4j.Logger;

import com.fitbank.dto.management.Detail;
import com.fitbank.dto.management.Table;
import com.passcop.source.dao.VpersonaDao;
import com.passcop.source.request.Persona;
import com.passcop.source.model.Vpersona;
import com.passcop.source.request.Respuesta;
import com.passcop.source.request.RespuestaSolicitud;
import com.passcop.source.util.DetailProcessor;
import com.passcop.source.util.HelperResponse;

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
				HelperResponse response = new HelperResponse();
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
			// e.printStackTrace();
			Persona persona = new Persona();
			persona.setTieneError(true);
			persona.setMensaje("D411");
			return persona;
		}
	}

	@WebMethod
	public RespuestaSolicitud EnviarDatosOperacion(@WebParam(name = "operacion") Respuesta operacion) {
		try {
			log.info("INICIO - CREACIÓN DE SOLICITUD PARA LA PESONA: " + operacion.getIdentificacion());
			HelperResponse helper = new HelperResponse();
			// 1) Verifica Si el producto existe en el mapeo
			String[] productFit = helper.getProduct(operacion.getProductoID());
			if (productFit == null) {
				return helper.getResponseNotFoundProduct();
			}
			log.info("CGRUPOPRODUCTO: " + productFit[0] + ", CPRODUCTO: " + productFit[1]);
			
			// 2) Verifica el valor del Destino de Fondos
			DetailProcessor detailProcessor = new DetailProcessor();
			RespuestaSolicitud destinoFodos = detailProcessor.getDestinoFondos(productFit,
					operacion.getDestinoEconomicoCOD());
			if (destinoFodos.isTieneError() == true) {
				return destinoFodos;
			}
			log.info("CDESTINOFONDOS: " + destinoFodos.getMensaje());
			
			// 3) Consulta la clacificación contable
			RespuestaSolicitud clasificacionCon = detailProcessor.getClasificacionContable(productFit, destinoFodos.getMensaje());
			if (clasificacionCon.isTieneError() == true) {
				return destinoFodos;
			}
			log.info("CCLASIFICACIONCONTABLE: " + clasificacionCon.getMensaje());
			
			// 4) Consulta la tproductoCuotas contable
			Short numeroCuotas = operacion.getPlazo();
			Integer plazo = (operacion.getPlazo() != 0) ? new Short(operacion.getPlazo()).intValue() * 30 : 0;
			Table tproductoCuotas = detailProcessor.getTproductoCuotas(productFit, destinoFodos.getMensaje(),
					clasificacionCon.getMensaje(), operacion, numeroCuotas, plazo);
			if (tproductoCuotas == null) {
				RespuestaSolicitud resSol = new RespuestaSolicitud();
				resSol.setTieneError(true);
				resSol.setRespuestaCOD("D503");
				resSol.setMensaje("No existe una tasa registrada para los parametros de la solicitud");
				resSol.setMensajePersonalizado("Error de validacion de entidades de la base de datos");
				resSol.setMensajeTecnico("No existe una tasa registrada para los parametros de la solicitud");
				return resSol;
			}
			log.info("TASA:"
					+ tproductoCuotas.getRecords().iterator().next().findFieldByNameCreate("TASA").getStringValue());
			
			// 5) Envía las transacción 062100 al CORE
			Detail outDetail = detailProcessor.solicitudProcess(operacion, productFit, destinoFodos.getMensaje(),
					clasificacionCon.getMensaje(), tproductoCuotas, numeroCuotas, plazo);
			
			RespuestaSolicitud resSol = new RespuestaSolicitud();
			if (outDetail.getResponse().getCode().trim().equals("0")) {
				resSol.setTieneError(false);
				resSol.setRespuestaCOD("D205");
				resSol.setMensaje("Proceso Exitoso");
				resSol.setMensajePersonalizado("Proceso Exitoso");
				resSol.setMensajeTecnico("Proceso Exitoso");
				log.info("CSOLICITUD:" + outDetail.findTableByName("TSOLICITUD").getRecords().iterator().next()
						.findFieldByNameCreate("CSOLICITUD").getStringValue());
			} else {
				resSol.setTieneError(false);
				resSol.setRespuestaCOD("D411");
				resSol.setMensaje(outDetail.getResponse().getUserMessage().toUpperCase());
				resSol.setMensajePersonalizado("Error de validacion de entidades de la base de datos");
				resSol.setMensajeTecnico(outDetail.getResponse().getTechnicalMessage());

				log.info("CSOLICITUD:" + outDetail.findTableByName("TSOLICITUD").getRecords().iterator().next()
						.findFieldByNameCreate("CSOLICITUD").getStringValue());
			}
			log.info("FIN - CREACIÓN DE SOLICITUD PARA LA PESONA: " + operacion.getIdentificacion());

			return resSol;
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
			RespuestaSolicitud resSol = new RespuestaSolicitud();
			resSol.setTieneError(true);
			resSol.setRespuestaCOD("D504");
			resSol.setMensaje("Error de Sistema");
			resSol.setMensajePersonalizado("Error de Sistema");
			resSol.setMensajeTecnico(ex.getMessage());

			return resSol;
		}
	}
}

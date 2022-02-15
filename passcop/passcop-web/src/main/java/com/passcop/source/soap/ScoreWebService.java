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

			HelperResponse helper = new HelperResponse();
			DetailProcessor detailProcessor = new DetailProcessor();
			log.debug("PARAMETROS DE ENTRADA");
			log.debug("TRAMA: " + operacion.toString());
			// 1) Verifica las indentificaicones del Deudor Garante y conyuge
			String cpersona = detailProcessor.getIdentificacion(operacion.getIdentificacion());
			if (cpersona == null && operacion.getIdentificacion() != null) {
				log.error("Identificacion no encontrada para " + operacion.getIdentificacion());
				return helper.getResponseNotIdentification(operacion.getIdentificacion());
			}
			log.debug("CPERSONA: " + cpersona);

			String cpersonaCon = null;
			if (operacion.getIdentificacionConyuge() != null && !"".equals(operacion.getIdentificacionConyuge())) {
				cpersonaCon = detailProcessor.getIdentificacion(operacion.getIdentificacionConyuge());
				if (cpersonaCon == null) {
					log.error("Identificacion no encontrada para " + operacion.getIdentificacionConyuge());
					return helper.getResponseNotIdentification(operacion.getIdentificacionConyuge());
				}
				log.debug("CPERSONA_CONYUGE: " + cpersonaCon);
			}

			String cpersonaGar = null;
			String cpersonaConGar = null;
			if (operacion.getGarante() != null && operacion.getGarante().getIdentificacion() != null
					&& !"".equals(operacion.getGarante().getIdentificacion())) {
				cpersonaGar = detailProcessor.getIdentificacion(operacion.getGarante().getIdentificacion());
				if (cpersonaGar == null && operacion.getGarante().getIdentificacion() != null) {
					log.error("Identificacion no encontrada para " + operacion.getGarante().getIdentificacion());
					return helper.getResponseNotIdentification(operacion.getGarante().getIdentificacion());
				}
				log.debug("CPERSONAGAR: " + cpersona);
				log.debug("ESTADOCIVIL_GAR:" + operacion.getGarante().getEstadoCivilCOD());

				if (operacion.getGarante() != null && operacion.getGarante().getIdentificacionConyuge() != null
						&& !"".equals(operacion.getGarante().getIdentificacionConyuge())) {
					cpersonaConGar = detailProcessor
							.getIdentificacion(operacion.getGarante().getIdentificacionConyuge());
					if (cpersonaConGar == null) {
						log.error("Identificacion no encontrada para "
								+ operacion.getGarante().getIdentificacionConyuge());
						return helper.getResponseNotIdentification(operacion.getGarante().getIdentificacionConyuge());
					}
					log.debug("CPERSONA_CONYUGEGAR: " + cpersonaConGar);
				}
			}
			// 2 Actualizar información
			log.debug("ESTADOCIVIL:" + operacion.getEstadoCivilCOD());
			log.debug("SEPARACIONBIENES: " + operacion.isSeparacionBienes());
			log.debug("NUMEROCARGA: " + operacion.getNumeroCarga());
			log.debug("NIVELEDUCACIONCOD: " + operacion.getNivelEducacionCOD());
			log.debug("OCUPACIONCOD: " + operacion.getOcupacionCOD());
			log.debug("USERID: " + operacion.getUsuarioID());
			log.debug("DUENOCASA: " + operacion.getDuenoCasa());
			log.debug("REFERENCIA: " + operacion.getReferenciaUbicacion());

			log.info("INICIO - ACTUALIZACIÓN DE INFORMACIÓN DEL DEUDOR: " + operacion.getIdentificacion());
			RespuestaSolicitud actualziarDatos = detailProcessor.updatePersonInformation(cpersona, cpersonaCon,
					cpersonaGar, cpersonaConGar, operacion);
			if (actualziarDatos.isTieneError() == true) {
				log.error("Error al actualicar datos");
				log.error(actualziarDatos.getMensajeTecnico());
				return actualziarDatos;
			}

			log.info("FIN - ACTUALIZACIÓN DE INFORMACIÓN DEL DEUDOR: " + operacion.getIdentificacion());

			log.info("INICIO - CREACIÓN DE SOLICITUD PARA LA PESONA: " + operacion.getIdentificacion());
			// 3) Verifica Si el producto existe en el mapeo
			String[] productFit = helper.getProduct(operacion.getProductoID());
			if (productFit == null) {
				log.error("Validacion No Exitosa No se puede identificar el Producto: " + operacion.getProductoID());
				return helper.getResponseNotFoundProduct();
			}
			log.info("CGRUPOPRODUCTO: " + productFit[0] + ", CPRODUCTO: " + productFit[1]);

			int idPersona = Integer.parseInt(cpersona);

			// 4) Verifica el valor del Destino de Fondos
			RespuestaSolicitud destinoFodos = detailProcessor.getDestinoFondos(productFit,
					operacion.getDestinoEconomicoCOD());
			if (destinoFodos.isTieneError() == true) {
				log.error("Error al consultar el destino de fondos");
				return destinoFodos;
			}
			log.info("CDESTINOFONDOS: " + destinoFodos.getMensaje());

			// 5) Consulta la clacificación contable
			RespuestaSolicitud clasificacionCon = detailProcessor.getClasificacionContable(productFit,
					destinoFodos.getMensaje());
			if (clasificacionCon.isTieneError() == true) {
				return destinoFodos;
			}
			log.info("CCLASIFICACIONCONTABLE: " + clasificacionCon.getMensaje());

			// 6) Consulta la tproductoCuotas contable
			RespuestaSolicitud validaParametros = helper.verifyParameters(operacion.getPlazo(),
					operacion.getFormaPagoCOD());
			if (validaParametros.isTieneError() == true) {
				return validaParametros;
			}

			Integer plazoMeses = new Short(operacion.getPlazo()).intValue();
			Integer plazoDias = plazoMeses * 30;
			String frecuencia = helper.getFrecuencia(operacion.getFormaPagoCOD());
			Integer frecuenciaDias = Integer.parseInt(operacion.getFormaPagoCOD());
			Integer numCuotas = (int) (plazoDias / frecuenciaDias);

			log.debug("FORMA DE PAGO: " + operacion.getFormaPagoCOD());
			log.debug("PLAZO EN MESES: " + plazoMeses);
			log.debug("PLAZO EN DÍAS: " + plazoDias);
			log.debug("FRECUENCIA FIT: " + frecuencia);
			log.debug("NUMEROCUOTAS: " + numCuotas);

			Table tproductoCuotas = detailProcessor.getTproductoCuotas(productFit, operacion.getMontoSolicitud(),
					frecuencia, plazoDias, idPersona);
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

			// 7s) Envía las transacción 062100 al CORE
			String tipoCuota = helper.getTipoCuota(operacion.getTipoCuotaCOD());

			// Setea los valores adicionales del Detail
			Detail inDetailSol = detailProcessor.getSolicitudData(productFit, idPersona, operacion.getUsuarioID(),
					operacion.getFechaSolicitud(), destinoFodos.getMensaje(), clasificacionCon.getMensaje(),
					operacion.getIdentificacionConyuge(), operacion.getMontoSolicitud(), tipoCuota, frecuencia,
					numCuotas, plazoDias, tproductoCuotas, operacion.getSolicitudID(), operacion.getIdentificacion(),
					operacion.getGarantiasReales(), cpersonaGar);
			Detail outDetail = detailProcessor.solicitudProcess(inDetailSol);

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
				log.error("Error de validacion de entidades de la base de datos");
				log.error(outDetail.getResponse().getTechnicalMessage());

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

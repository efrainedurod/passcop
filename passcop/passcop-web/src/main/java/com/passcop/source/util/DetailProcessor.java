package com.passcop.source.util;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fitbank.common.FileHelper;
import com.fitbank.dto.management.Detail;
import com.fitbank.dto.management.Record;
import com.fitbank.dto.management.Table;
import com.passcop.source.request.GarantiasReales;
import com.passcop.source.request.ReferenciasComerciales;
import com.passcop.source.request.ReferenciasPersonales;
import com.passcop.source.request.Respuesta;
import com.passcop.source.request.RespuestaSolicitud;

public class DetailProcessor implements Serializable {

	public Detail solicitudProcess(Detail pDetail) throws Exception {
		// Envía el Detail al uci
		String request = (String) UCIClient.send(pDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);

		return outDetail;
	}

//	public RespuestaSolicitud updatePersonInformation(String pCpersona, String pCpersonaCon, String pEstadoCivil,
//			boolean pSeparacionBienes, Short pNumeroCarga, String pNivelEducacion, String pOcupacionCod, String pCorreo,
//			String pDireccion, String pTipoViviendaCOD, boolean pViviendaHipotecada, String pUnidadTiempoVivienda,
//			Short pTiempoViviendaActual, String pTelefonoCelular, String pTelefonoDomicilio, String duenoCasa,
//			String pReferenciaUbicacion, String pUsuarioID, ReferenciasComerciales[] pRefComerciales,
//			ReferenciasPersonales[] pRegPersonales) throws Exception {

	public RespuestaSolicitud updatePersonInformation(String pCpersona, String pCpersonaCon, String pCpersonaGar,
			String pCpersonaConGar, Respuesta operacion) throws Exception {
		// Setea valores antes de enviar al UCI
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/023050.xml");
		Detail inDetail = Detail.valueOf(message);
		Table tper = inDetail.findTableByName("TPERSONAINFORMACION");
		if (tper != null) {
			inDetail.setUser(operacion.getUsuarioID());
			if (pCpersona != null) {
				Record deudor = new Record();
				deudor.findFieldByNameCreate("CPERSONA").setValue(pCpersona);
				deudor.findFieldByNameCreate("CPERSONACON").setValue(pCpersonaCon);
				deudor.findFieldByNameCreate("ESTADOCIVILCOD").setValue(operacion.getEstadoCivilCOD());
				deudor.findFieldByNameCreate("SEPARACIONBIENES").setValue(operacion.isSeparacionBienes());
				deudor.findFieldByNameCreate("NUMEROCARGA").setValue(operacion.getNumeroCarga());
				deudor.findFieldByNameCreate("NIVELEDUCACIONCOD").setValue(operacion.getNivelEducacionCOD());
				deudor.findFieldByNameCreate("OCUPACIONCOD").setValue(operacion.getOcupacionCOD());
				deudor.findFieldByNameCreate("CORREO").setValue(operacion.getCorreo());
				deudor.findFieldByNameCreate("DIRECCION").setValue(operacion.getDireccion());
				deudor.findFieldByNameCreate("TIPOVIVIENDACOD").setValue(operacion.getTipoViviendaCOD());
				deudor.findFieldByNameCreate("UNIDADTIEMPOVIVIENDAACTUALCOD")
						.setValue(operacion.getUnidadTiempoViviendaActualCOD());
				deudor.findFieldByNameCreate("TIEMPOVIVIENDAACTUAL").setValue(operacion.getTiempoViviendaActual());
				deudor.findFieldByNameCreate("TELEFONOCELULAR").setValue(operacion.getTelefonoCelular());
				deudor.findFieldByNameCreate("TELEFONODOMICILIO").setValue(operacion.getTelefonoDomicilio());
				deudor.findFieldByNameCreate("DUENOCASA").setValue(operacion.getDuenoCasa());
				deudor.findFieldByNameCreate("REFERENCIAUBICACION").setValue(operacion.getReferenciaUbicacion());
				tper.addRecord(deudor);
			}

			if (operacion.getGarante() != null && pCpersonaGar != null) {
				Record garante = new Record();
				garante.findFieldByNameCreate("CPERSONA").setValue(pCpersonaGar);
				garante.findFieldByNameCreate("CPERSONACON").setValue(pCpersonaConGar);
				garante.findFieldByNameCreate("ESTADOCIVILCOD").setValue(operacion.getGarante().getEstadoCivilCOD());
				garante.findFieldByNameCreate("SEPARACIONBIENES").setValue(operacion.getGarante().isSeparacionBienes());
				garante.findFieldByNameCreate("NUMEROCARGA").setValue(operacion.getGarante().getNumeroCarga());
				garante.findFieldByNameCreate("NIVELEDUCACIONCOD")
						.setValue(operacion.getGarante().getNivelEducacionCOD());
				garante.findFieldByNameCreate("OCUPACIONCOD").setValue(operacion.getGarante().getOcupacionCOD());
				garante.findFieldByNameCreate("CORREO").setValue(operacion.getGarante().getCorreo());
				garante.findFieldByNameCreate("DIRECCION").setValue(operacion.getGarante().getDireccion());
				garante.findFieldByNameCreate("TIPOVIVIENDACOD").setValue(operacion.getGarante().getTipoViviendaCOD());
				garante.findFieldByNameCreate("UNIDADTIEMPOVIVIENDAACTUALCOD")
						.setValue(operacion.getGarante().getUnidadTiempoViviendaActualCOD());
				garante.findFieldByNameCreate("TIEMPOVIVIENDAACTUAL")
						.setValue(operacion.getGarante().getTiempoViviendaActual());
				garante.findFieldByNameCreate("TELEFONOCELULAR").setValue(operacion.getGarante().getTelefonoCelular());
				garante.findFieldByNameCreate("TELEFONODOMICILIO")
						.setValue(operacion.getGarante().getTelefonoDomicilio());
				garante.findFieldByNameCreate("DUENOCASA").setValue(operacion.getGarante().getDuenoCasa());
				garante.findFieldByNameCreate("REFERENCIAUBICACION")
						.setValue(operacion.getGarante().getReferenciaUbicacion());
				tper.addRecord(garante);
			}

		}

		inDetail.findFieldByNameCreate("CPERSONA").setValue(pCpersona);
		Table trefComerciales = inDetail.findTableByName("TPERSONAREFERENCIASCOMERCIALES");
		if (trefComerciales != null) {
			for (ReferenciasComerciales refCom : operacion.getReferenciasComerciales()) {
				Record r = new Record();
				r.findFieldByNameCreate("CPERSONA").setValue(pCpersona);
				r.findFieldByNameCreate("TIPOREFERENCIACOMERCIALCOD").setValue(refCom.getTipoReferenciaComercialCOD());
				r.findFieldByNameCreate("DESCRIPCION").setValue(refCom.getDescripcion());
				r.findFieldByNameCreate("VALOR").setValue(refCom.getValor());
				r.findFieldByNameCreate("TELEFONO").setValue(refCom.getTelefono());
				r.findFieldByNameCreate("OBSERVACION").setValue(refCom.getObservacion());
				trefComerciales.addRecord(r);
			}
		}

		Table trefPersonales = inDetail.findTableByName("TPERSONAREFERENCIASPERSONALES");
		if (trefPersonales != null) {
			for (ReferenciasPersonales refPer : operacion.getReferenciasPersonales()) {
				Record r = new Record();
				r.findFieldByNameCreate("NOMBREPERSONA").setValue(refPer.getNombre());
				r.findFieldByNameCreate("TELEFONO").setValue(refPer.getTelefono());
				r.findFieldByNameCreate("DETALLE").setValue(refPer.getObservacion());
				trefPersonales.addRecord(r);
			}
		}

		// Se envía el Detail al UCI
		String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);

		RespuestaSolicitud result = new RespuestaSolicitud();
		if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
			return result;
		} else {
			result.setTieneError(true);
			result.setRespuestaCOD("D504");
			result.setMensaje(outDetail.getResponse() != null ? outDetail.getResponse().getUserMessage()
					: "Error al Actualizar los datos");
			result.setMensajePersonalizado("Error al Actualizar los datos");
			result.setMensajeTecnico(outDetail.getResponse().getTechnicalMessage());
		}
		return result;
	}

	public String getIdentificacion(String pIdentificacion) throws Exception {
		String cpersona = null;
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/4-lv-identificacion.xml");
		Detail inDetail = Detail.valueOf(message);
		Table tpro = inDetail.findTableByName("TPERSONA");
		if (tpro != null) {
			tpro.findCriterionByName("identificacion").setValue(pIdentificacion);
		}
		// Se envía el Detail al UCI
		String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);
		// Obtiene la clacificación contable del cgrupoproducto y destino de fondos
		if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
			Table tproDesFond = outDetail.findTableByName("TPERSONA");
			for (Record r : tproDesFond.getRecords()) {
				cpersona = r.findFieldByNameCreate("cpersona").getStringValue();
			}
		}
		return cpersona;
	}

	public Detail getSolicitudData(String[] pProductFit, int pPersonaId, String pUsuarioId, Calendar pFechaSol,
			String pDestinoFondos, String pClasContable, String pIdentificacionConyuge, double pMontoSolicitud,
			String pTipoCuota, String pFrecuencia, Integer pNumCuotas, Integer pPlazo, Table pTproductoCuotas,
			int pSolicitudId, String pIdentificacion, GarantiasReales[] pGarantiasReales) throws Exception {
		String messageSol = FileHelper.readFile("/home/fitbank/FitBank/score/062100.xml");
		Detail detail = Detail.valueOf(messageSol);

		// Setea Valores de la tabla TSOLICITUD
		Table tsolicitud = detail.findTableByName("TSOLICITUD");
		if (tsolicitud != null) {
			for (Record r : tsolicitud.getRecords()) {
				r.findFieldByNameCreate("CGRUPOPRODUCTO").setValue(pProductFit[0]);
				r.findFieldByNameCreate("CPRODUCTO").setValue(pProductFit[1]);
				r.findFieldByNameCreate("CPERSONA_CLIENTE").setValue(pPersonaId);
				r.findFieldByNameCreate("CUSUARIO_OFICIALCUENTA").setValue(pUsuarioId);
				r.findFieldByNameCreate("CUSUARIO_INGRESO").setValue(pUsuarioId);
				r.findFieldByNameCreate("FSOLICITUD").setValue(covertCalendarToDate(pFechaSol));
				r.findFieldByNameCreate("CDESTINOFONDOS").setValue(pDestinoFondos);
				if (pClasContable != null) {
					r.findFieldByNameCreate("CCLASIFICACIONCONTABLE").setValue(pClasContable);
				}
			}
		}
		// Setea Valores de la tabla TSOLICITUDPERSONAS
		Table tsolicitudPersona = detail.findTableByName("TSOLICITUDPERSONAS");
		if (tsolicitudPersona != null) {
			for (Record r : tsolicitudPersona.getRecords()) {
				r.findFieldByNameCreate("CPERSONA").setValue(pPersonaId);
				if (pIdentificacionConyuge != null) {
					r.findFieldByNameCreate("CPERSONA_VINCULADA").setValue(pIdentificacionConyuge);
					r.findFieldByNameCreate("CTIPOVINCULACION").setValue("31");
				}
			}
		}
		// Setea Valores de la tabla TSOLICITUDCOLOCACIONES
		Table tsolicitudColocaciones = detail.findTableByName("TSOLICITUDCOLOCACIONES");
		if (tsolicitudColocaciones != null) {
			for (Record r : tsolicitudColocaciones.getRecords()) {
				r.findFieldByNameCreate("MONTOPRESTAMO").setValue(pMontoSolicitud);
				r.findFieldByNameCreate("CTIPOCUOTA").setValue(pTipoCuota);
				r.findFieldByNameCreate("CFRECUENCIA_CAPITAL").setValue(pFrecuencia);
				r.findFieldByNameCreate("CFRECUENCIA_INTERES").setValue(pFrecuencia);
				r.findFieldByNameCreate("NUMEROCUOTAS").setValue(pNumCuotas);
				r.findFieldByNameCreate("PLAZO").setValue(pPlazo);
			}
		}
		// Setea Valores de la tabla TSOLICITUDCATEGORIASTASAS
		Table tsolicitudCategoriaTasas = detail.findTableByName("TSOLICITUDCATEGORIASTASAS");
		if (tsolicitudCategoriaTasas != null) {
			for (Record r : tsolicitudCategoriaTasas.getRecords()) {
				r.findFieldByNameCreate("CATEGORIA").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("CATEGORIA").getStringValue());
				r.findFieldByNameCreate("CGRUPOBALANCE").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("CGRUPOBALANCE").getStringValue());
				r.findFieldByNameCreate("CTASAREFERENCIAL").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("CTASAREFERENCIAL").getStringValue());
				r.findFieldByNameCreate("TASABASE").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("TASABASE").getStringValue());
				r.findFieldByNameCreate("RELACIONMATEMATICA").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("RELACIONMATEMATICA").getStringValue());
				r.findFieldByNameCreate("MARGEN").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("MARGEN").getStringValue());
				r.findFieldByNameCreate("MARGENMINIMO").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("MARGENMINIMO").getStringValue());
				r.findFieldByNameCreate("MARGENMAXIMO").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("MARGENMAXIMO").getStringValue());
				r.findFieldByNameCreate("TASA").setValue(
						pTproductoCuotas.getRecords().iterator().next().findFieldByNameCreate("TASA").getStringValue());
				r.findFieldByNameCreate("CATEGORIA_CAPITAL").setValue(pTproductoCuotas.getRecords().iterator().next()
						.findFieldByNameCreate("CATEGORIA_CAPITAL").getStringValue());
				r.findFieldByNameCreate("CGRUPOBALANCE_CAPITAL").setValue(pTproductoCuotas.getRecords().iterator()
						.next().findFieldByNameCreate("CGRUPOBALANCE_CAPITAL").getStringValue());
			}
		}

		Table tsoGar = detail.findTableByName("TSOLICITUDGARANTIASREALES");
		if (tsoGar != null && pGarantiasReales != null) {
			for (GarantiasReales gar : pGarantiasReales) {
				Record r = new Record();
				r.findFieldByNameCreate("TIPOGARANTIACOD").setValue(gar.getTipoGarantiaCOD());
				r.findFieldByNameCreate("TIPOGARANTIA").setValue(gar.getTipoGarantia());
				r.findFieldByNameCreate("DESCRIPCION").setValue(gar.getDescripcion());
				r.findFieldByNameCreate("DIRECCION").setValue(gar.getDireccion());
				r.findFieldByNameCreate("AVALUOCOMERCIAL").setValue(gar.getAvaluoComercial());
				r.findFieldByNameCreate("VAOR").setValue(gar.getValor());
				tsoGar.addRecord(r);
			}
		}

		detail.findFieldByNameCreate("CSOLICITUDMICROSCORE").setValue(pSolicitudId);
		detail.findFieldByNameCreate("MICROSCOREPROCESS").setValue("P");
		detail.findFieldByNameCreate("MICROSCOREIDENTIFICACION").setValue(pIdentificacion);

		return detail;
	}

	public RespuestaSolicitud getDestinoFondos(String[] pProductFit, String pDestinoFondos) throws Exception {
		// Setea el criterio de grupo producto en el detail antes de enviar al UCI
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/1-lv-destinofondos.xml");
		Detail inDetail = Detail.valueOf(message);
		Table tpro = inDetail.findTableByName("TPRODUCTODESTINOFONDOS");
		if (tpro != null) {
			tpro.findCriterionByName("CGRUPOPRODUCTO").setValue(pProductFit[0]);
		}
		// Se envía el Detail al UCI
		String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);

		// Verifica si existe coincidencia del destino de fondos para el grupo producto
		// de microscore de lo contrario se toma el primer registro
		RespuestaSolicitud result = new RespuestaSolicitud();

		if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
			Table tproDes = outDetail.findTableByName("TPRODUCTODESTINOFONDOS");
			if (tproDes != null) {
				for (Record r : tproDes.getRecords()) {
					if (pDestinoFondos.compareTo(r.findFieldByNameCreate("CDESTINOFONDOS").getStringValue()) == 0) {
						result.setTieneError(false);
						result.setMensaje(r.findFieldByNameCreate("CDESTINOFONDOS").getStringValue());
					}
				}
			}
			if (result.getMensaje() == null && tproDes.getRecordCount() > 0) {
				for (Record r : tproDes.getRecords()) {
					result.setTieneError(false);
					result.setMensaje(r.findFieldByNameCreate("CDESTINOFONDOS").getStringValue());
					break;
				}
			}
		} else {
			result.setTieneError(true);
			result.setRespuestaCOD("D504");
			result.setMensaje(outDetail.getResponse() != null ? outDetail.getResponse().getUserMessage()
					: "Error al consultar el destino de fondos");
			result.setMensajePersonalizado("Error de Sistema");
			result.setMensajeTecnico(outDetail.getResponse().getTechnicalMessage());
		}

		return result;
	}

	public RespuestaSolicitud getClasificacionContable(String[] pProductFit, String pDestinoFondos) throws Exception {
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/2-lv-clacificacioncontable.xml");
		Detail inDetail = Detail.valueOf(message);
		Table tpro = inDetail.findTableByName("TPRODUCTODESTINOFONDOS");
		if (tpro != null) {
			tpro.findCriterionByName("CGRUPOPRODUCTO").setValue(pProductFit[0]);
			tpro.findCriterionByName("CDESTINOFONDOS").setValue(pDestinoFondos);
		}
		// Se envía el Detail al UCI
		String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);
		// Obtiene la clacificación contable del cgrupoproducto y destino de fondos
		RespuestaSolicitud result = new RespuestaSolicitud();
		if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
			Table tproDesFond = outDetail.findTableByName("TPRODUCTODESTINOFONDOS");
			for (Record r : tproDesFond.getRecords()) {
				result.setTieneError(false);
				result.setMensaje(r.findFieldByNameCreate("CCLASIFICACIONCONTABLE").getStringValue());
			}
		} else {
			result.setTieneError(true);
			result.setRespuestaCOD("D504");
			result.setMensaje(outDetail.getResponse() != null ? outDetail.getResponse().getUserMessage()
					: "Error al consultar la clacificación contable");
			result.setMensajePersonalizado("Error de Sistema");
			result.setMensajeTecnico(outDetail.getResponse().getTechnicalMessage());
		}

		return result;
	}

	public Table getTproductoCuotas(String[] pProductFit, double pMonto, String pFrecuencia, Integer pPlazo,
			int pIdPersona) throws Exception {
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/3-lv-tasa.xml");
		Detail inDetail = Detail.valueOf(message);

		Table tpro = inDetail.findTableByName("TPRODUCTOTASAS");
		if (tpro != null) {
			tpro.findCriterionByName("MONTO").setValue(pMonto);
			tpro.findCriterionByName("CGRUPOPRODUCTO").setValue(pProductFit[0]);
			tpro.findCriterionByName("CPRODUCTO").setValue(pProductFit[1]);
			tpro.findCriterionByName("FRECUENCIA").setValue(pFrecuencia);
			tpro.findCriterionByName("PLAZO").setValue(pPlazo);
			tpro.findCriterionByName("CPERSONA_CLIENTE").setValue(pIdPersona);
			String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
			Detail outDetail = Detail.valueOf(request);
			if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
				Table tproTasas = outDetail.findTableByName("TPRODUCTOTASAS");
				if (tproTasas.getRecordCount() > 0) {
					return tproTasas;
				}
			}
		}
		return null;
	}

	public String covertCalendarToDate(Calendar calendar) throws Exception {
		if (calendar == null) {
			return "";
		}
		Date date = (Date) calendar.getTime();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		String inActiveDate = null;
		inActiveDate = format1.format(date);
		return inActiveDate;
	}

}

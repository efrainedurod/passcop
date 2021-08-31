package com.passcop.source.util;

import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.fitbank.common.FileHelper;
import com.fitbank.dto.management.Detail;
import com.fitbank.dto.management.Record;
import com.fitbank.dto.management.Table;
import com.passcop.source.request.Respuesta;
import com.passcop.source.request.RespuestaSolicitud;

public class DetailProcessor implements Serializable {

	public Detail solicitudProcess(Respuesta respuesta, String[] pProductFit, String pDestinoFondos,
			String pClasContable, Table pTproductoCuotas, Short pNumCuotas, Integer pPlazo) throws Exception {
		String[] result = null;
		// Llenada la información con la trama de entrada y consultas al Core Bancario
		String messageSol = FileHelper.readFile("/home/fitbank/FitBank/score/062100.xml");
		Detail inDetail = Detail.valueOf(messageSol);
		inDetail = setInformationDetail(inDetail, respuesta, pProductFit, pDestinoFondos, pClasContable,
				pTproductoCuotas, pNumCuotas, pPlazo);
		// Envía el Detail al uci
		String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);

		return outDetail;
	}

	public Detail setInformationDetail(Detail pDetail, Respuesta respuesta, String[] pProductFit, String pDestinoFondos,
			String pClasContable, Table pTproductoCuotas, Short pNumCuotas, Integer pPlazo) throws Exception {

		if (pDetail == null) {
			return null;
		}
		// Valores de la tabla TSOLICITUD
		Table tsolicitud = pDetail.findTableByName("TSOLICITUD");
		if (tsolicitud != null) {
			for (Record r : tsolicitud.getRecords()) {
				r.findFieldByNameCreate("CGRUPOPRODUCTO").setValue(pProductFit[0]);
				r.findFieldByNameCreate("CPRODUCTO").setValue(pProductFit[1]);
				r.findFieldByNameCreate("CPERSONA_CLIENTE").setValue(respuesta.getPersonaID());
				r.findFieldByNameCreate("CUSUARIO_OFICIALCUENTA").setValue(respuesta.getUsuarioIDSolicitud());
				r.findFieldByNameCreate("CUSUARIO_INGRESO").setValue(respuesta.getUsuarioID());
				r.findFieldByNameCreate("FSOLICITUD").setValue(covertCalendarToDate(respuesta.getFechaSolicitud()));
				r.findFieldByNameCreate("CDESTINOFONDOS").setValue(pDestinoFondos);
				if (pClasContable != null) {
					r.findFieldByNameCreate("CCLASIFICACIONCONTABLE").setValue(pClasContable);
				}
			}
		}
		// Valores de la tabla TSOLICITUDPERSONAS
		Table tsolicitudPersona = pDetail.findTableByName("TSOLICITUDPERSONAS");
		if (tsolicitudPersona != null) {
			for (Record r : tsolicitudPersona.getRecords()) {
				r.findFieldByNameCreate("CPERSONA").setValue(respuesta.getPersonaID());
				if (respuesta.getIdentificacionConyuge() != null) {
					r.findFieldByNameCreate("CPERSONA_VINCULADA").setValue(respuesta.getIdentificacionConyuge());
					r.findFieldByNameCreate("CTIPOVINCULACION").setValue("31");
				}
			}
		}
		// Valores de la tabla TSOLICITUDCOLOCACIONES
		Table tsolicitudColocaciones = pDetail.findTableByName("TSOLICITUDCOLOCACIONES");
		if (tsolicitudColocaciones != null) {
			for (Record r : tsolicitudColocaciones.getRecords()) {
				r.findFieldByNameCreate("MONTOPRESTAMO").setValue(respuesta.getMontoSolicitud());
				r.findFieldByNameCreate("CTIPOCUOTA").setValue(respuesta.getTipoCuotaCOD());
				r.findFieldByNameCreate("CFRECUENCIA_CAPITAL").setValue(respuesta.getFormaPagoCOD());
				r.findFieldByNameCreate("CFRECUENCIA_INTERES").setValue(respuesta.getFormaPagoCOD());
				r.findFieldByNameCreate("NUMEROCUOTAS").setValue(pNumCuotas);
				r.findFieldByNameCreate("PLAZO").setValue(pPlazo);
			}
		}
		// Valores de la tabla TSOLICITUDCATEGORIASTASAS
		Table tsolicitudCategoriaTasas = pDetail.findTableByName("TSOLICITUDCATEGORIASTASAS");
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

		return pDetail;
	}

	public RespuestaSolicitud getDestinoFondos(String[] pProductFit, String pDestinoFondos) throws Exception {
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/1-lv-destinofondos.xml");
		String request = (String) UCIClient.send(message, "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);
		RespuestaSolicitud result = new RespuestaSolicitud();
		if (outDetail.getResponse() != null) {
			if (outDetail.getResponse().getCode().trim().equals("0")) {
				Table tpro = outDetail.findTableByName("TPRODUCTODESTINOFONDOS");
				if (tpro != null) {
					tpro.findCriterionByName("CGRUPOPRODUCTO").setValue(pProductFit[0]);
					for (Record r : tpro.getRecords()) {
						if (pDestinoFondos.compareTo(r.findFieldByNameCreate("CDESTINOFONDOS").getStringValue()) == 0) {
							result.setTieneError(false);
							result.setMensaje(r.findFieldByNameCreate("CDESTINOFONDOS").getStringValue());
						}
					}
				}
				if (result.getMensaje() == null && tpro.getRecordCount() > 0) {
					for (Record r : tpro.getRecords()) {
						result.setTieneError(false);
						result.setMensaje(r.findFieldByNameCreate("CDESTINOFONDOS").getStringValue());
						break;
					}
				}
			} else {
				result.setTieneError(true);
				result.setRespuestaCOD("D504");
				result.setMensaje(outDetail.getResponse().getUserMessage());
				result.setMensajePersonalizado("Error de Sistema");
				result.setMensajeTecnico(outDetail.getResponse().getTechnicalMessage());
			}
		}
		return result;
	}

	public RespuestaSolicitud getClasificacionContable(String[] pProductFit, String pDestinoFondos) throws Exception {
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/2-lv-clacificacioncontable.xml");
		Detail inDetail = Detail.valueOf(message);

		RespuestaSolicitud result = new RespuestaSolicitud();
		Table tpro = inDetail.findTableByName("TPRODUCTODESTINOFONDOS");
		if (tpro != null) {
			tpro.findCriterionByName("CGRUPOPRODUCTO").setValue(pProductFit[0]);
			tpro.findCriterionByName("CDESTINOFONDOS").setValue(pDestinoFondos);
			String request = (String) UCIClient.send(inDetail.toErrorXml(), "127.0.0.1", 20091, 30);
			Detail outDetail = Detail.valueOf(request);
			if (outDetail.getResponse() != null && outDetail.getResponse().getCode().trim().equals("0")) {
				Table tproDesFond = outDetail.findTableByName("TPRODUCTODESTINOFONDOS");
				for (Record r : tproDesFond.getRecords()) {
					result.setTieneError(false);
					result.setMensaje(r.findFieldByNameCreate("CCLASIFICACIONCONTABLE").getStringValue());
				}
			} else {
				result.setTieneError(true);
				result.setRespuestaCOD("D504");
				result.setMensaje(outDetail.getResponse().getUserMessage());
				result.setMensajePersonalizado("Error de Sistema");
				result.setMensajeTecnico(outDetail.getResponse().getTechnicalMessage());
			}
		}
		return result;
	}

	public Table getTproductoCuotas(String[] pProductFit, String pDestinoFondos, String pClacificacionCon,
			Respuesta operacion, Short pNumCuotas, Integer pPlazo) throws Exception {
		String message = FileHelper.readFile("/home/fitbank/FitBank/score/3-lv-tasa.xml");
		Detail inDetail = Detail.valueOf(message);

		Table tpro = inDetail.findTableByName("TPRODUCTOTASAS");
		if (tpro != null) {
			tpro.findCriterionByName("MONTO").setValue(operacion.getMontoSolicitud());
			tpro.findCriterionByName("CGRUPOPRODUCTO").setValue(pProductFit[0]);
			tpro.findCriterionByName("CPRODUCTO").setValue(pProductFit[1]);
			tpro.findCriterionByName("FRECUENCIA").setValue(operacion.getFormaPagoCOD());
			tpro.findCriterionByName("PLAZO").setValue(pPlazo);
			tpro.findCriterionByName("CPERSONA_CLIENTE").setValue(operacion.getPersonaID());
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

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
import com.passcop.source.request.RespuestaSolicitud;

public class DetailProcessor implements Serializable {

	public Detail solicitudProcess(Detail pDetail) throws Exception {
		// Envía el Detail al uci
		String request = (String) UCIClient.send(pDetail.toErrorXml(), "127.0.0.1", 20091, 30);
		Detail outDetail = Detail.valueOf(request);

		return outDetail;
	}
	
	public String getIdentificacion(String pIdentificacion) throws Exception {
		String identificacion = null;
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
				 identificacion = r.findFieldByNameCreate("cpersona").getStringValue();
			}
		}
		return identificacion;
	}

	public Detail getSolicitudData(String[] pProductFit, int pPersonaId, String pUsuarioId,
			Calendar pFechaSol, String pDestinoFondos, String pClasContable, String pIdentificacionConyuge,
			double pMontoSolicitud, String pTipoCuota, String pFrecuencia, Integer pNumCuotas, Integer pPlazo,
			Table pTproductoCuotas) throws Exception {
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
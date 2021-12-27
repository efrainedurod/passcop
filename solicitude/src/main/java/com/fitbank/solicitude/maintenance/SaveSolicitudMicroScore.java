/**
 * clase que se utiliza para generar el codigo de persona los titulares y cotitulares 
 * ingresados por la creacion rapida de personas de la solicitud de prestamos.
 */

package com.fitbank.solicitude.maintenance;

import java.math.BigDecimal;
import java.sql.Timestamp;

import com.fitbank.common.ApplicationDates;
import com.fitbank.common.Helper;
import com.fitbank.dto.management.Detail;
import com.fitbank.dto.management.Record;
import com.fitbank.processor.maintenance.MaintenanceCommand;
import com.fitbank.dto.management.Table;
import com.fitbank.hb.persistence.soli.Tmicroscoresolicitude;
import com.fitbank.hb.persistence.soli.TmicroscoresolicitudeKey;
import com.fitbank.hb.persistence.soli.loan.Tguaranteesolicitude;
import com.fitbank.hb.persistence.soli.loan.TguaranteesolicitudeKey;

public class SaveSolicitudMicroScore extends MaintenanceCommand {

	@Override
	public Detail executeNormal(Detail pDetail) throws Exception {

		String microScore = pDetail.findFieldByNameCreate("MICROSCOREPROCESS").getStringValue();
		Long solicitudMicro = pDetail.findFieldByNameCreate("CSOLICITUDMICROSCORE").getLongValue();
		String identificacion = pDetail.findFieldByNameCreate("MICROSCOREIDENTIFICACION").getStringValue();

		Table tsolicitud = pDetail.findTableByName("TSOLICITUD");
		Table tsolGar = pDetail.findTableByName("TSOLICITUDGARANTIASREALES");
		if (microScore != null && tsolicitud != null && "P".compareTo(microScore) == 0) {
			Long csolicitud = null;
			Integer secuencia = null;
			Integer cpersonaCompania = null;

			for (Record r : tsolicitud.getRecords()) {
				csolicitud = r.findFieldByNameCreate("CSOLICITUD").getLongValue();
				secuencia = r.findFieldByNameCreate("SECUENCIA").getIntegerValue();
				cpersonaCompania = r.findFieldByNameCreate("CPERSONA_COMPANIA").getIntegerValue();
			}
			if (csolicitud != null && secuencia != null && cpersonaCompania != null) {
				TmicroscoresolicitudeKey key = new TmicroscoresolicitudeKey(csolicitud, secuencia, cpersonaCompania,
						ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
				Tmicroscoresolicitude micro = Helper.getBean(Tmicroscoresolicitude.class, key);
				if (micro == null) {
					micro = new Tmicroscoresolicitude(key);
					micro.setNumerosolicitud(solicitudMicro);
					micro.setIdentificacion(identificacion);
					Helper.save(micro);
				} else {
					micro.setNumerosolicitud(solicitudMicro);
					micro.setIdentificacion(identificacion);
					Helper.update(micro);
				}
				if (tsolGar != null) {
					Integer segGarantias = 1;
					for (Record r : tsolGar.getRecords()) {
						String tipoGar = r.findFieldByNameCreate("TIPOGARANTIACOD").getStringValue();
						Integer tipoBien = r.findFieldByNameCreate("TIPOGARANTIA").getIntegerValue();
						String descripcion = r.findFieldByNameCreate("DESCRIPCION").getStringValue();
						String direccion = r.findFieldByNameCreate("DIRECCION").getStringValue();
						BigDecimal avaluo = r.findFieldByNameCreate("AVALUOCOMERCIAL").getBigDecimalValue();
						BigDecimal valor = r.findFieldByNameCreate("VAOR").getBigDecimalValue();

						String detalle = descripcion != null ? descripcion : "";
						detalle = direccion != null ? detalle + " " + direccion : detalle;

						TguaranteesolicitudeKey keyGar = new TguaranteesolicitudeKey(csolicitud, secuencia,
								cpersonaCompania, segGarantias, ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
						Tguaranteesolicitude gar = new Tguaranteesolicitude(keyGar,
								new Timestamp(System.currentTimeMillis()));
						gar.setCtipogarantia(tipoGar);
						gar.setCtipobien(tipoBien);
						gar.setDetalle(detalle);
						gar.setValorcomercial(avaluo);
						gar.setValormaximo(valor);
						segGarantias = segGarantias + 1;
						Helper.saveOrUpdate(gar);
					}
				}

			}
		}

		return pDetail;

	}

	public Detail executeReverse(Detail pDetail) throws Exception {

		return pDetail;
	}

}

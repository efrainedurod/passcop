/**
 * clase que se utiliza para generar el codigo de persona los titulares y cotitulares 
 * ingresados por la creacion rapida de personas de la solicitud de prestamos.
 */

package com.fitbank.solicitude.maintenance;

import java.math.BigDecimal;
import java.sql.Timestamp;
import com.fitbank.common.ApplicationDates;
import com.fitbank.common.Helper;
import com.fitbank.common.hb.UtilHB;
import com.fitbank.dto.management.Detail;
import com.fitbank.processor.maintenance.MaintenanceCommand;
import com.fitbank.dto.management.Record;
import com.fitbank.dto.management.Table;
import com.fitbank.hb.persistence.person.Taddressperson;
import com.fitbank.hb.persistence.person.TaddresspersonKey;
import com.fitbank.hb.persistence.person.Tlinkingperson;
import com.fitbank.hb.persistence.person.TlinkingpersonKey;
import com.fitbank.hb.persistence.person.Tpersonalreferenceperson;
import com.fitbank.hb.persistence.person.TpersonalreferencepersonKey;
import com.fitbank.hb.persistence.person.Ttelephoneperson;
import com.fitbank.hb.persistence.person.TtelephonepersonKey;
import com.fitbank.hb.persistence.person.juri.Tgeneralbalancejuridical;
import com.fitbank.hb.persistence.person.juri.TgeneralbalancejuridicalKey;
import com.fitbank.hb.persistence.person.natural.Tadditionalinformationnatural;
import com.fitbank.hb.persistence.person.natural.TadditionalinformationnaturalKey;
import com.fitbank.hb.persistence.person.natural.Tbasicinformationnatural;
import com.fitbank.hb.persistence.person.natural.TbasicinformationnaturalKey;
import com.fitbank.hb.persistence.person.natural.Tcomercialreferencenatural;
import com.fitbank.hb.persistence.person.natural.TcomercialreferencenaturalKey;
import com.fitbank.hb.persistence.person.natural.Texpendituresrevenuesnatural;
import com.fitbank.hb.persistence.person.natural.TexpendituresrevenuesnaturalKey;
import com.fitbank.hb.persistence.person.natural.Tlifelevelnatural;
import com.fitbank.hb.persistence.person.natural.TlifelevelnaturalKey;

public class UpdateInformationMicroScore extends MaintenanceCommand {

	public static final String HQL_DIRECCIONESMAX = "SELECT max(t.pk.numerodireccion) FROM Taddressperson t "
			+ "WHERE t.pk.cpersona = :cpersona";

	public static final String HQL_TELEFONOMAX = "SELECT max(t.pk.stelefono) FROM Ttelephoneperson t "
			+ "WHERE t.pk.cpersona = :cpersona";

	public static final String HQL_COMERCIALREFMAX = "SELECT max(t.pk.sreferenciacomercial) FROM Tcomercialreferencenatural t "
			+ "WHERE t.pk.cpersona = :cpersona";

	public static final String HQL_PERSONALREFMAX = "SELECT max(t.pk.sreferenciapersonal) FROM Tpersonalreferenceperson t "
			+ "WHERE t.pk.cpersona = :cpersona";

	public static final String HQL_INGRESOMAX = "SELECT max(t.pk.singresoegreso) FROM Texpendituresrevenuesnatural t "
			+ "WHERE t.pk.cpersona = :cpersona and t.pk.ingresoegreso = 'I'";

	public static final String HQL_EGRESOMAX = "SELECT max(t.pk.singresoegreso) FROM Texpendituresrevenuesnatural t "
			+ "WHERE t.pk.cpersona = :cpersona and t.pk.ingresoegreso = 'E'";

	public static final String HQL_ACTIVOMAX = "SELECT max(t.pk.singresoegreso) FROM Texpendituresrevenuesnatural t "
			+ "WHERE t.pk.cpersona = :cpersona and t.pk.ingresoegreso = 'A'";

	public static final String HQL_PASIVOMAX = "SELECT max(t.pk.singresoegreso) FROM Texpendituresrevenuesnatural t "
			+ "WHERE t.pk.cpersona = :cpersona and t.pk.ingresoegreso = 'P'";

	public static final String HQL_DIRECCIONESCE = " FROM Taddressperson t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta and t.ctipodireccion='CE' and "
			+ " t.fdesde = (select max(t.fdesde) from Taddressperson t WHERE t.pk.cpersona = :cpersona and "
			+ " t.pk.fhasta =:fhasta and t.ctipodireccion='CE' ) ";

	public static final String HQL_DIRECCIONESDO = " FROM Taddressperson t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta and t.ctipodireccion='DO' and "
			+ " t.fdesde = (select max(t.fdesde) from Taddressperson t WHERE t.pk.cpersona = :cpersona and "
			+ " t.pk.fhasta =:fhasta and t.ctipodireccion='DO' ) ";

	public static final String HQL_TELEFONOSCEL = " FROM Ttelephoneperson t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta and t.ctipotelefono='CEL' and "
			+ " t.fdesde = (select max(t.fdesde) from Ttelephoneperson t WHERE t.pk.cpersona = :cpersona and "
			+ " t.pk.fhasta =:fhasta and t.ctipotelefono='CEL' ) ";

	public static final String HQL_TELEFONOSHOME = " FROM Ttelephoneperson t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta and t.ctipotelefono='TEL' and "
			+ " t.fdesde = (select max(t.fdesde) from Ttelephoneperson t WHERE t.pk.cpersona = :cpersona and "
			+ " t.pk.fhasta =:fhasta and t.ctipotelefono='TEL' ) ";

	public static final String HQL_REFRENCIASCOMERCIALES = " FROM Tcomercialreferencenatural t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta ";

	public static final String HQL_REFRENCIASPERSONALES = " FROM Tpersonalreferenceperson t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta ";

	public static final String HQL_INGRESOEGRESO = " FROM Texpendituresrevenuesnatural t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta and t.pk.ingresoegreso in ('I','E') ";

	public static final String HQL_ACTIVOPASIVO = " FROM Texpendituresrevenuesnatural t "
			+ " WHERE t.pk.cpersona = :cpersona and t.pk.fhasta =:fhasta and t.pk.ingresoegreso in ('A','P') ";

	@Override
	public Detail executeNormal(Detail pDetail) throws Exception {

		Table tperinfo = pDetail.findTableByName("TPERSONAINFORMACION");
		if (tperinfo != null) {
			for (Record r : tperinfo.getRecords()) {
				Integer cpersona = r.findFieldByNameCreate("CPERSONA").getIntegerValue();
				Integer estado = r.findFieldByNameCreate("ESTADOCIVILCOD").getIntegerValue();
				String ctipoVivienda = r.findFieldByNameCreate("TIPOVIVIENDACOD").getStringValue();
				Integer cpersonaCon = r.findFieldByNameCreate("CPERSONACON").getIntegerValue();
				boolean separacionBienes = r.findFieldByNameCreate("SEPARACIONBIENES").getBooleanValue();
				Integer numCargas = r.findFieldByNameCreate("NUMEROCARGA").getIntegerValue();
				Integer cnivelEducacion = r.findFieldByNameCreate("NIVELEDUCACIONCOD").getIntegerValue();
				Integer cProfecion = r.findFieldByNameCreate("OCUPACIONCOD").getIntegerValue();
				String correo = r.findFieldByNameCreate("CORREO").getStringValue();
				String direccion = r.findFieldByNameCreate("DIRECCION").getStringValue();
				String duenoCasa = r.findFieldByNameCreate("DUENOCASA").getStringValue();
				String referencia = r.findFieldByNameCreate("REFERENCIAUBICACION").getStringValue();
				String unidadtiempo = r.findFieldByNameCreate("UNIDADTIEMPOVIVIENDAACTUALCOD").getStringValue();
				Integer tiempoViviendaAct = r.findFieldByNameCreate("TIEMPOVIVIENDAACTUAL").getIntegerValue();
				String celular = r.findFieldByNameCreate("TELEFONOCELULAR").getStringValue();
				String telefonoDomicilio = r.findFieldByNameCreate("TELEFONODOMICILIO").getStringValue();

				// Actualiza la tabla TNATURALINFORMACIONBASICA
				this.upDateBasicinformationnatural(cpersona, estado, ctipoVivienda, pDetail.getUser());
				// Actualiza la tabla TPERSONAVINCULACIONES
				this.updateTlinkingperson(cpersona, cpersonaCon, separacionBienes, pDetail.getUser());
				// Actualiza la tabla TNATURALINFORMACIONADICIONAL
				this.updateTadditionalinformationnatural(cpersona, numCargas, cnivelEducacion, cProfecion,
						pDetail.getUser());
				// Actualiza la tabla TPERSONADIRECCIONES para el CORREO
				this.updateTpersonAddressEmail(cpersona, correo, pDetail.getUser());
				// Actualiza la tabla TPERSONADIRECCIONES para la DIRECCIÓN
				this.updateTpersonAddressHome(cpersona, direccion, duenoCasa, referencia, pDetail.getUser());
				// Actualiza la tabla TNATURALNIVELDEVIDA
				this.updateTlifelevelnatural(cpersona, tiempoViviendaAct, unidadtiempo, pDetail.getUser());
				// Actualiza la table TPERSONATELEFONOS para Celular
				this.updateTtelephoneCel(cpersona, celular, pDetail.getUser());
				// Actualiza la table TPERSONATELEFONOS para Telefono
				this.updateTtelephoneHome(cpersona, telefonoDomicilio, pDetail.getUser());
			}
		}

		Integer cpersona = pDetail.findFieldByNameCreate("CPERSONA").getIntegerValue();
		// Actualización de referencias personales
		Table trefCom = pDetail.findTableByName("TPERSONAREFERENCIASCOMERCIALES");
		if (trefCom != null && trefCom.getRecordCount() > 0) {
			this.expirecomercialrefere(cpersona);
			Integer secuencia = this.getComercialrefereSeq(cpersona);
			for (Record r : trefCom.getRecords()) {
				TcomercialreferencenaturalKey keyRefCom = new TcomercialreferencenaturalKey(cpersona, secuencia,
						ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
				Tcomercialreferencenatural refCom = new Tcomercialreferencenatural(keyRefCom,
						new Timestamp(System.currentTimeMillis()));
				refCom.setNombreempresa(r.findFieldByNameCreate("DESCRIPCION").getStringValue());
				refCom.setObservaciones(r.findFieldByNameCreate("OBSERVACION").getStringValue());
				refCom.setValorcuota(r.findFieldByNameCreate("VALOR").getBigDecimalValue());
				refCom.setTelefonoempresa(r.findFieldByNameCreate("TELEFONO").getStringValue());
				Helper.saveOrUpdate(refCom);
				secuencia = secuencia + 1;
			}
		}

		// Actualización de referencias comerciales
		Table trefPer = pDetail.findTableByName("TPERSONAREFERENCIASPERSONALES");
		if (trefPer != null && trefPer.getRecordCount() > 0) {
			this.expirePersonalrefere(cpersona);
			Integer secuencia = this.getPersonalRefereSeq(cpersona);
			for (Record r : trefPer.getRecords()) {
				TpersonalreferencepersonKey keyRefPer = new TpersonalreferencepersonKey(cpersona, secuencia,
						ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
				Tpersonalreferenceperson refPer = new Tpersonalreferenceperson(keyRefPer,
						new Timestamp(System.currentTimeMillis()));
				refPer.setNombrepersona(r.findFieldByNameCreate("NOMBREPERSONA").getStringValue());
				refPer.setTelefono(r.findFieldByNameCreate("TELEFONO").getStringValue());
				refPer.setDetalle(r.findFieldByNameCreate("DETALLE").getStringValue());
				Helper.saveOrUpdate(refPer);
				secuencia = secuencia + 1;
			}
		}
		// Actualización de ingresos y egresos
		Table tnatIngEg = pDetail.findTableByName("TNATURALINGRESOSEGRESOS");
		if (tnatIngEg != null && tnatIngEg.getRecordCount() > 0) {
			this.expireIncomeEgress(cpersona);
			Integer secuenciaIng = this.getIngresoSequence(cpersona);
			Integer secuenciaEgr = this.getEgresoSequence(cpersona);
			for (Record r : tnatIngEg.getRecords()) {
				String ingresoEgreso = r.findFieldByNameCreate("GRUPOCUENTACODE").getStringValue();
				Integer cuentaId = r.findFieldByNameCreate("CUENTAID").getIntegerValue();
				BigDecimal valor = r.findFieldByNameCreate("VALORDETALLECUENTAS").getBigDecimalValue();
				if (ingresoEgreso == null) {
					continue;
				}
				if ("INGRESO".compareTo(ingresoEgreso) == 0) {
					TexpendituresrevenuesnaturalKey keyIngEgr = new TexpendituresrevenuesnaturalKey(cpersona, "I",
							secuenciaIng, ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
					Texpendituresrevenuesnatural tnatInEg = new Texpendituresrevenuesnatural(keyIngEgr,
							new Timestamp(System.currentTimeMillis()), cuentaId, "USD", valor, "0");
					Helper.saveOrUpdate(tnatInEg);
					secuenciaIng = secuenciaIng + 1;
				} else if ("EGRESO".compareTo(ingresoEgreso) == 0) {
					TexpendituresrevenuesnaturalKey keyIngEgr = new TexpendituresrevenuesnaturalKey(cpersona, "E",
							secuenciaEgr, ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
					Texpendituresrevenuesnatural tnatInEg = new Texpendituresrevenuesnatural(keyIngEgr,
							new Timestamp(System.currentTimeMillis()), cuentaId, "USD", valor, "0");
					Helper.saveOrUpdate(tnatInEg);
					secuenciaEgr = secuenciaEgr + 1;
				}
			}
		}
		// Actualización de activos y pasivos
		Table tnatActPas = pDetail.findTableByName("TNATURALACTIVOSPASIVOS");
		if (tnatActPas != null && tnatActPas.getRecordCount() > 0) {
			this.expireActivePassive(cpersona);
			Integer secuenciaAct = this.getActiveSequence(cpersona);
			Integer secuenciaPas = this.getPasiveSequence(cpersona);
			for (Record r : tnatActPas.getRecords()) {
				String ingresoEgreso = r.findFieldByNameCreate("GRUPOCUENTACODEDETALLEPATRIMONIAL").getStringValue();
				Integer cuentaId = r.findFieldByNameCreate("CUENTAIDDETALLEPATRIMONIAL").getIntegerValue();
				BigDecimal valor = r.findFieldByNameCreate("VALORDETALLEPATRIMONIAL").getBigDecimalValue();
				if (ingresoEgreso == null) {
					continue;
				}
				if ("ACTIVO".compareTo(ingresoEgreso) == 0) {
					TexpendituresrevenuesnaturalKey keyIngEgr = new TexpendituresrevenuesnaturalKey(cpersona, "A",
							secuenciaAct, ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
					Texpendituresrevenuesnatural tnatInEg = new Texpendituresrevenuesnatural(keyIngEgr,
							new Timestamp(System.currentTimeMillis()), cuentaId, "USD", valor, "0");
					Helper.saveOrUpdate(tnatInEg);
					secuenciaAct = secuenciaAct + 1;
				} else if ("PASIVO".compareTo(ingresoEgreso) == 0) {
					TexpendituresrevenuesnaturalKey keyIngEgr = new TexpendituresrevenuesnaturalKey(cpersona, "P",
							secuenciaPas, ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
					Texpendituresrevenuesnatural tnatInEg = new Texpendituresrevenuesnatural(keyIngEgr,
							new Timestamp(System.currentTimeMillis()), cuentaId, "USD", valor, "0");
					Helper.saveOrUpdate(tnatInEg);
					secuenciaPas = secuenciaPas + 1;
				}
			}
		}
		// Actualización de ventas montos
		BigDecimal ventasMontos = pDetail.findFieldByNameCreate("VENTASMONTOS").getBigDecimalValue();

		if (ventasMontos != null) {
			TgeneralbalancejuridicalKey keyBal = new TgeneralbalancejuridicalKey(cpersona, pDetail.getAccountingDate(),
					"USD", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Tgeneralbalancejuridical bean = Helper.getBean(Tgeneralbalancejuridical.class, keyBal);
			if (bean == null) {
				bean = new Tgeneralbalancejuridical(keyBal, new Timestamp(System.currentTimeMillis()));
			}
			bean.setVentasnetas(ventasMontos);
			Helper.saveOrUpdate(bean);
		}

		return pDetail;
	}

	public void upDateBasicinformationnatural(Integer pCpersona, Integer pEstado, String pCtipoVivienda, String pUser)
			throws Exception {
		TbasicinformationnaturalKey tnatkey = new TbasicinformationnaturalKey(pCpersona,
				ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		Tbasicinformationnatural tbasicIfoNat = Helper.getBean(Tbasicinformationnatural.class, tnatkey);
		if (tbasicIfoNat != null) {
			tbasicIfoNat.setCestadocivil(pEstado);
			tbasicIfoNat.setCtipovivienda(pCtipoVivienda);
			tbasicIfoNat.setCusuario_modificacion(pUser);
			Helper.saveOrUpdate(tbasicIfoNat);
		}
	}

	public void updateTlinkingperson(Integer pCpersona, Integer pCpersonaCon, boolean pSeparacionBienes, String pUser)
			throws Exception {
		// Actualiza la tabla TPERSONAVINCULACIONES
		if (pCpersona != null && pCpersonaCon != null) {
			TlinkingpersonKey tlinkPerKey = new TlinkingpersonKey(pCpersona, pCpersonaCon, "31",
					ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Tlinkingperson tlinkPer = Helper.getBean(Tlinkingperson.class, tlinkPerKey);
			if (tlinkPer == null) {
				tlinkPer = new Tlinkingperson(tlinkPerKey, new Timestamp(System.currentTimeMillis()));
			}
			tlinkPer.setSeparacionbienes(pSeparacionBienes == true ? "1" : "0");
			tlinkPer.setCusuario_modificacion(pUser);
			Helper.saveOrUpdate(tlinkPer);
		}
	}

	public void updateTadditionalinformationnatural(Integer pCpersona, Integer numCargas, Integer pCnivelEducacion,
			Integer pCProfecion, String pUser) throws Exception {
		TadditionalinformationnaturalKey tadkey = new TadditionalinformationnaturalKey(pCpersona,
				ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		Tadditionalinformationnatural tadnat = Helper.getBean(Tadditionalinformationnatural.class, tadkey);
		if (tadnat != null) {
			tadnat.setNumerocargas(numCargas == null ? 0 : numCargas);
			tadnat.setCniveleducacion(pCnivelEducacion);
			tadnat.setCprofesion(pCProfecion);
			tadnat.setCusuario_modificacion(pUser);
			Helper.saveOrUpdate(tadnat);
		}
	}

	public void updateTpersonAddressEmail(Integer pCpersona, String pCorreo, String pUser) throws Exception {
		if (!updateEmail(pCpersona, pCorreo, pUser)) {
			UtilHB utilHB = new UtilHB();
			utilHB.setSentence(HQL_DIRECCIONESMAX);
			utilHB.setInteger("cpersona", pCpersona);
			utilHB.setReadonly(true);
			Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
			Integer numero = (Integer) secuencia;
			numero = numero + 1;
			TaddresspersonKey ceKey = new TaddresspersonKey(pCpersona, numero,
					ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Taddressperson address = new Taddressperson();
			address.setPk(ceKey);
			address.setDireccion(pCorreo);
			address.setCtipodireccion("CE");
			address.setDireccionprincipal("0");
			address.setCpais("EC");
			address.setCusuario_ingreso(pUser);
			Helper.saveOrUpdate(address);

		}
	}

	public void updateTpersonAddressHome(Integer pCpersona, String pDireccion, String pDuenoCasa, String pReferencia,
			String pUser) throws Exception {
		if (!updateDomicilio(pCpersona, pDireccion, pUser, pDuenoCasa, pReferencia)) {
			UtilHB utilHB = new UtilHB();
			utilHB.setSentence(HQL_DIRECCIONESMAX);
			utilHB.setInteger("cpersona", pCpersona);
			utilHB.setReadonly(true);
			Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
			Integer numero = (Integer) secuencia;
			numero = numero + 1;
			TaddresspersonKey ceKey = new TaddresspersonKey(pCpersona, numero,
					ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Taddressperson address = new Taddressperson();
			address.setPk(ceKey);
			address.setDireccion(pDireccion);
			address.setNombrepropietario(pDuenoCasa);
			address.setObservaciones(pReferencia);
			address.setCtipodireccion("DO");
			address.setDireccionprincipal("0");
			address.setCpais("EC");
			address.setCusuario_ingreso(pUser);
			Helper.saveOrUpdate(address);

		}
	}

	public boolean updateEmail(Integer pCpersona, String pDireccion, String pUser) throws Exception {
		boolean band = false;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_DIRECCIONESCE);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Taddressperson address = (Taddressperson) obj;
				address.setDireccion(pDireccion);
				address.setCusuario_modificacion(pUser);
				Helper.saveOrUpdate(address);
				band = true;
			}
		}
		return band;
	}

	public boolean updateDomicilio(Integer pCpersona, String pDireccion, String pUser, String pDuenoCasa,
			String pReferencia) throws Exception {
		boolean band = false;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_DIRECCIONESDO);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Taddressperson address = (Taddressperson) obj;
				address.setDireccion(pDireccion);
				address.setNombrepropietario(pDuenoCasa);
				address.setObservaciones(pReferencia);
				address.setCusuario_modificacion(pUser);
				Helper.saveOrUpdate(address);
				band = true;
			}
		}
		return band;
	}

	public void updateTlifelevelnatural(Integer pCpersona, Integer pTiempoViviendaAct, String pUnidadtiempo,
			String pUser) throws Exception {
		if (pTiempoViviendaAct != null && pUnidadtiempo != null) {
			Integer meses = 0;
			TlifelevelnaturalKey tnatlifekey = new TlifelevelnaturalKey(pCpersona,
					ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Tlifelevelnatural tnatlife = Helper.getBean(Tlifelevelnatural.class, tnatlifekey);

			if (tnatlife == null) {
				tnatlife = new Tlifelevelnatural(tnatlifekey, new Timestamp(System.currentTimeMillis()));
				tnatlife.setCusuario_ingreso(pUser);
			} else {
				tnatlife.setCusuario_modificacion(pUser);
			}

			if ("A".compareTo(pUnidadtiempo) == 0) {
				tnatlife.setTiemporesidencia(pTiempoViviendaAct);
				tnatlife.setMesesresidencia("0");
				Helper.saveOrUpdate(tnatlife);
			} else if ("M".compareTo(pUnidadtiempo) == 0) {
				double calculo = (pTiempoViviendaAct * 1.0) / 12.0;
				double mesesD = (calculo % 1);
				double aniosD = calculo - mesesD;
				meses = (int) Math.round(mesesD * 12.0);
				tnatlife.setTiemporesidencia((int) aniosD);
				tnatlife.setMesesresidencia(meses.toString());
				Helper.saveOrUpdate(tnatlife);
			}
		}
	}

	public void updateTtelephoneCel(Integer pCpersona, String pNumeroTelefono, String pUser) throws Exception {
		if (!updateCelular(pCpersona, pNumeroTelefono, pUser)) {
			UtilHB utilHB = new UtilHB();
			utilHB.setSentence(HQL_TELEFONOMAX);
			utilHB.setInteger("cpersona", pCpersona);
			utilHB.setReadonly(true);
			Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
			Integer numero = (Integer) secuencia;
			numero = numero + 1;
			TtelephonepersonKey ceKey = new TtelephonepersonKey(pCpersona, numero,
					ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Ttelephoneperson cel = new Ttelephoneperson();
			cel.setPk(ceKey);
			cel.setNumerotelefono(pNumeroTelefono);
			cel.setCtipotelefono("CEL");
			cel.setCodigoarea(593);
			cel.setCtipoubicacion("001");
			cel.setCusuario_ingreso(pUser);
			Helper.saveOrUpdate(cel);
		}
	}

	public boolean updateCelular(Integer pCpersona, String pNumeroTelefono, String pUser) throws Exception {
		boolean band = false;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_TELEFONOSCEL);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Ttelephoneperson cel = (Ttelephoneperson) obj;
				cel.setNumerotelefono(pNumeroTelefono);
				cel.setCtipotelefono("CEL");
				cel.setCodigoarea(593);
				cel.setCtipoubicacion("001");
				cel.setCusuario_modificacion(pUser);
				Helper.saveOrUpdate(cel);
				band = true;
			}
		}
		return band;
	}

	public void updateTtelephoneHome(Integer pCpersona, String pNumeroTelefono, String pUser) throws Exception {
		if (!updateTelHome(pCpersona, pNumeroTelefono, pUser)) {
			UtilHB utilHB = new UtilHB();
			utilHB.setSentence(HQL_TELEFONOMAX);
			utilHB.setInteger("cpersona", pCpersona);
			utilHB.setReadonly(true);
			Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
			Integer numero = (Integer) secuencia;
			numero = numero + 1;
			TtelephonepersonKey ceKey = new TtelephonepersonKey(pCpersona, numero,
					ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
			Ttelephoneperson cel = new Ttelephoneperson();
			cel.setPk(ceKey);
			cel.setNumerotelefono(pNumeroTelefono);
			cel.setCtipotelefono("TEL");
			cel.setCodigoarea(593);
			cel.setCtipoubicacion("001");
			cel.setCusuario_ingreso(pUser);
			Helper.saveOrUpdate(cel);
		}
	}

	public boolean updateTelHome(Integer pCpersona, String pNumeroTelefono, String pUser) throws Exception {
		boolean band = false;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_TELEFONOSHOME);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Ttelephoneperson cel = (Ttelephoneperson) obj;
				cel.setNumerotelefono(pNumeroTelefono);
				cel.setCtipotelefono("TEL");
				cel.setCodigoarea(593);
				cel.setCtipoubicacion("001");
				cel.setCusuario_modificacion(pUser);
				Helper.saveOrUpdate(cel);
				band = true;
			}
		}
		return band;
	}

	public void expirecomercialrefere(Integer pCpersona) throws Exception {
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_REFRENCIASCOMERCIALES);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Tcomercialreferencenatural cel = (Tcomercialreferencenatural) obj;
				Helper.expire(cel);
			}
		}
	}

	public Integer getComercialrefereSeq(Integer pCpersona) throws Exception {
		Integer numero = 1;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_COMERCIALREFMAX);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setReadonly(true);
		Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
		numero = (Integer) secuencia;
		numero = numero + 1;
		return numero;
	}

	public void expirePersonalrefere(Integer pCpersona) throws Exception {
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_REFRENCIASPERSONALES);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Tpersonalreferenceperson ref = (Tpersonalreferenceperson) obj;
				Helper.expire(ref);
			}
		}
	}

	public Integer getPersonalRefereSeq(Integer pCpersona) throws Exception {
		Integer numero = 1;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_PERSONALREFMAX);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setReadonly(true);
		Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
		numero = (Integer) secuencia;
		numero = numero + 1;
		return numero;
	}

	public void expireIncomeEgress(Integer pCpersona) throws Exception {
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_INGRESOEGRESO);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Texpendituresrevenuesnatural bean = (Texpendituresrevenuesnatural) obj;
				Helper.expire(bean);
			}
		}
	}

	public void expireActivePassive(Integer pCpersona) throws Exception {
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_ACTIVOPASIVO);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setTimestamp("fhasta", ApplicationDates.DEFAULT_EXPIRY_TIMESTAMP);
		utilHB.setReadonly(true);
		utilHB.getResults();
		if (!utilHB.getResults().isEmpty()) {
			for (Object obj : utilHB.getResults()) {
				Texpendituresrevenuesnatural bean = (Texpendituresrevenuesnatural) obj;
				Helper.expire(bean);
			}
		}
	}

	public Integer getIngresoSequence(Integer pCpersona) throws Exception {
		Integer numero = 1;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_INGRESOMAX);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setReadonly(true);
		Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
		numero = (Integer) secuencia;
		numero = numero + 1;
		return numero;
	}

	public Integer getEgresoSequence(Integer pCpersona) throws Exception {
		Integer numero = 1;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_EGRESOMAX);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setReadonly(true);
		Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
		numero = (Integer) secuencia;
		numero = numero + 1;
		return numero;
	}

	public Integer getActiveSequence(Integer pCpersona) throws Exception {
		Integer numero = 1;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_ACTIVOMAX);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setReadonly(true);
		Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
		numero = (Integer) secuencia;
		numero = numero + 1;
		return numero;
	}

	public Integer getPasiveSequence(Integer pCpersona) throws Exception {
		Integer numero = 1;
		UtilHB utilHB = new UtilHB();
		utilHB.setSentence(HQL_PASIVOMAX);
		utilHB.setInteger("cpersona", pCpersona);
		utilHB.setReadonly(true);
		Object secuencia = utilHB.getObject() == null ? 0 : utilHB.getObject();
		numero = (Integer) secuencia;
		numero = numero + 1;
		return numero;
	}

	public Detail executeReverse(Detail pDetail) throws Exception {

		return pDetail;
	}

}

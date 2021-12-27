package com.passcop.source.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.passcop.source.model.Vpersona;
import com.passcop.source.request.Persona;
import com.passcop.source.request.RespuestaSolicitud;

public class HelperResponse implements Serializable {

	public Persona consultarPersona(List<Vpersona> personas) throws Exception {
		Vpersona vper = personas.get(0);

		Persona persona = new Persona();
		persona.setPersonaID(vper.getPersonaid().intValueExact());
		persona.setRelacionCOD(vper.getRelacioncod());

		persona.setNomreModulo(vper.getNombremodulo());
		persona.setUsuarioID(vper.getUsuarioid() != null ? Short.parseShort(vper.getUsuarioid()) : new Short("0"));
		persona.setIdentificacion(vper.getIdentificacion());
		persona.setIdentificacionConyuge(vper.getIdentificacionconyuge());
		persona.setTipoPersonaCOD(vper.getTipopersonacod());
		persona.setTipoIdentificacionCOD(vper.getTipoidentificacioncod());
		persona.setApellidoPaterno(vper.getApellidopaterno());
		persona.setApellidoMaterno(vper.getApellidomaterno());
		persona.setNombres(vper.getNombres());
		persona.setFechaNacimiento(
				vper.getFechanacimiento() != null ? dateToCalendar(vper.getFechanacimiento()) : null);
		persona.setEstadoCivilCOD(vper.getEstadocivilcod() != null ? vper.getEstadocivilcod().toString() : null);
		persona.setSexoCOD(vper.getSexocod());
		persona.setNumeroCarga(vper.getNumerocarga() != null ? vper.getNumerocarga().shortValueExact() : null);
		persona.setSeparacionBienes(
				vper.getSeparacionbienes() != null && vper.getSeparacionbienes() == "1" ? true : false);
		persona.setNacionalidadCOD(vper.getNacionalidadcod());
		persona.setNivelEducacionCOD(
				vper.getNiveleducacioncod() != null ? vper.getNiveleducacioncod().toString() : null);
		persona.setOcupacionCOD(vper.getOcupacioncod() != null ? vper.getOcupacioncod().toString() : null);
		persona.setCorreo(vper.getCorreo());
		persona.setFechaApertura(dateToCalendar(vper.getFechaapertura()));
		persona.setLocalidadCOD(vper.getLocalidadcod());
		persona.setDireccion(vper.getDireccion());
		persona.setTipoViviendaCOD(vper.getTipoviviendacod());
		persona.setSituacionViviendaCOD(vper.getSituacionviviendacod());
		persona.setViviendaHipotecada(false); // La cooperativa Debe definir la fuente
		persona.setDuenoCasa(vper.getDuenocasa());
		persona.setTelefonoDuenoCasa(vper.getTelefonoduenocasa());
		persona.setTiempoViviendaActual(
				vper.getTiempoviviendaactual() != null ? vper.getTiempoviviendaactual().shortValueExact() : null);
		persona.setUnidadTiempoViviendaActualCOD(vper.getUnidadtiempoviviendaactualcod());
		persona.setReferenciaUbicacion(vper.getReferenciaubicacion());
		persona.setTiempoViviendaAnterior(null); // El campo no existe en Fitbank
		persona.setUnidadTiempoViviendaAnteriorCOD(null); // El campo no existe en Fitbank
		persona.setTelefonoDomicilio(vper.getTelefonodomicilio());
		persona.setTelefonoCelular(vper.getTelefonocelular());
		persona.setTieneError(false);
		persona.setMensaje("D204");

		return persona;
	}

	public List<Persona> consultarPersona2(List<Vpersona> personas) {

		Vpersona vper = personas.get(0);
		List<Persona> pers = new ArrayList<Persona>();
		System.out.println("PersonaID: " + vper.getPersonaid().intValueExact());
		System.out.println("UsuarioId" + vper.getUsuarioid());

		for (Vpersona vpersona : personas) {
			Persona persona = new Persona();
			persona.setPersonaID(vper.getPersonaid().intValueExact());
			persona.setRelacionCOD(vper.getRelacioncod());

			persona.setNomreModulo(vper.getNombremodulo());
			persona.setUsuarioID(vper.getUsuarioid() != null ? Short.parseShort(vper.getUsuarioid()) : new Short("0"));
			persona.setIdentificacion(vper.getIdentificacion());
			persona.setIdentificacionConyuge(vper.getIdentificacionconyuge());
			persona.setTipoPersonaCOD(vper.getTipopersonacod());
			persona.setTipoIdentificacionCOD(vper.getTipoidentificacioncod());
			persona.setApellidoPaterno(vper.getApellidopaterno());
			persona.setApellidoMaterno(vper.getApellidomaterno());
			persona.setNombres(vper.getNombres());
			persona.setFechaNacimiento(
					vper.getFechanacimiento() != null ? dateToCalendar(vper.getFechanacimiento()) : null);
			persona.setEstadoCivilCOD(vper.getEstadocivilcod() != null ? vper.getEstadocivilcod().toString() : null);
			persona.setSexoCOD(vper.getSexocod());
			persona.setNumeroCarga(vper.getNumerocarga() != null ? vper.getNumerocarga().shortValueExact() : null);
			persona.setSeparacionBienes(
					vper.getSeparacionbienes() != null && vper.getSeparacionbienes() == "1" ? true : false);
			persona.setNacionalidadCOD(vper.getNacionalidadcod());
			persona.setNivelEducacionCOD(
					vper.getNiveleducacioncod() != null ? vper.getNiveleducacioncod().toString() : null);
			persona.setOcupacionCOD(vper.getOcupacioncod() != null ? vper.getOcupacioncod().toString() : null);
			persona.setCorreo(vper.getCorreo());
			persona.setFechaApertura(dateToCalendar(vper.getFechaapertura()));
			persona.setLocalidadCOD(vper.getLocalidadcod());
			persona.setDireccion(vper.getDireccion());
			persona.setTipoViviendaCOD(vper.getTipoviviendacod());
			persona.setSituacionViviendaCOD(vper.getSituacionviviendacod());
			persona.setViviendaHipotecada(false); // La cooperativa Debe definir la fuente
			persona.setDuenoCasa(vper.getDuenocasa());
			persona.setTelefonoDuenoCasa(vper.getTelefonoduenocasa());
			persona.setTiempoViviendaActual(
					vper.getTiempoviviendaactual() != null ? vper.getTiempoviviendaactual().shortValueExact() : null);
			persona.setUnidadTiempoViviendaActualCOD(vper.getUnidadtiempoviviendaactualcod());
			persona.setReferenciaUbicacion(vper.getReferenciaubicacion());
			persona.setTiempoViviendaAnterior(null); // El campo no existe en Fitbank
			persona.setUnidadTiempoViviendaAnteriorCOD(null); // El campo no existe en Fitbank
			persona.setTelefonoDomicilio(vper.getTelefonodomicilio());
			persona.setTelefonoCelular(vper.getTelefonocelular());
			persona.setTieneError(false);
			persona.setMensaje("D204");
			pers.add(persona);
		}

		return pers;
	}

	public Calendar dateToCalendar(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;

	}

	public String[] getProduct(String pId) throws Exception {
		String product = null;
		switch (pId) {

		case "2620":
			product = "02-620";
			break;
		case "2622":
			product = "02-622";
			break;
		case "4642":
			product = "04-642";
			break;
		case "4645":
			product = "04-645";
			break;
		case "4640 AA":
			product = "04-640";
			break;
		case "4640 AS":
			product = "04-640";
			break;
		case "4640 MIN":
			product = "04-640";
			break;
		case "4644 AA":
			product = "04-644";
			break;
		case "4644 AS":
			product = "04-644";
			break;
		case "4644 MIN":
			product = "04-644";
			break;
		case "4648 AA":
			product = "04-648";
			break;
		case "4648 AS":
			product = "04-648";
			break;
		case "4648 MIN":
			product = "04-648";
			break;
		case "4652 AA":
			product = "04-652";
			break;
		case "4652 AS":
			product = "04-652";
			break;
		case "4652 MIN":
			product = "04-652";
			break;
		}
		return (product != null) ? product.split("-") : null;
	}

	public String getTipoCuota(String pId) throws Exception {
		String product = "";
		switch (pId) {

		case "F":
			product = "AMG";
			break;
		case "D":
			product = "CAP";
			break;
		}
		return product;
	}

	public String getFrecuencia(String pId) throws Exception {
		String frecuencia = "";
		switch (pId) {
		case "360":
			frecuencia = "8";
			break;
		case "60":
			frecuencia = "10";
			break;
		case "1":
			frecuencia = "1";
			break;
		case "30":
			frecuencia = "5";
			break;
		case "15":
			frecuencia = "4";
			break;
		case "7":
			frecuencia = "2";
			break;
		case "180":
			frecuencia = "7";
			break;
		case "90":
			frecuencia = "6";
			break;
		}
		return frecuencia;
	}

	public String getIdTipoBien(String pId) throws Exception {
		String frecuencia = "";
		switch (pId) {
		case "TERRENOS":
			frecuencia = "110";
			break;
		case "EDIFICACIONES":
			frecuencia = "120";
			break;
		case "EQUIPOS":
			frecuencia = "220";
			break;
		}
		return frecuencia;
	}

	public RespuestaSolicitud getResponseNotFoundProduct() {
		RespuestaSolicitud resSol = new RespuestaSolicitud();
		resSol.setTieneError(true);
		resSol.setRespuestaCOD("D404");
		resSol.setMensaje("Validacion No Exitosa No se puede identificar el Producto");
		resSol.setMensajePersonalizado("Validacion No Exitosa No se puede identificar el Producto");
		resSol.setMensajeTecnico("Validacion No Exitosa No se puede identificar el Producto");
		return resSol;
	}

	public RespuestaSolicitud getResponseNotIdentification(String pIdentificacion) {
		RespuestaSolicitud resSol = new RespuestaSolicitud();
		resSol.setTieneError(true);
		resSol.setRespuestaCOD("D404");
		resSol.setMensaje("Validacion No Exitosa No se puede encontrar la identificacion " + pIdentificacion);
		resSol.setMensajePersonalizado(
				"Validacion No Exitosa No se puede encontrar la identificacion" + pIdentificacion);
		resSol.setMensajeTecnico("Validacion No Exitosa No se puede encontrar la identificacion" + pIdentificacion);
		return resSol;
	}

	public RespuestaSolicitud verifyParameters(Short pPlazo, String pFormaPago) {
		RespuestaSolicitud resSol = new RespuestaSolicitud();

		if (pPlazo == null || pPlazo == 0) {
			resSol.setTieneError(true);
			resSol.setRespuestaCOD("D503");
			resSol.setMensaje("Parámetro Plazo no enviado o igual a cero");
			resSol.setMensajePersonalizado("Parámetro Plazo no enviado o igul a cero ");
			resSol.setMensajeTecnico("Parámetro Plazo no enviado o igul a cero");
		}

		if (pFormaPago == null || pFormaPago == "") {
			resSol.setTieneError(true);
			resSol.setRespuestaCOD("D503");
			resSol.setMensaje("Parámetro FormaPago no enviado");
			resSol.setMensajePersonalizado("Parámetro FormaPago no enviado");
			resSol.setMensajeTecnico("Parámetro FormaPago no enviado");
		}
		return resSol;
	}
}

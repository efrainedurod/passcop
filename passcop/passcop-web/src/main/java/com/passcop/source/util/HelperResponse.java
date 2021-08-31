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
	
	public String[] getProduct(Integer pId) throws Exception {
		String product = null;
		switch (pId) {

		case 1610:
			product = "01-610";
			break;
		case 1611:
			product = "01-611";
			break;
		case 2620:
			product = "02-620";
			break;
		case 2621:
			product = "02-621";
			break;
		case 2622:
			product = "02-622";
			break;
		case 3630:
			product = "03-630";
			break;
		case 4640:
			product = "04-640";
			break;
		case 4641:
			product = "01-641";
			break;
		case 4642:
			product = "01-642";
			break;
		case 4643:
			product = "01-643";
			break;
		case 4644:
			product = "01-644";
			break;
		case 4645:
			product = "01-645";
			break;
		case 4646:
			product = "04-646";
			break;
		case 4647:
			product = "04-647";
			break;
		case 4648:
			product = "4-648";
			break;
		case 4649:
			product = "04-649";
			break;
		case 4650:
			product = "04-650";
			break;
		case 4651:
			product = "04-651";
			break;
		case 4652:
			product = "04-652";
			break;
		case 4653:
			product = "04-653";
			break;
		case 4654:
			product = "04-654";
			break;
		case 5655:
			product = "05-655";
			break;
		case 7670:
			product = "07-670";
			break;
		case 9690:
			product = "09-690";
			break;
		}
		return (product != null) ? product.split("-") : null;
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
}

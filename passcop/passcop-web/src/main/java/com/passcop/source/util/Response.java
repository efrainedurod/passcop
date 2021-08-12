package com.passcop.source.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;
import org.slf4j.Logger;

import com.passcop.source.model.Vpersona;
import com.passcop.source.request.Persona;


public class Response implements Serializable {
	
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
}

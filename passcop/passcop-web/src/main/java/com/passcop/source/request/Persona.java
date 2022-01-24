/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class Persona  implements java.io.Serializable {
    private int personaID;

    private java.lang.String relacionCOD;

    private java.lang.String nomreModulo;

    private short usuarioID;

    private java.lang.String identificacion;

    private java.lang.String identificacionConyuge;

    private java.lang.String tipoPersonaCOD;

    private java.lang.String tipoIdentificacionCOD;

    private java.lang.String apellidoPaterno;

    private java.lang.String apellidoMaterno;

    private java.lang.String nombres;

    private java.util.Calendar fechaNacimiento;

    private java.lang.String estadoCivilCOD;

    private java.lang.String sexoCOD;

    private int numeroCarga;

    private boolean separacionBienes;

    private java.lang.String nacionalidadCOD;

    private java.lang.String nivelEducacionCOD;

    private java.lang.String ocupacionCOD;

    private java.lang.String correo;

    private java.util.Calendar fechaApertura;

    private java.lang.String localidadCOD;

    private java.lang.String direccion;

    private java.lang.String tipoViviendaCOD;

    private java.lang.String situacionViviendaCOD;

    private boolean viviendaHipotecada;

    private java.lang.String duenoCasa;

    private java.lang.String telefonoDuenoCasa;

    private java.lang.Short tiempoViviendaActual;

    private java.lang.String unidadTiempoViviendaActualCOD;

    private java.lang.String referenciaUbicacion;

    private java.lang.Short tiempoViviendaAnterior;

    private java.lang.String unidadTiempoViviendaAnteriorCOD;

    private java.lang.String telefonoDomicilio;

    private java.lang.String telefonoCelular;

    private boolean tieneError;

    private java.lang.String mensaje;

    public Persona() {
    }

    public Persona(
           int personaID,
           java.lang.String relacionCOD,
           java.lang.String nomreModulo,
           short usuarioID,
           int numeroCarga/*,
           java.lang.String identificacion,
           java.lang.String identificacionConyuge,
           java.lang.String tipoPersonaCOD,
           java.lang.String tipoIdentificacionCOD,
           java.lang.String apellidoPaterno,
           java.lang.String apellidoMaterno,
           java.lang.String nombres,
           java.util.Calendar fechaNacimiento,
           java.lang.String estadoCivilCOD,
           java.lang.String sexoCOD,
           boolean separacionBienes,
           java.lang.String nacionalidadCOD,
           java.lang.String nivelEducacionCOD,
           java.lang.String ocupacionCOD,
           java.lang.String correo,
           java.util.Calendar fechaApertura,
           java.lang.String localidadCOD,
           java.lang.String direccion,
           java.lang.String tipoViviendaCOD,
           java.lang.String situacionViviendaCOD,
           boolean viviendaHipotecada,
           java.lang.String duenoCasa,
           java.lang.String telefonoDuenoCasa,
           java.lang.Short tiempoViviendaActual,
           java.lang.String unidadTiempoViviendaActualCOD,
           java.lang.String referenciaUbicacion,
           java.lang.Short tiempoViviendaAnterior,
           java.lang.String unidadTiempoViviendaAnteriorCOD,
           java.lang.String telefonoDomicilio,
           java.lang.String telefonoCelular,
           boolean tieneError,
           java.lang.String mensaje*/) {
           this.personaID = personaID;
           this.relacionCOD = relacionCOD;
           this.nomreModulo = nomreModulo;
           this.usuarioID = usuarioID;
           this.numeroCarga = numeroCarga;
          /* this.identificacion = identificacion;
           this.identificacionConyuge = identificacionConyuge;
           this.tipoPersonaCOD = tipoPersonaCOD;
           this.tipoIdentificacionCOD = tipoIdentificacionCOD;
           this.apellidoPaterno = apellidoPaterno;
           this.apellidoMaterno = apellidoMaterno;
           this.nombres = nombres;
           this.fechaNacimiento = fechaNacimiento;
           this.estadoCivilCOD = estadoCivilCOD;
           this.sexoCOD = sexoCOD;

           this.separacionBienes = separacionBienes;
           this.nacionalidadCOD = nacionalidadCOD;
           this.nivelEducacionCOD = nivelEducacionCOD;
           this.ocupacionCOD = ocupacionCOD;
           this.correo = correo;
           this.fechaApertura = fechaApertura;
           this.localidadCOD = localidadCOD;
           this.direccion = direccion;
           this.tipoViviendaCOD = tipoViviendaCOD;
           this.situacionViviendaCOD = situacionViviendaCOD;
           this.viviendaHipotecada = viviendaHipotecada;
           this.duenoCasa = duenoCasa;
           this.telefonoDuenoCasa = telefonoDuenoCasa;
           this.tiempoViviendaActual = tiempoViviendaActual;
           this.unidadTiempoViviendaActualCOD = unidadTiempoViviendaActualCOD;
           this.referenciaUbicacion = referenciaUbicacion;
           this.tiempoViviendaAnterior = tiempoViviendaAnterior;
           this.unidadTiempoViviendaAnteriorCOD = unidadTiempoViviendaAnteriorCOD;
           this.telefonoDomicilio = telefonoDomicilio;
           this.telefonoCelular = telefonoCelular;
           this.tieneError = tieneError;
           this.mensaje = mensaje;*/
    }


    /**
     * Gets the personaID value for this Persona.
     * 
     * @return personaID
     */
    public int getPersonaID() {
        return personaID;
    }


    /**
     * Sets the personaID value for this Persona.
     * 
     * @param personaID
     */
    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }


    /**
     * Gets the relacionCOD value for this Persona.
     * 
     * @return relacionCOD
     */
    public java.lang.String getRelacionCOD() {
        return relacionCOD;
    }


    /**
     * Sets the relacionCOD value for this Persona.
     * 
     * @param relacionCOD
     */
    public void setRelacionCOD(java.lang.String relacionCOD) {
        this.relacionCOD = relacionCOD;
    }


    /**
     * Gets the nomreModulo value for this Persona.
     * 
     * @return nomreModulo
     */
    public java.lang.String getNomreModulo() {
        return nomreModulo;
    }


    /**
     * Sets the nomreModulo value for this Persona.
     * 
     * @param nomreModulo
     */
    public void setNomreModulo(java.lang.String nomreModulo) {
        this.nomreModulo = nomreModulo;
    }


    /**
     * Gets the usuarioID value for this Persona.
     * 
     * @return usuarioID
     */
    public short getUsuarioID() {
        return usuarioID;
    }


    /**
     * Sets the usuarioID value for this Persona.
     * 
     * @param usuarioID
     */
    public void setUsuarioID(short usuarioID) {
        this.usuarioID = usuarioID;
    }


    /**
     * Gets the identificacion value for this Persona.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this Persona.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the identificacionConyuge value for this Persona.
     * 
     * @return identificacionConyuge
     */
    public java.lang.String getIdentificacionConyuge() {
        return identificacionConyuge;
    }


    /**
     * Sets the identificacionConyuge value for this Persona.
     * 
     * @param identificacionConyuge
     */
    public void setIdentificacionConyuge(java.lang.String identificacionConyuge) {
        this.identificacionConyuge = identificacionConyuge;
    }


    /**
     * Gets the tipoPersonaCOD value for this Persona.
     * 
     * @return tipoPersonaCOD
     */
    public java.lang.String getTipoPersonaCOD() {
        return tipoPersonaCOD;
    }


    /**
     * Sets the tipoPersonaCOD value for this Persona.
     * 
     * @param tipoPersonaCOD
     */
    public void setTipoPersonaCOD(java.lang.String tipoPersonaCOD) {
        this.tipoPersonaCOD = tipoPersonaCOD;
    }


    /**
     * Gets the tipoIdentificacionCOD value for this Persona.
     * 
     * @return tipoIdentificacionCOD
     */
    public java.lang.String getTipoIdentificacionCOD() {
        return tipoIdentificacionCOD;
    }


    /**
     * Sets the tipoIdentificacionCOD value for this Persona.
     * 
     * @param tipoIdentificacionCOD
     */
    public void setTipoIdentificacionCOD(java.lang.String tipoIdentificacionCOD) {
        this.tipoIdentificacionCOD = tipoIdentificacionCOD;
    }


    /**
     * Gets the apellidoPaterno value for this Persona.
     * 
     * @return apellidoPaterno
     */
    public java.lang.String getApellidoPaterno() {
        return apellidoPaterno;
    }


    /**
     * Sets the apellidoPaterno value for this Persona.
     * 
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }


    /**
     * Gets the apellidoMaterno value for this Persona.
     * 
     * @return apellidoMaterno
     */
    public java.lang.String getApellidoMaterno() {
        return apellidoMaterno;
    }


    /**
     * Sets the apellidoMaterno value for this Persona.
     * 
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    /**
     * Gets the nombres value for this Persona.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this Persona.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the fechaNacimiento value for this Persona.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this Persona.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the estadoCivilCOD value for this Persona.
     * 
     * @return estadoCivilCOD
     */
    public java.lang.String getEstadoCivilCOD() {
        return estadoCivilCOD;
    }


    /**
     * Sets the estadoCivilCOD value for this Persona.
     * 
     * @param estadoCivilCOD
     */
    public void setEstadoCivilCOD(java.lang.String estadoCivilCOD) {
        this.estadoCivilCOD = estadoCivilCOD;
    }


    /**
     * Gets the sexoCOD value for this Persona.
     * 
     * @return sexoCOD
     */
    public java.lang.String getSexoCOD() {
        return sexoCOD;
    }


    /**
     * Sets the sexoCOD value for this Persona.
     * 
     * @param sexoCOD
     */
    public void setSexoCOD(java.lang.String sexoCOD) {
        this.sexoCOD = sexoCOD;
    }


    /**
     * Gets the numeroCarga value for this Persona.
     * 
     * @return numeroCarga
     */
    public int getNumeroCarga() {
        return numeroCarga;
    }


    /**
     * Sets the numeroCarga value for this Persona.
     * 
     * @param numeroCarga
     */
    public void setNumeroCarga(int numeroCarga) {
        this.numeroCarga = numeroCarga;
    }


    /**
     * Gets the separacionBienes value for this Persona.
     * 
     * @return separacionBienes
     */
    public boolean isSeparacionBienes() {
        return separacionBienes;
    }


    /**
     * Sets the separacionBienes value for this Persona.
     * 
     * @param separacionBienes
     */
    public void setSeparacionBienes(boolean separacionBienes) {
        this.separacionBienes = separacionBienes;
    }


    /**
     * Gets the nacionalidadCOD value for this Persona.
     * 
     * @return nacionalidadCOD
     */
    public java.lang.String getNacionalidadCOD() {
        return nacionalidadCOD;
    }


    /**
     * Sets the nacionalidadCOD value for this Persona.
     * 
     * @param nacionalidadCOD
     */
    public void setNacionalidadCOD(java.lang.String nacionalidadCOD) {
        this.nacionalidadCOD = nacionalidadCOD;
    }


    /**
     * Gets the nivelEducacionCOD value for this Persona.
     * 
     * @return nivelEducacionCOD
     */
    public java.lang.String getNivelEducacionCOD() {
        return nivelEducacionCOD;
    }


    /**
     * Sets the nivelEducacionCOD value for this Persona.
     * 
     * @param nivelEducacionCOD
     */
    public void setNivelEducacionCOD(java.lang.String nivelEducacionCOD) {
        this.nivelEducacionCOD = nivelEducacionCOD;
    }


    /**
     * Gets the ocupacionCOD value for this Persona.
     * 
     * @return ocupacionCOD
     */
    public java.lang.String getOcupacionCOD() {
        return ocupacionCOD;
    }


    /**
     * Sets the ocupacionCOD value for this Persona.
     * 
     * @param ocupacionCOD
     */
    public void setOcupacionCOD(java.lang.String ocupacionCOD) {
        this.ocupacionCOD = ocupacionCOD;
    }


    /**
     * Gets the correo value for this Persona.
     * 
     * @return correo
     */
    public java.lang.String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this Persona.
     * 
     * @param correo
     */
    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }


    /**
     * Gets the fechaApertura value for this Persona.
     * 
     * @return fechaApertura
     */
    public java.util.Calendar getFechaApertura() {
        return fechaApertura;
    }


    /**
     * Sets the fechaApertura value for this Persona.
     * 
     * @param fechaApertura
     */
    public void setFechaApertura(java.util.Calendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }


    /**
     * Gets the localidadCOD value for this Persona.
     * 
     * @return localidadCOD
     */
    public java.lang.String getLocalidadCOD() {
        return localidadCOD;
    }


    /**
     * Sets the localidadCOD value for this Persona.
     * 
     * @param localidadCOD
     */
    public void setLocalidadCOD(java.lang.String localidadCOD) {
        this.localidadCOD = localidadCOD;
    }


    /**
     * Gets the direccion value for this Persona.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this Persona.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the tipoViviendaCOD value for this Persona.
     * 
     * @return tipoViviendaCOD
     */
    public java.lang.String getTipoViviendaCOD() {
        return tipoViviendaCOD;
    }


    /**
     * Sets the tipoViviendaCOD value for this Persona.
     * 
     * @param tipoViviendaCOD
     */
    public void setTipoViviendaCOD(java.lang.String tipoViviendaCOD) {
        this.tipoViviendaCOD = tipoViviendaCOD;
    }


    /**
     * Gets the situacionViviendaCOD value for this Persona.
     * 
     * @return situacionViviendaCOD
     */
    public java.lang.String getSituacionViviendaCOD() {
        return situacionViviendaCOD;
    }


    /**
     * Sets the situacionViviendaCOD value for this Persona.
     * 
     * @param situacionViviendaCOD
     */
    public void setSituacionViviendaCOD(java.lang.String situacionViviendaCOD) {
        this.situacionViviendaCOD = situacionViviendaCOD;
    }


    /**
     * Gets the viviendaHipotecada value for this Persona.
     * 
     * @return viviendaHipotecada
     */
    public boolean isViviendaHipotecada() {
        return viviendaHipotecada;
    }


    /**
     * Sets the viviendaHipotecada value for this Persona.
     * 
     * @param viviendaHipotecada
     */
    public void setViviendaHipotecada(boolean viviendaHipotecada) {
        this.viviendaHipotecada = viviendaHipotecada;
    }


    /**
     * Gets the duenoCasa value for this Persona.
     * 
     * @return duenoCasa
     */
    public java.lang.String getDuenoCasa() {
        return duenoCasa;
    }


    /**
     * Sets the duenoCasa value for this Persona.
     * 
     * @param duenoCasa
     */
    public void setDuenoCasa(java.lang.String duenoCasa) {
        this.duenoCasa = duenoCasa;
    }


    /**
     * Gets the telefonoDuenoCasa value for this Persona.
     * 
     * @return telefonoDuenoCasa
     */
    public java.lang.String getTelefonoDuenoCasa() {
        return telefonoDuenoCasa;
    }


    /**
     * Sets the telefonoDuenoCasa value for this Persona.
     * 
     * @param telefonoDuenoCasa
     */
    public void setTelefonoDuenoCasa(java.lang.String telefonoDuenoCasa) {
        this.telefonoDuenoCasa = telefonoDuenoCasa;
    }


    /**
     * Gets the tiempoViviendaActual value for this Persona.
     * 
     * @return tiempoViviendaActual
     */
    public java.lang.Short getTiempoViviendaActual() {
        return tiempoViviendaActual;
    }


    /**
     * Sets the tiempoViviendaActual value for this Persona.
     * 
     * @param tiempoViviendaActual
     */
    public void setTiempoViviendaActual(java.lang.Short tiempoViviendaActual) {
        this.tiempoViviendaActual = tiempoViviendaActual;
    }


    /**
     * Gets the unidadTiempoViviendaActualCOD value for this Persona.
     * 
     * @return unidadTiempoViviendaActualCOD
     */
    public java.lang.String getUnidadTiempoViviendaActualCOD() {
        return unidadTiempoViviendaActualCOD;
    }


    /**
     * Sets the unidadTiempoViviendaActualCOD value for this Persona.
     * 
     * @param unidadTiempoViviendaActualCOD
     */
    public void setUnidadTiempoViviendaActualCOD(java.lang.String unidadTiempoViviendaActualCOD) {
        this.unidadTiempoViviendaActualCOD = unidadTiempoViviendaActualCOD;
    }


    /**
     * Gets the referenciaUbicacion value for this Persona.
     * 
     * @return referenciaUbicacion
     */
    public java.lang.String getReferenciaUbicacion() {
        return referenciaUbicacion;
    }


    /**
     * Sets the referenciaUbicacion value for this Persona.
     * 
     * @param referenciaUbicacion
     */
    public void setReferenciaUbicacion(java.lang.String referenciaUbicacion) {
        this.referenciaUbicacion = referenciaUbicacion;
    }


    /**
     * Gets the tiempoViviendaAnterior value for this Persona.
     * 
     * @return tiempoViviendaAnterior
     */
    public java.lang.Short getTiempoViviendaAnterior() {
        return tiempoViviendaAnterior;
    }


    /**
     * Sets the tiempoViviendaAnterior value for this Persona.
     * 
     * @param tiempoViviendaAnterior
     */
    public void setTiempoViviendaAnterior(java.lang.Short tiempoViviendaAnterior) {
        this.tiempoViviendaAnterior = tiempoViviendaAnterior;
    }


    /**
     * Gets the unidadTiempoViviendaAnteriorCOD value for this Persona.
     * 
     * @return unidadTiempoViviendaAnteriorCOD
     */
    public java.lang.String getUnidadTiempoViviendaAnteriorCOD() {
        return unidadTiempoViviendaAnteriorCOD;
    }


    /**
     * Sets the unidadTiempoViviendaAnteriorCOD value for this Persona.
     * 
     * @param unidadTiempoViviendaAnteriorCOD
     */
    public void setUnidadTiempoViviendaAnteriorCOD(java.lang.String unidadTiempoViviendaAnteriorCOD) {
        this.unidadTiempoViviendaAnteriorCOD = unidadTiempoViviendaAnteriorCOD;
    }


    /**
     * Gets the telefonoDomicilio value for this Persona.
     * 
     * @return telefonoDomicilio
     */
    public java.lang.String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }


    /**
     * Sets the telefonoDomicilio value for this Persona.
     * 
     * @param telefonoDomicilio
     */
    public void setTelefonoDomicilio(java.lang.String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }


    /**
     * Gets the telefonoCelular value for this Persona.
     * 
     * @return telefonoCelular
     */
    public java.lang.String getTelefonoCelular() {
        return telefonoCelular;
    }


    /**
     * Sets the telefonoCelular value for this Persona.
     * 
     * @param telefonoCelular
     */
    public void setTelefonoCelular(java.lang.String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }


    /**
     * Gets the tieneError value for this Persona.
     * 
     * @return tieneError
     */
    public boolean isTieneError() {
        return tieneError;
    }


    /**
     * Sets the tieneError value for this Persona.
     * 
     * @param tieneError
     */
    public void setTieneError(boolean tieneError) {
        this.tieneError = tieneError;
    }


    /**
     * Gets the mensaje value for this Persona.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Persona.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (__hashCodeCalc != other.__hashCodeCalc)
			return false;
		if (apellidoMaterno == null) {
			if (other.apellidoMaterno != null)
				return false;
		} else if (!apellidoMaterno.equals(other.apellidoMaterno))
			return false;
		if (apellidoPaterno == null) {
			if (other.apellidoPaterno != null)
				return false;
		} else if (!apellidoPaterno.equals(other.apellidoPaterno))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (duenoCasa == null) {
			if (other.duenoCasa != null)
				return false;
		} else if (!duenoCasa.equals(other.duenoCasa))
			return false;
		if (estadoCivilCOD == null) {
			if (other.estadoCivilCOD != null)
				return false;
		} else if (!estadoCivilCOD.equals(other.estadoCivilCOD))
			return false;
		if (fechaApertura == null) {
			if (other.fechaApertura != null)
				return false;
		} else if (!fechaApertura.equals(other.fechaApertura))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (identificacionConyuge == null) {
			if (other.identificacionConyuge != null)
				return false;
		} else if (!identificacionConyuge.equals(other.identificacionConyuge))
			return false;
		if (localidadCOD == null) {
			if (other.localidadCOD != null)
				return false;
		} else if (!localidadCOD.equals(other.localidadCOD))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (nacionalidadCOD == null) {
			if (other.nacionalidadCOD != null)
				return false;
		} else if (!nacionalidadCOD.equals(other.nacionalidadCOD))
			return false;
		if (nivelEducacionCOD == null) {
			if (other.nivelEducacionCOD != null)
				return false;
		} else if (!nivelEducacionCOD.equals(other.nivelEducacionCOD))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (nomreModulo == null) {
			if (other.nomreModulo != null)
				return false;
		} else if (!nomreModulo.equals(other.nomreModulo))
			return false;
		if (numeroCarga != other.numeroCarga)
			return false;
		if (ocupacionCOD == null) {
			if (other.ocupacionCOD != null)
				return false;
		} else if (!ocupacionCOD.equals(other.ocupacionCOD))
			return false;
		if (personaID != other.personaID)
			return false;
		if (referenciaUbicacion == null) {
			if (other.referenciaUbicacion != null)
				return false;
		} else if (!referenciaUbicacion.equals(other.referenciaUbicacion))
			return false;
		if (relacionCOD == null) {
			if (other.relacionCOD != null)
				return false;
		} else if (!relacionCOD.equals(other.relacionCOD))
			return false;
		if (separacionBienes != other.separacionBienes)
			return false;
		if (sexoCOD == null) {
			if (other.sexoCOD != null)
				return false;
		} else if (!sexoCOD.equals(other.sexoCOD))
			return false;
		if (situacionViviendaCOD == null) {
			if (other.situacionViviendaCOD != null)
				return false;
		} else if (!situacionViviendaCOD.equals(other.situacionViviendaCOD))
			return false;
		if (telefonoCelular == null) {
			if (other.telefonoCelular != null)
				return false;
		} else if (!telefonoCelular.equals(other.telefonoCelular))
			return false;
		if (telefonoDomicilio == null) {
			if (other.telefonoDomicilio != null)
				return false;
		} else if (!telefonoDomicilio.equals(other.telefonoDomicilio))
			return false;
		if (telefonoDuenoCasa == null) {
			if (other.telefonoDuenoCasa != null)
				return false;
		} else if (!telefonoDuenoCasa.equals(other.telefonoDuenoCasa))
			return false;
		if (tiempoViviendaActual == null) {
			if (other.tiempoViviendaActual != null)
				return false;
		} else if (!tiempoViviendaActual.equals(other.tiempoViviendaActual))
			return false;
		if (tiempoViviendaAnterior == null) {
			if (other.tiempoViviendaAnterior != null)
				return false;
		} else if (!tiempoViviendaAnterior.equals(other.tiempoViviendaAnterior))
			return false;
		if (tieneError != other.tieneError)
			return false;
		if (tipoIdentificacionCOD == null) {
			if (other.tipoIdentificacionCOD != null)
				return false;
		} else if (!tipoIdentificacionCOD.equals(other.tipoIdentificacionCOD))
			return false;
		if (tipoPersonaCOD == null) {
			if (other.tipoPersonaCOD != null)
				return false;
		} else if (!tipoPersonaCOD.equals(other.tipoPersonaCOD))
			return false;
		if (tipoViviendaCOD == null) {
			if (other.tipoViviendaCOD != null)
				return false;
		} else if (!tipoViviendaCOD.equals(other.tipoViviendaCOD))
			return false;
		if (unidadTiempoViviendaActualCOD == null) {
			if (other.unidadTiempoViviendaActualCOD != null)
				return false;
		} else if (!unidadTiempoViviendaActualCOD.equals(other.unidadTiempoViviendaActualCOD))
			return false;
		if (unidadTiempoViviendaAnteriorCOD == null) {
			if (other.unidadTiempoViviendaAnteriorCOD != null)
				return false;
		} else if (!unidadTiempoViviendaAnteriorCOD.equals(other.unidadTiempoViviendaAnteriorCOD))
			return false;
		if (usuarioID != other.usuarioID)
			return false;
		if (viviendaHipotecada != other.viviendaHipotecada)
			return false;
		return true;
	}

    private boolean __hashCodeCalc = false;
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((__equalsCalc == null) ? 0 : __equalsCalc.hashCode());
		result = prime * result + (__hashCodeCalc ? 1231 : 1237);
		result = prime * result + ((apellidoMaterno == null) ? 0 : apellidoMaterno.hashCode());
		result = prime * result + ((apellidoPaterno == null) ? 0 : apellidoPaterno.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((duenoCasa == null) ? 0 : duenoCasa.hashCode());
		result = prime * result + ((estadoCivilCOD == null) ? 0 : estadoCivilCOD.hashCode());
		result = prime * result + ((fechaApertura == null) ? 0 : fechaApertura.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((identificacionConyuge == null) ? 0 : identificacionConyuge.hashCode());
		result = prime * result + ((localidadCOD == null) ? 0 : localidadCOD.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((nacionalidadCOD == null) ? 0 : nacionalidadCOD.hashCode());
		result = prime * result + ((nivelEducacionCOD == null) ? 0 : nivelEducacionCOD.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((nomreModulo == null) ? 0 : nomreModulo.hashCode());
		result = prime * result + numeroCarga;
		result = prime * result + ((ocupacionCOD == null) ? 0 : ocupacionCOD.hashCode());
		result = prime * result + personaID;
		result = prime * result + ((referenciaUbicacion == null) ? 0 : referenciaUbicacion.hashCode());
		result = prime * result + ((relacionCOD == null) ? 0 : relacionCOD.hashCode());
		result = prime * result + (separacionBienes ? 1231 : 1237);
		result = prime * result + ((sexoCOD == null) ? 0 : sexoCOD.hashCode());
		result = prime * result + ((situacionViviendaCOD == null) ? 0 : situacionViviendaCOD.hashCode());
		result = prime * result + ((telefonoCelular == null) ? 0 : telefonoCelular.hashCode());
		result = prime * result + ((telefonoDomicilio == null) ? 0 : telefonoDomicilio.hashCode());
		result = prime * result + ((telefonoDuenoCasa == null) ? 0 : telefonoDuenoCasa.hashCode());
		result = prime * result + ((tiempoViviendaActual == null) ? 0 : tiempoViviendaActual.hashCode());
		result = prime * result + ((tiempoViviendaAnterior == null) ? 0 : tiempoViviendaAnterior.hashCode());
		result = prime * result + (tieneError ? 1231 : 1237);
		result = prime * result + ((tipoIdentificacionCOD == null) ? 0 : tipoIdentificacionCOD.hashCode());
		result = prime * result + ((tipoPersonaCOD == null) ? 0 : tipoPersonaCOD.hashCode());
		result = prime * result + ((tipoViviendaCOD == null) ? 0 : tipoViviendaCOD.hashCode());
		result = prime * result
				+ ((unidadTiempoViviendaActualCOD == null) ? 0 : unidadTiempoViviendaActualCOD.hashCode());
		result = prime * result
				+ ((unidadTiempoViviendaAnteriorCOD == null) ? 0 : unidadTiempoViviendaAnteriorCOD.hashCode());
		result = prime * result + usuarioID;
		result = prime * result + (viviendaHipotecada ? 1231 : 1237);
		return result;
	}

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Persona.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Persona"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PersonaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RelacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomreModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NomreModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UsuarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionConyuge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionConyuge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPersonaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoPersonaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoIdentificacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApellidoPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApellidoMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCivilCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EstadoCivilCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SexoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroCarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("separacionBienes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SeparacionBienes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidadCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NacionalidadCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelEducacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NivelEducacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocupacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OcupacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaApertura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FechaApertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidadCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LocalidadCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoViviendaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoViviendaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacionViviendaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SituacionViviendaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viviendaHipotecada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ViviendaHipotecada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duenoCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DuenoCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoDuenoCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoDuenoCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiempoViviendaActual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TiempoViviendaActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoViviendaActualCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadTiempoViviendaActualCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciaUbicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciaUbicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiempoViviendaAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TiempoViviendaAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoViviendaAnteriorCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadTiempoViviendaAnteriorCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoDomicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoDomicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tieneError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TieneError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

	@Override
	public String toString() {
		return "Persona [personaID=" + personaID + ", relacionCOD=" + relacionCOD + ", nomreModulo=" + nomreModulo
				+ ", usuarioID=" + usuarioID + ", identificacion=" + identificacion + ", identificacionConyuge="
				+ identificacionConyuge + ", tipoPersonaCOD=" + tipoPersonaCOD + ", tipoIdentificacionCOD="
				+ tipoIdentificacionCOD + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno="
				+ apellidoMaterno + ", nombres=" + nombres + ", fechaNacimiento=" + fechaNacimiento
				+ ", estadoCivilCOD=" + estadoCivilCOD + ", sexoCOD=" + sexoCOD + ", numeroCarga=" + numeroCarga
				+ ", separacionBienes=" + separacionBienes + ", nacionalidadCOD=" + nacionalidadCOD
				+ ", nivelEducacionCOD=" + nivelEducacionCOD + ", ocupacionCOD=" + ocupacionCOD + ", correo=" + correo
				+ ", fechaApertura=" + fechaApertura + ", localidadCOD=" + localidadCOD + ", direccion=" + direccion
				+ ", tipoViviendaCOD=" + tipoViviendaCOD + ", situacionViviendaCOD=" + situacionViviendaCOD
				+ ", viviendaHipotecada=" + viviendaHipotecada + ", duenoCasa=" + duenoCasa + ", telefonoDuenoCasa="
				+ telefonoDuenoCasa + ", tiempoViviendaActual=" + tiempoViviendaActual
				+ ", unidadTiempoViviendaActualCOD=" + unidadTiempoViviendaActualCOD + ", referenciaUbicacion="
				+ referenciaUbicacion + ", tiempoViviendaAnterior=" + tiempoViviendaAnterior
				+ ", unidadTiempoViviendaAnteriorCOD=" + unidadTiempoViviendaAnteriorCOD + ", telefonoDomicilio="
				+ telefonoDomicilio + ", telefonoCelular=" + telefonoCelular + ", tieneError=" + tieneError
				+ ", mensaje=" + mensaje + ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc
				+ "]";
	}

    
    
}

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

    private java.lang.Short numeroCarga;

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
           short usuarioID/*,
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
           java.lang.Short numeroCarga,
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
           this.numeroCarga = numeroCarga;
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
    public java.lang.Short getNumeroCarga() {
        return numeroCarga;
    }


    /**
     * Sets the numeroCarga value for this Persona.
     * 
     * @param numeroCarga
     */
    public void setNumeroCarga(java.lang.Short numeroCarga) {
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
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Persona)) return false;
        Persona other = (Persona) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.personaID == other.getPersonaID() &&
            ((this.relacionCOD==null && other.getRelacionCOD()==null) || 
             (this.relacionCOD!=null &&
              this.relacionCOD.equals(other.getRelacionCOD()))) &&
            ((this.nomreModulo==null && other.getNomreModulo()==null) || 
             (this.nomreModulo!=null &&
              this.nomreModulo.equals(other.getNomreModulo()))) &&
            this.usuarioID == other.getUsuarioID() &&
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.identificacionConyuge==null && other.getIdentificacionConyuge()==null) || 
             (this.identificacionConyuge!=null &&
              this.identificacionConyuge.equals(other.getIdentificacionConyuge()))) &&
            ((this.tipoPersonaCOD==null && other.getTipoPersonaCOD()==null) || 
             (this.tipoPersonaCOD!=null &&
              this.tipoPersonaCOD.equals(other.getTipoPersonaCOD()))) &&
            ((this.tipoIdentificacionCOD==null && other.getTipoIdentificacionCOD()==null) || 
             (this.tipoIdentificacionCOD!=null &&
              this.tipoIdentificacionCOD.equals(other.getTipoIdentificacionCOD()))) &&
            ((this.apellidoPaterno==null && other.getApellidoPaterno()==null) || 
             (this.apellidoPaterno!=null &&
              this.apellidoPaterno.equals(other.getApellidoPaterno()))) &&
            ((this.apellidoMaterno==null && other.getApellidoMaterno()==null) || 
             (this.apellidoMaterno!=null &&
              this.apellidoMaterno.equals(other.getApellidoMaterno()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.estadoCivilCOD==null && other.getEstadoCivilCOD()==null) || 
             (this.estadoCivilCOD!=null &&
              this.estadoCivilCOD.equals(other.getEstadoCivilCOD()))) &&
            ((this.sexoCOD==null && other.getSexoCOD()==null) || 
             (this.sexoCOD!=null &&
              this.sexoCOD.equals(other.getSexoCOD()))) &&
            ((this.numeroCarga==null && other.getNumeroCarga()==null) || 
             (this.numeroCarga!=null &&
              this.numeroCarga.equals(other.getNumeroCarga()))) &&
            this.separacionBienes == other.isSeparacionBienes() &&
            ((this.nacionalidadCOD==null && other.getNacionalidadCOD()==null) || 
             (this.nacionalidadCOD!=null &&
              this.nacionalidadCOD.equals(other.getNacionalidadCOD()))) &&
            ((this.nivelEducacionCOD==null && other.getNivelEducacionCOD()==null) || 
             (this.nivelEducacionCOD!=null &&
              this.nivelEducacionCOD.equals(other.getNivelEducacionCOD()))) &&
            ((this.ocupacionCOD==null && other.getOcupacionCOD()==null) || 
             (this.ocupacionCOD!=null &&
              this.ocupacionCOD.equals(other.getOcupacionCOD()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.fechaApertura==null && other.getFechaApertura()==null) || 
             (this.fechaApertura!=null &&
              this.fechaApertura.equals(other.getFechaApertura()))) &&
            ((this.localidadCOD==null && other.getLocalidadCOD()==null) || 
             (this.localidadCOD!=null &&
              this.localidadCOD.equals(other.getLocalidadCOD()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.tipoViviendaCOD==null && other.getTipoViviendaCOD()==null) || 
             (this.tipoViviendaCOD!=null &&
              this.tipoViviendaCOD.equals(other.getTipoViviendaCOD()))) &&
            ((this.situacionViviendaCOD==null && other.getSituacionViviendaCOD()==null) || 
             (this.situacionViviendaCOD!=null &&
              this.situacionViviendaCOD.equals(other.getSituacionViviendaCOD()))) &&
            this.viviendaHipotecada == other.isViviendaHipotecada() &&
            ((this.duenoCasa==null && other.getDuenoCasa()==null) || 
             (this.duenoCasa!=null &&
              this.duenoCasa.equals(other.getDuenoCasa()))) &&
            ((this.telefonoDuenoCasa==null && other.getTelefonoDuenoCasa()==null) || 
             (this.telefonoDuenoCasa!=null &&
              this.telefonoDuenoCasa.equals(other.getTelefonoDuenoCasa()))) &&
            ((this.tiempoViviendaActual==null && other.getTiempoViviendaActual()==null) || 
             (this.tiempoViviendaActual!=null &&
              this.tiempoViviendaActual.equals(other.getTiempoViviendaActual()))) &&
            ((this.unidadTiempoViviendaActualCOD==null && other.getUnidadTiempoViviendaActualCOD()==null) || 
             (this.unidadTiempoViviendaActualCOD!=null &&
              this.unidadTiempoViviendaActualCOD.equals(other.getUnidadTiempoViviendaActualCOD()))) &&
            ((this.referenciaUbicacion==null && other.getReferenciaUbicacion()==null) || 
             (this.referenciaUbicacion!=null &&
              this.referenciaUbicacion.equals(other.getReferenciaUbicacion()))) &&
            ((this.tiempoViviendaAnterior==null && other.getTiempoViviendaAnterior()==null) || 
             (this.tiempoViviendaAnterior!=null &&
              this.tiempoViviendaAnterior.equals(other.getTiempoViviendaAnterior()))) &&
            ((this.unidadTiempoViviendaAnteriorCOD==null && other.getUnidadTiempoViviendaAnteriorCOD()==null) || 
             (this.unidadTiempoViviendaAnteriorCOD!=null &&
              this.unidadTiempoViviendaAnteriorCOD.equals(other.getUnidadTiempoViviendaAnteriorCOD()))) &&
            ((this.telefonoDomicilio==null && other.getTelefonoDomicilio()==null) || 
             (this.telefonoDomicilio!=null &&
              this.telefonoDomicilio.equals(other.getTelefonoDomicilio()))) &&
            ((this.telefonoCelular==null && other.getTelefonoCelular()==null) || 
             (this.telefonoCelular!=null &&
              this.telefonoCelular.equals(other.getTelefonoCelular()))) &&
            this.tieneError == other.isTieneError() &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getPersonaID();
        if (getRelacionCOD() != null) {
            _hashCode += getRelacionCOD().hashCode();
        }
        if (getNomreModulo() != null) {
            _hashCode += getNomreModulo().hashCode();
        }
        _hashCode += getUsuarioID();
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getIdentificacionConyuge() != null) {
            _hashCode += getIdentificacionConyuge().hashCode();
        }
        if (getTipoPersonaCOD() != null) {
            _hashCode += getTipoPersonaCOD().hashCode();
        }
        if (getTipoIdentificacionCOD() != null) {
            _hashCode += getTipoIdentificacionCOD().hashCode();
        }
        if (getApellidoPaterno() != null) {
            _hashCode += getApellidoPaterno().hashCode();
        }
        if (getApellidoMaterno() != null) {
            _hashCode += getApellidoMaterno().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getEstadoCivilCOD() != null) {
            _hashCode += getEstadoCivilCOD().hashCode();
        }
        if (getSexoCOD() != null) {
            _hashCode += getSexoCOD().hashCode();
        }
        if (getNumeroCarga() != null) {
            _hashCode += getNumeroCarga().hashCode();
        }
        _hashCode += (isSeparacionBienes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNacionalidadCOD() != null) {
            _hashCode += getNacionalidadCOD().hashCode();
        }
        if (getNivelEducacionCOD() != null) {
            _hashCode += getNivelEducacionCOD().hashCode();
        }
        if (getOcupacionCOD() != null) {
            _hashCode += getOcupacionCOD().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getFechaApertura() != null) {
            _hashCode += getFechaApertura().hashCode();
        }
        if (getLocalidadCOD() != null) {
            _hashCode += getLocalidadCOD().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getTipoViviendaCOD() != null) {
            _hashCode += getTipoViviendaCOD().hashCode();
        }
        if (getSituacionViviendaCOD() != null) {
            _hashCode += getSituacionViviendaCOD().hashCode();
        }
        _hashCode += (isViviendaHipotecada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDuenoCasa() != null) {
            _hashCode += getDuenoCasa().hashCode();
        }
        if (getTelefonoDuenoCasa() != null) {
            _hashCode += getTelefonoDuenoCasa().hashCode();
        }
        if (getTiempoViviendaActual() != null) {
            _hashCode += getTiempoViviendaActual().hashCode();
        }
        if (getUnidadTiempoViviendaActualCOD() != null) {
            _hashCode += getUnidadTiempoViviendaActualCOD().hashCode();
        }
        if (getReferenciaUbicacion() != null) {
            _hashCode += getReferenciaUbicacion().hashCode();
        }
        if (getTiempoViviendaAnterior() != null) {
            _hashCode += getTiempoViviendaAnterior().hashCode();
        }
        if (getUnidadTiempoViviendaAnteriorCOD() != null) {
            _hashCode += getUnidadTiempoViviendaAnteriorCOD().hashCode();
        }
        if (getTelefonoDomicilio() != null) {
            _hashCode += getTelefonoDomicilio().hashCode();
        }
        if (getTelefonoCelular() != null) {
            _hashCode += getTelefonoCelular().hashCode();
        }
        _hashCode += (isTieneError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
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

}

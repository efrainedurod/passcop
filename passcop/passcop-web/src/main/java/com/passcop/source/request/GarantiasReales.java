/**
 * GarantiasReales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class GarantiasReales  implements java.io.Serializable {
    private java.lang.String identificacion;

    private java.lang.String tipoGarantiaCOD;

    private java.lang.String descripcion;

    private java.math.BigDecimal valor;

    private java.lang.Integer personaID;

    private boolean microEmpresario;

    private java.math.BigDecimal cuotaCreditoVigente;

    private java.util.Calendar ingreso;

    private java.lang.String estado;

    private java.lang.Short usuarioID;

    private boolean comercio;

    private java.lang.String estadoCOD;

    private java.lang.String direccion;

    private java.lang.String nombrePropietario;

    private java.lang.String seriePrincipalMotor;

    private java.lang.String serieSecundariaMotor;

    private java.lang.String marca;

    private java.lang.String modelo;

    private java.lang.String placa;

    private java.lang.Integer anioFabricacionConstruccion;

    private java.util.Calendar fechaAvaluo;

    private java.lang.String nombrePerito;

    private java.math.BigDecimal avaluoComercial;

    private java.lang.Integer numeroRegistro;

    private java.lang.String grupoTipoGarantiaCOD;

    private java.math.BigDecimal longitud;

    private java.math.BigDecimal latitud;

    private java.lang.String descripcionGarantiasReales;

    private java.lang.String direccionGarantiasReales;

    private boolean tieneError;

    private java.lang.String mensaje;

    public GarantiasReales() {
    }

    public GarantiasReales(
           java.lang.String identificacion,
           java.lang.String tipoGarantiaCOD,
           java.lang.String descripcion,
           java.math.BigDecimal valor,
           java.lang.Integer personaID,
           boolean microEmpresario,
           java.math.BigDecimal cuotaCreditoVigente,
           java.util.Calendar ingreso,
           java.lang.String estado,
           java.lang.Short usuarioID,
           boolean comercio,
           java.lang.String estadoCOD,
           java.lang.String direccion,
           java.lang.String nombrePropietario,
           java.lang.String seriePrincipalMotor,
           java.lang.String serieSecundariaMotor,
           java.lang.String marca,
           java.lang.String modelo,
           java.lang.String placa,
           java.lang.Integer anioFabricacionConstruccion,
           java.util.Calendar fechaAvaluo,
           java.lang.String nombrePerito,
           java.math.BigDecimal avaluoComercial,
           java.lang.Integer numeroRegistro,
           java.lang.String grupoTipoGarantiaCOD,
           java.math.BigDecimal longitud,
           java.math.BigDecimal latitud,
           java.lang.String descripcionGarantiasReales,
           java.lang.String direccionGarantiasReales,
           boolean tieneError,
           java.lang.String mensaje) {
           this.identificacion = identificacion;
           this.tipoGarantiaCOD = tipoGarantiaCOD;
           this.descripcion = descripcion;
           this.valor = valor;
           this.personaID = personaID;
           this.microEmpresario = microEmpresario;
           this.cuotaCreditoVigente = cuotaCreditoVigente;
           this.ingreso = ingreso;
           this.estado = estado;
           this.usuarioID = usuarioID;
           this.comercio = comercio;
           this.estadoCOD = estadoCOD;
           this.direccion = direccion;
           this.nombrePropietario = nombrePropietario;
           this.seriePrincipalMotor = seriePrincipalMotor;
           this.serieSecundariaMotor = serieSecundariaMotor;
           this.marca = marca;
           this.modelo = modelo;
           this.placa = placa;
           this.anioFabricacionConstruccion = anioFabricacionConstruccion;
           this.fechaAvaluo = fechaAvaluo;
           this.nombrePerito = nombrePerito;
           this.avaluoComercial = avaluoComercial;
           this.numeroRegistro = numeroRegistro;
           this.grupoTipoGarantiaCOD = grupoTipoGarantiaCOD;
           this.longitud = longitud;
           this.latitud = latitud;
           this.descripcionGarantiasReales = descripcionGarantiasReales;
           this.direccionGarantiasReales = direccionGarantiasReales;
           this.tieneError = tieneError;
           this.mensaje = mensaje;
    }


    /**
     * Gets the identificacion value for this GarantiasReales.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this GarantiasReales.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the tipoGarantiaCOD value for this GarantiasReales.
     * 
     * @return tipoGarantiaCOD
     */
    public java.lang.String getTipoGarantiaCOD() {
        return tipoGarantiaCOD;
    }


    /**
     * Sets the tipoGarantiaCOD value for this GarantiasReales.
     * 
     * @param tipoGarantiaCOD
     */
    public void setTipoGarantiaCOD(java.lang.String tipoGarantiaCOD) {
        this.tipoGarantiaCOD = tipoGarantiaCOD;
    }


    /**
     * Gets the descripcion value for this GarantiasReales.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this GarantiasReales.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the valor value for this GarantiasReales.
     * 
     * @return valor
     */
    public java.math.BigDecimal getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this GarantiasReales.
     * 
     * @param valor
     */
    public void setValor(java.math.BigDecimal valor) {
        this.valor = valor;
    }


    /**
     * Gets the personaID value for this GarantiasReales.
     * 
     * @return personaID
     */
    public java.lang.Integer getPersonaID() {
        return personaID;
    }


    /**
     * Sets the personaID value for this GarantiasReales.
     * 
     * @param personaID
     */
    public void setPersonaID(java.lang.Integer personaID) {
        this.personaID = personaID;
    }


    /**
     * Gets the microEmpresario value for this GarantiasReales.
     * 
     * @return microEmpresario
     */
    public boolean isMicroEmpresario() {
        return microEmpresario;
    }


    /**
     * Sets the microEmpresario value for this GarantiasReales.
     * 
     * @param microEmpresario
     */
    public void setMicroEmpresario(boolean microEmpresario) {
        this.microEmpresario = microEmpresario;
    }


    /**
     * Gets the cuotaCreditoVigente value for this GarantiasReales.
     * 
     * @return cuotaCreditoVigente
     */
    public java.math.BigDecimal getCuotaCreditoVigente() {
        return cuotaCreditoVigente;
    }


    /**
     * Sets the cuotaCreditoVigente value for this GarantiasReales.
     * 
     * @param cuotaCreditoVigente
     */
    public void setCuotaCreditoVigente(java.math.BigDecimal cuotaCreditoVigente) {
        this.cuotaCreditoVigente = cuotaCreditoVigente;
    }


    /**
     * Gets the ingreso value for this GarantiasReales.
     * 
     * @return ingreso
     */
    public java.util.Calendar getIngreso() {
        return ingreso;
    }


    /**
     * Sets the ingreso value for this GarantiasReales.
     * 
     * @param ingreso
     */
    public void setIngreso(java.util.Calendar ingreso) {
        this.ingreso = ingreso;
    }


    /**
     * Gets the estado value for this GarantiasReales.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this GarantiasReales.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the usuarioID value for this GarantiasReales.
     * 
     * @return usuarioID
     */
    public java.lang.Short getUsuarioID() {
        return usuarioID;
    }


    /**
     * Sets the usuarioID value for this GarantiasReales.
     * 
     * @param usuarioID
     */
    public void setUsuarioID(java.lang.Short usuarioID) {
        this.usuarioID = usuarioID;
    }


    /**
     * Gets the comercio value for this GarantiasReales.
     * 
     * @return comercio
     */
    public boolean isComercio() {
        return comercio;
    }


    /**
     * Sets the comercio value for this GarantiasReales.
     * 
     * @param comercio
     */
    public void setComercio(boolean comercio) {
        this.comercio = comercio;
    }


    /**
     * Gets the estadoCOD value for this GarantiasReales.
     * 
     * @return estadoCOD
     */
    public java.lang.String getEstadoCOD() {
        return estadoCOD;
    }


    /**
     * Sets the estadoCOD value for this GarantiasReales.
     * 
     * @param estadoCOD
     */
    public void setEstadoCOD(java.lang.String estadoCOD) {
        this.estadoCOD = estadoCOD;
    }


    /**
     * Gets the direccion value for this GarantiasReales.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this GarantiasReales.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the nombrePropietario value for this GarantiasReales.
     * 
     * @return nombrePropietario
     */
    public java.lang.String getNombrePropietario() {
        return nombrePropietario;
    }


    /**
     * Sets the nombrePropietario value for this GarantiasReales.
     * 
     * @param nombrePropietario
     */
    public void setNombrePropietario(java.lang.String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }


    /**
     * Gets the seriePrincipalMotor value for this GarantiasReales.
     * 
     * @return seriePrincipalMotor
     */
    public java.lang.String getSeriePrincipalMotor() {
        return seriePrincipalMotor;
    }


    /**
     * Sets the seriePrincipalMotor value for this GarantiasReales.
     * 
     * @param seriePrincipalMotor
     */
    public void setSeriePrincipalMotor(java.lang.String seriePrincipalMotor) {
        this.seriePrincipalMotor = seriePrincipalMotor;
    }


    /**
     * Gets the serieSecundariaMotor value for this GarantiasReales.
     * 
     * @return serieSecundariaMotor
     */
    public java.lang.String getSerieSecundariaMotor() {
        return serieSecundariaMotor;
    }


    /**
     * Sets the serieSecundariaMotor value for this GarantiasReales.
     * 
     * @param serieSecundariaMotor
     */
    public void setSerieSecundariaMotor(java.lang.String serieSecundariaMotor) {
        this.serieSecundariaMotor = serieSecundariaMotor;
    }


    /**
     * Gets the marca value for this GarantiasReales.
     * 
     * @return marca
     */
    public java.lang.String getMarca() {
        return marca;
    }


    /**
     * Sets the marca value for this GarantiasReales.
     * 
     * @param marca
     */
    public void setMarca(java.lang.String marca) {
        this.marca = marca;
    }


    /**
     * Gets the modelo value for this GarantiasReales.
     * 
     * @return modelo
     */
    public java.lang.String getModelo() {
        return modelo;
    }


    /**
     * Sets the modelo value for this GarantiasReales.
     * 
     * @param modelo
     */
    public void setModelo(java.lang.String modelo) {
        this.modelo = modelo;
    }


    /**
     * Gets the placa value for this GarantiasReales.
     * 
     * @return placa
     */
    public java.lang.String getPlaca() {
        return placa;
    }


    /**
     * Sets the placa value for this GarantiasReales.
     * 
     * @param placa
     */
    public void setPlaca(java.lang.String placa) {
        this.placa = placa;
    }


    /**
     * Gets the anioFabricacionConstruccion value for this GarantiasReales.
     * 
     * @return anioFabricacionConstruccion
     */
    public java.lang.Integer getAnioFabricacionConstruccion() {
        return anioFabricacionConstruccion;
    }


    /**
     * Sets the anioFabricacionConstruccion value for this GarantiasReales.
     * 
     * @param anioFabricacionConstruccion
     */
    public void setAnioFabricacionConstruccion(java.lang.Integer anioFabricacionConstruccion) {
        this.anioFabricacionConstruccion = anioFabricacionConstruccion;
    }


    /**
     * Gets the fechaAvaluo value for this GarantiasReales.
     * 
     * @return fechaAvaluo
     */
    public java.util.Calendar getFechaAvaluo() {
        return fechaAvaluo;
    }


    /**
     * Sets the fechaAvaluo value for this GarantiasReales.
     * 
     * @param fechaAvaluo
     */
    public void setFechaAvaluo(java.util.Calendar fechaAvaluo) {
        this.fechaAvaluo = fechaAvaluo;
    }


    /**
     * Gets the nombrePerito value for this GarantiasReales.
     * 
     * @return nombrePerito
     */
    public java.lang.String getNombrePerito() {
        return nombrePerito;
    }


    /**
     * Sets the nombrePerito value for this GarantiasReales.
     * 
     * @param nombrePerito
     */
    public void setNombrePerito(java.lang.String nombrePerito) {
        this.nombrePerito = nombrePerito;
    }


    /**
     * Gets the avaluoComercial value for this GarantiasReales.
     * 
     * @return avaluoComercial
     */
    public java.math.BigDecimal getAvaluoComercial() {
        return avaluoComercial;
    }


    /**
     * Sets the avaluoComercial value for this GarantiasReales.
     * 
     * @param avaluoComercial
     */
    public void setAvaluoComercial(java.math.BigDecimal avaluoComercial) {
        this.avaluoComercial = avaluoComercial;
    }


    /**
     * Gets the numeroRegistro value for this GarantiasReales.
     * 
     * @return numeroRegistro
     */
    public java.lang.Integer getNumeroRegistro() {
        return numeroRegistro;
    }


    /**
     * Sets the numeroRegistro value for this GarantiasReales.
     * 
     * @param numeroRegistro
     */
    public void setNumeroRegistro(java.lang.Integer numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }


    /**
     * Gets the grupoTipoGarantiaCOD value for this GarantiasReales.
     * 
     * @return grupoTipoGarantiaCOD
     */
    public java.lang.String getGrupoTipoGarantiaCOD() {
        return grupoTipoGarantiaCOD;
    }


    /**
     * Sets the grupoTipoGarantiaCOD value for this GarantiasReales.
     * 
     * @param grupoTipoGarantiaCOD
     */
    public void setGrupoTipoGarantiaCOD(java.lang.String grupoTipoGarantiaCOD) {
        this.grupoTipoGarantiaCOD = grupoTipoGarantiaCOD;
    }


    /**
     * Gets the longitud value for this GarantiasReales.
     * 
     * @return longitud
     */
    public java.math.BigDecimal getLongitud() {
        return longitud;
    }


    /**
     * Sets the longitud value for this GarantiasReales.
     * 
     * @param longitud
     */
    public void setLongitud(java.math.BigDecimal longitud) {
        this.longitud = longitud;
    }


    /**
     * Gets the latitud value for this GarantiasReales.
     * 
     * @return latitud
     */
    public java.math.BigDecimal getLatitud() {
        return latitud;
    }


    /**
     * Sets the latitud value for this GarantiasReales.
     * 
     * @param latitud
     */
    public void setLatitud(java.math.BigDecimal latitud) {
        this.latitud = latitud;
    }


    /**
     * Gets the descripcionGarantiasReales value for this GarantiasReales.
     * 
     * @return descripcionGarantiasReales
     */
    public java.lang.String getDescripcionGarantiasReales() {
        return descripcionGarantiasReales;
    }


    /**
     * Sets the descripcionGarantiasReales value for this GarantiasReales.
     * 
     * @param descripcionGarantiasReales
     */
    public void setDescripcionGarantiasReales(java.lang.String descripcionGarantiasReales) {
        this.descripcionGarantiasReales = descripcionGarantiasReales;
    }


    /**
     * Gets the direccionGarantiasReales value for this GarantiasReales.
     * 
     * @return direccionGarantiasReales
     */
    public java.lang.String getDireccionGarantiasReales() {
        return direccionGarantiasReales;
    }


    /**
     * Sets the direccionGarantiasReales value for this GarantiasReales.
     * 
     * @param direccionGarantiasReales
     */
    public void setDireccionGarantiasReales(java.lang.String direccionGarantiasReales) {
        this.direccionGarantiasReales = direccionGarantiasReales;
    }


    /**
     * Gets the tieneError value for this GarantiasReales.
     * 
     * @return tieneError
     */
    public boolean isTieneError() {
        return tieneError;
    }


    /**
     * Sets the tieneError value for this GarantiasReales.
     * 
     * @param tieneError
     */
    public void setTieneError(boolean tieneError) {
        this.tieneError = tieneError;
    }


    /**
     * Gets the mensaje value for this GarantiasReales.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this GarantiasReales.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GarantiasReales)) return false;
        GarantiasReales other = (GarantiasReales) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.tipoGarantiaCOD==null && other.getTipoGarantiaCOD()==null) || 
             (this.tipoGarantiaCOD!=null &&
              this.tipoGarantiaCOD.equals(other.getTipoGarantiaCOD()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.valor==null && other.getValor()==null) || 
             (this.valor!=null &&
              this.valor.equals(other.getValor()))) &&
            ((this.personaID==null && other.getPersonaID()==null) || 
             (this.personaID!=null &&
              this.personaID.equals(other.getPersonaID()))) &&
            this.microEmpresario == other.isMicroEmpresario() &&
            ((this.cuotaCreditoVigente==null && other.getCuotaCreditoVigente()==null) || 
             (this.cuotaCreditoVigente!=null &&
              this.cuotaCreditoVigente.equals(other.getCuotaCreditoVigente()))) &&
            ((this.ingreso==null && other.getIngreso()==null) || 
             (this.ingreso!=null &&
              this.ingreso.equals(other.getIngreso()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.usuarioID==null && other.getUsuarioID()==null) || 
             (this.usuarioID!=null &&
              this.usuarioID.equals(other.getUsuarioID()))) &&
            this.comercio == other.isComercio() &&
            ((this.estadoCOD==null && other.getEstadoCOD()==null) || 
             (this.estadoCOD!=null &&
              this.estadoCOD.equals(other.getEstadoCOD()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.nombrePropietario==null && other.getNombrePropietario()==null) || 
             (this.nombrePropietario!=null &&
              this.nombrePropietario.equals(other.getNombrePropietario()))) &&
            ((this.seriePrincipalMotor==null && other.getSeriePrincipalMotor()==null) || 
             (this.seriePrincipalMotor!=null &&
              this.seriePrincipalMotor.equals(other.getSeriePrincipalMotor()))) &&
            ((this.serieSecundariaMotor==null && other.getSerieSecundariaMotor()==null) || 
             (this.serieSecundariaMotor!=null &&
              this.serieSecundariaMotor.equals(other.getSerieSecundariaMotor()))) &&
            ((this.marca==null && other.getMarca()==null) || 
             (this.marca!=null &&
              this.marca.equals(other.getMarca()))) &&
            ((this.modelo==null && other.getModelo()==null) || 
             (this.modelo!=null &&
              this.modelo.equals(other.getModelo()))) &&
            ((this.placa==null && other.getPlaca()==null) || 
             (this.placa!=null &&
              this.placa.equals(other.getPlaca()))) &&
            ((this.anioFabricacionConstruccion==null && other.getAnioFabricacionConstruccion()==null) || 
             (this.anioFabricacionConstruccion!=null &&
              this.anioFabricacionConstruccion.equals(other.getAnioFabricacionConstruccion()))) &&
            ((this.fechaAvaluo==null && other.getFechaAvaluo()==null) || 
             (this.fechaAvaluo!=null &&
              this.fechaAvaluo.equals(other.getFechaAvaluo()))) &&
            ((this.nombrePerito==null && other.getNombrePerito()==null) || 
             (this.nombrePerito!=null &&
              this.nombrePerito.equals(other.getNombrePerito()))) &&
            ((this.avaluoComercial==null && other.getAvaluoComercial()==null) || 
             (this.avaluoComercial!=null &&
              this.avaluoComercial.equals(other.getAvaluoComercial()))) &&
            ((this.numeroRegistro==null && other.getNumeroRegistro()==null) || 
             (this.numeroRegistro!=null &&
              this.numeroRegistro.equals(other.getNumeroRegistro()))) &&
            ((this.grupoTipoGarantiaCOD==null && other.getGrupoTipoGarantiaCOD()==null) || 
             (this.grupoTipoGarantiaCOD!=null &&
              this.grupoTipoGarantiaCOD.equals(other.getGrupoTipoGarantiaCOD()))) &&
            ((this.longitud==null && other.getLongitud()==null) || 
             (this.longitud!=null &&
              this.longitud.equals(other.getLongitud()))) &&
            ((this.latitud==null && other.getLatitud()==null) || 
             (this.latitud!=null &&
              this.latitud.equals(other.getLatitud()))) &&
            ((this.descripcionGarantiasReales==null && other.getDescripcionGarantiasReales()==null) || 
             (this.descripcionGarantiasReales!=null &&
              this.descripcionGarantiasReales.equals(other.getDescripcionGarantiasReales()))) &&
            ((this.direccionGarantiasReales==null && other.getDireccionGarantiasReales()==null) || 
             (this.direccionGarantiasReales!=null &&
              this.direccionGarantiasReales.equals(other.getDireccionGarantiasReales()))) &&
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
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getTipoGarantiaCOD() != null) {
            _hashCode += getTipoGarantiaCOD().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getValor() != null) {
            _hashCode += getValor().hashCode();
        }
        if (getPersonaID() != null) {
            _hashCode += getPersonaID().hashCode();
        }
        _hashCode += (isMicroEmpresario() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCuotaCreditoVigente() != null) {
            _hashCode += getCuotaCreditoVigente().hashCode();
        }
        if (getIngreso() != null) {
            _hashCode += getIngreso().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getUsuarioID() != null) {
            _hashCode += getUsuarioID().hashCode();
        }
        _hashCode += (isComercio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEstadoCOD() != null) {
            _hashCode += getEstadoCOD().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getNombrePropietario() != null) {
            _hashCode += getNombrePropietario().hashCode();
        }
        if (getSeriePrincipalMotor() != null) {
            _hashCode += getSeriePrincipalMotor().hashCode();
        }
        if (getSerieSecundariaMotor() != null) {
            _hashCode += getSerieSecundariaMotor().hashCode();
        }
        if (getMarca() != null) {
            _hashCode += getMarca().hashCode();
        }
        if (getModelo() != null) {
            _hashCode += getModelo().hashCode();
        }
        if (getPlaca() != null) {
            _hashCode += getPlaca().hashCode();
        }
        if (getAnioFabricacionConstruccion() != null) {
            _hashCode += getAnioFabricacionConstruccion().hashCode();
        }
        if (getFechaAvaluo() != null) {
            _hashCode += getFechaAvaluo().hashCode();
        }
        if (getNombrePerito() != null) {
            _hashCode += getNombrePerito().hashCode();
        }
        if (getAvaluoComercial() != null) {
            _hashCode += getAvaluoComercial().hashCode();
        }
        if (getNumeroRegistro() != null) {
            _hashCode += getNumeroRegistro().hashCode();
        }
        if (getGrupoTipoGarantiaCOD() != null) {
            _hashCode += getGrupoTipoGarantiaCOD().hashCode();
        }
        if (getLongitud() != null) {
            _hashCode += getLongitud().hashCode();
        }
        if (getLatitud() != null) {
            _hashCode += getLatitud().hashCode();
        }
        if (getDescripcionGarantiasReales() != null) {
            _hashCode += getDescripcionGarantiasReales().hashCode();
        }
        if (getDireccionGarantiasReales() != null) {
            _hashCode += getDireccionGarantiasReales().hashCode();
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
        new org.apache.axis.description.TypeDesc(GarantiasReales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GarantiasReales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoGarantiaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoGarantiaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Valor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PersonaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("microEmpresario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MicroEmpresario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotaCreditoVigente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CuotaCreditoVigente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingreso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ingreso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UsuarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comercio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Comercio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EstadoCOD"));
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
        elemField.setFieldName("nombrePropietario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NombrePropietario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seriePrincipalMotor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SeriePrincipalMotor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieSecundariaMotor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SerieSecundariaMotor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marca");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Marca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modelo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Modelo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Placa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anioFabricacionConstruccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AnioFabricacionConstruccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAvaluo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FechaAvaluo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePerito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NombrePerito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaluoComercial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AvaluoComercial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroRegistro");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroRegistro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoTipoGarantiaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GrupoTipoGarantiaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Longitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Latitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionGarantiasReales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DescripcionGarantiasReales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionGarantiasReales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DireccionGarantiasReales"));
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
		return "GarantiasReales [identificacion=" + identificacion + ", tipoGarantiaCOD=" + tipoGarantiaCOD
				+ ", descripcion=" + descripcion + ", valor=" + valor + ", personaID=" + personaID
				+ ", microEmpresario=" + microEmpresario + ", cuotaCreditoVigente=" + cuotaCreditoVigente + ", ingreso="
				+ ingreso + ", estado=" + estado + ", usuarioID=" + usuarioID + ", comercio=" + comercio
				+ ", estadoCOD=" + estadoCOD + ", direccion=" + direccion + ", nombrePropietario=" + nombrePropietario
				+ ", seriePrincipalMotor=" + seriePrincipalMotor + ", serieSecundariaMotor=" + serieSecundariaMotor
				+ ", marca=" + marca + ", modelo=" + modelo + ", placa=" + placa + ", anioFabricacionConstruccion="
				+ anioFabricacionConstruccion + ", fechaAvaluo=" + fechaAvaluo + ", nombrePerito=" + nombrePerito
				+ ", avaluoComercial=" + avaluoComercial + ", numeroRegistro=" + numeroRegistro
				+ ", grupoTipoGarantiaCOD=" + grupoTipoGarantiaCOD + ", longitud=" + longitud + ", latitud=" + latitud
				+ ", descripcionGarantiasReales=" + descripcionGarantiasReales + ", direccionGarantiasReales="
				+ direccionGarantiasReales + ", tieneError=" + tieneError + ", mensaje=" + mensaje + ", __equalsCalc="
				+ __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc + "]";
	}

    
}

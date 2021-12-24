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
    
    private java.lang.String tipoGarantia;

    private java.lang.String descripcion;

    private double valor;

    private java.lang.Integer personaID;

    private boolean microEmpresario;

    private double cuotaCreditoVigente;

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

    private double avaluoComercial;

    private java.lang.Integer numeroRegistro;

    private java.lang.String grupoTipoGarantiaCOD;

    private double longitud;

    private double latitud;

    private java.lang.String descripcionGarantiasReales;

    private java.lang.String direccionGarantiasReales;

    private boolean tieneError;

    private java.lang.String mensaje;

    public GarantiasReales() {
    }

    public GarantiasReales(
           java.lang.String identificacion,
           java.lang.String tipoGarantiaCOD,
           java.lang.String tipoGarantia,
           java.lang.String descripcion,
           double valor,
           java.lang.Integer personaID,
           boolean microEmpresario,
           double cuotaCreditoVigente,
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
           double avaluoComercial,
           java.lang.Integer numeroRegistro,
           java.lang.String grupoTipoGarantiaCOD,
           double longitud,
           double latitud,
           java.lang.String descripcionGarantiasReales,
           java.lang.String direccionGarantiasReales,
           boolean tieneError,
           java.lang.String mensaje) {
           this.identificacion = identificacion;
           this.tipoGarantiaCOD = tipoGarantiaCOD;
           this.tipoGarantia = tipoGarantia;
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
     * Gets the tipoGarantia value for this GarantiasReales.
     * 
     * @return tipoGarantia
     */
    public java.lang.String getTipoGarantia() {
		return tipoGarantia;
	}
    
    /**
     * Sets the tipoGarantia value for this GarantiasReales.
     * 
     * @param tipoGarantia
     */
	public void setTipoGarantia(java.lang.String tipoGarantia) {
		this.tipoGarantia = tipoGarantia;
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
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this GarantiasReales.
     * 
     * @param valor
     */
    public void setValor(double valor) {
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
    public double getCuotaCreditoVigente() {
        return cuotaCreditoVigente;
    }


    /**
     * Sets the cuotaCreditoVigente value for this GarantiasReales.
     * 
     * @param cuotaCreditoVigente
     */
    public void setCuotaCreditoVigente(double cuotaCreditoVigente) {
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
    public double getAvaluoComercial() {
        return avaluoComercial;
    }


    /**
     * Sets the avaluoComercial value for this GarantiasReales.
     * 
     * @param avaluoComercial
     */
    public void setAvaluoComercial(double avaluoComercial) {
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
    public double getLongitud() {
        return longitud;
    }


    /**
     * Sets the longitud value for this GarantiasReales.
     * 
     * @param longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }


    /**
     * Gets the latitud value for this GarantiasReales.
     * 
     * @return latitud
     */
    public double getLatitud() {
        return latitud;
    }


    /**
     * Sets the latitud value for this GarantiasReales.
     * 
     * @param latitud
     */
    public void setLatitud(double latitud) {
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
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GarantiasReales other = (GarantiasReales) obj;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (__hashCodeCalc != other.__hashCodeCalc)
			return false;
		if (anioFabricacionConstruccion == null) {
			if (other.anioFabricacionConstruccion != null)
				return false;
		} else if (!anioFabricacionConstruccion.equals(other.anioFabricacionConstruccion))
			return false;
		if (Double.doubleToLongBits(avaluoComercial) != Double.doubleToLongBits(other.avaluoComercial))
			return false;
		if (comercio != other.comercio)
			return false;
		if (Double.doubleToLongBits(cuotaCreditoVigente) != Double.doubleToLongBits(other.cuotaCreditoVigente))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (descripcionGarantiasReales == null) {
			if (other.descripcionGarantiasReales != null)
				return false;
		} else if (!descripcionGarantiasReales.equals(other.descripcionGarantiasReales))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (direccionGarantiasReales == null) {
			if (other.direccionGarantiasReales != null)
				return false;
		} else if (!direccionGarantiasReales.equals(other.direccionGarantiasReales))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (estadoCOD == null) {
			if (other.estadoCOD != null)
				return false;
		} else if (!estadoCOD.equals(other.estadoCOD))
			return false;
		if (fechaAvaluo == null) {
			if (other.fechaAvaluo != null)
				return false;
		} else if (!fechaAvaluo.equals(other.fechaAvaluo))
			return false;
		if (grupoTipoGarantiaCOD == null) {
			if (other.grupoTipoGarantiaCOD != null)
				return false;
		} else if (!grupoTipoGarantiaCOD.equals(other.grupoTipoGarantiaCOD))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (ingreso == null) {
			if (other.ingreso != null)
				return false;
		} else if (!ingreso.equals(other.ingreso))
			return false;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (microEmpresario != other.microEmpresario)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (nombrePerito == null) {
			if (other.nombrePerito != null)
				return false;
		} else if (!nombrePerito.equals(other.nombrePerito))
			return false;
		if (nombrePropietario == null) {
			if (other.nombrePropietario != null)
				return false;
		} else if (!nombrePropietario.equals(other.nombrePropietario))
			return false;
		if (numeroRegistro == null) {
			if (other.numeroRegistro != null)
				return false;
		} else if (!numeroRegistro.equals(other.numeroRegistro))
			return false;
		if (personaID == null) {
			if (other.personaID != null)
				return false;
		} else if (!personaID.equals(other.personaID))
			return false;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		if (seriePrincipalMotor == null) {
			if (other.seriePrincipalMotor != null)
				return false;
		} else if (!seriePrincipalMotor.equals(other.seriePrincipalMotor))
			return false;
		if (serieSecundariaMotor == null) {
			if (other.serieSecundariaMotor != null)
				return false;
		} else if (!serieSecundariaMotor.equals(other.serieSecundariaMotor))
			return false;
		if (tieneError != other.tieneError)
			return false;
		if (tipoGarantia == null) {
			if (other.tipoGarantia != null)
				return false;
		} else if (!tipoGarantia.equals(other.tipoGarantia))
			return false;
		if (tipoGarantiaCOD == null) {
			if (other.tipoGarantiaCOD != null)
				return false;
		} else if (!tipoGarantiaCOD.equals(other.tipoGarantiaCOD))
			return false;
		if (usuarioID == null) {
			if (other.usuarioID != null)
				return false;
		} else if (!usuarioID.equals(other.usuarioID))
			return false;
		if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
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
		result = prime * result + ((anioFabricacionConstruccion == null) ? 0 : anioFabricacionConstruccion.hashCode());
		long temp;
		temp = Double.doubleToLongBits(avaluoComercial);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (comercio ? 1231 : 1237);
		temp = Double.doubleToLongBits(cuotaCreditoVigente);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((descripcionGarantiasReales == null) ? 0 : descripcionGarantiasReales.hashCode());
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((direccionGarantiasReales == null) ? 0 : direccionGarantiasReales.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((estadoCOD == null) ? 0 : estadoCOD.hashCode());
		result = prime * result + ((fechaAvaluo == null) ? 0 : fechaAvaluo.hashCode());
		result = prime * result + ((grupoTipoGarantiaCOD == null) ? 0 : grupoTipoGarantiaCOD.hashCode());
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((ingreso == null) ? 0 : ingreso.hashCode());
		temp = Double.doubleToLongBits(latitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + (microEmpresario ? 1231 : 1237);
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((nombrePerito == null) ? 0 : nombrePerito.hashCode());
		result = prime * result + ((nombrePropietario == null) ? 0 : nombrePropietario.hashCode());
		result = prime * result + ((numeroRegistro == null) ? 0 : numeroRegistro.hashCode());
		result = prime * result + ((personaID == null) ? 0 : personaID.hashCode());
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		result = prime * result + ((seriePrincipalMotor == null) ? 0 : seriePrincipalMotor.hashCode());
		result = prime * result + ((serieSecundariaMotor == null) ? 0 : serieSecundariaMotor.hashCode());
		result = prime * result + (tieneError ? 1231 : 1237);
		result = prime * result + ((tipoGarantia == null) ? 0 : tipoGarantia.hashCode());
		result = prime * result + ((tipoGarantiaCOD == null) ? 0 : tipoGarantiaCOD.hashCode());
		result = prime * result + ((usuarioID == null) ? 0 : usuarioID.hashCode());
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
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
        elemField.setFieldName("tipoGarantia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoGarantia"));
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
				+ ", tipoGarantia=" + tipoGarantia + ", descripcion=" + descripcion + ", valor=" + valor
				+ ", personaID=" + personaID + ", microEmpresario=" + microEmpresario + ", cuotaCreditoVigente="
				+ cuotaCreditoVigente + ", ingreso=" + ingreso + ", estado=" + estado + ", usuarioID=" + usuarioID
				+ ", comercio=" + comercio + ", estadoCOD=" + estadoCOD + ", direccion=" + direccion
				+ ", nombrePropietario=" + nombrePropietario + ", seriePrincipalMotor=" + seriePrincipalMotor
				+ ", serieSecundariaMotor=" + serieSecundariaMotor + ", marca=" + marca + ", modelo=" + modelo
				+ ", placa=" + placa + ", anioFabricacionConstruccion=" + anioFabricacionConstruccion + ", fechaAvaluo="
				+ fechaAvaluo + ", nombrePerito=" + nombrePerito + ", avaluoComercial=" + avaluoComercial
				+ ", numeroRegistro=" + numeroRegistro + ", grupoTipoGarantiaCOD=" + grupoTipoGarantiaCOD
				+ ", longitud=" + longitud + ", latitud=" + latitud + ", descripcionGarantiasReales="
				+ descripcionGarantiasReales + ", direccionGarantiasReales=" + direccionGarantiasReales
				+ ", tieneError=" + tieneError + ", mensaje=" + mensaje + ", __equalsCalc=" + __equalsCalc
				+ ", __hashCodeCalc=" + __hashCodeCalc + "]";
	}

    
}

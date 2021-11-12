/**
 * RespuestaCentralRiesgo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class RespuestaCentralRiesgo  implements java.io.Serializable {
    private java.lang.String identificacionCentralRiesgo;

    private int personaId;

    private java.lang.String seccion;

    private double montoTotalEndeudamiento;

    private double totalCarteraVigente;

    private double carteraRiesgo;

    private java.lang.String calificacionRiesgoCOD;

    private double castigoDemanda;

    private java.lang.String peorCalificacion12MesesCOD;

    private double castigoDemanda12Meses;

    private java.lang.Short numeroCreditosIFI;

    private java.lang.Short numeroOperaciones;

    private java.lang.String reciprocidad;

    private boolean tieneError;

    private java.lang.String mensaje;

    public RespuestaCentralRiesgo() {
    }

    public RespuestaCentralRiesgo(
           java.lang.String identificacionCentralRiesgo,
           int personaId,
           java.lang.String seccion,
           double montoTotalEndeudamiento,
           double totalCarteraVigente,
           double carteraRiesgo,
           java.lang.String calificacionRiesgoCOD,
           double castigoDemanda,
           java.lang.String peorCalificacion12MesesCOD,
           double castigoDemanda12Meses,
           java.lang.Short numeroCreditosIFI,
           java.lang.Short numeroOperaciones,
           java.lang.String reciprocidad,
           boolean tieneError,
           java.lang.String mensaje) {
           this.identificacionCentralRiesgo = identificacionCentralRiesgo;
           this.personaId = personaId;
           this.seccion = seccion;
           this.montoTotalEndeudamiento = montoTotalEndeudamiento;
           this.totalCarteraVigente = totalCarteraVigente;
           this.carteraRiesgo = carteraRiesgo;
           this.calificacionRiesgoCOD = calificacionRiesgoCOD;
           this.castigoDemanda = castigoDemanda;
           this.peorCalificacion12MesesCOD = peorCalificacion12MesesCOD;
           this.castigoDemanda12Meses = castigoDemanda12Meses;
           this.numeroCreditosIFI = numeroCreditosIFI;
           this.numeroOperaciones = numeroOperaciones;
           this.reciprocidad = reciprocidad;
           this.tieneError = tieneError;
           this.mensaje = mensaje;
    }


    /**
     * Gets the identificacionCentralRiesgo value for this RespuestaCentralRiesgo.
     * 
     * @return identificacionCentralRiesgo
     */
    public java.lang.String getIdentificacionCentralRiesgo() {
        return identificacionCentralRiesgo;
    }


    /**
     * Sets the identificacionCentralRiesgo value for this RespuestaCentralRiesgo.
     * 
     * @param identificacionCentralRiesgo
     */
    public void setIdentificacionCentralRiesgo(java.lang.String identificacionCentralRiesgo) {
        this.identificacionCentralRiesgo = identificacionCentralRiesgo;
    }


    /**
     * Gets the personaId value for this RespuestaCentralRiesgo.
     * 
     * @return personaId
     */
    public int getPersonaId() {
        return personaId;
    }


    /**
     * Sets the personaId value for this RespuestaCentralRiesgo.
     * 
     * @param personaId
     */
    public void setPersonaId(int personaId) {
        this.personaId = personaId;
    }


    /**
     * Gets the seccion value for this RespuestaCentralRiesgo.
     * 
     * @return seccion
     */
    public java.lang.String getSeccion() {
        return seccion;
    }


    /**
     * Sets the seccion value for this RespuestaCentralRiesgo.
     * 
     * @param seccion
     */
    public void setSeccion(java.lang.String seccion) {
        this.seccion = seccion;
    }


    /**
     * Gets the montoTotalEndeudamiento value for this RespuestaCentralRiesgo.
     * 
     * @return montoTotalEndeudamiento
     */
    public double getMontoTotalEndeudamiento() {
        return montoTotalEndeudamiento;
    }


    /**
     * Sets the montoTotalEndeudamiento value for this RespuestaCentralRiesgo.
     * 
     * @param montoTotalEndeudamiento
     */
    public void setMontoTotalEndeudamiento(double montoTotalEndeudamiento) {
        this.montoTotalEndeudamiento = montoTotalEndeudamiento;
    }


    /**
     * Gets the totalCarteraVigente value for this RespuestaCentralRiesgo.
     * 
     * @return totalCarteraVigente
     */
    public double getTotalCarteraVigente() {
        return totalCarteraVigente;
    }


    /**
     * Sets the totalCarteraVigente value for this RespuestaCentralRiesgo.
     * 
     * @param totalCarteraVigente
     */
    public void setTotalCarteraVigente(double totalCarteraVigente) {
        this.totalCarteraVigente = totalCarteraVigente;
    }


    /**
     * Gets the carteraRiesgo value for this RespuestaCentralRiesgo.
     * 
     * @return carteraRiesgo
     */
    public double getCarteraRiesgo() {
        return carteraRiesgo;
    }


    /**
     * Sets the carteraRiesgo value for this RespuestaCentralRiesgo.
     * 
     * @param carteraRiesgo
     */
    public void setCarteraRiesgo(double carteraRiesgo) {
        this.carteraRiesgo = carteraRiesgo;
    }


    /**
     * Gets the calificacionRiesgoCOD value for this RespuestaCentralRiesgo.
     * 
     * @return calificacionRiesgoCOD
     */
    public java.lang.String getCalificacionRiesgoCOD() {
        return calificacionRiesgoCOD;
    }


    /**
     * Sets the calificacionRiesgoCOD value for this RespuestaCentralRiesgo.
     * 
     * @param calificacionRiesgoCOD
     */
    public void setCalificacionRiesgoCOD(java.lang.String calificacionRiesgoCOD) {
        this.calificacionRiesgoCOD = calificacionRiesgoCOD;
    }


    /**
     * Gets the castigoDemanda value for this RespuestaCentralRiesgo.
     * 
     * @return castigoDemanda
     */
    public double getCastigoDemanda() {
        return castigoDemanda;
    }


    /**
     * Sets the castigoDemanda value for this RespuestaCentralRiesgo.
     * 
     * @param castigoDemanda
     */
    public void setCastigoDemanda(double castigoDemanda) {
        this.castigoDemanda = castigoDemanda;
    }


    /**
     * Gets the peorCalificacion12MesesCOD value for this RespuestaCentralRiesgo.
     * 
     * @return peorCalificacion12MesesCOD
     */
    public java.lang.String getPeorCalificacion12MesesCOD() {
        return peorCalificacion12MesesCOD;
    }


    /**
     * Sets the peorCalificacion12MesesCOD value for this RespuestaCentralRiesgo.
     * 
     * @param peorCalificacion12MesesCOD
     */
    public void setPeorCalificacion12MesesCOD(java.lang.String peorCalificacion12MesesCOD) {
        this.peorCalificacion12MesesCOD = peorCalificacion12MesesCOD;
    }


    /**
     * Gets the castigoDemanda12Meses value for this RespuestaCentralRiesgo.
     * 
     * @return castigoDemanda12Meses
     */
    public double getCastigoDemanda12Meses() {
        return castigoDemanda12Meses;
    }


    /**
     * Sets the castigoDemanda12Meses value for this RespuestaCentralRiesgo.
     * 
     * @param castigoDemanda12Meses
     */
    public void setCastigoDemanda12Meses(double castigoDemanda12Meses) {
        this.castigoDemanda12Meses = castigoDemanda12Meses;
    }


    /**
     * Gets the numeroCreditosIFI value for this RespuestaCentralRiesgo.
     * 
     * @return numeroCreditosIFI
     */
    public java.lang.Short getNumeroCreditosIFI() {
        return numeroCreditosIFI;
    }


    /**
     * Sets the numeroCreditosIFI value for this RespuestaCentralRiesgo.
     * 
     * @param numeroCreditosIFI
     */
    public void setNumeroCreditosIFI(java.lang.Short numeroCreditosIFI) {
        this.numeroCreditosIFI = numeroCreditosIFI;
    }


    /**
     * Gets the numeroOperaciones value for this RespuestaCentralRiesgo.
     * 
     * @return numeroOperaciones
     */
    public java.lang.Short getNumeroOperaciones() {
        return numeroOperaciones;
    }


    /**
     * Sets the numeroOperaciones value for this RespuestaCentralRiesgo.
     * 
     * @param numeroOperaciones
     */
    public void setNumeroOperaciones(java.lang.Short numeroOperaciones) {
        this.numeroOperaciones = numeroOperaciones;
    }


    /**
     * Gets the reciprocidad value for this RespuestaCentralRiesgo.
     * 
     * @return reciprocidad
     */
    public java.lang.String getReciprocidad() {
        return reciprocidad;
    }


    /**
     * Sets the reciprocidad value for this RespuestaCentralRiesgo.
     * 
     * @param reciprocidad
     */
    public void setReciprocidad(java.lang.String reciprocidad) {
        this.reciprocidad = reciprocidad;
    }


    /**
     * Gets the tieneError value for this RespuestaCentralRiesgo.
     * 
     * @return tieneError
     */
    public boolean isTieneError() {
        return tieneError;
    }


    /**
     * Sets the tieneError value for this RespuestaCentralRiesgo.
     * 
     * @param tieneError
     */
    public void setTieneError(boolean tieneError) {
        this.tieneError = tieneError;
    }


    /**
     * Gets the mensaje value for this RespuestaCentralRiesgo.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this RespuestaCentralRiesgo.
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
		RespuestaCentralRiesgo other = (RespuestaCentralRiesgo) obj;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (__hashCodeCalc != other.__hashCodeCalc)
			return false;
		if (calificacionRiesgoCOD == null) {
			if (other.calificacionRiesgoCOD != null)
				return false;
		} else if (!calificacionRiesgoCOD.equals(other.calificacionRiesgoCOD))
			return false;
		if (Double.doubleToLongBits(carteraRiesgo) != Double.doubleToLongBits(other.carteraRiesgo))
			return false;
		if (Double.doubleToLongBits(castigoDemanda) != Double.doubleToLongBits(other.castigoDemanda))
			return false;
		if (Double.doubleToLongBits(castigoDemanda12Meses) != Double.doubleToLongBits(other.castigoDemanda12Meses))
			return false;
		if (identificacionCentralRiesgo == null) {
			if (other.identificacionCentralRiesgo != null)
				return false;
		} else if (!identificacionCentralRiesgo.equals(other.identificacionCentralRiesgo))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (Double.doubleToLongBits(montoTotalEndeudamiento) != Double.doubleToLongBits(other.montoTotalEndeudamiento))
			return false;
		if (numeroCreditosIFI == null) {
			if (other.numeroCreditosIFI != null)
				return false;
		} else if (!numeroCreditosIFI.equals(other.numeroCreditosIFI))
			return false;
		if (numeroOperaciones == null) {
			if (other.numeroOperaciones != null)
				return false;
		} else if (!numeroOperaciones.equals(other.numeroOperaciones))
			return false;
		if (peorCalificacion12MesesCOD == null) {
			if (other.peorCalificacion12MesesCOD != null)
				return false;
		} else if (!peorCalificacion12MesesCOD.equals(other.peorCalificacion12MesesCOD))
			return false;
		if (personaId != other.personaId)
			return false;
		if (reciprocidad == null) {
			if (other.reciprocidad != null)
				return false;
		} else if (!reciprocidad.equals(other.reciprocidad))
			return false;
		if (seccion == null) {
			if (other.seccion != null)
				return false;
		} else if (!seccion.equals(other.seccion))
			return false;
		if (tieneError != other.tieneError)
			return false;
		if (Double.doubleToLongBits(totalCarteraVigente) != Double.doubleToLongBits(other.totalCarteraVigente))
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
		result = prime * result + ((calificacionRiesgoCOD == null) ? 0 : calificacionRiesgoCOD.hashCode());
		long temp;
		temp = Double.doubleToLongBits(carteraRiesgo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(castigoDemanda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(castigoDemanda12Meses);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((identificacionCentralRiesgo == null) ? 0 : identificacionCentralRiesgo.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		temp = Double.doubleToLongBits(montoTotalEndeudamiento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((numeroCreditosIFI == null) ? 0 : numeroCreditosIFI.hashCode());
		result = prime * result + ((numeroOperaciones == null) ? 0 : numeroOperaciones.hashCode());
		result = prime * result + ((peorCalificacion12MesesCOD == null) ? 0 : peorCalificacion12MesesCOD.hashCode());
		result = prime * result + personaId;
		result = prime * result + ((reciprocidad == null) ? 0 : reciprocidad.hashCode());
		result = prime * result + ((seccion == null) ? 0 : seccion.hashCode());
		result = prime * result + (tieneError ? 1231 : 1237);
		temp = Double.doubleToLongBits(totalCarteraVigente);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaCentralRiesgo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaCentralRiesgo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionCentralRiesgo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionCentralRiesgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PersonaId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Seccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoTotalEndeudamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MontoTotalEndeudamiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCarteraVigente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TotalCarteraVigente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carteraRiesgo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CarteraRiesgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calificacionRiesgoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CalificacionRiesgoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("castigoDemanda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CastigoDemanda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peorCalificacion12MesesCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PeorCalificacion12mesesCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("castigoDemanda12Meses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CastigoDemanda12meses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCreditosIFI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroCreditosIFI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOperaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroOperaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reciprocidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Reciprocidad"));
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

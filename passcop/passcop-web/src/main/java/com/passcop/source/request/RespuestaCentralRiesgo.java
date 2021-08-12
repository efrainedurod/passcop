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

    private java.math.BigDecimal montoTotalEndeudamiento;

    private java.math.BigDecimal totalCarteraVigente;

    private java.math.BigDecimal carteraRiesgo;

    private java.lang.String calificacionRiesgoCOD;

    private java.math.BigDecimal castigoDemanda;

    private java.lang.String peorCalificacion12MesesCOD;

    private java.math.BigDecimal castigoDemanda12Meses;

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
           java.math.BigDecimal montoTotalEndeudamiento,
           java.math.BigDecimal totalCarteraVigente,
           java.math.BigDecimal carteraRiesgo,
           java.lang.String calificacionRiesgoCOD,
           java.math.BigDecimal castigoDemanda,
           java.lang.String peorCalificacion12MesesCOD,
           java.math.BigDecimal castigoDemanda12Meses,
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
    public java.math.BigDecimal getMontoTotalEndeudamiento() {
        return montoTotalEndeudamiento;
    }


    /**
     * Sets the montoTotalEndeudamiento value for this RespuestaCentralRiesgo.
     * 
     * @param montoTotalEndeudamiento
     */
    public void setMontoTotalEndeudamiento(java.math.BigDecimal montoTotalEndeudamiento) {
        this.montoTotalEndeudamiento = montoTotalEndeudamiento;
    }


    /**
     * Gets the totalCarteraVigente value for this RespuestaCentralRiesgo.
     * 
     * @return totalCarteraVigente
     */
    public java.math.BigDecimal getTotalCarteraVigente() {
        return totalCarteraVigente;
    }


    /**
     * Sets the totalCarteraVigente value for this RespuestaCentralRiesgo.
     * 
     * @param totalCarteraVigente
     */
    public void setTotalCarteraVigente(java.math.BigDecimal totalCarteraVigente) {
        this.totalCarteraVigente = totalCarteraVigente;
    }


    /**
     * Gets the carteraRiesgo value for this RespuestaCentralRiesgo.
     * 
     * @return carteraRiesgo
     */
    public java.math.BigDecimal getCarteraRiesgo() {
        return carteraRiesgo;
    }


    /**
     * Sets the carteraRiesgo value for this RespuestaCentralRiesgo.
     * 
     * @param carteraRiesgo
     */
    public void setCarteraRiesgo(java.math.BigDecimal carteraRiesgo) {
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
    public java.math.BigDecimal getCastigoDemanda() {
        return castigoDemanda;
    }


    /**
     * Sets the castigoDemanda value for this RespuestaCentralRiesgo.
     * 
     * @param castigoDemanda
     */
    public void setCastigoDemanda(java.math.BigDecimal castigoDemanda) {
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
    public java.math.BigDecimal getCastigoDemanda12Meses() {
        return castigoDemanda12Meses;
    }


    /**
     * Sets the castigoDemanda12Meses value for this RespuestaCentralRiesgo.
     * 
     * @param castigoDemanda12Meses
     */
    public void setCastigoDemanda12Meses(java.math.BigDecimal castigoDemanda12Meses) {
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
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaCentralRiesgo)) return false;
        RespuestaCentralRiesgo other = (RespuestaCentralRiesgo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identificacionCentralRiesgo==null && other.getIdentificacionCentralRiesgo()==null) || 
             (this.identificacionCentralRiesgo!=null &&
              this.identificacionCentralRiesgo.equals(other.getIdentificacionCentralRiesgo()))) &&
            this.personaId == other.getPersonaId() &&
            ((this.seccion==null && other.getSeccion()==null) || 
             (this.seccion!=null &&
              this.seccion.equals(other.getSeccion()))) &&
            ((this.montoTotalEndeudamiento==null && other.getMontoTotalEndeudamiento()==null) || 
             (this.montoTotalEndeudamiento!=null &&
              this.montoTotalEndeudamiento.equals(other.getMontoTotalEndeudamiento()))) &&
            ((this.totalCarteraVigente==null && other.getTotalCarteraVigente()==null) || 
             (this.totalCarteraVigente!=null &&
              this.totalCarteraVigente.equals(other.getTotalCarteraVigente()))) &&
            ((this.carteraRiesgo==null && other.getCarteraRiesgo()==null) || 
             (this.carteraRiesgo!=null &&
              this.carteraRiesgo.equals(other.getCarteraRiesgo()))) &&
            ((this.calificacionRiesgoCOD==null && other.getCalificacionRiesgoCOD()==null) || 
             (this.calificacionRiesgoCOD!=null &&
              this.calificacionRiesgoCOD.equals(other.getCalificacionRiesgoCOD()))) &&
            ((this.castigoDemanda==null && other.getCastigoDemanda()==null) || 
             (this.castigoDemanda!=null &&
              this.castigoDemanda.equals(other.getCastigoDemanda()))) &&
            ((this.peorCalificacion12MesesCOD==null && other.getPeorCalificacion12MesesCOD()==null) || 
             (this.peorCalificacion12MesesCOD!=null &&
              this.peorCalificacion12MesesCOD.equals(other.getPeorCalificacion12MesesCOD()))) &&
            ((this.castigoDemanda12Meses==null && other.getCastigoDemanda12Meses()==null) || 
             (this.castigoDemanda12Meses!=null &&
              this.castigoDemanda12Meses.equals(other.getCastigoDemanda12Meses()))) &&
            ((this.numeroCreditosIFI==null && other.getNumeroCreditosIFI()==null) || 
             (this.numeroCreditosIFI!=null &&
              this.numeroCreditosIFI.equals(other.getNumeroCreditosIFI()))) &&
            ((this.numeroOperaciones==null && other.getNumeroOperaciones()==null) || 
             (this.numeroOperaciones!=null &&
              this.numeroOperaciones.equals(other.getNumeroOperaciones()))) &&
            ((this.reciprocidad==null && other.getReciprocidad()==null) || 
             (this.reciprocidad!=null &&
              this.reciprocidad.equals(other.getReciprocidad()))) &&
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
        if (getIdentificacionCentralRiesgo() != null) {
            _hashCode += getIdentificacionCentralRiesgo().hashCode();
        }
        _hashCode += getPersonaId();
        if (getSeccion() != null) {
            _hashCode += getSeccion().hashCode();
        }
        if (getMontoTotalEndeudamiento() != null) {
            _hashCode += getMontoTotalEndeudamiento().hashCode();
        }
        if (getTotalCarteraVigente() != null) {
            _hashCode += getTotalCarteraVigente().hashCode();
        }
        if (getCarteraRiesgo() != null) {
            _hashCode += getCarteraRiesgo().hashCode();
        }
        if (getCalificacionRiesgoCOD() != null) {
            _hashCode += getCalificacionRiesgoCOD().hashCode();
        }
        if (getCastigoDemanda() != null) {
            _hashCode += getCastigoDemanda().hashCode();
        }
        if (getPeorCalificacion12MesesCOD() != null) {
            _hashCode += getPeorCalificacion12MesesCOD().hashCode();
        }
        if (getCastigoDemanda12Meses() != null) {
            _hashCode += getCastigoDemanda12Meses().hashCode();
        }
        if (getNumeroCreditosIFI() != null) {
            _hashCode += getNumeroCreditosIFI().hashCode();
        }
        if (getNumeroOperaciones() != null) {
            _hashCode += getNumeroOperaciones().hashCode();
        }
        if (getReciprocidad() != null) {
            _hashCode += getReciprocidad().hashCode();
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

/**
 * ReferenciasPersonales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class ReferenciasPersonales  implements java.io.Serializable {
    private java.lang.Integer solicitudID;

    private java.lang.String nombre;

    private java.lang.String tipoReferenciaPersonalCOD;

    private java.lang.String telefono;

    private java.lang.String observacion;

    private boolean tieneError;

    private java.lang.String mensaje;

    public ReferenciasPersonales() {
    }

    public ReferenciasPersonales(
           java.lang.Integer solicitudID,
           java.lang.String nombre,
           java.lang.String tipoReferenciaPersonalCOD,
           java.lang.String telefono,
           java.lang.String observacion,
           boolean tieneError,
           java.lang.String mensaje) {
           this.solicitudID = solicitudID;
           this.nombre = nombre;
           this.tipoReferenciaPersonalCOD = tipoReferenciaPersonalCOD;
           this.telefono = telefono;
           this.observacion = observacion;
           this.tieneError = tieneError;
           this.mensaje = mensaje;
    }


    /**
     * Gets the solicitudID value for this ReferenciasPersonales.
     * 
     * @return solicitudID
     */
    public java.lang.Integer getSolicitudID() {
        return solicitudID;
    }


    /**
     * Sets the solicitudID value for this ReferenciasPersonales.
     * 
     * @param solicitudID
     */
    public void setSolicitudID(java.lang.Integer solicitudID) {
        this.solicitudID = solicitudID;
    }


    /**
     * Gets the nombre value for this ReferenciasPersonales.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ReferenciasPersonales.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the tipoReferenciaPersonalCOD value for this ReferenciasPersonales.
     * 
     * @return tipoReferenciaPersonalCOD
     */
    public java.lang.String getTipoReferenciaPersonalCOD() {
        return tipoReferenciaPersonalCOD;
    }


    /**
     * Sets the tipoReferenciaPersonalCOD value for this ReferenciasPersonales.
     * 
     * @param tipoReferenciaPersonalCOD
     */
    public void setTipoReferenciaPersonalCOD(java.lang.String tipoReferenciaPersonalCOD) {
        this.tipoReferenciaPersonalCOD = tipoReferenciaPersonalCOD;
    }


    /**
     * Gets the telefono value for this ReferenciasPersonales.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this ReferenciasPersonales.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the observacion value for this ReferenciasPersonales.
     * 
     * @return observacion
     */
    public java.lang.String getObservacion() {
        return observacion;
    }


    /**
     * Sets the observacion value for this ReferenciasPersonales.
     * 
     * @param observacion
     */
    public void setObservacion(java.lang.String observacion) {
        this.observacion = observacion;
    }


    /**
     * Gets the tieneError value for this ReferenciasPersonales.
     * 
     * @return tieneError
     */
    public boolean isTieneError() {
        return tieneError;
    }


    /**
     * Sets the tieneError value for this ReferenciasPersonales.
     * 
     * @param tieneError
     */
    public void setTieneError(boolean tieneError) {
        this.tieneError = tieneError;
    }


    /**
     * Gets the mensaje value for this ReferenciasPersonales.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this ReferenciasPersonales.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReferenciasPersonales)) return false;
        ReferenciasPersonales other = (ReferenciasPersonales) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.solicitudID==null && other.getSolicitudID()==null) || 
             (this.solicitudID!=null &&
              this.solicitudID.equals(other.getSolicitudID()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.tipoReferenciaPersonalCOD==null && other.getTipoReferenciaPersonalCOD()==null) || 
             (this.tipoReferenciaPersonalCOD!=null &&
              this.tipoReferenciaPersonalCOD.equals(other.getTipoReferenciaPersonalCOD()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.observacion==null && other.getObservacion()==null) || 
             (this.observacion!=null &&
              this.observacion.equals(other.getObservacion()))) &&
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
        if (getSolicitudID() != null) {
            _hashCode += getSolicitudID().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getTipoReferenciaPersonalCOD() != null) {
            _hashCode += getTipoReferenciaPersonalCOD().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getObservacion() != null) {
            _hashCode += getObservacion().hashCode();
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
        new org.apache.axis.description.TypeDesc(ReferenciasPersonales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasPersonales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitudID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SolicitudID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoReferenciaPersonalCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoReferenciaPersonalCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Observacion"));
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

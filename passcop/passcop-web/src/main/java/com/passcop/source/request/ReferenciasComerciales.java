/**
 * ReferenciasComerciales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class ReferenciasComerciales  implements java.io.Serializable {
    private java.lang.Integer solicitudID;

    private java.lang.String tipoReferenciaComercialCOD;

    private java.lang.String descripcion;

    private double valor;

    private java.lang.String telefono;

    private java.lang.String observacion;

    private boolean tieneError;

    private java.lang.String mensaje;

    public ReferenciasComerciales() {
    }

    public ReferenciasComerciales(
           java.lang.Integer solicitudID,
           java.lang.String tipoReferenciaComercialCOD,
           java.lang.String descripcion,
           double valor,
           java.lang.String telefono,
           java.lang.String observacion,
           boolean tieneError,
           java.lang.String mensaje) {
           this.solicitudID = solicitudID;
           this.tipoReferenciaComercialCOD = tipoReferenciaComercialCOD;
           this.descripcion = descripcion;
           this.valor = valor;
           this.telefono = telefono;
           this.observacion = observacion;
           this.tieneError = tieneError;
           this.mensaje = mensaje;
    }


    /**
     * Gets the solicitudID value for this ReferenciasComerciales.
     * 
     * @return solicitudID
     */
    public java.lang.Integer getSolicitudID() {
        return solicitudID;
    }


    /**
     * Sets the solicitudID value for this ReferenciasComerciales.
     * 
     * @param solicitudID
     */
    public void setSolicitudID(java.lang.Integer solicitudID) {
        this.solicitudID = solicitudID;
    }


    /**
     * Gets the tipoReferenciaComercialCOD value for this ReferenciasComerciales.
     * 
     * @return tipoReferenciaComercialCOD
     */
    public java.lang.String getTipoReferenciaComercialCOD() {
        return tipoReferenciaComercialCOD;
    }


    /**
     * Sets the tipoReferenciaComercialCOD value for this ReferenciasComerciales.
     * 
     * @param tipoReferenciaComercialCOD
     */
    public void setTipoReferenciaComercialCOD(java.lang.String tipoReferenciaComercialCOD) {
        this.tipoReferenciaComercialCOD = tipoReferenciaComercialCOD;
    }


    /**
     * Gets the descripcion value for this ReferenciasComerciales.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this ReferenciasComerciales.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the valor value for this ReferenciasComerciales.
     * 
     * @return valor
     */
    public double getValor() {
        return valor;
    }


    /**
     * Sets the valor value for this ReferenciasComerciales.
     * 
     * @param valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


    /**
     * Gets the telefono value for this ReferenciasComerciales.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this ReferenciasComerciales.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the observacion value for this ReferenciasComerciales.
     * 
     * @return observacion
     */
    public java.lang.String getObservacion() {
        return observacion;
    }


    /**
     * Sets the observacion value for this ReferenciasComerciales.
     * 
     * @param observacion
     */
    public void setObservacion(java.lang.String observacion) {
        this.observacion = observacion;
    }


    /**
     * Gets the tieneError value for this ReferenciasComerciales.
     * 
     * @return tieneError
     */
    public boolean isTieneError() {
        return tieneError;
    }


    /**
     * Sets the tieneError value for this ReferenciasComerciales.
     * 
     * @param tieneError
     */
    public void setTieneError(boolean tieneError) {
        this.tieneError = tieneError;
    }


    /**
     * Gets the mensaje value for this ReferenciasComerciales.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this ReferenciasComerciales.
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
		ReferenciasComerciales other = (ReferenciasComerciales) obj;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (__hashCodeCalc != other.__hashCodeCalc)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (solicitudID == null) {
			if (other.solicitudID != null)
				return false;
		} else if (!solicitudID.equals(other.solicitudID))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (tieneError != other.tieneError)
			return false;
		if (tipoReferenciaComercialCOD == null) {
			if (other.tipoReferenciaComercialCOD != null)
				return false;
		} else if (!tipoReferenciaComercialCOD.equals(other.tipoReferenciaComercialCOD))
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
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result + ((solicitudID == null) ? 0 : solicitudID.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + (tieneError ? 1231 : 1237);
		result = prime * result + ((tipoReferenciaComercialCOD == null) ? 0 : tipoReferenciaComercialCOD.hashCode());
		long temp;
		temp = Double.doubleToLongBits(valor);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReferenciasComerciales.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasComerciales"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitudID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SolicitudID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoReferenciaComercialCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoReferenciaComercialCOD"));
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

/**
 * Persona.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class RespuestaSolicitud implements java.io.Serializable {

	private boolean tieneError;

	private java.lang.String respuestaCOD;

	private java.lang.String mensaje;

	private java.lang.String mensajePersonalizado;

	private java.lang.String mensajeTecnico;

	public RespuestaSolicitud() {
	}

	public RespuestaSolicitud(boolean tieneError, String respuestaCOD, String mensaje, String mensajePersonalizado,
			String mensajeTecnico) {
		this.tieneError = tieneError;
		this.respuestaCOD = respuestaCOD;
		this.mensaje = mensaje;
		this.mensajePersonalizado = mensajePersonalizado;
		this.mensajeTecnico = mensajeTecnico;
	}

	public boolean isTieneError() {
		return tieneError;
	}

	public void setTieneError(boolean tieneError) {
		this.tieneError = tieneError;
	}

	public java.lang.String getRespuestaCOD() {
		return respuestaCOD;
	}

	public void setRespuestaCOD(java.lang.String respuestaCOD) {
		this.respuestaCOD = respuestaCOD;
	}

	public java.lang.String getMensaje() {
		return mensaje;
	}

	public void setMensaje(java.lang.String mensaje) {
		this.mensaje = mensaje;
	}

	public java.lang.String getMensajePersonalizado() {
		return mensajePersonalizado;
	}

	public void setMensajePersonalizado(java.lang.String mensajePersonalizado) {
		this.mensajePersonalizado = mensajePersonalizado;
	}

	public java.lang.String getMensajeTecnico() {
		return mensajeTecnico;
	}

	public void setMensajeTecnico(java.lang.String mensajeTecnico) {
		this.mensajeTecnico = mensajeTecnico;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((__equalsCalc == null) ? 0 : __equalsCalc.hashCode());
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((mensajePersonalizado == null) ? 0 : mensajePersonalizado.hashCode());
		result = prime * result + ((mensajeTecnico == null) ? 0 : mensajeTecnico.hashCode());
		result = prime * result + ((respuestaCOD == null) ? 0 : respuestaCOD.hashCode());
		result = prime * result + (tieneError ? 1231 : 1237);
		return result;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RespuestaSolicitud other = (RespuestaSolicitud) obj;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (mensajePersonalizado == null) {
			if (other.mensajePersonalizado != null)
				return false;
		} else if (!mensajePersonalizado.equals(other.mensajePersonalizado))
			return false;
		if (mensajeTecnico == null) {
			if (other.mensajeTecnico != null)
				return false;
		} else if (!mensajeTecnico.equals(other.mensajeTecnico))
			return false;
		if (respuestaCOD == null) {
			if (other.respuestaCOD != null)
				return false;
		} else if (!respuestaCOD.equals(other.respuestaCOD))
			return false;
		if (tieneError != other.tieneError)
			return false;
		return true;
	}


	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			Persona.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaSolicitud"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mensajePersonalizado");
		elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MensajePersonalizado"));
		elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("mensajeTecnico");
		elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MensajeTecnico"));
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
	public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType,
			java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
	}

}

/**
 * DetallePatrimonial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class DetallePatrimonial  implements java.io.Serializable {
    private int cuentaIDDetallePatrimonial;

    private java.lang.String cuentaDetallePatrimonial;

    private java.lang.String grupoCuentaCODEDetallePatrimonial;

    private boolean detallar;

    private boolean circulante;

    private boolean inventario;

    private int orden;

    private java.lang.String descripcion;

    private int cantidad;

    private double valorDetallePatrimonial;

    public DetallePatrimonial() {
    }

    public DetallePatrimonial(
           int cuentaIDDetallePatrimonial,
           java.lang.String cuentaDetallePatrimonial,
           java.lang.String grupoCuentaCODEDetallePatrimonial,
           boolean detallar,
           boolean circulante,
           boolean inventario,
           int orden,
           java.lang.String descripcion,
           int cantidad,
           double valorDetallePatrimonial) {
           this.cuentaIDDetallePatrimonial = cuentaIDDetallePatrimonial;
           this.cuentaDetallePatrimonial = cuentaDetallePatrimonial;
           this.grupoCuentaCODEDetallePatrimonial = grupoCuentaCODEDetallePatrimonial;
           this.detallar = detallar;
           this.circulante = circulante;
           this.inventario = inventario;
           this.orden = orden;
           this.descripcion = descripcion;
           this.cantidad = cantidad;
           this.valorDetallePatrimonial = valorDetallePatrimonial;
    }


    /**
     * Gets the cuentaIDDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @return cuentaIDDetallePatrimonial
     */
    public int getCuentaIDDetallePatrimonial() {
        return cuentaIDDetallePatrimonial;
    }


    /**
     * Sets the cuentaIDDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @param cuentaIDDetallePatrimonial
     */
    public void setCuentaIDDetallePatrimonial(int cuentaIDDetallePatrimonial) {
        this.cuentaIDDetallePatrimonial = cuentaIDDetallePatrimonial;
    }


    /**
     * Gets the cuentaDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @return cuentaDetallePatrimonial
     */
    public java.lang.String getCuentaDetallePatrimonial() {
        return cuentaDetallePatrimonial;
    }


    /**
     * Sets the cuentaDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @param cuentaDetallePatrimonial
     */
    public void setCuentaDetallePatrimonial(java.lang.String cuentaDetallePatrimonial) {
        this.cuentaDetallePatrimonial = cuentaDetallePatrimonial;
    }


    /**
     * Gets the grupoCuentaCODEDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @return grupoCuentaCODEDetallePatrimonial
     */
    public java.lang.String getGrupoCuentaCODEDetallePatrimonial() {
        return grupoCuentaCODEDetallePatrimonial;
    }


    /**
     * Sets the grupoCuentaCODEDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @param grupoCuentaCODEDetallePatrimonial
     */
    public void setGrupoCuentaCODEDetallePatrimonial(java.lang.String grupoCuentaCODEDetallePatrimonial) {
        this.grupoCuentaCODEDetallePatrimonial = grupoCuentaCODEDetallePatrimonial;
    }


    /**
     * Gets the detallar value for this DetallePatrimonial.
     * 
     * @return detallar
     */
    public boolean isDetallar() {
        return detallar;
    }


    /**
     * Sets the detallar value for this DetallePatrimonial.
     * 
     * @param detallar
     */
    public void setDetallar(boolean detallar) {
        this.detallar = detallar;
    }


    /**
     * Gets the circulante value for this DetallePatrimonial.
     * 
     * @return circulante
     */
    public boolean isCirculante() {
        return circulante;
    }


    /**
     * Sets the circulante value for this DetallePatrimonial.
     * 
     * @param circulante
     */
    public void setCirculante(boolean circulante) {
        this.circulante = circulante;
    }


    /**
     * Gets the inventario value for this DetallePatrimonial.
     * 
     * @return inventario
     */
    public boolean isInventario() {
        return inventario;
    }


    /**
     * Sets the inventario value for this DetallePatrimonial.
     * 
     * @param inventario
     */
    public void setInventario(boolean inventario) {
        this.inventario = inventario;
    }


    /**
     * Gets the orden value for this DetallePatrimonial.
     * 
     * @return orden
     */
    public int getOrden() {
        return orden;
    }


    /**
     * Sets the orden value for this DetallePatrimonial.
     * 
     * @param orden
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }


    /**
     * Gets the descripcion value for this DetallePatrimonial.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this DetallePatrimonial.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the cantidad value for this DetallePatrimonial.
     * 
     * @return cantidad
     */
    public int getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this DetallePatrimonial.
     * 
     * @param cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the valorDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @return valorDetallePatrimonial
     */
    public double getValorDetallePatrimonial() {
        return valorDetallePatrimonial;
    }


    /**
     * Sets the valorDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @param valorDetallePatrimonial
     */
    public void setValorDetallePatrimonial(double valorDetallePatrimonial) {
        this.valorDetallePatrimonial = valorDetallePatrimonial;
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
		DetallePatrimonial other = (DetallePatrimonial) obj;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (__hashCodeCalc != other.__hashCodeCalc)
			return false;
		if (cantidad != other.cantidad)
			return false;
		if (circulante != other.circulante)
			return false;
		if (cuentaDetallePatrimonial == null) {
			if (other.cuentaDetallePatrimonial != null)
				return false;
		} else if (!cuentaDetallePatrimonial.equals(other.cuentaDetallePatrimonial))
			return false;
		if (cuentaIDDetallePatrimonial != other.cuentaIDDetallePatrimonial)
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (detallar != other.detallar)
			return false;
		if (grupoCuentaCODEDetallePatrimonial == null) {
			if (other.grupoCuentaCODEDetallePatrimonial != null)
				return false;
		} else if (!grupoCuentaCODEDetallePatrimonial.equals(other.grupoCuentaCODEDetallePatrimonial))
			return false;
		if (inventario != other.inventario)
			return false;
		if (orden != other.orden)
			return false;
		if (Double.doubleToLongBits(valorDetallePatrimonial) != Double.doubleToLongBits(other.valorDetallePatrimonial))
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
		result = prime * result + cantidad;
		result = prime * result + (circulante ? 1231 : 1237);
		result = prime * result + ((cuentaDetallePatrimonial == null) ? 0 : cuentaDetallePatrimonial.hashCode());
		result = prime * result + cuentaIDDetallePatrimonial;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (detallar ? 1231 : 1237);
		result = prime * result
				+ ((grupoCuentaCODEDetallePatrimonial == null) ? 0 : grupoCuentaCODEDetallePatrimonial.hashCode());
		result = prime * result + (inventario ? 1231 : 1237);
		result = prime * result + orden;
		long temp;
		temp = Double.doubleToLongBits(valorDetallePatrimonial);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetallePatrimonial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrimonial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaIDDetallePatrimonial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CuentaIDDetallePatrimonial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaDetallePatrimonial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CuentaDetallePatrimonial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoCuentaCODEDetallePatrimonial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GrupoCuentaCODEDetallePatrimonial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detallar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Detallar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circulante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Circulante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inventario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Inventario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orden");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Orden"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("cantidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Cantidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDetallePatrimonial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValorDetallePatrimonial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
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
		return "DetallePatrimonial [cuentaIDDetallePatrimonial=" + cuentaIDDetallePatrimonial
				+ ", cuentaDetallePatrimonial=" + cuentaDetallePatrimonial + ", grupoCuentaCODEDetallePatrimonial="
				+ grupoCuentaCODEDetallePatrimonial + ", detallar=" + detallar + ", circulante=" + circulante
				+ ", inventario=" + inventario + ", orden=" + orden + ", descripcion=" + descripcion + ", cantidad="
				+ cantidad + ", valorDetallePatrimonial=" + valorDetallePatrimonial + ", __equalsCalc=" + __equalsCalc
				+ ", __hashCodeCalc=" + __hashCodeCalc + "]";
	}

    
}

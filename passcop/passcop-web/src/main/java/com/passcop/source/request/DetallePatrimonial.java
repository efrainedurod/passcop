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

    private java.lang.Integer cantidad;

    private java.math.BigDecimal valorDetallePatrimonial;

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
           java.lang.Integer cantidad,
           java.math.BigDecimal valorDetallePatrimonial) {
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
    public java.lang.Integer getCantidad() {
        return cantidad;
    }


    /**
     * Sets the cantidad value for this DetallePatrimonial.
     * 
     * @param cantidad
     */
    public void setCantidad(java.lang.Integer cantidad) {
        this.cantidad = cantidad;
    }


    /**
     * Gets the valorDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @return valorDetallePatrimonial
     */
    public java.math.BigDecimal getValorDetallePatrimonial() {
        return valorDetallePatrimonial;
    }


    /**
     * Sets the valorDetallePatrimonial value for this DetallePatrimonial.
     * 
     * @param valorDetallePatrimonial
     */
    public void setValorDetallePatrimonial(java.math.BigDecimal valorDetallePatrimonial) {
        this.valorDetallePatrimonial = valorDetallePatrimonial;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetallePatrimonial)) return false;
        DetallePatrimonial other = (DetallePatrimonial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cuentaIDDetallePatrimonial == other.getCuentaIDDetallePatrimonial() &&
            ((this.cuentaDetallePatrimonial==null && other.getCuentaDetallePatrimonial()==null) || 
             (this.cuentaDetallePatrimonial!=null &&
              this.cuentaDetallePatrimonial.equals(other.getCuentaDetallePatrimonial()))) &&
            ((this.grupoCuentaCODEDetallePatrimonial==null && other.getGrupoCuentaCODEDetallePatrimonial()==null) || 
             (this.grupoCuentaCODEDetallePatrimonial!=null &&
              this.grupoCuentaCODEDetallePatrimonial.equals(other.getGrupoCuentaCODEDetallePatrimonial()))) &&
            this.detallar == other.isDetallar() &&
            this.circulante == other.isCirculante() &&
            this.inventario == other.isInventario() &&
            this.orden == other.getOrden() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.cantidad==null && other.getCantidad()==null) || 
             (this.cantidad!=null &&
              this.cantidad.equals(other.getCantidad()))) &&
            ((this.valorDetallePatrimonial==null && other.getValorDetallePatrimonial()==null) || 
             (this.valorDetallePatrimonial!=null &&
              this.valorDetallePatrimonial.equals(other.getValorDetallePatrimonial())));
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
        _hashCode += getCuentaIDDetallePatrimonial();
        if (getCuentaDetallePatrimonial() != null) {
            _hashCode += getCuentaDetallePatrimonial().hashCode();
        }
        if (getGrupoCuentaCODEDetallePatrimonial() != null) {
            _hashCode += getGrupoCuentaCODEDetallePatrimonial().hashCode();
        }
        _hashCode += (isDetallar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCirculante() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInventario() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOrden();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getCantidad() != null) {
            _hashCode += getCantidad().hashCode();
        }
        if (getValorDetallePatrimonial() != null) {
            _hashCode += getValorDetallePatrimonial().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
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

}

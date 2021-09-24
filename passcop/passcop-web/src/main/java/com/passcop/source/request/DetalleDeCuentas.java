/**
 * DetalleDeCuentas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class DetalleDeCuentas  implements java.io.Serializable {
    private int infEconFamiliarID;

    private int personaID;

    private int cuentaID;

    private java.math.BigDecimal valorDetalleCuentas;

    private short institucionID;

    private java.lang.String grupoCuentaCODE;

    private java.lang.String nombreDetalleCuenta;

    private boolean detallar;

    private boolean circulante;

    private boolean inventario;

    private int orden;

    public DetalleDeCuentas() {
    }

    public DetalleDeCuentas(
           int infEconFamiliarID,
           int personaID,
           int cuentaID,
           java.math.BigDecimal valorDetalleCuentas,
           short institucionID,
           java.lang.String grupoCuentaCODE,
           java.lang.String nombreDetalleCuenta,
           boolean detallar,
           boolean circulante,
           boolean inventario,
           int orden) {
           this.infEconFamiliarID = infEconFamiliarID;
           this.personaID = personaID;
           this.cuentaID = cuentaID;
           this.valorDetalleCuentas = valorDetalleCuentas;
           this.institucionID = institucionID;
           this.grupoCuentaCODE = grupoCuentaCODE;
           this.nombreDetalleCuenta = nombreDetalleCuenta;
           this.detallar = detallar;
           this.circulante = circulante;
           this.inventario = inventario;
           this.orden = orden;
    }


    /**
     * Gets the infEconFamiliarID value for this DetalleDeCuentas.
     * 
     * @return infEconFamiliarID
     */
    public int getInfEconFamiliarID() {
        return infEconFamiliarID;
    }


    /**
     * Sets the infEconFamiliarID value for this DetalleDeCuentas.
     * 
     * @param infEconFamiliarID
     */
    public void setInfEconFamiliarID(int infEconFamiliarID) {
        this.infEconFamiliarID = infEconFamiliarID;
    }


    /**
     * Gets the personaID value for this DetalleDeCuentas.
     * 
     * @return personaID
     */
    public int getPersonaID() {
        return personaID;
    }


    /**
     * Sets the personaID value for this DetalleDeCuentas.
     * 
     * @param personaID
     */
    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }


    /**
     * Gets the cuentaID value for this DetalleDeCuentas.
     * 
     * @return cuentaID
     */
    public int getCuentaID() {
        return cuentaID;
    }


    /**
     * Sets the cuentaID value for this DetalleDeCuentas.
     * 
     * @param cuentaID
     */
    public void setCuentaID(int cuentaID) {
        this.cuentaID = cuentaID;
    }


    /**
     * Gets the valorDetalleCuentas value for this DetalleDeCuentas.
     * 
     * @return valorDetalleCuentas
     */
    public java.math.BigDecimal getValorDetalleCuentas() {
        return valorDetalleCuentas;
    }


    /**
     * Sets the valorDetalleCuentas value for this DetalleDeCuentas.
     * 
     * @param valorDetalleCuentas
     */
    public void setValorDetalleCuentas(java.math.BigDecimal valorDetalleCuentas) {
        this.valorDetalleCuentas = valorDetalleCuentas;
    }


    /**
     * Gets the institucionID value for this DetalleDeCuentas.
     * 
     * @return institucionID
     */
    public short getInstitucionID() {
        return institucionID;
    }


    /**
     * Sets the institucionID value for this DetalleDeCuentas.
     * 
     * @param institucionID
     */
    public void setInstitucionID(short institucionID) {
        this.institucionID = institucionID;
    }


    /**
     * Gets the grupoCuentaCODE value for this DetalleDeCuentas.
     * 
     * @return grupoCuentaCODE
     */
    public java.lang.String getGrupoCuentaCODE() {
        return grupoCuentaCODE;
    }


    /**
     * Sets the grupoCuentaCODE value for this DetalleDeCuentas.
     * 
     * @param grupoCuentaCODE
     */
    public void setGrupoCuentaCODE(java.lang.String grupoCuentaCODE) {
        this.grupoCuentaCODE = grupoCuentaCODE;
    }


    /**
     * Gets the nombreDetalleCuenta value for this DetalleDeCuentas.
     * 
     * @return nombreDetalleCuenta
     */
    public java.lang.String getNombreDetalleCuenta() {
        return nombreDetalleCuenta;
    }


    /**
     * Sets the nombreDetalleCuenta value for this DetalleDeCuentas.
     * 
     * @param nombreDetalleCuenta
     */
    public void setNombreDetalleCuenta(java.lang.String nombreDetalleCuenta) {
        this.nombreDetalleCuenta = nombreDetalleCuenta;
    }


    /**
     * Gets the detallar value for this DetalleDeCuentas.
     * 
     * @return detallar
     */
    public boolean isDetallar() {
        return detallar;
    }


    /**
     * Sets the detallar value for this DetalleDeCuentas.
     * 
     * @param detallar
     */
    public void setDetallar(boolean detallar) {
        this.detallar = detallar;
    }


    /**
     * Gets the circulante value for this DetalleDeCuentas.
     * 
     * @return circulante
     */
    public boolean isCirculante() {
        return circulante;
    }


    /**
     * Sets the circulante value for this DetalleDeCuentas.
     * 
     * @param circulante
     */
    public void setCirculante(boolean circulante) {
        this.circulante = circulante;
    }


    /**
     * Gets the inventario value for this DetalleDeCuentas.
     * 
     * @return inventario
     */
    public boolean isInventario() {
        return inventario;
    }


    /**
     * Sets the inventario value for this DetalleDeCuentas.
     * 
     * @param inventario
     */
    public void setInventario(boolean inventario) {
        this.inventario = inventario;
    }


    /**
     * Gets the orden value for this DetalleDeCuentas.
     * 
     * @return orden
     */
    public int getOrden() {
        return orden;
    }


    /**
     * Sets the orden value for this DetalleDeCuentas.
     * 
     * @param orden
     */
    public void setOrden(int orden) {
        this.orden = orden;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetalleDeCuentas)) return false;
        DetalleDeCuentas other = (DetalleDeCuentas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.infEconFamiliarID == other.getInfEconFamiliarID() &&
            this.personaID == other.getPersonaID() &&
            this.cuentaID == other.getCuentaID() &&
            ((this.valorDetalleCuentas==null && other.getValorDetalleCuentas()==null) || 
             (this.valorDetalleCuentas!=null &&
              this.valorDetalleCuentas.equals(other.getValorDetalleCuentas()))) &&
            this.institucionID == other.getInstitucionID() &&
            ((this.grupoCuentaCODE==null && other.getGrupoCuentaCODE()==null) || 
             (this.grupoCuentaCODE!=null &&
              this.grupoCuentaCODE.equals(other.getGrupoCuentaCODE()))) &&
            ((this.nombreDetalleCuenta==null && other.getNombreDetalleCuenta()==null) || 
             (this.nombreDetalleCuenta!=null &&
              this.nombreDetalleCuenta.equals(other.getNombreDetalleCuenta()))) &&
            this.detallar == other.isDetallar() &&
            this.circulante == other.isCirculante() &&
            this.inventario == other.isInventario() &&
            this.orden == other.getOrden();
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
        _hashCode += getInfEconFamiliarID();
        _hashCode += getPersonaID();
        _hashCode += getCuentaID();
        if (getValorDetalleCuentas() != null) {
            _hashCode += getValorDetalleCuentas().hashCode();
        }
        _hashCode += getInstitucionID();
        if (getGrupoCuentaCODE() != null) {
            _hashCode += getGrupoCuentaCODE().hashCode();
        }
        if (getNombreDetalleCuenta() != null) {
            _hashCode += getNombreDetalleCuenta().hashCode();
        }
        _hashCode += (isDetallar() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCirculante() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInventario() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getOrden();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetalleDeCuentas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DetalleDeCuentas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infEconFamiliarID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InfEconFamiliarID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PersonaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CuentaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorDetalleCuentas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValorDetalleCuentas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("institucionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InstitucionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grupoCuentaCODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GrupoCuentaCODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreDetalleCuenta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NombreDetalleCuenta"));
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
		return "DetalleDeCuentas [infEconFamiliarID=" + infEconFamiliarID + ", personaID=" + personaID + ", cuentaID="
				+ cuentaID + ", valorDetalleCuentas=" + valorDetalleCuentas + ", institucionID=" + institucionID
				+ ", grupoCuentaCODE=" + grupoCuentaCODE + ", nombreDetalleCuenta=" + nombreDetalleCuenta
				+ ", detallar=" + detallar + ", circulante=" + circulante + ", inventario=" + inventario + ", orden="
				+ orden + ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc + "]";
	}
    
    

}

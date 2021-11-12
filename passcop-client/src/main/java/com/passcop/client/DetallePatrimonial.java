
package com.passcop.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detallePatrimonial complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detallePatrimonial"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cantidad" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="circulante" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cuentaDetallePatrimonial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cuentaIDDetallePatrimonial" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detallar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="grupoCuentaCODEDetallePatrimonial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="inventario" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valorDetallePatrimonial" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detallePatrimonial", propOrder = {
    "cantidad",
    "circulante",
    "cuentaDetallePatrimonial",
    "cuentaIDDetallePatrimonial",
    "descripcion",
    "detallar",
    "grupoCuentaCODEDetallePatrimonial",
    "inventario",
    "orden",
    "valorDetallePatrimonial"
})
public class DetallePatrimonial {

    protected Integer cantidad;
    protected boolean circulante;
    protected String cuentaDetallePatrimonial;
    protected int cuentaIDDetallePatrimonial;
    protected String descripcion;
    protected boolean detallar;
    protected String grupoCuentaCODEDetallePatrimonial;
    protected boolean inventario;
    protected int orden;
    protected double valorDetallePatrimonial;

    /**
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCantidad(Integer value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the circulante property.
     * 
     */
    public boolean isCirculante() {
        return circulante;
    }

    /**
     * Sets the value of the circulante property.
     * 
     */
    public void setCirculante(boolean value) {
        this.circulante = value;
    }

    /**
     * Gets the value of the cuentaDetallePatrimonial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuentaDetallePatrimonial() {
        return cuentaDetallePatrimonial;
    }

    /**
     * Sets the value of the cuentaDetallePatrimonial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuentaDetallePatrimonial(String value) {
        this.cuentaDetallePatrimonial = value;
    }

    /**
     * Gets the value of the cuentaIDDetallePatrimonial property.
     * 
     */
    public int getCuentaIDDetallePatrimonial() {
        return cuentaIDDetallePatrimonial;
    }

    /**
     * Sets the value of the cuentaIDDetallePatrimonial property.
     * 
     */
    public void setCuentaIDDetallePatrimonial(int value) {
        this.cuentaIDDetallePatrimonial = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Gets the value of the detallar property.
     * 
     */
    public boolean isDetallar() {
        return detallar;
    }

    /**
     * Sets the value of the detallar property.
     * 
     */
    public void setDetallar(boolean value) {
        this.detallar = value;
    }

    /**
     * Gets the value of the grupoCuentaCODEDetallePatrimonial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoCuentaCODEDetallePatrimonial() {
        return grupoCuentaCODEDetallePatrimonial;
    }

    /**
     * Sets the value of the grupoCuentaCODEDetallePatrimonial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoCuentaCODEDetallePatrimonial(String value) {
        this.grupoCuentaCODEDetallePatrimonial = value;
    }

    /**
     * Gets the value of the inventario property.
     * 
     */
    public boolean isInventario() {
        return inventario;
    }

    /**
     * Sets the value of the inventario property.
     * 
     */
    public void setInventario(boolean value) {
        this.inventario = value;
    }

    /**
     * Gets the value of the orden property.
     * 
     */
    public int getOrden() {
        return orden;
    }

    /**
     * Sets the value of the orden property.
     * 
     */
    public void setOrden(int value) {
        this.orden = value;
    }

    /**
     * Gets the value of the valorDetallePatrimonial property.
     * 
     */
    public double getValorDetallePatrimonial() {
        return valorDetallePatrimonial;
    }

    /**
     * Sets the value of the valorDetallePatrimonial property.
     * 
     */
    public void setValorDetallePatrimonial(double value) {
        this.valorDetallePatrimonial = value;
    }

}

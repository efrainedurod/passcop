
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for detalleDeCuentas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="detalleDeCuentas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="circulante" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cuentaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="detallar" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="grupoCuentaCODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="infEconFamiliarID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="institucionID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="inventario" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="nombreDetalleCuenta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="orden" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="personaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="valorDetalleCuentas" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "detalleDeCuentas", propOrder = {
    "circulante",
    "cuentaID",
    "detallar",
    "grupoCuentaCODE",
    "infEconFamiliarID",
    "institucionID",
    "inventario",
    "nombreDetalleCuenta",
    "orden",
    "personaID",
    "valorDetalleCuentas"
})
public class DetalleDeCuentas {

    protected boolean circulante;
    protected int cuentaID;
    protected boolean detallar;
    protected String grupoCuentaCODE;
    protected int infEconFamiliarID;
    protected short institucionID;
    protected boolean inventario;
    protected String nombreDetalleCuenta;
    protected int orden;
    protected int personaID;
    protected double valorDetalleCuentas;

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
     * Gets the value of the cuentaID property.
     * 
     */
    public int getCuentaID() {
        return cuentaID;
    }

    /**
     * Sets the value of the cuentaID property.
     * 
     */
    public void setCuentaID(int value) {
        this.cuentaID = value;
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
     * Gets the value of the grupoCuentaCODE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoCuentaCODE() {
        return grupoCuentaCODE;
    }

    /**
     * Sets the value of the grupoCuentaCODE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoCuentaCODE(String value) {
        this.grupoCuentaCODE = value;
    }

    /**
     * Gets the value of the infEconFamiliarID property.
     * 
     */
    public int getInfEconFamiliarID() {
        return infEconFamiliarID;
    }

    /**
     * Sets the value of the infEconFamiliarID property.
     * 
     */
    public void setInfEconFamiliarID(int value) {
        this.infEconFamiliarID = value;
    }

    /**
     * Gets the value of the institucionID property.
     * 
     */
    public short getInstitucionID() {
        return institucionID;
    }

    /**
     * Sets the value of the institucionID property.
     * 
     */
    public void setInstitucionID(short value) {
        this.institucionID = value;
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
     * Gets the value of the nombreDetalleCuenta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreDetalleCuenta() {
        return nombreDetalleCuenta;
    }

    /**
     * Sets the value of the nombreDetalleCuenta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreDetalleCuenta(String value) {
        this.nombreDetalleCuenta = value;
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
     * Gets the value of the personaID property.
     * 
     */
    public int getPersonaID() {
        return personaID;
    }

    /**
     * Sets the value of the personaID property.
     * 
     */
    public void setPersonaID(int value) {
        this.personaID = value;
    }

    /**
     * Gets the value of the valorDetalleCuentas property.
     * 
     */
    public double getValorDetalleCuentas() {
        return valorDetalleCuentas;
    }

    /**
     * Sets the value of the valorDetalleCuentas property.
     * 
     */
    public void setValorDetalleCuentas(double value) {
        this.valorDetalleCuentas = value;
    }

}

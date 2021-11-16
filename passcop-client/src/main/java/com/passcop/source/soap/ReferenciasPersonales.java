
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for referenciasPersonales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="referenciasPersonales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="solicitudID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoReferenciaPersonalCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "referenciasPersonales", propOrder = {
    "mensaje",
    "nombre",
    "observacion",
    "solicitudID",
    "telefono",
    "tieneError",
    "tipoReferenciaPersonalCOD"
})
public class ReferenciasPersonales {

    protected String mensaje;
    protected String nombre;
    protected String observacion;
    protected Integer solicitudID;
    protected String telefono;
    protected boolean tieneError;
    protected String tipoReferenciaPersonalCOD;

    /**
     * Gets the value of the mensaje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * Sets the value of the mensaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensaje(String value) {
        this.mensaje = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the observacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacion() {
        return observacion;
    }

    /**
     * Sets the value of the observacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacion(String value) {
        this.observacion = value;
    }

    /**
     * Gets the value of the solicitudID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSolicitudID() {
        return solicitudID;
    }

    /**
     * Sets the value of the solicitudID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSolicitudID(Integer value) {
        this.solicitudID = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Sets the value of the telefono property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefono(String value) {
        this.telefono = value;
    }

    /**
     * Gets the value of the tieneError property.
     * 
     */
    public boolean isTieneError() {
        return tieneError;
    }

    /**
     * Sets the value of the tieneError property.
     * 
     */
    public void setTieneError(boolean value) {
        this.tieneError = value;
    }

    /**
     * Gets the value of the tipoReferenciaPersonalCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoReferenciaPersonalCOD() {
        return tipoReferenciaPersonalCOD;
    }

    /**
     * Sets the value of the tipoReferenciaPersonalCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoReferenciaPersonalCOD(String value) {
        this.tipoReferenciaPersonalCOD = value;
    }

}

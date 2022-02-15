
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaSolicitud complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestaSolicitud"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajePersonalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajeTecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuestaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaSolicitud", propOrder = {
    "mensaje",
    "mensajePersonalizado",
    "mensajeTecnico",
    "respuestaCOD",
    "tieneError"
})
public class RespuestaSolicitud {

    protected String mensaje;
    protected String mensajePersonalizado;
    protected String mensajeTecnico;
    protected String respuestaCOD;
    protected boolean tieneError;

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
     * Gets the value of the mensajePersonalizado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajePersonalizado() {
        return mensajePersonalizado;
    }

    /**
     * Sets the value of the mensajePersonalizado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajePersonalizado(String value) {
        this.mensajePersonalizado = value;
    }

    /**
     * Gets the value of the mensajeTecnico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensajeTecnico() {
        return mensajeTecnico;
    }

    /**
     * Sets the value of the mensajeTecnico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensajeTecnico(String value) {
        this.mensajeTecnico = value;
    }

    /**
     * Gets the value of the respuestaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRespuestaCOD() {
        return respuestaCOD;
    }

    /**
     * Sets the value of the respuestaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRespuestaCOD(String value) {
        this.respuestaCOD = value;
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

}

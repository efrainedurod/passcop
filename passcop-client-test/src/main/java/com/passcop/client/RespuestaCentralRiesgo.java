
package com.passcop.client;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for respuestaCentralRiesgo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuestaCentralRiesgo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calificacionRiesgoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carteraRiesgo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="castigoDemanda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="castigoDemanda12Meses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="identificacionCentralRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="montoTotalEndeudamiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="numeroCreditosIFI" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="peorCalificacion12MesesCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personaId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="reciprocidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="totalCarteraVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "respuestaCentralRiesgo", propOrder = {
    "calificacionRiesgoCOD",
    "carteraRiesgo",
    "castigoDemanda",
    "castigoDemanda12Meses",
    "identificacionCentralRiesgo",
    "mensaje",
    "montoTotalEndeudamiento",
    "numeroCreditosIFI",
    "numeroOperaciones",
    "peorCalificacion12MesesCOD",
    "personaId",
    "reciprocidad",
    "seccion",
    "tieneError",
    "totalCarteraVigente"
})
public class RespuestaCentralRiesgo {

    protected String calificacionRiesgoCOD;
    protected BigDecimal carteraRiesgo;
    protected BigDecimal castigoDemanda;
    protected BigDecimal castigoDemanda12Meses;
    protected String identificacionCentralRiesgo;
    protected String mensaje;
    protected BigDecimal montoTotalEndeudamiento;
    protected Short numeroCreditosIFI;
    protected Short numeroOperaciones;
    protected String peorCalificacion12MesesCOD;
    protected int personaId;
    protected String reciprocidad;
    protected String seccion;
    protected boolean tieneError;
    protected BigDecimal totalCarteraVigente;

    /**
     * Gets the value of the calificacionRiesgoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalificacionRiesgoCOD() {
        return calificacionRiesgoCOD;
    }

    /**
     * Sets the value of the calificacionRiesgoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalificacionRiesgoCOD(String value) {
        this.calificacionRiesgoCOD = value;
    }

    /**
     * Gets the value of the carteraRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCarteraRiesgo() {
        return carteraRiesgo;
    }

    /**
     * Sets the value of the carteraRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCarteraRiesgo(BigDecimal value) {
        this.carteraRiesgo = value;
    }

    /**
     * Gets the value of the castigoDemanda property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCastigoDemanda() {
        return castigoDemanda;
    }

    /**
     * Sets the value of the castigoDemanda property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCastigoDemanda(BigDecimal value) {
        this.castigoDemanda = value;
    }

    /**
     * Gets the value of the castigoDemanda12Meses property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCastigoDemanda12Meses() {
        return castigoDemanda12Meses;
    }

    /**
     * Sets the value of the castigoDemanda12Meses property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCastigoDemanda12Meses(BigDecimal value) {
        this.castigoDemanda12Meses = value;
    }

    /**
     * Gets the value of the identificacionCentralRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionCentralRiesgo() {
        return identificacionCentralRiesgo;
    }

    /**
     * Sets the value of the identificacionCentralRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionCentralRiesgo(String value) {
        this.identificacionCentralRiesgo = value;
    }

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
     * Gets the value of the montoTotalEndeudamiento property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoTotalEndeudamiento() {
        return montoTotalEndeudamiento;
    }

    /**
     * Sets the value of the montoTotalEndeudamiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoTotalEndeudamiento(BigDecimal value) {
        this.montoTotalEndeudamiento = value;
    }

    /**
     * Gets the value of the numeroCreditosIFI property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroCreditosIFI() {
        return numeroCreditosIFI;
    }

    /**
     * Sets the value of the numeroCreditosIFI property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroCreditosIFI(Short value) {
        this.numeroCreditosIFI = value;
    }

    /**
     * Gets the value of the numeroOperaciones property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroOperaciones() {
        return numeroOperaciones;
    }

    /**
     * Sets the value of the numeroOperaciones property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroOperaciones(Short value) {
        this.numeroOperaciones = value;
    }

    /**
     * Gets the value of the peorCalificacion12MesesCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeorCalificacion12MesesCOD() {
        return peorCalificacion12MesesCOD;
    }

    /**
     * Sets the value of the peorCalificacion12MesesCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeorCalificacion12MesesCOD(String value) {
        this.peorCalificacion12MesesCOD = value;
    }

    /**
     * Gets the value of the personaId property.
     * 
     */
    public int getPersonaId() {
        return personaId;
    }

    /**
     * Sets the value of the personaId property.
     * 
     */
    public void setPersonaId(int value) {
        this.personaId = value;
    }

    /**
     * Gets the value of the reciprocidad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReciprocidad() {
        return reciprocidad;
    }

    /**
     * Sets the value of the reciprocidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReciprocidad(String value) {
        this.reciprocidad = value;
    }

    /**
     * Gets the value of the seccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeccion() {
        return seccion;
    }

    /**
     * Sets the value of the seccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeccion(String value) {
        this.seccion = value;
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
     * Gets the value of the totalCarteraVigente property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCarteraVigente() {
        return totalCarteraVigente;
    }

    /**
     * Sets the value of the totalCarteraVigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCarteraVigente(BigDecimal value) {
        this.totalCarteraVigente = value;
    }

}

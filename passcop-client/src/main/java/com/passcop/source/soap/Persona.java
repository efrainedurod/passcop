
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for persona complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="persona"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="duenoCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCivilCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaApertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="localidadCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidadCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nivelEducacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nomreModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCarga" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="ocupacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="personaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="referenciaUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="separacionBienes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sexoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="situacionViviendaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoDuenoCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tiempoViviendaActual" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tiempoViviendaAnterior" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tieneError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoIdentificacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPersonaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoViviendaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadTiempoViviendaActualCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadTiempoViviendaAnteriorCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuarioID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="viviendaHipotecada" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "persona", propOrder = {
    "apellidoMaterno",
    "apellidoPaterno",
    "correo",
    "direccion",
    "duenoCasa",
    "estadoCivilCOD",
    "fechaApertura",
    "fechaNacimiento",
    "identificacion",
    "identificacionConyuge",
    "localidadCOD",
    "mensaje",
    "nacionalidadCOD",
    "nivelEducacionCOD",
    "nombres",
    "nomreModulo",
    "numeroCarga",
    "ocupacionCOD",
    "personaID",
    "referenciaUbicacion",
    "relacionCOD",
    "separacionBienes",
    "sexoCOD",
    "situacionViviendaCOD",
    "telefonoCelular",
    "telefonoDomicilio",
    "telefonoDuenoCasa",
    "tiempoViviendaActual",
    "tiempoViviendaAnterior",
    "tieneError",
    "tipoIdentificacionCOD",
    "tipoPersonaCOD",
    "tipoViviendaCOD",
    "unidadTiempoViviendaActualCOD",
    "unidadTiempoViviendaAnteriorCOD",
    "usuarioID",
    "viviendaHipotecada"
})
public class Persona {

    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected String correo;
    protected String direccion;
    protected String duenoCasa;
    protected String estadoCivilCOD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaApertura;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
    protected String identificacion;
    protected String identificacionConyuge;
    protected String localidadCOD;
    protected String mensaje;
    protected String nacionalidadCOD;
    protected String nivelEducacionCOD;
    protected String nombres;
    protected String nomreModulo;
    protected Short numeroCarga;
    protected String ocupacionCOD;
    protected int personaID;
    protected String referenciaUbicacion;
    protected String relacionCOD;
    protected boolean separacionBienes;
    protected String sexoCOD;
    protected String situacionViviendaCOD;
    protected String telefonoCelular;
    protected String telefonoDomicilio;
    protected String telefonoDuenoCasa;
    protected Short tiempoViviendaActual;
    protected Short tiempoViviendaAnterior;
    protected boolean tieneError;
    protected String tipoIdentificacionCOD;
    protected String tipoPersonaCOD;
    protected String tipoViviendaCOD;
    protected String unidadTiempoViviendaActualCOD;
    protected String unidadTiempoViviendaAnteriorCOD;
    protected short usuarioID;
    protected boolean viviendaHipotecada;

    /**
     * Gets the value of the apellidoMaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    /**
     * Sets the value of the apellidoMaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoMaterno(String value) {
        this.apellidoMaterno = value;
    }

    /**
     * Gets the value of the apellidoPaterno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    /**
     * Sets the value of the apellidoPaterno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellidoPaterno(String value) {
        this.apellidoPaterno = value;
    }

    /**
     * Gets the value of the correo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Sets the value of the correo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorreo(String value) {
        this.correo = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccion(String value) {
        this.direccion = value;
    }

    /**
     * Gets the value of the duenoCasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuenoCasa() {
        return duenoCasa;
    }

    /**
     * Sets the value of the duenoCasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuenoCasa(String value) {
        this.duenoCasa = value;
    }

    /**
     * Gets the value of the estadoCivilCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCivilCOD() {
        return estadoCivilCOD;
    }

    /**
     * Sets the value of the estadoCivilCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCivilCOD(String value) {
        this.estadoCivilCOD = value;
    }

    /**
     * Gets the value of the fechaApertura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaApertura() {
        return fechaApertura;
    }

    /**
     * Sets the value of the fechaApertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaApertura(XMLGregorianCalendar value) {
        this.fechaApertura = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaNacimiento(XMLGregorianCalendar value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the identificacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Sets the value of the identificacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacion(String value) {
        this.identificacion = value;
    }

    /**
     * Gets the value of the identificacionConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionConyuge() {
        return identificacionConyuge;
    }

    /**
     * Sets the value of the identificacionConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionConyuge(String value) {
        this.identificacionConyuge = value;
    }

    /**
     * Gets the value of the localidadCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidadCOD() {
        return localidadCOD;
    }

    /**
     * Sets the value of the localidadCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidadCOD(String value) {
        this.localidadCOD = value;
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
     * Gets the value of the nacionalidadCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacionalidadCOD() {
        return nacionalidadCOD;
    }

    /**
     * Sets the value of the nacionalidadCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacionalidadCOD(String value) {
        this.nacionalidadCOD = value;
    }

    /**
     * Gets the value of the nivelEducacionCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNivelEducacionCOD() {
        return nivelEducacionCOD;
    }

    /**
     * Sets the value of the nivelEducacionCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNivelEducacionCOD(String value) {
        this.nivelEducacionCOD = value;
    }

    /**
     * Gets the value of the nombres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * Sets the value of the nombres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombres(String value) {
        this.nombres = value;
    }

    /**
     * Gets the value of the nomreModulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomreModulo() {
        return nomreModulo;
    }

    /**
     * Sets the value of the nomreModulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomreModulo(String value) {
        this.nomreModulo = value;
    }

    /**
     * Gets the value of the numeroCarga property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroCarga() {
        return numeroCarga;
    }

    /**
     * Sets the value of the numeroCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroCarga(Short value) {
        this.numeroCarga = value;
    }

    /**
     * Gets the value of the ocupacionCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOcupacionCOD() {
        return ocupacionCOD;
    }

    /**
     * Sets the value of the ocupacionCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOcupacionCOD(String value) {
        this.ocupacionCOD = value;
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
     * Gets the value of the referenciaUbicacion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenciaUbicacion() {
        return referenciaUbicacion;
    }

    /**
     * Sets the value of the referenciaUbicacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenciaUbicacion(String value) {
        this.referenciaUbicacion = value;
    }

    /**
     * Gets the value of the relacionCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelacionCOD() {
        return relacionCOD;
    }

    /**
     * Sets the value of the relacionCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelacionCOD(String value) {
        this.relacionCOD = value;
    }

    /**
     * Gets the value of the separacionBienes property.
     * 
     */
    public boolean isSeparacionBienes() {
        return separacionBienes;
    }

    /**
     * Sets the value of the separacionBienes property.
     * 
     */
    public void setSeparacionBienes(boolean value) {
        this.separacionBienes = value;
    }

    /**
     * Gets the value of the sexoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexoCOD() {
        return sexoCOD;
    }

    /**
     * Sets the value of the sexoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexoCOD(String value) {
        this.sexoCOD = value;
    }

    /**
     * Gets the value of the situacionViviendaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionViviendaCOD() {
        return situacionViviendaCOD;
    }

    /**
     * Sets the value of the situacionViviendaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionViviendaCOD(String value) {
        this.situacionViviendaCOD = value;
    }

    /**
     * Gets the value of the telefonoCelular property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoCelular() {
        return telefonoCelular;
    }

    /**
     * Sets the value of the telefonoCelular property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoCelular(String value) {
        this.telefonoCelular = value;
    }

    /**
     * Gets the value of the telefonoDomicilio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }

    /**
     * Sets the value of the telefonoDomicilio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoDomicilio(String value) {
        this.telefonoDomicilio = value;
    }

    /**
     * Gets the value of the telefonoDuenoCasa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoDuenoCasa() {
        return telefonoDuenoCasa;
    }

    /**
     * Sets the value of the telefonoDuenoCasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoDuenoCasa(String value) {
        this.telefonoDuenoCasa = value;
    }

    /**
     * Gets the value of the tiempoViviendaActual property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTiempoViviendaActual() {
        return tiempoViviendaActual;
    }

    /**
     * Sets the value of the tiempoViviendaActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTiempoViviendaActual(Short value) {
        this.tiempoViviendaActual = value;
    }

    /**
     * Gets the value of the tiempoViviendaAnterior property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTiempoViviendaAnterior() {
        return tiempoViviendaAnterior;
    }

    /**
     * Sets the value of the tiempoViviendaAnterior property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTiempoViviendaAnterior(Short value) {
        this.tiempoViviendaAnterior = value;
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
     * Gets the value of the tipoIdentificacionCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdentificacionCOD() {
        return tipoIdentificacionCOD;
    }

    /**
     * Sets the value of the tipoIdentificacionCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdentificacionCOD(String value) {
        this.tipoIdentificacionCOD = value;
    }

    /**
     * Gets the value of the tipoPersonaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoPersonaCOD() {
        return tipoPersonaCOD;
    }

    /**
     * Sets the value of the tipoPersonaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoPersonaCOD(String value) {
        this.tipoPersonaCOD = value;
    }

    /**
     * Gets the value of the tipoViviendaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoViviendaCOD() {
        return tipoViviendaCOD;
    }

    /**
     * Sets the value of the tipoViviendaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoViviendaCOD(String value) {
        this.tipoViviendaCOD = value;
    }

    /**
     * Gets the value of the unidadTiempoViviendaActualCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadTiempoViviendaActualCOD() {
        return unidadTiempoViviendaActualCOD;
    }

    /**
     * Sets the value of the unidadTiempoViviendaActualCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadTiempoViviendaActualCOD(String value) {
        this.unidadTiempoViviendaActualCOD = value;
    }

    /**
     * Gets the value of the unidadTiempoViviendaAnteriorCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadTiempoViviendaAnteriorCOD() {
        return unidadTiempoViviendaAnteriorCOD;
    }

    /**
     * Sets the value of the unidadTiempoViviendaAnteriorCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadTiempoViviendaAnteriorCOD(String value) {
        this.unidadTiempoViviendaAnteriorCOD = value;
    }

    /**
     * Gets the value of the usuarioID property.
     * 
     */
    public short getUsuarioID() {
        return usuarioID;
    }

    /**
     * Sets the value of the usuarioID property.
     * 
     */
    public void setUsuarioID(short value) {
        this.usuarioID = value;
    }

    /**
     * Gets the value of the viviendaHipotecada property.
     * 
     */
    public boolean isViviendaHipotecada() {
        return viviendaHipotecada;
    }

    /**
     * Sets the value of the viviendaHipotecada property.
     * 
     */
    public void setViviendaHipotecada(boolean value) {
        this.viviendaHipotecada = value;
    }

}

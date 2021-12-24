
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for garantiasReales complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="garantiasReales"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="anioFabricacionConstruccion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="avaluoComercial" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="comercio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="cuotaCreditoVigente" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionGarantiasReales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionGarantiasReales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaAvaluo" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="grupoTipoGarantiaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ingreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="marca" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="microEmpresario" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="modelo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePerito" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombrePropietario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroRegistro" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="personaID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="placa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="seriePrincipalMotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serieSecundariaMotor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tieneError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoGarantia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoGarantiaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuarioID" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="valor" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "garantiasReales", propOrder = {
    "anioFabricacionConstruccion",
    "avaluoComercial",
    "comercio",
    "cuotaCreditoVigente",
    "descripcion",
    "descripcionGarantiasReales",
    "direccion",
    "direccionGarantiasReales",
    "estado",
    "estadoCOD",
    "fechaAvaluo",
    "grupoTipoGarantiaCOD",
    "identificacion",
    "ingreso",
    "latitud",
    "longitud",
    "marca",
    "mensaje",
    "microEmpresario",
    "modelo",
    "nombrePerito",
    "nombrePropietario",
    "numeroRegistro",
    "personaID",
    "placa",
    "seriePrincipalMotor",
    "serieSecundariaMotor",
    "tieneError",
    "tipoGarantia",
    "tipoGarantiaCOD",
    "usuarioID",
    "valor"
})
public class GarantiasReales {

    protected Integer anioFabricacionConstruccion;
    protected double avaluoComercial;
    protected boolean comercio;
    protected double cuotaCreditoVigente;
    protected String descripcion;
    protected String descripcionGarantiasReales;
    protected String direccion;
    protected String direccionGarantiasReales;
    protected String estado;
    protected String estadoCOD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAvaluo;
    protected String grupoTipoGarantiaCOD;
    protected String identificacion;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ingreso;
    protected double latitud;
    protected double longitud;
    protected String marca;
    protected String mensaje;
    protected boolean microEmpresario;
    protected String modelo;
    protected String nombrePerito;
    protected String nombrePropietario;
    protected Integer numeroRegistro;
    protected Integer personaID;
    protected String placa;
    protected String seriePrincipalMotor;
    protected String serieSecundariaMotor;
    protected boolean tieneError;
    protected String tipoGarantia;
    protected String tipoGarantiaCOD;
    protected Short usuarioID;
    protected double valor;

    /**
     * Gets the value of the anioFabricacionConstruccion property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAnioFabricacionConstruccion() {
        return anioFabricacionConstruccion;
    }

    /**
     * Sets the value of the anioFabricacionConstruccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAnioFabricacionConstruccion(Integer value) {
        this.anioFabricacionConstruccion = value;
    }

    /**
     * Gets the value of the avaluoComercial property.
     * 
     */
    public double getAvaluoComercial() {
        return avaluoComercial;
    }

    /**
     * Sets the value of the avaluoComercial property.
     * 
     */
    public void setAvaluoComercial(double value) {
        this.avaluoComercial = value;
    }

    /**
     * Gets the value of the comercio property.
     * 
     */
    public boolean isComercio() {
        return comercio;
    }

    /**
     * Sets the value of the comercio property.
     * 
     */
    public void setComercio(boolean value) {
        this.comercio = value;
    }

    /**
     * Gets the value of the cuotaCreditoVigente property.
     * 
     */
    public double getCuotaCreditoVigente() {
        return cuotaCreditoVigente;
    }

    /**
     * Sets the value of the cuotaCreditoVigente property.
     * 
     */
    public void setCuotaCreditoVigente(double value) {
        this.cuotaCreditoVigente = value;
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
     * Gets the value of the descripcionGarantiasReales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionGarantiasReales() {
        return descripcionGarantiasReales;
    }

    /**
     * Sets the value of the descripcionGarantiasReales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionGarantiasReales(String value) {
        this.descripcionGarantiasReales = value;
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
     * Gets the value of the direccionGarantiasReales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionGarantiasReales() {
        return direccionGarantiasReales;
    }

    /**
     * Sets the value of the direccionGarantiasReales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionGarantiasReales(String value) {
        this.direccionGarantiasReales = value;
    }

    /**
     * Gets the value of the estado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Sets the value of the estado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstado(String value) {
        this.estado = value;
    }

    /**
     * Gets the value of the estadoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCOD() {
        return estadoCOD;
    }

    /**
     * Sets the value of the estadoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCOD(String value) {
        this.estadoCOD = value;
    }

    /**
     * Gets the value of the fechaAvaluo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaAvaluo() {
        return fechaAvaluo;
    }

    /**
     * Sets the value of the fechaAvaluo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaAvaluo(XMLGregorianCalendar value) {
        this.fechaAvaluo = value;
    }

    /**
     * Gets the value of the grupoTipoGarantiaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrupoTipoGarantiaCOD() {
        return grupoTipoGarantiaCOD;
    }

    /**
     * Sets the value of the grupoTipoGarantiaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrupoTipoGarantiaCOD(String value) {
        this.grupoTipoGarantiaCOD = value;
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
     * Gets the value of the ingreso property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIngreso() {
        return ingreso;
    }

    /**
     * Sets the value of the ingreso property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIngreso(XMLGregorianCalendar value) {
        this.ingreso = value;
    }

    /**
     * Gets the value of the latitud property.
     * 
     */
    public double getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     */
    public void setLatitud(double value) {
        this.latitud = value;
    }

    /**
     * Gets the value of the longitud property.
     * 
     */
    public double getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     */
    public void setLongitud(double value) {
        this.longitud = value;
    }

    /**
     * Gets the value of the marca property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Sets the value of the marca property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarca(String value) {
        this.marca = value;
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
     * Gets the value of the microEmpresario property.
     * 
     */
    public boolean isMicroEmpresario() {
        return microEmpresario;
    }

    /**
     * Sets the value of the microEmpresario property.
     * 
     */
    public void setMicroEmpresario(boolean value) {
        this.microEmpresario = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

    /**
     * Gets the value of the nombrePerito property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePerito() {
        return nombrePerito;
    }

    /**
     * Sets the value of the nombrePerito property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePerito(String value) {
        this.nombrePerito = value;
    }

    /**
     * Gets the value of the nombrePropietario property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombrePropietario() {
        return nombrePropietario;
    }

    /**
     * Sets the value of the nombrePropietario property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombrePropietario(String value) {
        this.nombrePropietario = value;
    }

    /**
     * Gets the value of the numeroRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumeroRegistro() {
        return numeroRegistro;
    }

    /**
     * Sets the value of the numeroRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumeroRegistro(Integer value) {
        this.numeroRegistro = value;
    }

    /**
     * Gets the value of the personaID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonaID() {
        return personaID;
    }

    /**
     * Sets the value of the personaID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonaID(Integer value) {
        this.personaID = value;
    }

    /**
     * Gets the value of the placa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Sets the value of the placa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlaca(String value) {
        this.placa = value;
    }

    /**
     * Gets the value of the seriePrincipalMotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriePrincipalMotor() {
        return seriePrincipalMotor;
    }

    /**
     * Sets the value of the seriePrincipalMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriePrincipalMotor(String value) {
        this.seriePrincipalMotor = value;
    }

    /**
     * Gets the value of the serieSecundariaMotor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerieSecundariaMotor() {
        return serieSecundariaMotor;
    }

    /**
     * Sets the value of the serieSecundariaMotor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerieSecundariaMotor(String value) {
        this.serieSecundariaMotor = value;
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
     * Gets the value of the tipoGarantia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoGarantia() {
        return tipoGarantia;
    }

    /**
     * Sets the value of the tipoGarantia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoGarantia(String value) {
        this.tipoGarantia = value;
    }

    /**
     * Gets the value of the tipoGarantiaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoGarantiaCOD() {
        return tipoGarantiaCOD;
    }

    /**
     * Sets the value of the tipoGarantiaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoGarantiaCOD(String value) {
        this.tipoGarantiaCOD = value;
    }

    /**
     * Gets the value of the usuarioID property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getUsuarioID() {
        return usuarioID;
    }

    /**
     * Sets the value of the usuarioID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setUsuarioID(Short value) {
        this.usuarioID = value;
    }

    /**
     * Gets the value of the valor property.
     * 
     */
    public double getValor() {
        return valor;
    }

    /**
     * Sets the value of the valor property.
     * 
     */
    public void setValor(double value) {
        this.valor = value;
    }

}

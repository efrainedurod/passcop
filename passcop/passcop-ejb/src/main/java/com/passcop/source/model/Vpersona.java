package com.passcop.source.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the VPERSONA database table.
 * 
 */
@Entity
@XmlRootElement
@Table(name="VPERSONA",schema = "PASSCOP")
@NamedQuery(name="Vpersona.findAll", query="SELECT v FROM Vpersona v")
public class Vpersona implements Serializable {
	private static final long serialVersionUID = 1L;
	private String apellidomaterno;
	private String apellidopaterno;
	private String correo;
	private String direccion;
	private String duenocasa;
	private BigDecimal estadocivilcod;
	private Date fechaapertura;
	private Date fechanacimiento;
	private String identificacion;
	private String identificacionconyuge;
	private BigDecimal idvpersona;
	private String localidadcod;
	private String nacionalidadcod;
	private BigDecimal niveleducacioncod;
	private String nombremodulo;
	private String nombres;
	private BigDecimal numerocarga;
	private BigDecimal ocupacioncod;
	private BigDecimal personaid;
	private String referenciaubicacion;
	private String relacioncod;
	private String separacionbienes;
	private String sexocod;
	private String situacionviviendacod;
	private String telefonocelular;
	private String telefonodomicilio;
	private String telefonoduenocasa;
	private BigDecimal tiempoviviendaactual;
	private String tiempoviviendaanterior;
	private String tipoidentificacioncod;
	private String tipopersonacod;
	private String tipoviviendacod;
	private String unidadtiempoviviendaactualcod;
	private String unidadtiempoviviendaanteriorcod;
	private String usuarioid;
	private String viviendahipotecada;

	public Vpersona() {
	}


	@Column(length=25)
	public String getApellidomaterno() {
		return this.apellidomaterno;
	}

	public void setApellidomaterno(String apellidomaterno) {
		this.apellidomaterno = apellidomaterno;
	}


	@Column(length=25)
	public String getApellidopaterno() {
		return this.apellidopaterno;
	}

	public void setApellidopaterno(String apellidopaterno) {
		this.apellidopaterno = apellidopaterno;
	}


	@Column(length=70)
	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}


	@Column(length=70)
	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	@Column(length=100)
	public String getDuenocasa() {
		return this.duenocasa;
	}

	public void setDuenocasa(String duenocasa) {
		this.duenocasa = duenocasa;
	}


	@Column(precision=1)
	public BigDecimal getEstadocivilcod() {
		return this.estadocivilcod;
	}

	public void setEstadocivilcod(BigDecimal estadocivilcod) {
		this.estadocivilcod = estadocivilcod;
	}


	@Temporal(TemporalType.DATE)
	public Date getFechaapertura() {
		return this.fechaapertura;
	}

	public void setFechaapertura(Date fechaapertura) {
		this.fechaapertura = fechaapertura;
	}


	@Temporal(TemporalType.DATE)
	public Date getFechanacimiento() {
		return this.fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}


	@Column(nullable=false, length=19)
	public String getIdentificacion() {
		return this.identificacion;
	}

	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	@Column(length=19)
	public String getIdentificacionconyuge() {
		return this.identificacionconyuge;
	}

	public void setIdentificacionconyuge(String identificacionconyuge) {
		this.identificacionconyuge = identificacionconyuge;
	}

	@Id
	public BigDecimal getIdvpersona() {
		return this.idvpersona;
	}

	public void setIdvpersona(BigDecimal idvpersona) {
		this.idvpersona = idvpersona;
	}


	@Column(length=6)
	public String getLocalidadcod() {
		return this.localidadcod;
	}

	public void setLocalidadcod(String localidadcod) {
		this.localidadcod = localidadcod;
	}


	@Column(length=3)
	public String getNacionalidadcod() {
		return this.nacionalidadcod;
	}

	public void setNacionalidadcod(String nacionalidadcod) {
		this.nacionalidadcod = nacionalidadcod;
	}


	@Column(precision=2)
	public BigDecimal getNiveleducacioncod() {
		return this.niveleducacioncod;
	}

	public void setNiveleducacioncod(BigDecimal niveleducacioncod) {
		this.niveleducacioncod = niveleducacioncod;
	}


	public String getNombremodulo() {
		return this.nombremodulo;
	}

	public void setNombremodulo(String nombremodulo) {
		this.nombremodulo = nombremodulo;
	}


	@Column(length=51)
	public String getNombres() {
		return this.nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	@Column(precision=2)
	public BigDecimal getNumerocarga() {
		return this.numerocarga;
	}

	public void setNumerocarga(BigDecimal numerocarga) {
		this.numerocarga = numerocarga;
	}


	@Column(precision=4)
	public BigDecimal getOcupacioncod() {
		return this.ocupacioncod;
	}

	public void setOcupacioncod(BigDecimal ocupacioncod) {
		this.ocupacioncod = ocupacioncod;
	}


	@Column(nullable=false, precision=8)
	public BigDecimal getPersonaid() {
		return this.personaid;
	}

	public void setPersonaid(BigDecimal personaid) {
		this.personaid = personaid;
	}


	@Column(length=500)
	public String getReferenciaubicacion() {
		return this.referenciaubicacion;
	}

	public void setReferenciaubicacion(String referenciaubicacion) {
		this.referenciaubicacion = referenciaubicacion;
	}


	@Column(length=3)
	public String getRelacioncod() {
		return this.relacioncod;
	}

	public void setRelacioncod(String relacioncod) {
		this.relacioncod = relacioncod;
	}


	@Column(length=1)
	public String getSeparacionbienes() {
		return this.separacionbienes;
	}

	public void setSeparacionbienes(String separacionbienes) {
		this.separacionbienes = separacionbienes;
	}


	@Column(length=1)
	public String getSexocod() {
		return this.sexocod;
	}

	public void setSexocod(String sexocod) {
		this.sexocod = sexocod;
	}


	@Column(length=3)
	public String getSituacionviviendacod() {
		return this.situacionviviendacod;
	}

	public void setSituacionviviendacod(String situacionviviendacod) {
		this.situacionviviendacod = situacionviviendacod;
	}


	@Column(length=12)
	public String getTelefonocelular() {
		return this.telefonocelular;
	}

	public void setTelefonocelular(String telefonocelular) {
		this.telefonocelular = telefonocelular;
	}


	@Column(length=12)
	public String getTelefonodomicilio() {
		return this.telefonodomicilio;
	}

	public void setTelefonodomicilio(String telefonodomicilio) {
		this.telefonodomicilio = telefonodomicilio;
	}


	public String getTelefonoduenocasa() {
		return this.telefonoduenocasa;
	}

	public void setTelefonoduenocasa(String telefonoduenocasa) {
		this.telefonoduenocasa = telefonoduenocasa;
	}


	@Column(precision=3)
	public BigDecimal getTiempoviviendaactual() {
		return this.tiempoviviendaactual;
	}

	public void setTiempoviviendaactual(BigDecimal tiempoviviendaactual) {
		this.tiempoviviendaactual = tiempoviviendaactual;
	}


	public String getTiempoviviendaanterior() {
		return this.tiempoviviendaanterior;
	}

	public void setTiempoviviendaanterior(String tiempoviviendaanterior) {
		this.tiempoviviendaanterior = tiempoviviendaanterior;
	}


	@Column(nullable=false, length=3)
	public String getTipoidentificacioncod() {
		return this.tipoidentificacioncod;
	}

	public void setTipoidentificacioncod(String tipoidentificacioncod) {
		this.tipoidentificacioncod = tipoidentificacioncod;
	}


	@Column(nullable=false, length=3)
	public String getTipopersonacod() {
		return this.tipopersonacod;
	}

	public void setTipopersonacod(String tipopersonacod) {
		this.tipopersonacod = tipopersonacod;
	}


	@Column(length=3)
	public String getTipoviviendacod() {
		return this.tipoviviendacod;
	}

	public void setTipoviviendacod(String tipoviviendacod) {
		this.tipoviviendacod = tipoviviendacod;
	}


	public String getUnidadtiempoviviendaactualcod() {
		return this.unidadtiempoviviendaactualcod;
	}

	public void setUnidadtiempoviviendaactualcod(String unidadtiempoviviendaactualcod) {
		this.unidadtiempoviviendaactualcod = unidadtiempoviviendaactualcod;
	}


	public String getUnidadtiempoviviendaanteriorcod() {
		return this.unidadtiempoviviendaanteriorcod;
	}

	public void setUnidadtiempoviviendaanteriorcod(String unidadtiempoviviendaanteriorcod) {
		this.unidadtiempoviviendaanteriorcod = unidadtiempoviviendaanteriorcod;
	}


	@Column(length=12)
	public String getUsuarioid() {
		return this.usuarioid;
	}

	public void setUsuarioid(String usuarioid) {
		this.usuarioid = usuarioid;
	}


	public String getViviendahipotecada() {
		return this.viviendahipotecada;
	}

	public void setViviendahipotecada(String viviendahipotecada) {
		this.viviendahipotecada = viviendahipotecada;
	}

}

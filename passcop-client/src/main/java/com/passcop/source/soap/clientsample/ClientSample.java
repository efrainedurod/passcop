package com.passcop.source.soap.clientsample;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.passcop.source.soap.*;

public class ClientSample {

	public static void main(String[] args)  {
		System.out.println("***********************");
		System.out.println("Create Web Service Client...");
		ScoreWebServiceService service1 = new ScoreWebServiceService();
		System.out.println("Create Web Service...");
		ScoreWebService port1 = service1.getScoreWebServicePort();
		System.out.println("Call Web Service Operation...");

//		Persona persona = port1.consultarServicioPersona("1804073268", new Short("1"));
		Respuesta res = new Respuesta();
		res.setAntiguedadNegocio(1);
		res.setAntiguedadNegocioMismoLugar(1);
		res.setApellidoMaterno("MORALES");
		res.setApellidoPaterno("PEREZ");
		res.setCalificacionRiesgoCOD("AAA"); // Preguntaro
		res.setCarteraRiesgo(100);
		res.setCastigoDemanda(100);
		res.setCastigoDemanda12Meses(100);

		// Se crea el objeto RespuestaCentralRiesgo
		RespuestaCentralRiesgo resCenRiCony = new RespuestaCentralRiesgo();
		resCenRiCony.setCalificacionRiesgoCOD("A"); // Consultar
		resCenRiCony.setCarteraRiesgo(101);
		resCenRiCony.setCastigoDemanda(101);
		resCenRiCony.setCastigoDemanda12Meses(101);
		resCenRiCony.setIdentificacionCentralRiesgo("0502631310");
		resCenRiCony.setMensaje("Mensaje");
		resCenRiCony.setMontoTotalEndeudamiento(101);
		resCenRiCony.setNumeroCreditosIFI(new Short("1"));
		resCenRiCony.setNumeroOperaciones(new Short("1"));
		resCenRiCony.setPeorCalificacion12MesesCOD("B");// Verificar
		resCenRiCony.setPersonaId(5932);
		resCenRiCony.setReciprocidad("2"); // Consultar
		resCenRiCony.setSeccion("seccion"); // Consultar
		resCenRiCony.setTieneError(false);
		resCenRiCony.setTotalCarteraVigente(101);
		// Se crea el objeto RespuestaCentralRiesgo
		RespuestaCentralRiesgo resCenRiConSoc = new RespuestaCentralRiesgo();
		resCenRiConSoc.setCalificacionRiesgoCOD("A"); // Consultar
		resCenRiConSoc.setCarteraRiesgo(101);
		resCenRiConSoc.setCastigoDemanda(101);
		resCenRiConSoc.setCastigoDemanda12Meses(101);
		resCenRiConSoc.setIdentificacionCentralRiesgo("0502631310");
		resCenRiConSoc.setMensaje("Mensaje");
		resCenRiConSoc.setMontoTotalEndeudamiento(101);
		resCenRiConSoc.setNumeroCreditosIFI(new Short("1"));
		resCenRiConSoc.setNumeroOperaciones(new Short("1"));
		resCenRiConSoc.setPeorCalificacion12MesesCOD("B");// Verificar
		resCenRiConSoc.setPersonaId(5932);
		resCenRiConSoc.setReciprocidad("2"); // Consultar
		resCenRiConSoc.setSeccion("seccion"); // Consultar
		resCenRiConSoc.setTieneError(false);
		resCenRiConSoc.setTotalCarteraVigente(101);
		// Se crea el objeto RespuestaCentralRiesgo
		RespuestaCentralRiesgo resRiesGar = new RespuestaCentralRiesgo();
		resRiesGar.setCalificacionRiesgoCOD("A"); // Consultar
		resRiesGar.setCarteraRiesgo(101);
		resRiesGar.setCastigoDemanda(101);
		resRiesGar.setCastigoDemanda12Meses(101);
		resRiesGar.setIdentificacionCentralRiesgo("0502631310");
		resRiesGar.setMensaje("Mensaje");
		resRiesGar.setMontoTotalEndeudamiento(101);
		resRiesGar.setNumeroCreditosIFI(new Short("1"));
		resRiesGar.setNumeroOperaciones(new Short("1"));
		resRiesGar.setPeorCalificacion12MesesCOD("B");// Verificar
		resRiesGar.setPersonaId(5932);
		resRiesGar.setReciprocidad("2"); // Consultar
		resRiesGar.setSeccion("seccion"); // Consultar
		resRiesGar.setTieneError(false);
		resRiesGar.setTotalCarteraVigente(101);
		// Se crea el objeto RespuestaCentralRiesgo
		RespuestaCentralRiesgo resRiesSoc = new RespuestaCentralRiesgo();
		resRiesSoc.setCalificacionRiesgoCOD("A"); // Consultar
		resRiesSoc.setCarteraRiesgo(101);
		resRiesSoc.setCastigoDemanda(101);
		resRiesSoc.setCastigoDemanda12Meses(101);
		resRiesSoc.setIdentificacionCentralRiesgo("0502631310");
		resRiesSoc.setMensaje("Mensaje");
		resRiesSoc.setMontoTotalEndeudamiento(101);
		resRiesSoc.setNumeroCreditosIFI(new Short("1"));
		resRiesSoc.setNumeroOperaciones(new Short("1"));
		resRiesSoc.setPeorCalificacion12MesesCOD("B");// Verificar
		resRiesSoc.setPersonaId(5932);
		resRiesSoc.setReciprocidad("2"); // Consultar
		resRiesSoc.setSeccion("seccion"); // Consultar
		resRiesSoc.setTieneError(false);
		resRiesSoc.setTotalCarteraVigente(101);

		res.setCentralRiesgoConyugeGarante(resCenRiCony);
		res.setCentralRiesgoConyugeSocio(resCenRiConSoc);
		res.setCentralRiesgoGarante(resRiesGar);
		res.setCentralRiesgoSocio(resRiesSoc);
		res.setComercio(true);
		// Se crea el objeto Persona conyugue
		Persona personaCon = new Persona();
		personaCon.setPersonaID(123456); // Consultar como se maneja si es una persona nueva
		personaCon.setRelacionCOD(" "); // Consultar que va en realación
		personaCon.setNomreModulo("Personas");
		personaCon.setUsuarioID(new Short("1"));
		personaCon.setIdentificacion("0502631310");
		personaCon.setIdentificacionConyuge("0502631310");
		personaCon.setTipoPersonaCOD("NAT");
		personaCon.setTipoIdentificacionCOD("CED");
		personaCon.setApellidoPaterno("TENDELEMA");
		personaCon.setApellidoMaterno("LOPEZ");
		personaCon.setNombres("TOMASA");
		personaCon.setFechaNacimiento(null);
		personaCon.setEstadoCivilCOD("1");
		personaCon.setSexoCOD("F");
		personaCon.setNumeroCarga(new Short("1"));
		personaCon.setSeparacionBienes(false);
		personaCon.setNacionalidadCOD("EC");
		personaCon.setNivelEducacionCOD("3");
		personaCon.setOcupacionCOD("328");
		personaCon.setCorreo("test@gmail.com");
		personaCon.setFechaApertura(null);
		personaCon.setLocalidadCOD(null);
		personaCon.setDireccion("CALLE 1 Y CALLE 2");
		personaCon.setTipoViviendaCOD(null);
		personaCon.setSituacionViviendaCOD("NO");
		personaCon.setViviendaHipotecada(false); // La cooperativa Debe definir la fuente
		personaCon.setDuenoCasa("JOSE JIMENEZ");
		personaCon.setTelefonoDuenoCasa("");
		personaCon.setTiempoViviendaActual(new Short("24"));
		personaCon.setUnidadTiempoViviendaActualCOD("M");
		personaCon.setReferenciaUbicacion("A TRES CUADRAS DE LA UPC");
		personaCon.setTiempoViviendaAnterior(null); // El campo no existe en Fitbank
		personaCon.setUnidadTiempoViviendaAnteriorCOD(null); // El campo no existe en Fitbank
		personaCon.setTelefonoDomicilio("0502631310");
		personaCon.setTelefonoCelular("0502631310");
		personaCon.setTieneError(false);
		personaCon.setMensaje("D204");
		// Se crea el objeto Persona conyugue socio
		Persona personaConSoc = new Persona();
		personaConSoc.setPersonaID(123456); // Consultar como se maneja si es una persona nueva
		personaConSoc.setRelacionCOD(" "); // Consultar que va en realación
		personaConSoc.setNomreModulo("Personas");
		personaConSoc.setUsuarioID(new Short("1"));
		personaConSoc.setIdentificacion("1234567892");
		personaConSoc.setIdentificacionConyuge("0502631310");
		personaConSoc.setTipoPersonaCOD("NAT");
		personaConSoc.setTipoIdentificacionCOD("CED");
		personaConSoc.setApellidoPaterno("TENDELEMA");
		personaConSoc.setApellidoMaterno("LOPEZ");
		personaConSoc.setNombres("TOMASA");
		personaConSoc.setFechaNacimiento(null);
		personaConSoc.setEstadoCivilCOD("1");
		personaConSoc.setSexoCOD("F");
		personaConSoc.setNumeroCarga(new Short("1"));
		personaConSoc.setSeparacionBienes(false);
		personaConSoc.setNacionalidadCOD("EC");
		personaConSoc.setNivelEducacionCOD("3");
		personaConSoc.setOcupacionCOD("328");
		personaConSoc.setCorreo("test@gmail.com");
		personaConSoc.setFechaApertura(null);
		personaConSoc.setLocalidadCOD(null);
		personaConSoc.setDireccion("CALLE 1 Y CALLE 2");
		personaConSoc.setTipoViviendaCOD(null);
		personaConSoc.setSituacionViviendaCOD("NO");
		personaConSoc.setViviendaHipotecada(false); // La cooperativa Debe definir la fuente
		personaConSoc.setDuenoCasa("JOSE JIMENEZ");
		personaConSoc.setTelefonoDuenoCasa("");
		personaConSoc.setTiempoViviendaActual(new Short("24"));
		personaConSoc.setUnidadTiempoViviendaActualCOD("M");
		personaConSoc.setReferenciaUbicacion("A TRES CUADRAS DE LA UPC");
		personaConSoc.setTiempoViviendaAnterior(null); // El campo no existe en Fitbank
		personaConSoc.setUnidadTiempoViviendaAnteriorCOD(null); // El campo no existe en Fitbank
		personaConSoc.setTelefonoDomicilio("0502631310");
		personaConSoc.setTelefonoCelular("0502631310");
		personaConSoc.setTieneError(false);
		personaConSoc.setMensaje("D204");

		res.setConyugeGarante(personaCon);
		res.setConyugeSocio(personaConSoc);
		res.setCorreo("juan@gmail.com");
		res.setCostosTotalesPerdidasYGanancias(102);
		res.setCostototal(102);
		res.setCuoraCredito(102);
		res.setCuotaCreditoVigente(102);
		res.setDecisionCOD(""); // Consultar
		res.setDescripcion(""); // Consultar
		res.setDescripcionRererenciasComerciales("REF COMERCIALES");
		res.setDestinoDetalle("OT");
		res.setDestinoEconomicoCOD("IF"); // Destino de fondos
		// Se crea el objeto Detalle Patrimonio Socio
		List<DetallePatrimonial> listDetPatSoc = new ArrayList<DetallePatrimonial>();
		DetallePatrimonial detPatSoc = new DetallePatrimonial();
		detPatSoc.setCantidad(1);
		detPatSoc.setCirculante(true);
		detPatSoc.setCuentaDetallePatrimonial("1234");
		detPatSoc.setCuentaIDDetallePatrimonial(4);
		detPatSoc.setDescripcion("CASA");
		detPatSoc.setDetallar(true);
		detPatSoc.setGrupoCuentaCODEDetallePatrimonial("X");
		detPatSoc.setInventario(true);
		detPatSoc.setOrden(1);
		detPatSoc.setValorDetallePatrimonial(1000);
		// Se crea el objeto Detalle Patrimonio Socio
		DetallePatrimonial detPatSoc2 = new DetallePatrimonial();
		detPatSoc2.setCantidad(1);
		detPatSoc2.setCirculante(true);
		detPatSoc2.setCuentaDetallePatrimonial("1234");
		detPatSoc2.setCuentaIDDetallePatrimonial(4);
		detPatSoc2.setDescripcion("DEPARA");
		detPatSoc2.setDetallar(true);
		detPatSoc2.setGrupoCuentaCODEDetallePatrimonial("X");
		detPatSoc2.setInventario(true);
		detPatSoc2.setOrden(1);
		detPatSoc2.setValorDetallePatrimonial(2000);

		listDetPatSoc.add(detPatSoc);
		listDetPatSoc.add(detPatSoc2);
		res.setDetallePatrimonialSocio(listDetPatSoc);
		// Se crea el objeto Detalle cuentas Garante
		DetalleDeCuentas detCuen1 = new DetalleDeCuentas();
		detCuen1.setCirculante(true);
		detCuen1.setCuentaID(1);
		detCuen1.setDetallar(true);
		detCuen1.setGrupoCuentaCODE("02");
		detCuen1.setInfEconFamiliarID(2);
		detCuen1.setInstitucionID(new Short("1"));
		detCuen1.setInventario(true);
		detCuen1.setNombreDetalleCuenta("CUENTA 1");
		detCuen1.setOrden(2);
		detCuen1.setPersonaID(5932);
		detCuen1.setValorDetalleCuentas(1000);

		DetalleDeCuentas detCuen2 = new DetalleDeCuentas();
		detCuen2.setCirculante(true);
		detCuen2.setCuentaID(1);
		detCuen2.setDetallar(true);
		detCuen2.setGrupoCuentaCODE("02");
		detCuen2.setInfEconFamiliarID(2);
		detCuen2.setInstitucionID(new Short("1"));
		detCuen2.setInventario(true);
		detCuen2.setNombreDetalleCuenta("CUENTA 1");
		detCuen2.setOrden(2);
		detCuen2.setPersonaID(5932);
		detCuen2.setValorDetalleCuentas(10001);

		List<DetalleDeCuentas> detalleCuentas = new ArrayList<DetalleDeCuentas>();
		detalleCuentas.add(detCuen1);
		detalleCuentas.add(detCuen2);

		res.setDetalledeCuentasGarante(detalleCuentas);
		// Se crea el objeto Detalle cuentas Socio
		DetalleDeCuentas detCuen3 = new DetalleDeCuentas();
		detCuen3.setCirculante(true);
		detCuen3.setCuentaID(1);
		detCuen3.setDetallar(true);
		detCuen3.setGrupoCuentaCODE("02");
		detCuen3.setInfEconFamiliarID(2);
		detCuen3.setInstitucionID(new Short("1"));
		detCuen3.setInventario(true);
		detCuen3.setNombreDetalleCuenta("CUENTA 1");
		detCuen3.setOrden(2);
		detCuen3.setPersonaID(5932);
		detCuen3.setValorDetalleCuentas(1000);

		DetalleDeCuentas detCuen4 = new DetalleDeCuentas();
		detCuen4.setCirculante(true);
		detCuen4.setCuentaID(1);
		detCuen4.setDetallar(true);
		detCuen4.setGrupoCuentaCODE("02");
		detCuen4.setInfEconFamiliarID(2);
		detCuen4.setInstitucionID(new Short("1"));
		detCuen4.setInventario(true);
		detCuen4.setNombreDetalleCuenta("CUENTA 1");
		detCuen4.setOrden(2);
		detCuen4.setPersonaID(5932);
		detCuen4.setValorDetalleCuentas(10001);

		List<DetalleDeCuentas> detalleCuentasSoc = new ArrayList<DetalleDeCuentas>();
		detalleCuentasSoc.add(detCuen3);
		detalleCuentasSoc.add(detCuen4);

		res.setDetalledeCuentasSocio(detalleCuentasSoc);
		res.setDireccion("DIRECCION");
		res.setDireccionInformacionNegocio("DIRECCION NEGOCIO");
		res.setDireccionTrabajoConyuge("DIRECCION CONYUGE");
		res.setDisponibilidadAntesCredito(10000);
		res.setDisponibleNeto(5000);
		res.setDuenoCasa("SAN JOSE DE MORAN");
		res.setEgresosFamiliar(800);
		res.setEgresosFamiliaresTotalPerdidasYGanancias(800);
		res.setEgresosNegocio(200);
		res.setEgresosNegocioPerdidasYGanancias(200);
		res.setEstado("ACTIVO");
		res.setEstadoCentralRiesgo("BAJO");
		res.setEstadoCivilCOD("2");
		res.setFechaApertura(null);
		res.setFechaNacimiento(null);
		res.setFechaSolicitud(null);
		res.setFormaPagoCOD("90");

		// Se crea el objeto Persona conyugue
		Persona personaGarante = new Persona();
		personaGarante.setPersonaID(123456); // Consultar como se maneja si es una persona nueva
		personaGarante.setRelacionCOD(" "); // Consultar que va en realación
		personaGarante.setNomreModulo("Personas");
		personaGarante.setUsuarioID(new Short("1"));
		personaGarante.setIdentificacion("1804073268");
		personaGarante.setIdentificacionConyuge("22297");
		personaGarante.setTipoPersonaCOD("NAT");
		personaGarante.setTipoIdentificacionCOD("CED");
		personaGarante.setApellidoPaterno("TENDELEMA");
		personaGarante.setApellidoMaterno("LOPEZ");
		personaGarante.setNombres("TOMASA");
		personaGarante.setFechaNacimiento(null);
		personaGarante.setEstadoCivilCOD("1");
		personaGarante.setSexoCOD("F");
		personaGarante.setNumeroCarga(new Short("1"));
		personaGarante.setSeparacionBienes(false);
		personaGarante.setNacionalidadCOD("EC");
		personaGarante.setNivelEducacionCOD("3");
		personaGarante.setOcupacionCOD("328");
		personaGarante.setCorreo("test@gmail.com");
		personaGarante.setFechaApertura(null);
		personaGarante.setLocalidadCOD(null);
		personaGarante.setDireccion("CALLE 1 Y CALLE 2");
		personaGarante.setTipoViviendaCOD(null);
		personaGarante.setSituacionViviendaCOD("NO");
		personaGarante.setViviendaHipotecada(false); // La cooperativa Debe definir la fuente
		personaGarante.setDuenoCasa("JOSE JIMENEZ");
		personaGarante.setTelefonoDuenoCasa("");
		personaGarante.setTiempoViviendaActual(new Short("24"));
		personaGarante.setUnidadTiempoViviendaActualCOD("M");
		personaGarante.setReferenciaUbicacion("A TRES CUADRAS DE LA UPC");
		personaGarante.setTiempoViviendaAnterior(null); // El campo no existe en Fitbank
		personaGarante.setUnidadTiempoViviendaAnteriorCOD(null); // El campo no existe en Fitbank
		personaGarante.setTelefonoDomicilio("0502631310");
		personaGarante.setTelefonoCelular("0502631310");
		personaGarante.setTieneError(false);
		personaGarante.setMensaje("D204");

		res.setGarante(personaGarante);
		// Objeto de garantias reales
		GarantiasReales garReal1 = new GarantiasReales();
		garReal1.setAnioFabricacionConstruccion(1986);
		garReal1.setAvaluoComercial(2000);
		garReal1.setComercio(true);
		garReal1.setCuotaCreditoVigente(2000);
		garReal1.setDescripcion("DESCRIPCION GARANTIA 1");
		garReal1.setDescripcionGarantiasReales("DESCRIPCION GARANTIA 1");
		garReal1.setDireccion("DIRECCION");
		garReal1.setDireccionGarantiasReales("DIRECCION");
		garReal1.setEstado("ACTIVO");
		garReal1.setEstadoCOD("002");
		garReal1.setFechaAvaluo(null);
		garReal1.setGrupoTipoGarantiaCOD("007");
		garReal1.setIdentificacion("0502631310");
		garReal1.setIngreso(null);
		garReal1.setLatitud(12121);
		garReal1.setLongitud(1212122);
		garReal1.setMarca("MARCA1");
		garReal1.setMensaje("MENSAJE");
		garReal1.setMicroEmpresario(true);
		garReal1.setModelo("MODELO 1");
		garReal1.setNombrePropietario("NOMBRE PROP 1");
		garReal1.setNumeroRegistro(22222);
		garReal1.setPersonaID(5932);
		garReal1.setPlaca("PLACA 1");
		garReal1.setSeriePrincipalMotor("1231212121212");
		garReal1.setSerieSecundariaMotor("2121121212");
		garReal1.setTieneError(false);
		garReal1.setTipoGarantiaCOD("004");
		garReal1.setUsuarioID(new Short("1")); // Consultar si se debe veridicar el usuario
		garReal1.setValor(20000);

		GarantiasReales garReal2 = new GarantiasReales();
		garReal2.setAnioFabricacionConstruccion(1986);
		garReal2.setAvaluoComercial(2000);
		garReal2.setComercio(true);
		garReal2.setCuotaCreditoVigente(2000);
		garReal2.setDescripcion("DESCRIPCION GARANTIA 1");
		garReal2.setDescripcionGarantiasReales("DESCRIPCION GARANTIA 1");
		garReal2.setDireccion("DIRECCION");
		garReal2.setDireccionGarantiasReales("DIRECCION");
		garReal2.setEstado("ACTIVO");
		garReal2.setEstadoCOD("002");
		garReal2.setFechaAvaluo(null);
		garReal2.setGrupoTipoGarantiaCOD("007");
		garReal2.setIdentificacion("0502631310");
		garReal2.setIngreso(null);
		garReal2.setLatitud(2121212);
		garReal2.setLongitud(212121);
		garReal2.setMarca("MARCA1");
		garReal2.setMensaje("MENSAJE");
		garReal2.setMicroEmpresario(true);
		garReal2.setModelo("MODELO 1");
		garReal2.setNombrePropietario("NOMBRE PROP 1");
		garReal2.setNumeroRegistro(22222);
		garReal2.setPersonaID(5932);
		garReal2.setPlaca("PLACA 1");
		garReal2.setSeriePrincipalMotor("1231212121212");
		garReal2.setSerieSecundariaMotor("2121121212");
		garReal2.setTieneError(false);
		garReal2.setTipoGarantiaCOD("004");
		garReal2.setUsuarioID(new Short("1")); // Consultar si se debe veridicar el usuario
		garReal2.setValor(20000);

		List<GarantiasReales> garReales = new ArrayList<GarantiasReales>();
		garReales.add(garReal1);
		garReales.add(garReal2);

		res.setGastosFinancierosPerdidasYGanancias(5000);
		res.setGastosTotalesPerdidasYGanancias(5000);
		res.setIVA(500);
		res.setIdentificacion("1804073268");
		res.setIdentificacionConyuge("1234567892");
		res.setIdentificacionGarante("1234567893");
		res.setIdentificacionInformacionNegocio("1234567894");
		res.setIdentificacionSocio("1234567895");
		res.setIdentificacionSolicitud("1234567896");
		res.setIngreso(null);
		res.setIngresosFamiliar(12000);
		res.setIngresosFamiliaresTotalPerdidasYGanancias(12100);
		res.setIngresosNegocio(50);
		res.setInteresesAmortizacion(true);
		res.setLatitud(1231243);
		res.setLocalidadCOD("");
		res.setLongitud(121212121);
		res.setMensaje("MENSAJE");
		res.setMensajePersonalizado("MENSAJE PERSONALIZADO");
		res.setMensajeTecnico("Null pointer Exception");
		res.setMetodo("EnviarOperacion");
		res.setModuloID(6);
		res.setMontoSolicitud(2000);
		res.setNacionalidadCOD("EC");
		res.setNivelEducacionCOD("02");
		res.setNombreInformacionNegocio("BAZAR Y PAPELERIA");
		res.setNombreModulo("PRESTAMOS");
		res.setNombres("JUAN JOSE");
		res.setNumeroCarga(new Short("3"));
		res.setNumeroCreditosIFI(new Short("1"));
		res.setNumeroEmpleados(new Short("1"));
		res.setNumeroOperaciones(new Short("1"));
		res.setObservacion("OBSERVACIONES");
		res.setObservacionReferenciasComerciales("OBSERVACIONES REFERENCIAA");
		res.setOcupacionCOD("03");
		res.setPatrimonioMontos(100000);
		res.setPeorCalificacion12MesesCOD("B");
		res.setPeriodoGracia(2);
		res.setPersonaID(5932);
		res.setPersonaIdCentralRiesgo(1);
		res.setPlazo(new Short("18"));
		res.setPrimerInteres(12);
		res.setPrimeraCuota(120);
		res.setProductoID("2620");
		res.setReciprocidad("RECIPROCIDAD");
		res.setReferencia("REFERENCIA");
		res.setReferenciaUbicacion("REFERENCIA UBICACION");
		// Objeto ReferenciasComerciales
		ReferenciasComerciales refComer = new ReferenciasComerciales();
		refComer.setDescripcion("DESCRIPCION REFCO");
		refComer.setMensaje("MENSAJE REF COMER");
		refComer.setObservacion("OBSERVACIONES REF COM");
		refComer.setSolicitudID(123);
		refComer.setTelefono("245522322");
		refComer.setTieneError(false);
		refComer.setTipoReferenciaComercialCOD("Codigo");
		refComer.setValor(10000);

		ReferenciasComerciales refComer2 = new ReferenciasComerciales();
		refComer2.setDescripcion("DESCRIPCION REFCO");
		refComer2.setMensaje("MENSAJE REF COMER");
		refComer2.setObservacion("OBSERVACIONES REF COM");
		refComer2.setSolicitudID(123);
		refComer2.setTelefono("245522322");
		refComer2.setTieneError(false);
		refComer2.setTipoReferenciaComercialCOD("Codigo");
		refComer2.setValor(10000);

		List<ReferenciasComerciales> referenciasComer = new ArrayList<ReferenciasComerciales>();
		referenciasComer.add(refComer);
		referenciasComer.add(refComer2);

		res.setReferenciasComerciales(referenciasComer);
		// Objeto ReferenciasPersonales
		ReferenciasPersonales refPers1 = new ReferenciasPersonales();
		refPers1.setMensaje("Mensaje");
		refPers1.setNombre("Juan Manuel Pardo");
		refPers1.setObservacion("Observacion");
		refPers1.setSolicitudID(123);
		refPers1.setTelefono("1231457891");
		refPers1.setTieneError(true);
		refPers1.setTipoReferenciaPersonalCOD("REFP");

		ReferenciasPersonales refPers2 = new ReferenciasPersonales();
		refPers2.setMensaje("Mensaje");
		refPers2.setNombre("Jose Molina");
		refPers2.setObservacion("Observacion");
		refPers2.setSolicitudID(123);
		refPers2.setTelefono("1231457891");
		refPers2.setTieneError(true);
		refPers2.setTipoReferenciaPersonalCOD("REFP");

		List<ReferenciasPersonales> referenciasPersonales = new ArrayList<ReferenciasPersonales>();
		referenciasPersonales.add(refPers1);
		referenciasPersonales.add(refPers2);
		res.setReferenciasPersonales(referenciasPersonales);

		// Objeto ReferenciasPersonales2
		ReferenciasPersonales refPers3 = new ReferenciasPersonales();
		refPers3.setMensaje("Mensaje");
		refPers3.setNombre("Juan Manuel Pardo");
		refPers3.setObservacion("Observacion");
		refPers3.setSolicitudID(123);
		refPers3.setTelefono("1231457891");
		refPers3.setTieneError(true);
		refPers3.setTipoReferenciaPersonalCOD("REFP");

		ReferenciasPersonales refPers4 = new ReferenciasPersonales();
		refPers4.setMensaje("Mensaje");
		refPers4.setNombre("Jose Molina");
		refPers4.setObservacion("Observacion");
		refPers4.setSolicitudID(123);
		refPers4.setTelefono("1231457891");
		refPers4.setTieneError(true);
		refPers4.setTipoReferenciaPersonalCOD("REFP");

		List<ReferenciasPersonales> referenciasPersonales2 = new ArrayList<ReferenciasPersonales>();
		referenciasPersonales2.add(refPers3);
		referenciasPersonales2.add(refPers4);
		res.setReferenciasPersonales(referenciasPersonales2);

		res.setRelacionCOD(""); // Consultar
		res.setRespuestaCOD("COD");
		res.setSectorEconomicoCOD("SECEC");
		res.setSegmento("SEG");
		res.setSeparacionBienes(true);
		res.setSexoCOD("M");
		res.setSituacionViviendaCOD("3");

		Persona personaSoc = new Persona();
		personaSoc.setPersonaID(123456); // Consultar como se maneja si es una persona nueva
		personaSoc.setRelacionCOD(" "); // Consultar que va en realación
		personaSoc.setNomreModulo("Personas");
		personaSoc.setUsuarioID(new Short("1"));
		personaSoc.setIdentificacion("1234567892");
		personaSoc.setIdentificacionConyuge("0502631310");
		personaSoc.setTipoPersonaCOD("NAT");
		personaSoc.setTipoIdentificacionCOD("CED");
		personaSoc.setApellidoPaterno("TENDELEMA");
		personaSoc.setApellidoMaterno("LOPEZ");
		personaSoc.setNombres("TOMASA");
		personaSoc.setFechaNacimiento(null);
		personaSoc.setEstadoCivilCOD("1");
		personaSoc.setSexoCOD("F");
		personaSoc.setNumeroCarga(new Short("1"));
		personaSoc.setSeparacionBienes(false);
		personaSoc.setNacionalidadCOD("EC");
		personaSoc.setNivelEducacionCOD("3");
		personaSoc.setOcupacionCOD("328");
		personaSoc.setCorreo("test@gmail.com");
		personaSoc.setFechaApertura(null);
		personaSoc.setLocalidadCOD(null);
		personaSoc.setDireccion("CALLE 1 Y CALLE 2");
		personaSoc.setTipoViviendaCOD(null);
		personaSoc.setSituacionViviendaCOD("NO");
		personaSoc.setViviendaHipotecada(false); // La cooperativa Debe definir la fuente
		personaSoc.setDuenoCasa("JOSE JIMENEZ");
		personaSoc.setTelefonoDuenoCasa("");
		personaSoc.setTiempoViviendaActual(new Short("24"));
		personaSoc.setUnidadTiempoViviendaActualCOD("M");
		personaSoc.setReferenciaUbicacion("A TRES CUADRAS DE LA UPC");
		personaSoc.setTiempoViviendaAnterior(null); // El campo no existe en Fitbank
		personaSoc.setUnidadTiempoViviendaAnteriorCOD(null); // El campo no existe en Fitbank
		personaSoc.setTelefonoDomicilio("0502631310");
		personaSoc.setTelefonoCelular("0502631310");
		personaSoc.setTieneError(false);
		personaSoc.setMensaje("D204");

		res.setSocio(personaSoc);
		res.setSolicitudID(123);
		res.setTasa(12.5);
		res.setTelefono("27135153");
		res.setTelefonoCelular("121312121212");
		res.setTelefonoDomicilio("1231231221");
		res.setTelefonoDuenoCasa("123121212");
		res.setTelefonoReferenciasComerciales("123132121212");
		res.setTelefonoTrabajoConyuge("234322323");
		res.setTiempoViviendaActual(new Short("24"));
		res.setTiempoViviendaAnterior(new Short("0"));
		res.setTieneError(false);
		res.setTipoCuotaCOD("F");
		res.setTipoGarantiaCOD("GAR");
		res.setTipoIdentificacionCOD("CED");
		res.setTipoLocalCOD(""); // Consultar
		res.setTipoPersonaCOD("NAT");
		res.setTipoReferenciaComercialCOD("TIPREF");
		res.setTipoViviendaCOD("TIPVI");
		res.setTotalCarteraVigente(1000);
		res.setTotalEgresos(1000);
		res.setTotalIngresosFlujo(1000);
		res.setTotalValorDetalleDeCuentasEGRESOSGarante(1000);
		res.setTotalValorDetalleDeCuentasEGRESOSSocio(1000);
		res.setTotalValorDetalleDeCuentasINGRESOSGarante(1000);
		res.setTotalValorDetalleDeCuentasINGRESOSSocio(1000);
		res.setTotalValorDetalleDeCuentasINGRESOSGarante(1000);
		res.setTotalValorDetalleDeCuentasINGRESOSSocio(1000);
		res.setTotalValorDetallePatrimonial(1000);
		res.setTotalValorDetallePatrimonialGarante(1000);
		res.setTotalValorPatrimonioACTIVOGarante(1000);
		res.setTotalValorPatrimonioACTIVOSocio(1000);
		res.setTotalValorPatrimonioPASIVOGarante(1000);
		res.setTotalValorPatrimonioPASIVOSocio(1000);
		res.setUnidadAntiguedadNegocioCOD("M");
		res.setUnidadAntiguedadNegocioMismoLugarCOD("M");
		res.setUnidadTiempoPlazoCOD("05");
		res.setUnidadTiempoViviendaActualCOD("2");
		res.setUsuarioID("1");
		res.setUsuarioIDSolicitud(new Short("1"));
		res.setUtilidadNegocioTotalPerdidasYGanancias(10000);
		res.setUtilidadNetaPersidasYGanancias(10000);
		res.setValorReferenciasComerciales(10000);
		res.setVentasMontos(10000);
		res.setVentasTotalesPerdidasYGanancias(10000);
		res.setViviendaHipotecada(true);

		RespuestaSolicitud respuesta = port1.enviarDatosOperacion(res);
		System.out.println(respuesta.toString());


		System.out.println("***********************");
		System.out.println("Call Over!");
	}
}

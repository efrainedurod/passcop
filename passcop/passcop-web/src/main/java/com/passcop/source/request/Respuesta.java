/**
 * Respuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

import java.util.Arrays;

public class Respuesta  implements java.io.Serializable {
    private ReferenciasPersonales[] referenciasPersonales;

    private java.lang.String nombreModulo;

    private int solicitudID;

    private java.lang.String productoID;

    private int moduloID;

    private java.lang.String tipoCuotaCOD;

    private double montoSolicitud;

    private double tasa;

    private short plazo;

    private java.lang.String unidadTiempoPlazoCOD;

    private java.lang.String formaPagoCOD;

    private double primerInteres;

    private double primeraCuota;

    private java.lang.String tipoGarantiaCOD;

    private java.lang.String destinoEconomicoCOD;

    private java.lang.String destinoDetalle;

    private double cuotaCreditoVigente;

    private java.lang.String decisionCOD;

    private java.lang.String observacion;

    private double IVA;

    private java.lang.Integer periodoGracia;

    private java.lang.Boolean interesesAmortizacion;

    private short usuarioIDSolicitud;

    private java.lang.String identificacionSolicitud;

    private int personaID;

    private java.util.Calendar fechaSolicitud;

    private java.lang.String relacionCOD;

    private java.lang.String identificacion;

    private java.lang.String identificacionConyuge;

    private java.lang.String tipoPersonaCOD;

    private java.lang.String tipoIdentificacionCOD;

    private java.lang.String apellidoPaterno;

    private java.lang.String apellidoMaterno;

    private java.lang.String nombres;

    private java.util.Calendar fechaNacimiento;

    private java.lang.String estadoCivilCOD;

    private java.lang.String sexoCOD;

    private java.lang.Short numeroCarga;

    private boolean separacionBienes;

    private java.lang.String nacionalidadCOD;

    private java.lang.String nivelEducacionCOD;

    private java.lang.String ocupacionCOD;

    private java.lang.String correo;

    private java.util.Calendar fechaApertura;

    private java.lang.String localidadCOD;

    private java.lang.String direccion;

    private java.lang.String tipoViviendaCOD;

    private java.lang.String situacionViviendaCOD;

    private boolean viviendaHipotecada;

    private java.lang.String duenoCasa;

    private java.lang.String telefonoDuenoCasa;

    private java.lang.Short tiempoViviendaActual;

    private java.lang.String unidadTiempoViviendaActualCOD;

    private java.lang.String referenciaUbicacion;

    private java.lang.Short tiempoViviendaAnterior;

    private java.lang.String unidadTiempoViviendaAnteriorCOD;

    private java.lang.String telefonoDomicilio;

    private java.lang.String telefonoCelular;

    private Persona socio;

    private java.lang.String identificacionSocio;

    private Persona garante;

    private java.lang.String identificacionGarante;

    private Persona conyugeGarante;

    private Persona conyugeSocio;

    private java.lang.String identificacionInformacionNegocio;

    private java.lang.String nombreInformacionNegocio;

    private java.lang.String sectorEconomicoCOD;

    private java.lang.String descripcion;

    private java.lang.Integer antiguedadNegocio;

    private java.lang.String unidadAntiguedadNegocioCOD;

    private java.lang.Short numeroEmpleados;

    private java.lang.String direccionInformacionNegocio;

    private java.lang.String referencia;

    private java.lang.String telefono;

    private java.lang.String direccionTrabajoConyuge;

    private java.lang.String telefonoTrabajoConyuge;

    private java.lang.Integer antiguedadNegocioMismoLugar;

    private java.lang.String unidadAntiguedadNegocioMismoLugarCOD;

    private java.lang.String tipoLocalCOD;

    private boolean comercio;

    private java.util.Calendar ingreso;

    private java.lang.String estado;

    private double latitud;

    private double longitud;

    private DetalleDeCuentas[] detalledeCuentasSocio;

    private DetalleDeCuentas[] detalledeCuentasGarante;

    private double totalValorPatrimonioACTIVOSocio;

    private double totalValorPatrimonioPASIVOSocio;

    private double totalValorDetalleDeCuentasINGRESOSSocio;

    private double totalValorDetalleDeCuentasEGRESOSSocio;

    private double totalValorPatrimonioACTIVOGarante;

    private double totalValorPatrimonioPASIVOGarante;

    private double totalValorDetalleDeCuentasINGRESOSGarante;

    private double totalValorDetalleDeCuentasEGRESOSGarante;

    private DetallePatrimonial[] detallePatrimonialSocio;

    private double totalValorDetallePatrimonial;

    private DetallePatrimonial[] detallePatrominialGarante;

    private double totalValorDetallePatrimonialGarante;

    private GarantiasReales[] garantiasReales;

    private ReferenciasPersonales[] referenciasPersonales2;

    private ReferenciasComerciales[] referenciasComerciales;

    private java.lang.String tipoReferenciaComercialCOD;

    private java.lang.String descripcionRererenciasComerciales;

    private double valorReferenciasComerciales;

    private java.lang.String telefonoReferenciasComerciales;

    private java.lang.String observacionReferenciasComerciales;

    private double patrimonioMontos;

    private double ventasMontos;

    private double costototal;

    private double totalIngresosFlujo;

    private double ingresosFamiliar;

    private double ingresosNegocio;

    private double totalEgresos;

    private double egresosFamiliar;

    private double egresosNegocio;

    private double disponibilidadAntesCredito;

    private double cuoraCredito;

    private double disponibleNeto;

    private double ventasTotalesPerdidasYGanancias;

    private double costosTotalesPerdidasYGanancias;

    private double gastosTotalesPerdidasYGanancias;

    private double gastosFinancierosPerdidasYGanancias;

    private double utilidadNegocioTotalPerdidasYGanancias;

    private double egresosNegocioPerdidasYGanancias;

    private double ingresosFamiliaresTotalPerdidasYGanancias;

    private double egresosFamiliaresTotalPerdidasYGanancias;

    private double utilidadNetaPersidasYGanancias;

    private RespuestaCentralRiesgo centralRiesgoSocio;

    private RespuestaCentralRiesgo centralRiesgoConyugeSocio;

    private RespuestaCentralRiesgo centralRiesgoGarante;

    private RespuestaCentralRiesgo centralRiesgoConyugeGarante;

    private double montoTotalEndeudamiento;

    private double totalCarteraVigente;

    private double carteraRiesgo;

    private java.lang.String calificacionRiesgoCOD;

    private double castigoDemanda;

    private java.lang.String peorCalificacion12MesesCOD;

    private double castigoDemanda12Meses;

    private java.lang.Short numeroCreditosIFI;

    private java.lang.Short numeroOperaciones;

    private java.lang.String reciprocidad;

    private java.lang.String estadoCentralRiesgo;

    private short usuarioID;

    private java.lang.Integer personaIdCentralRiesgo;

    private boolean tieneError;

    private java.lang.String mensaje;

    private java.lang.String respuestaCOD;

    private java.lang.String segmento;

    private java.lang.String metodo;

    private java.lang.String mensajePersonalizado;

    private java.lang.String mensajeTecnico;

    public Respuesta() {
    }

    public Respuesta(
           ReferenciasPersonales[] referenciasPersonales,
           java.lang.String nombreModulo,
           int solicitudID,
           java.lang.String productoID,
           int moduloID,
           java.lang.String tipoCuotaCOD,
           double montoSolicitud,
           double tasa,
           short plazo,
           java.lang.String unidadTiempoPlazoCOD,
           java.lang.String formaPagoCOD,
           double primerInteres,
           double primeraCuota,
           java.lang.String tipoGarantiaCOD,
           java.lang.String destinoEconomicoCOD,
           java.lang.String destinoDetalle,
           double cuotaCreditoVigente,
           java.lang.String decisionCOD,
           java.lang.String observacion,
           double IVA,
           java.lang.Integer periodoGracia,
           java.lang.Boolean interesesAmortizacion,
           short usuarioIDSolicitud,
           java.lang.String identificacionSolicitud,
           int personaID,
           java.util.Calendar fechaSolicitud,
           java.lang.String relacionCOD,
           java.lang.String identificacion,
           java.lang.String identificacionConyuge,
           java.lang.String tipoPersonaCOD,
           java.lang.String tipoIdentificacionCOD,
           java.lang.String apellidoPaterno,
           java.lang.String apellidoMaterno,
           java.lang.String nombres,
           java.util.Calendar fechaNacimiento,
           java.lang.String estadoCivilCOD,
           java.lang.String sexoCOD,
           java.lang.Short numeroCarga,
           boolean separacionBienes,
           java.lang.String nacionalidadCOD,
           java.lang.String nivelEducacionCOD,
           java.lang.String ocupacionCOD,
           java.lang.String correo,
           java.util.Calendar fechaApertura,
           java.lang.String localidadCOD,
           java.lang.String direccion,
           java.lang.String tipoViviendaCOD,
           java.lang.String situacionViviendaCOD,
           boolean viviendaHipotecada,
           java.lang.String duenoCasa,
           java.lang.String telefonoDuenoCasa,
           java.lang.Short tiempoViviendaActual,
           java.lang.String unidadTiempoViviendaActualCOD,
           java.lang.String referenciaUbicacion,
           java.lang.Short tiempoViviendaAnterior,
           java.lang.String unidadTiempoViviendaAnteriorCOD,
           java.lang.String telefonoDomicilio,
           java.lang.String telefonoCelular,
           Persona socio,
           java.lang.String identificacionSocio,
           Persona garante,
           java.lang.String identificacionGarante,
           Persona conyugeGarante,
           Persona conyugeSocio,
           java.lang.String identificacionInformacionNegocio,
           java.lang.String nombreInformacionNegocio,
           java.lang.String sectorEconomicoCOD,
           java.lang.String descripcion,
           java.lang.Integer antiguedadNegocio,
           java.lang.String unidadAntiguedadNegocioCOD,
           java.lang.Short numeroEmpleados,
           java.lang.String direccionInformacionNegocio,
           java.lang.String referencia,
           java.lang.String telefono,
           java.lang.String direccionTrabajoConyuge,
           java.lang.String telefonoTrabajoConyuge,
           java.lang.Integer antiguedadNegocioMismoLugar,
           java.lang.String unidadAntiguedadNegocioMismoLugarCOD,
           java.lang.String tipoLocalCOD,
           boolean comercio,
           java.util.Calendar ingreso,
           java.lang.String estado,
           double latitud,
           double longitud,
           DetalleDeCuentas[] detalledeCuentasSocio,
           DetalleDeCuentas[] detalledeCuentasGarante,
           double totalValorPatrimonioACTIVOSocio,
           double totalValorPatrimonioPASIVOSocio,
           double totalValorDetalleDeCuentasINGRESOSSocio,
           double totalValorDetalleDeCuentasEGRESOSSocio,
           double totalValorPatrimonioACTIVOGarante,
           double totalValorPatrimonioPASIVOGarante,
           double totalValorDetalleDeCuentasINGRESOSGarante,
           double totalValorDetalleDeCuentasEGRESOSGarante,
           DetallePatrimonial[] detallePatrimonialSocio,
           double totalValorDetallePatrimonial,
           DetallePatrimonial[] detallePatrominialGarante,
           double totalValorDetallePatrimonialGarante,
           GarantiasReales[] garantiasReales,
           ReferenciasPersonales[] referenciasPersonales2,
           ReferenciasComerciales[] referenciasComerciales,
           java.lang.String tipoReferenciaComercialCOD,
           java.lang.String descripcionRererenciasComerciales,
           double valorReferenciasComerciales,
           java.lang.String telefonoReferenciasComerciales,
           java.lang.String observacionReferenciasComerciales,
           double patrimonioMontos,
           double ventasMontos,
           double costototal,
           double totalIngresosFlujo,
           double ingresosFamiliar,
           double ingresosNegocio,
           double totalEgresos,
           double egresosFamiliar,
           double egresosNegocio,
           double disponibilidadAntesCredito,
           double cuoraCredito,
           double disponibleNeto,
           double ventasTotalesPerdidasYGanancias,
           double costosTotalesPerdidasYGanancias,
           double gastosTotalesPerdidasYGanancias,
           double gastosFinancierosPerdidasYGanancias,
           double utilidadNegocioTotalPerdidasYGanancias,
           double egresosNegocioPerdidasYGanancias,
           double ingresosFamiliaresTotalPerdidasYGanancias,
           double egresosFamiliaresTotalPerdidasYGanancias,
           double utilidadNetaPersidasYGanancias,
           RespuestaCentralRiesgo centralRiesgoSocio,
           RespuestaCentralRiesgo centralRiesgoConyugeSocio,
           RespuestaCentralRiesgo centralRiesgoGarante,
           RespuestaCentralRiesgo centralRiesgoConyugeGarante,
           double montoTotalEndeudamiento,
           double totalCarteraVigente,
           double carteraRiesgo,
           java.lang.String calificacionRiesgoCOD,
           double castigoDemanda,
           java.lang.String peorCalificacion12MesesCOD,
           double castigoDemanda12Meses,
           java.lang.Short numeroCreditosIFI,
           java.lang.Short numeroOperaciones,
           java.lang.String reciprocidad,
           java.lang.String estadoCentralRiesgo,
           short usuarioID,
           java.lang.Integer personaIdCentralRiesgo,
           boolean tieneError,
           java.lang.String mensaje,
           java.lang.String respuestaCOD,
           java.lang.String segmento,
           java.lang.String metodo,
           java.lang.String mensajePersonalizado,
           java.lang.String mensajeTecnico) {
           this.referenciasPersonales = referenciasPersonales;
           this.nombreModulo = nombreModulo;
           this.solicitudID = solicitudID;
           this.productoID = productoID;
           this.moduloID = moduloID;
           this.tipoCuotaCOD = tipoCuotaCOD;
           this.montoSolicitud = montoSolicitud;
           this.tasa = tasa;
           this.plazo = plazo;
           this.unidadTiempoPlazoCOD = unidadTiempoPlazoCOD;
           this.formaPagoCOD = formaPagoCOD;
           this.primerInteres = primerInteres;
           this.primeraCuota = primeraCuota;
           this.tipoGarantiaCOD = tipoGarantiaCOD;
           this.destinoEconomicoCOD = destinoEconomicoCOD;
           this.destinoDetalle = destinoDetalle;
           this.cuotaCreditoVigente = cuotaCreditoVigente;
           this.decisionCOD = decisionCOD;
           this.observacion = observacion;
           this.IVA = IVA;
           this.periodoGracia = periodoGracia;
           this.interesesAmortizacion = interesesAmortizacion;
           this.usuarioIDSolicitud = usuarioIDSolicitud;
           this.identificacionSolicitud = identificacionSolicitud;
           this.personaID = personaID;
           this.fechaSolicitud = fechaSolicitud;
           this.relacionCOD = relacionCOD;
           this.identificacion = identificacion;
           this.identificacionConyuge = identificacionConyuge;
           this.tipoPersonaCOD = tipoPersonaCOD;
           this.tipoIdentificacionCOD = tipoIdentificacionCOD;
           this.apellidoPaterno = apellidoPaterno;
           this.apellidoMaterno = apellidoMaterno;
           this.nombres = nombres;
           this.fechaNacimiento = fechaNacimiento;
           this.estadoCivilCOD = estadoCivilCOD;
           this.sexoCOD = sexoCOD;
           this.numeroCarga = numeroCarga;
           this.separacionBienes = separacionBienes;
           this.nacionalidadCOD = nacionalidadCOD;
           this.nivelEducacionCOD = nivelEducacionCOD;
           this.ocupacionCOD = ocupacionCOD;
           this.correo = correo;
           this.fechaApertura = fechaApertura;
           this.localidadCOD = localidadCOD;
           this.direccion = direccion;
           this.tipoViviendaCOD = tipoViviendaCOD;
           this.situacionViviendaCOD = situacionViviendaCOD;
           this.viviendaHipotecada = viviendaHipotecada;
           this.duenoCasa = duenoCasa;
           this.telefonoDuenoCasa = telefonoDuenoCasa;
           this.tiempoViviendaActual = tiempoViviendaActual;
           this.unidadTiempoViviendaActualCOD = unidadTiempoViviendaActualCOD;
           this.referenciaUbicacion = referenciaUbicacion;
           this.tiempoViviendaAnterior = tiempoViviendaAnterior;
           this.unidadTiempoViviendaAnteriorCOD = unidadTiempoViviendaAnteriorCOD;
           this.telefonoDomicilio = telefonoDomicilio;
           this.telefonoCelular = telefonoCelular;
           this.socio = socio;
           this.identificacionSocio = identificacionSocio;
           this.garante = garante;
           this.identificacionGarante = identificacionGarante;
           this.conyugeGarante = conyugeGarante;
           this.conyugeSocio = conyugeSocio;
           this.identificacionInformacionNegocio = identificacionInformacionNegocio;
           this.nombreInformacionNegocio = nombreInformacionNegocio;
           this.sectorEconomicoCOD = sectorEconomicoCOD;
           this.descripcion = descripcion;
           this.antiguedadNegocio = antiguedadNegocio;
           this.unidadAntiguedadNegocioCOD = unidadAntiguedadNegocioCOD;
           this.numeroEmpleados = numeroEmpleados;
           this.direccionInformacionNegocio = direccionInformacionNegocio;
           this.referencia = referencia;
           this.telefono = telefono;
           this.direccionTrabajoConyuge = direccionTrabajoConyuge;
           this.telefonoTrabajoConyuge = telefonoTrabajoConyuge;
           this.antiguedadNegocioMismoLugar = antiguedadNegocioMismoLugar;
           this.unidadAntiguedadNegocioMismoLugarCOD = unidadAntiguedadNegocioMismoLugarCOD;
           this.tipoLocalCOD = tipoLocalCOD;
           this.comercio = comercio;
           this.ingreso = ingreso;
           this.estado = estado;
           this.latitud = latitud;
           this.longitud = longitud;
           this.detalledeCuentasSocio = detalledeCuentasSocio;
           this.detalledeCuentasGarante = detalledeCuentasGarante;
           this.totalValorPatrimonioACTIVOSocio = totalValorPatrimonioACTIVOSocio;
           this.totalValorPatrimonioPASIVOSocio = totalValorPatrimonioPASIVOSocio;
           this.totalValorDetalleDeCuentasINGRESOSSocio = totalValorDetalleDeCuentasINGRESOSSocio;
           this.totalValorDetalleDeCuentasEGRESOSSocio = totalValorDetalleDeCuentasEGRESOSSocio;
           this.totalValorPatrimonioACTIVOGarante = totalValorPatrimonioACTIVOGarante;
           this.totalValorPatrimonioPASIVOGarante = totalValorPatrimonioPASIVOGarante;
           this.totalValorDetalleDeCuentasINGRESOSGarante = totalValorDetalleDeCuentasINGRESOSGarante;
           this.totalValorDetalleDeCuentasEGRESOSGarante = totalValorDetalleDeCuentasEGRESOSGarante;
           this.detallePatrimonialSocio = detallePatrimonialSocio;
           this.totalValorDetallePatrimonial = totalValorDetallePatrimonial;
           this.detallePatrominialGarante = detallePatrominialGarante;
           this.totalValorDetallePatrimonialGarante = totalValorDetallePatrimonialGarante;
           this.garantiasReales = garantiasReales;
           this.referenciasPersonales2 = referenciasPersonales2;
           this.referenciasComerciales = referenciasComerciales;
           this.tipoReferenciaComercialCOD = tipoReferenciaComercialCOD;
           this.descripcionRererenciasComerciales = descripcionRererenciasComerciales;
           this.valorReferenciasComerciales = valorReferenciasComerciales;
           this.telefonoReferenciasComerciales = telefonoReferenciasComerciales;
           this.observacionReferenciasComerciales = observacionReferenciasComerciales;
           this.patrimonioMontos = patrimonioMontos;
           this.ventasMontos = ventasMontos;
           this.costototal = costototal;
           this.totalIngresosFlujo = totalIngresosFlujo;
           this.ingresosFamiliar = ingresosFamiliar;
           this.ingresosNegocio = ingresosNegocio;
           this.totalEgresos = totalEgresos;
           this.egresosFamiliar = egresosFamiliar;
           this.egresosNegocio = egresosNegocio;
           this.disponibilidadAntesCredito = disponibilidadAntesCredito;
           this.cuoraCredito = cuoraCredito;
           this.disponibleNeto = disponibleNeto;
           this.ventasTotalesPerdidasYGanancias = ventasTotalesPerdidasYGanancias;
           this.costosTotalesPerdidasYGanancias = costosTotalesPerdidasYGanancias;
           this.gastosTotalesPerdidasYGanancias = gastosTotalesPerdidasYGanancias;
           this.gastosFinancierosPerdidasYGanancias = gastosFinancierosPerdidasYGanancias;
           this.utilidadNegocioTotalPerdidasYGanancias = utilidadNegocioTotalPerdidasYGanancias;
           this.egresosNegocioPerdidasYGanancias = egresosNegocioPerdidasYGanancias;
           this.ingresosFamiliaresTotalPerdidasYGanancias = ingresosFamiliaresTotalPerdidasYGanancias;
           this.egresosFamiliaresTotalPerdidasYGanancias = egresosFamiliaresTotalPerdidasYGanancias;
           this.utilidadNetaPersidasYGanancias = utilidadNetaPersidasYGanancias;
           this.centralRiesgoSocio = centralRiesgoSocio;
           this.centralRiesgoConyugeSocio = centralRiesgoConyugeSocio;
           this.centralRiesgoGarante = centralRiesgoGarante;
           this.centralRiesgoConyugeGarante = centralRiesgoConyugeGarante;
           this.montoTotalEndeudamiento = montoTotalEndeudamiento;
           this.totalCarteraVigente = totalCarteraVigente;
           this.carteraRiesgo = carteraRiesgo;
           this.calificacionRiesgoCOD = calificacionRiesgoCOD;
           this.castigoDemanda = castigoDemanda;
           this.peorCalificacion12MesesCOD = peorCalificacion12MesesCOD;
           this.castigoDemanda12Meses = castigoDemanda12Meses;
           this.numeroCreditosIFI = numeroCreditosIFI;
           this.numeroOperaciones = numeroOperaciones;
           this.reciprocidad = reciprocidad;
           this.estadoCentralRiesgo = estadoCentralRiesgo;
           this.usuarioID = usuarioID;
           this.personaIdCentralRiesgo = personaIdCentralRiesgo;
           this.tieneError = tieneError;
           this.mensaje = mensaje;
           this.respuestaCOD = respuestaCOD;
           this.segmento = segmento;
           this.metodo = metodo;
           this.mensajePersonalizado = mensajePersonalizado;
           this.mensajeTecnico = mensajeTecnico;
    }


    /**
     * Gets the referenciasPersonales value for this Respuesta.
     * 
     * @return referenciasPersonales
     */
    public ReferenciasPersonales[] getReferenciasPersonales() {
        return referenciasPersonales;
    }


    /**
     * Sets the referenciasPersonales value for this Respuesta.
     * 
     * @param referenciasPersonales
     */
    public void setReferenciasPersonales(ReferenciasPersonales[] referenciasPersonales) {
        this.referenciasPersonales = referenciasPersonales;
    }


    /**
     * Gets the nombreModulo value for this Respuesta.
     * 
     * @return nombreModulo
     */
    public java.lang.String getNombreModulo() {
        return nombreModulo;
    }


    /**
     * Sets the nombreModulo value for this Respuesta.
     * 
     * @param nombreModulo
     */
    public void setNombreModulo(java.lang.String nombreModulo) {
        this.nombreModulo = nombreModulo;
    }


    /**
     * Gets the solicitudID value for this Respuesta.
     * 
     * @return solicitudID
     */
    public int getSolicitudID() {
        return solicitudID;
    }


    /**
     * Sets the solicitudID value for this Respuesta.
     * 
     * @param solicitudID
     */
    public void setSolicitudID(int solicitudID) {
        this.solicitudID = solicitudID;
    }


    /**
     * Gets the productoID value for this Respuesta.
     * 
     * @return productoID
     */
    public java.lang.String getProductoID() {
        return productoID;
    }


    /**
     * Sets the productoID value for this Respuesta.
     * 
     * @param productoID
     */
    public void setProductoID(java.lang.String productoID) {
        this.productoID = productoID;
    }


    /**
     * Gets the moduloID value for this Respuesta.
     * 
     * @return moduloID
     */
    public int getModuloID() {
        return moduloID;
    }


    /**
     * Sets the moduloID value for this Respuesta.
     * 
     * @param moduloID
     */
    public void setModuloID(int moduloID) {
        this.moduloID = moduloID;
    }


    /**
     * Gets the tipoCuotaCOD value for this Respuesta.
     * 
     * @return tipoCuotaCOD
     */
    public java.lang.String getTipoCuotaCOD() {
        return tipoCuotaCOD;
    }


    /**
     * Sets the tipoCuotaCOD value for this Respuesta.
     * 
     * @param tipoCuotaCOD
     */
    public void setTipoCuotaCOD(java.lang.String tipoCuotaCOD) {
        this.tipoCuotaCOD = tipoCuotaCOD;
    }


    /**
     * Gets the montoSolicitud value for this Respuesta.
     * 
     * @return montoSolicitud
     */
    public double getMontoSolicitud() {
        return montoSolicitud;
    }


    /**
     * Sets the montoSolicitud value for this Respuesta.
     * 
     * @param montoSolicitud
     */
    public void setMontoSolicitud(double montoSolicitud) {
        this.montoSolicitud = montoSolicitud;
    }


    /**
     * Gets the tasa value for this Respuesta.
     * 
     * @return tasa
     */
    public double getTasa() {
        return tasa;
    }


    /**
     * Sets the tasa value for this Respuesta.
     * 
     * @param tasa
     */
    public void setTasa(double tasa) {
        this.tasa = tasa;
    }


    /**
     * Gets the plazo value for this Respuesta.
     * 
     * @return plazo
     */
    public short getPlazo() {
        return plazo;
    }


    /**
     * Sets the plazo value for this Respuesta.
     * 
     * @param plazo
     */
    public void setPlazo(short plazo) {
        this.plazo = plazo;
    }


    /**
     * Gets the unidadTiempoPlazoCOD value for this Respuesta.
     * 
     * @return unidadTiempoPlazoCOD
     */
    public java.lang.String getUnidadTiempoPlazoCOD() {
        return unidadTiempoPlazoCOD;
    }


    /**
     * Sets the unidadTiempoPlazoCOD value for this Respuesta.
     * 
     * @param unidadTiempoPlazoCOD
     */
    public void setUnidadTiempoPlazoCOD(java.lang.String unidadTiempoPlazoCOD) {
        this.unidadTiempoPlazoCOD = unidadTiempoPlazoCOD;
    }


    /**
     * Gets the formaPagoCOD value for this Respuesta.
     * 
     * @return formaPagoCOD
     */
    public java.lang.String getFormaPagoCOD() {
        return formaPagoCOD;
    }


    /**
     * Sets the formaPagoCOD value for this Respuesta.
     * 
     * @param formaPagoCOD
     */
    public void setFormaPagoCOD(java.lang.String formaPagoCOD) {
        this.formaPagoCOD = formaPagoCOD;
    }


    /**
     * Gets the primerInteres value for this Respuesta.
     * 
     * @return primerInteres
     */
    public double getPrimerInteres() {
        return primerInteres;
    }


    /**
     * Sets the primerInteres value for this Respuesta.
     * 
     * @param primerInteres
     */
    public void setPrimerInteres(double primerInteres) {
        this.primerInteres = primerInteres;
    }


    /**
     * Gets the primeraCuota value for this Respuesta.
     * 
     * @return primeraCuota
     */
    public double getPrimeraCuota() {
        return primeraCuota;
    }


    /**
     * Sets the primeraCuota value for this Respuesta.
     * 
     * @param primeraCuota
     */
    public void setPrimeraCuota(double primeraCuota) {
        this.primeraCuota = primeraCuota;
    }


    /**
     * Gets the tipoGarantiaCOD value for this Respuesta.
     * 
     * @return tipoGarantiaCOD
     */
    public java.lang.String getTipoGarantiaCOD() {
        return tipoGarantiaCOD;
    }


    /**
     * Sets the tipoGarantiaCOD value for this Respuesta.
     * 
     * @param tipoGarantiaCOD
     */
    public void setTipoGarantiaCOD(java.lang.String tipoGarantiaCOD) {
        this.tipoGarantiaCOD = tipoGarantiaCOD;
    }


    /**
     * Gets the destinoEconomicoCOD value for this Respuesta.
     * 
     * @return destinoEconomicoCOD
     */
    public java.lang.String getDestinoEconomicoCOD() {
        return destinoEconomicoCOD;
    }


    /**
     * Sets the destinoEconomicoCOD value for this Respuesta.
     * 
     * @param destinoEconomicoCOD
     */
    public void setDestinoEconomicoCOD(java.lang.String destinoEconomicoCOD) {
        this.destinoEconomicoCOD = destinoEconomicoCOD;
    }


    /**
     * Gets the destinoDetalle value for this Respuesta.
     * 
     * @return destinoDetalle
     */
    public java.lang.String getDestinoDetalle() {
        return destinoDetalle;
    }


    /**
     * Sets the destinoDetalle value for this Respuesta.
     * 
     * @param destinoDetalle
     */
    public void setDestinoDetalle(java.lang.String destinoDetalle) {
        this.destinoDetalle = destinoDetalle;
    }


    /**
     * Gets the cuotaCreditoVigente value for this Respuesta.
     * 
     * @return cuotaCreditoVigente
     */
    public double getCuotaCreditoVigente() {
        return cuotaCreditoVigente;
    }


    /**
     * Sets the cuotaCreditoVigente value for this Respuesta.
     * 
     * @param cuotaCreditoVigente
     */
    public void setCuotaCreditoVigente(double cuotaCreditoVigente) {
        this.cuotaCreditoVigente = cuotaCreditoVigente;
    }


    /**
     * Gets the decisionCOD value for this Respuesta.
     * 
     * @return decisionCOD
     */
    public java.lang.String getDecisionCOD() {
        return decisionCOD;
    }


    /**
     * Sets the decisionCOD value for this Respuesta.
     * 
     * @param decisionCOD
     */
    public void setDecisionCOD(java.lang.String decisionCOD) {
        this.decisionCOD = decisionCOD;
    }


    /**
     * Gets the observacion value for this Respuesta.
     * 
     * @return observacion
     */
    public java.lang.String getObservacion() {
        return observacion;
    }


    /**
     * Sets the observacion value for this Respuesta.
     * 
     * @param observacion
     */
    public void setObservacion(java.lang.String observacion) {
        this.observacion = observacion;
    }


    /**
     * Gets the IVA value for this Respuesta.
     * 
     * @return IVA
     */
    public double getIVA() {
        return IVA;
    }


    /**
     * Sets the IVA value for this Respuesta.
     * 
     * @param IVA
     */
    public void setIVA(double IVA) {
        this.IVA = IVA;
    }


    /**
     * Gets the periodoGracia value for this Respuesta.
     * 
     * @return periodoGracia
     */
    public java.lang.Integer getPeriodoGracia() {
        return periodoGracia;
    }


    /**
     * Sets the periodoGracia value for this Respuesta.
     * 
     * @param periodoGracia
     */
    public void setPeriodoGracia(java.lang.Integer periodoGracia) {
        this.periodoGracia = periodoGracia;
    }


    /**
     * Gets the interesesAmortizacion value for this Respuesta.
     * 
     * @return interesesAmortizacion
     */
    public java.lang.Boolean getInteresesAmortizacion() {
        return interesesAmortizacion;
    }


    /**
     * Sets the interesesAmortizacion value for this Respuesta.
     * 
     * @param interesesAmortizacion
     */
    public void setInteresesAmortizacion(java.lang.Boolean interesesAmortizacion) {
        this.interesesAmortizacion = interesesAmortizacion;
    }


    /**
     * Gets the usuarioIDSolicitud value for this Respuesta.
     * 
     * @return usuarioIDSolicitud
     */
    public short getUsuarioIDSolicitud() {
        return usuarioIDSolicitud;
    }


    /**
     * Sets the usuarioIDSolicitud value for this Respuesta.
     * 
     * @param usuarioIDSolicitud
     */
    public void setUsuarioIDSolicitud(short usuarioIDSolicitud) {
        this.usuarioIDSolicitud = usuarioIDSolicitud;
    }


    /**
     * Gets the identificacionSolicitud value for this Respuesta.
     * 
     * @return identificacionSolicitud
     */
    public java.lang.String getIdentificacionSolicitud() {
        return identificacionSolicitud;
    }


    /**
     * Sets the identificacionSolicitud value for this Respuesta.
     * 
     * @param identificacionSolicitud
     */
    public void setIdentificacionSolicitud(java.lang.String identificacionSolicitud) {
        this.identificacionSolicitud = identificacionSolicitud;
    }


    /**
     * Gets the personaID value for this Respuesta.
     * 
     * @return personaID
     */
    public int getPersonaID() {
        return personaID;
    }


    /**
     * Sets the personaID value for this Respuesta.
     * 
     * @param personaID
     */
    public void setPersonaID(int personaID) {
        this.personaID = personaID;
    }


    /**
     * Gets the fechaSolicitud value for this Respuesta.
     * 
     * @return fechaSolicitud
     */
    public java.util.Calendar getFechaSolicitud() {
        return fechaSolicitud;
    }


    /**
     * Sets the fechaSolicitud value for this Respuesta.
     * 
     * @param fechaSolicitud
     */
    public void setFechaSolicitud(java.util.Calendar fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }


    /**
     * Gets the relacionCOD value for this Respuesta.
     * 
     * @return relacionCOD
     */
    public java.lang.String getRelacionCOD() {
        return relacionCOD;
    }


    /**
     * Sets the relacionCOD value for this Respuesta.
     * 
     * @param relacionCOD
     */
    public void setRelacionCOD(java.lang.String relacionCOD) {
        this.relacionCOD = relacionCOD;
    }


    /**
     * Gets the identificacion value for this Respuesta.
     * 
     * @return identificacion
     */
    public java.lang.String getIdentificacion() {
        return identificacion;
    }


    /**
     * Sets the identificacion value for this Respuesta.
     * 
     * @param identificacion
     */
    public void setIdentificacion(java.lang.String identificacion) {
        this.identificacion = identificacion;
    }


    /**
     * Gets the identificacionConyuge value for this Respuesta.
     * 
     * @return identificacionConyuge
     */
    public java.lang.String getIdentificacionConyuge() {
        return identificacionConyuge;
    }


    /**
     * Sets the identificacionConyuge value for this Respuesta.
     * 
     * @param identificacionConyuge
     */
    public void setIdentificacionConyuge(java.lang.String identificacionConyuge) {
        this.identificacionConyuge = identificacionConyuge;
    }


    /**
     * Gets the tipoPersonaCOD value for this Respuesta.
     * 
     * @return tipoPersonaCOD
     */
    public java.lang.String getTipoPersonaCOD() {
        return tipoPersonaCOD;
    }


    /**
     * Sets the tipoPersonaCOD value for this Respuesta.
     * 
     * @param tipoPersonaCOD
     */
    public void setTipoPersonaCOD(java.lang.String tipoPersonaCOD) {
        this.tipoPersonaCOD = tipoPersonaCOD;
    }


    /**
     * Gets the tipoIdentificacionCOD value for this Respuesta.
     * 
     * @return tipoIdentificacionCOD
     */
    public java.lang.String getTipoIdentificacionCOD() {
        return tipoIdentificacionCOD;
    }


    /**
     * Sets the tipoIdentificacionCOD value for this Respuesta.
     * 
     * @param tipoIdentificacionCOD
     */
    public void setTipoIdentificacionCOD(java.lang.String tipoIdentificacionCOD) {
        this.tipoIdentificacionCOD = tipoIdentificacionCOD;
    }


    /**
     * Gets the apellidoPaterno value for this Respuesta.
     * 
     * @return apellidoPaterno
     */
    public java.lang.String getApellidoPaterno() {
        return apellidoPaterno;
    }


    /**
     * Sets the apellidoPaterno value for this Respuesta.
     * 
     * @param apellidoPaterno
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }


    /**
     * Gets the apellidoMaterno value for this Respuesta.
     * 
     * @return apellidoMaterno
     */
    public java.lang.String getApellidoMaterno() {
        return apellidoMaterno;
    }


    /**
     * Sets the apellidoMaterno value for this Respuesta.
     * 
     * @param apellidoMaterno
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }


    /**
     * Gets the nombres value for this Respuesta.
     * 
     * @return nombres
     */
    public java.lang.String getNombres() {
        return nombres;
    }


    /**
     * Sets the nombres value for this Respuesta.
     * 
     * @param nombres
     */
    public void setNombres(java.lang.String nombres) {
        this.nombres = nombres;
    }


    /**
     * Gets the fechaNacimiento value for this Respuesta.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this Respuesta.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the estadoCivilCOD value for this Respuesta.
     * 
     * @return estadoCivilCOD
     */
    public java.lang.String getEstadoCivilCOD() {
        return estadoCivilCOD;
    }


    /**
     * Sets the estadoCivilCOD value for this Respuesta.
     * 
     * @param estadoCivilCOD
     */
    public void setEstadoCivilCOD(java.lang.String estadoCivilCOD) {
        this.estadoCivilCOD = estadoCivilCOD;
    }


    /**
     * Gets the sexoCOD value for this Respuesta.
     * 
     * @return sexoCOD
     */
    public java.lang.String getSexoCOD() {
        return sexoCOD;
    }


    /**
     * Sets the sexoCOD value for this Respuesta.
     * 
     * @param sexoCOD
     */
    public void setSexoCOD(java.lang.String sexoCOD) {
        this.sexoCOD = sexoCOD;
    }


    /**
     * Gets the numeroCarga value for this Respuesta.
     * 
     * @return numeroCarga
     */
    public java.lang.Short getNumeroCarga() {
        return numeroCarga;
    }


    /**
     * Sets the numeroCarga value for this Respuesta.
     * 
     * @param numeroCarga
     */
    public void setNumeroCarga(java.lang.Short numeroCarga) {
        this.numeroCarga = numeroCarga;
    }


    /**
     * Gets the separacionBienes value for this Respuesta.
     * 
     * @return separacionBienes
     */
    public boolean isSeparacionBienes() {
        return separacionBienes;
    }


    /**
     * Sets the separacionBienes value for this Respuesta.
     * 
     * @param separacionBienes
     */
    public void setSeparacionBienes(boolean separacionBienes) {
        this.separacionBienes = separacionBienes;
    }


    /**
     * Gets the nacionalidadCOD value for this Respuesta.
     * 
     * @return nacionalidadCOD
     */
    public java.lang.String getNacionalidadCOD() {
        return nacionalidadCOD;
    }


    /**
     * Sets the nacionalidadCOD value for this Respuesta.
     * 
     * @param nacionalidadCOD
     */
    public void setNacionalidadCOD(java.lang.String nacionalidadCOD) {
        this.nacionalidadCOD = nacionalidadCOD;
    }


    /**
     * Gets the nivelEducacionCOD value for this Respuesta.
     * 
     * @return nivelEducacionCOD
     */
    public java.lang.String getNivelEducacionCOD() {
        return nivelEducacionCOD;
    }


    /**
     * Sets the nivelEducacionCOD value for this Respuesta.
     * 
     * @param nivelEducacionCOD
     */
    public void setNivelEducacionCOD(java.lang.String nivelEducacionCOD) {
        this.nivelEducacionCOD = nivelEducacionCOD;
    }


    /**
     * Gets the ocupacionCOD value for this Respuesta.
     * 
     * @return ocupacionCOD
     */
    public java.lang.String getOcupacionCOD() {
        return ocupacionCOD;
    }


    /**
     * Sets the ocupacionCOD value for this Respuesta.
     * 
     * @param ocupacionCOD
     */
    public void setOcupacionCOD(java.lang.String ocupacionCOD) {
        this.ocupacionCOD = ocupacionCOD;
    }


    /**
     * Gets the correo value for this Respuesta.
     * 
     * @return correo
     */
    public java.lang.String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this Respuesta.
     * 
     * @param correo
     */
    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }


    /**
     * Gets the fechaApertura value for this Respuesta.
     * 
     * @return fechaApertura
     */
    public java.util.Calendar getFechaApertura() {
        return fechaApertura;
    }


    /**
     * Sets the fechaApertura value for this Respuesta.
     * 
     * @param fechaApertura
     */
    public void setFechaApertura(java.util.Calendar fechaApertura) {
        this.fechaApertura = fechaApertura;
    }


    /**
     * Gets the localidadCOD value for this Respuesta.
     * 
     * @return localidadCOD
     */
    public java.lang.String getLocalidadCOD() {
        return localidadCOD;
    }


    /**
     * Sets the localidadCOD value for this Respuesta.
     * 
     * @param localidadCOD
     */
    public void setLocalidadCOD(java.lang.String localidadCOD) {
        this.localidadCOD = localidadCOD;
    }


    /**
     * Gets the direccion value for this Respuesta.
     * 
     * @return direccion
     */
    public java.lang.String getDireccion() {
        return direccion;
    }


    /**
     * Sets the direccion value for this Respuesta.
     * 
     * @param direccion
     */
    public void setDireccion(java.lang.String direccion) {
        this.direccion = direccion;
    }


    /**
     * Gets the tipoViviendaCOD value for this Respuesta.
     * 
     * @return tipoViviendaCOD
     */
    public java.lang.String getTipoViviendaCOD() {
        return tipoViviendaCOD;
    }


    /**
     * Sets the tipoViviendaCOD value for this Respuesta.
     * 
     * @param tipoViviendaCOD
     */
    public void setTipoViviendaCOD(java.lang.String tipoViviendaCOD) {
        this.tipoViviendaCOD = tipoViviendaCOD;
    }


    /**
     * Gets the situacionViviendaCOD value for this Respuesta.
     * 
     * @return situacionViviendaCOD
     */
    public java.lang.String getSituacionViviendaCOD() {
        return situacionViviendaCOD;
    }


    /**
     * Sets the situacionViviendaCOD value for this Respuesta.
     * 
     * @param situacionViviendaCOD
     */
    public void setSituacionViviendaCOD(java.lang.String situacionViviendaCOD) {
        this.situacionViviendaCOD = situacionViviendaCOD;
    }


    /**
     * Gets the viviendaHipotecada value for this Respuesta.
     * 
     * @return viviendaHipotecada
     */
    public boolean isViviendaHipotecada() {
        return viviendaHipotecada;
    }


    /**
     * Sets the viviendaHipotecada value for this Respuesta.
     * 
     * @param viviendaHipotecada
     */
    public void setViviendaHipotecada(boolean viviendaHipotecada) {
        this.viviendaHipotecada = viviendaHipotecada;
    }


    /**
     * Gets the duenoCasa value for this Respuesta.
     * 
     * @return duenoCasa
     */
    public java.lang.String getDuenoCasa() {
        return duenoCasa;
    }


    /**
     * Sets the duenoCasa value for this Respuesta.
     * 
     * @param duenoCasa
     */
    public void setDuenoCasa(java.lang.String duenoCasa) {
        this.duenoCasa = duenoCasa;
    }


    /**
     * Gets the telefonoDuenoCasa value for this Respuesta.
     * 
     * @return telefonoDuenoCasa
     */
    public java.lang.String getTelefonoDuenoCasa() {
        return telefonoDuenoCasa;
    }


    /**
     * Sets the telefonoDuenoCasa value for this Respuesta.
     * 
     * @param telefonoDuenoCasa
     */
    public void setTelefonoDuenoCasa(java.lang.String telefonoDuenoCasa) {
        this.telefonoDuenoCasa = telefonoDuenoCasa;
    }


    /**
     * Gets the tiempoViviendaActual value for this Respuesta.
     * 
     * @return tiempoViviendaActual
     */
    public java.lang.Short getTiempoViviendaActual() {
        return tiempoViviendaActual;
    }


    /**
     * Sets the tiempoViviendaActual value for this Respuesta.
     * 
     * @param tiempoViviendaActual
     */
    public void setTiempoViviendaActual(java.lang.Short tiempoViviendaActual) {
        this.tiempoViviendaActual = tiempoViviendaActual;
    }


    /**
     * Gets the unidadTiempoViviendaActualCOD value for this Respuesta.
     * 
     * @return unidadTiempoViviendaActualCOD
     */
    public java.lang.String getUnidadTiempoViviendaActualCOD() {
        return unidadTiempoViviendaActualCOD;
    }


    /**
     * Sets the unidadTiempoViviendaActualCOD value for this Respuesta.
     * 
     * @param unidadTiempoViviendaActualCOD
     */
    public void setUnidadTiempoViviendaActualCOD(java.lang.String unidadTiempoViviendaActualCOD) {
        this.unidadTiempoViviendaActualCOD = unidadTiempoViviendaActualCOD;
    }


    /**
     * Gets the referenciaUbicacion value for this Respuesta.
     * 
     * @return referenciaUbicacion
     */
    public java.lang.String getReferenciaUbicacion() {
        return referenciaUbicacion;
    }


    /**
     * Sets the referenciaUbicacion value for this Respuesta.
     * 
     * @param referenciaUbicacion
     */
    public void setReferenciaUbicacion(java.lang.String referenciaUbicacion) {
        this.referenciaUbicacion = referenciaUbicacion;
    }


    /**
     * Gets the tiempoViviendaAnterior value for this Respuesta.
     * 
     * @return tiempoViviendaAnterior
     */
    public java.lang.Short getTiempoViviendaAnterior() {
        return tiempoViviendaAnterior;
    }


    /**
     * Sets the tiempoViviendaAnterior value for this Respuesta.
     * 
     * @param tiempoViviendaAnterior
     */
    public void setTiempoViviendaAnterior(java.lang.Short tiempoViviendaAnterior) {
        this.tiempoViviendaAnterior = tiempoViviendaAnterior;
    }


    /**
     * Gets the unidadTiempoViviendaAnteriorCOD value for this Respuesta.
     * 
     * @return unidadTiempoViviendaAnteriorCOD
     */
    public java.lang.String getUnidadTiempoViviendaAnteriorCOD() {
        return unidadTiempoViviendaAnteriorCOD;
    }


    /**
     * Sets the unidadTiempoViviendaAnteriorCOD value for this Respuesta.
     * 
     * @param unidadTiempoViviendaAnteriorCOD
     */
    public void setUnidadTiempoViviendaAnteriorCOD(java.lang.String unidadTiempoViviendaAnteriorCOD) {
        this.unidadTiempoViviendaAnteriorCOD = unidadTiempoViviendaAnteriorCOD;
    }


    /**
     * Gets the telefonoDomicilio value for this Respuesta.
     * 
     * @return telefonoDomicilio
     */
    public java.lang.String getTelefonoDomicilio() {
        return telefonoDomicilio;
    }


    /**
     * Sets the telefonoDomicilio value for this Respuesta.
     * 
     * @param telefonoDomicilio
     */
    public void setTelefonoDomicilio(java.lang.String telefonoDomicilio) {
        this.telefonoDomicilio = telefonoDomicilio;
    }


    /**
     * Gets the telefonoCelular value for this Respuesta.
     * 
     * @return telefonoCelular
     */
    public java.lang.String getTelefonoCelular() {
        return telefonoCelular;
    }


    /**
     * Sets the telefonoCelular value for this Respuesta.
     * 
     * @param telefonoCelular
     */
    public void setTelefonoCelular(java.lang.String telefonoCelular) {
        this.telefonoCelular = telefonoCelular;
    }


    /**
     * Gets the socio value for this Respuesta.
     * 
     * @return socio
     */
    public Persona getSocio() {
        return socio;
    }


    /**
     * Sets the socio value for this Respuesta.
     * 
     * @param socio
     */
    public void setSocio(Persona socio) {
        this.socio = socio;
    }


    /**
     * Gets the identificacionSocio value for this Respuesta.
     * 
     * @return identificacionSocio
     */
    public java.lang.String getIdentificacionSocio() {
        return identificacionSocio;
    }


    /**
     * Sets the identificacionSocio value for this Respuesta.
     * 
     * @param identificacionSocio
     */
    public void setIdentificacionSocio(java.lang.String identificacionSocio) {
        this.identificacionSocio = identificacionSocio;
    }


    /**
     * Gets the garante value for this Respuesta.
     * 
     * @return garante
     */
    public Persona getGarante() {
        return garante;
    }


    /**
     * Sets the garante value for this Respuesta.
     * 
     * @param garante
     */
    public void setGarante(Persona garante) {
        this.garante = garante;
    }


    /**
     * Gets the identificacionGarante value for this Respuesta.
     * 
     * @return identificacionGarante
     */
    public java.lang.String getIdentificacionGarante() {
        return identificacionGarante;
    }


    /**
     * Sets the identificacionGarante value for this Respuesta.
     * 
     * @param identificacionGarante
     */
    public void setIdentificacionGarante(java.lang.String identificacionGarante) {
        this.identificacionGarante = identificacionGarante;
    }


    /**
     * Gets the conyugeGarante value for this Respuesta.
     * 
     * @return conyugeGarante
     */
    public Persona getConyugeGarante() {
        return conyugeGarante;
    }


    /**
     * Sets the conyugeGarante value for this Respuesta.
     * 
     * @param conyugeGarante
     */
    public void setConyugeGarante(Persona conyugeGarante) {
        this.conyugeGarante = conyugeGarante;
    }


    /**
     * Gets the conyugeSocio value for this Respuesta.
     * 
     * @return conyugeSocio
     */
    public Persona getConyugeSocio() {
        return conyugeSocio;
    }


    /**
     * Sets the conyugeSocio value for this Respuesta.
     * 
     * @param conyugeSocio
     */
    public void setConyugeSocio(Persona conyugeSocio) {
        this.conyugeSocio = conyugeSocio;
    }


    /**
     * Gets the identificacionInformacionNegocio value for this Respuesta.
     * 
     * @return identificacionInformacionNegocio
     */
    public java.lang.String getIdentificacionInformacionNegocio() {
        return identificacionInformacionNegocio;
    }


    /**
     * Sets the identificacionInformacionNegocio value for this Respuesta.
     * 
     * @param identificacionInformacionNegocio
     */
    public void setIdentificacionInformacionNegocio(java.lang.String identificacionInformacionNegocio) {
        this.identificacionInformacionNegocio = identificacionInformacionNegocio;
    }


    /**
     * Gets the nombreInformacionNegocio value for this Respuesta.
     * 
     * @return nombreInformacionNegocio
     */
    public java.lang.String getNombreInformacionNegocio() {
        return nombreInformacionNegocio;
    }


    /**
     * Sets the nombreInformacionNegocio value for this Respuesta.
     * 
     * @param nombreInformacionNegocio
     */
    public void setNombreInformacionNegocio(java.lang.String nombreInformacionNegocio) {
        this.nombreInformacionNegocio = nombreInformacionNegocio;
    }


    /**
     * Gets the sectorEconomicoCOD value for this Respuesta.
     * 
     * @return sectorEconomicoCOD
     */
    public java.lang.String getSectorEconomicoCOD() {
        return sectorEconomicoCOD;
    }


    /**
     * Sets the sectorEconomicoCOD value for this Respuesta.
     * 
     * @param sectorEconomicoCOD
     */
    public void setSectorEconomicoCOD(java.lang.String sectorEconomicoCOD) {
        this.sectorEconomicoCOD = sectorEconomicoCOD;
    }


    /**
     * Gets the descripcion value for this Respuesta.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this Respuesta.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the antiguedadNegocio value for this Respuesta.
     * 
     * @return antiguedadNegocio
     */
    public java.lang.Integer getAntiguedadNegocio() {
        return antiguedadNegocio;
    }


    /**
     * Sets the antiguedadNegocio value for this Respuesta.
     * 
     * @param antiguedadNegocio
     */
    public void setAntiguedadNegocio(java.lang.Integer antiguedadNegocio) {
        this.antiguedadNegocio = antiguedadNegocio;
    }


    /**
     * Gets the unidadAntiguedadNegocioCOD value for this Respuesta.
     * 
     * @return unidadAntiguedadNegocioCOD
     */
    public java.lang.String getUnidadAntiguedadNegocioCOD() {
        return unidadAntiguedadNegocioCOD;
    }


    /**
     * Sets the unidadAntiguedadNegocioCOD value for this Respuesta.
     * 
     * @param unidadAntiguedadNegocioCOD
     */
    public void setUnidadAntiguedadNegocioCOD(java.lang.String unidadAntiguedadNegocioCOD) {
        this.unidadAntiguedadNegocioCOD = unidadAntiguedadNegocioCOD;
    }


    /**
     * Gets the numeroEmpleados value for this Respuesta.
     * 
     * @return numeroEmpleados
     */
    public java.lang.Short getNumeroEmpleados() {
        return numeroEmpleados;
    }


    /**
     * Sets the numeroEmpleados value for this Respuesta.
     * 
     * @param numeroEmpleados
     */
    public void setNumeroEmpleados(java.lang.Short numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }


    /**
     * Gets the direccionInformacionNegocio value for this Respuesta.
     * 
     * @return direccionInformacionNegocio
     */
    public java.lang.String getDireccionInformacionNegocio() {
        return direccionInformacionNegocio;
    }


    /**
     * Sets the direccionInformacionNegocio value for this Respuesta.
     * 
     * @param direccionInformacionNegocio
     */
    public void setDireccionInformacionNegocio(java.lang.String direccionInformacionNegocio) {
        this.direccionInformacionNegocio = direccionInformacionNegocio;
    }


    /**
     * Gets the referencia value for this Respuesta.
     * 
     * @return referencia
     */
    public java.lang.String getReferencia() {
        return referencia;
    }


    /**
     * Sets the referencia value for this Respuesta.
     * 
     * @param referencia
     */
    public void setReferencia(java.lang.String referencia) {
        this.referencia = referencia;
    }


    /**
     * Gets the telefono value for this Respuesta.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this Respuesta.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the direccionTrabajoConyuge value for this Respuesta.
     * 
     * @return direccionTrabajoConyuge
     */
    public java.lang.String getDireccionTrabajoConyuge() {
        return direccionTrabajoConyuge;
    }


    /**
     * Sets the direccionTrabajoConyuge value for this Respuesta.
     * 
     * @param direccionTrabajoConyuge
     */
    public void setDireccionTrabajoConyuge(java.lang.String direccionTrabajoConyuge) {
        this.direccionTrabajoConyuge = direccionTrabajoConyuge;
    }


    /**
     * Gets the telefonoTrabajoConyuge value for this Respuesta.
     * 
     * @return telefonoTrabajoConyuge
     */
    public java.lang.String getTelefonoTrabajoConyuge() {
        return telefonoTrabajoConyuge;
    }


    /**
     * Sets the telefonoTrabajoConyuge value for this Respuesta.
     * 
     * @param telefonoTrabajoConyuge
     */
    public void setTelefonoTrabajoConyuge(java.lang.String telefonoTrabajoConyuge) {
        this.telefonoTrabajoConyuge = telefonoTrabajoConyuge;
    }


    /**
     * Gets the antiguedadNegocioMismoLugar value for this Respuesta.
     * 
     * @return antiguedadNegocioMismoLugar
     */
    public java.lang.Integer getAntiguedadNegocioMismoLugar() {
        return antiguedadNegocioMismoLugar;
    }


    /**
     * Sets the antiguedadNegocioMismoLugar value for this Respuesta.
     * 
     * @param antiguedadNegocioMismoLugar
     */
    public void setAntiguedadNegocioMismoLugar(java.lang.Integer antiguedadNegocioMismoLugar) {
        this.antiguedadNegocioMismoLugar = antiguedadNegocioMismoLugar;
    }


    /**
     * Gets the unidadAntiguedadNegocioMismoLugarCOD value for this Respuesta.
     * 
     * @return unidadAntiguedadNegocioMismoLugarCOD
     */
    public java.lang.String getUnidadAntiguedadNegocioMismoLugarCOD() {
        return unidadAntiguedadNegocioMismoLugarCOD;
    }


    /**
     * Sets the unidadAntiguedadNegocioMismoLugarCOD value for this Respuesta.
     * 
     * @param unidadAntiguedadNegocioMismoLugarCOD
     */
    public void setUnidadAntiguedadNegocioMismoLugarCOD(java.lang.String unidadAntiguedadNegocioMismoLugarCOD) {
        this.unidadAntiguedadNegocioMismoLugarCOD = unidadAntiguedadNegocioMismoLugarCOD;
    }


    /**
     * Gets the tipoLocalCOD value for this Respuesta.
     * 
     * @return tipoLocalCOD
     */
    public java.lang.String getTipoLocalCOD() {
        return tipoLocalCOD;
    }


    /**
     * Sets the tipoLocalCOD value for this Respuesta.
     * 
     * @param tipoLocalCOD
     */
    public void setTipoLocalCOD(java.lang.String tipoLocalCOD) {
        this.tipoLocalCOD = tipoLocalCOD;
    }


    /**
     * Gets the comercio value for this Respuesta.
     * 
     * @return comercio
     */
    public boolean isComercio() {
        return comercio;
    }


    /**
     * Sets the comercio value for this Respuesta.
     * 
     * @param comercio
     */
    public void setComercio(boolean comercio) {
        this.comercio = comercio;
    }


    /**
     * Gets the ingreso value for this Respuesta.
     * 
     * @return ingreso
     */
    public java.util.Calendar getIngreso() {
        return ingreso;
    }


    /**
     * Sets the ingreso value for this Respuesta.
     * 
     * @param ingreso
     */
    public void setIngreso(java.util.Calendar ingreso) {
        this.ingreso = ingreso;
    }


    /**
     * Gets the estado value for this Respuesta.
     * 
     * @return estado
     */
    public java.lang.String getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this Respuesta.
     * 
     * @param estado
     */
    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }


    /**
     * Gets the latitud value for this Respuesta.
     * 
     * @return latitud
     */
    public double getLatitud() {
        return latitud;
    }


    /**
     * Sets the latitud value for this Respuesta.
     * 
     * @param latitud
     */
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }


    /**
     * Gets the longitud value for this Respuesta.
     * 
     * @return longitud
     */
    public double getLongitud() {
        return longitud;
    }


    /**
     * Sets the longitud value for this Respuesta.
     * 
     * @param longitud
     */
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }


    /**
     * Gets the detalledeCuentasSocio value for this Respuesta.
     * 
     * @return detalledeCuentasSocio
     */
    public DetalleDeCuentas[] getDetalledeCuentasSocio() {
        return detalledeCuentasSocio;
    }


    /**
     * Sets the detalledeCuentasSocio value for this Respuesta.
     * 
     * @param detalledeCuentasSocio
     */
    public void setDetalledeCuentasSocio(DetalleDeCuentas[] detalledeCuentasSocio) {
        this.detalledeCuentasSocio = detalledeCuentasSocio;
    }


    /**
     * Gets the detalledeCuentasGarante value for this Respuesta.
     * 
     * @return detalledeCuentasGarante
     */
    public DetalleDeCuentas[] getDetalledeCuentasGarante() {
        return detalledeCuentasGarante;
    }


    /**
     * Sets the detalledeCuentasGarante value for this Respuesta.
     * 
     * @param detalledeCuentasGarante
     */
    public void setDetalledeCuentasGarante(DetalleDeCuentas[] detalledeCuentasGarante) {
        this.detalledeCuentasGarante = detalledeCuentasGarante;
    }


    /**
     * Gets the totalValorPatrimonioACTIVOSocio value for this Respuesta.
     * 
     * @return totalValorPatrimonioACTIVOSocio
     */
    public double getTotalValorPatrimonioACTIVOSocio() {
        return totalValorPatrimonioACTIVOSocio;
    }


    /**
     * Sets the totalValorPatrimonioACTIVOSocio value for this Respuesta.
     * 
     * @param totalValorPatrimonioACTIVOSocio
     */
    public void setTotalValorPatrimonioACTIVOSocio(double totalValorPatrimonioACTIVOSocio) {
        this.totalValorPatrimonioACTIVOSocio = totalValorPatrimonioACTIVOSocio;
    }


    /**
     * Gets the totalValorPatrimonioPASIVOSocio value for this Respuesta.
     * 
     * @return totalValorPatrimonioPASIVOSocio
     */
    public double getTotalValorPatrimonioPASIVOSocio() {
        return totalValorPatrimonioPASIVOSocio;
    }


    /**
     * Sets the totalValorPatrimonioPASIVOSocio value for this Respuesta.
     * 
     * @param totalValorPatrimonioPASIVOSocio
     */
    public void setTotalValorPatrimonioPASIVOSocio(double totalValorPatrimonioPASIVOSocio) {
        this.totalValorPatrimonioPASIVOSocio = totalValorPatrimonioPASIVOSocio;
    }


    /**
     * Gets the totalValorDetalleDeCuentasINGRESOSSocio value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasINGRESOSSocio
     */
    public double getTotalValorDetalleDeCuentasINGRESOSSocio() {
        return totalValorDetalleDeCuentasINGRESOSSocio;
    }


    /**
     * Sets the totalValorDetalleDeCuentasINGRESOSSocio value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasINGRESOSSocio
     */
    public void setTotalValorDetalleDeCuentasINGRESOSSocio(double totalValorDetalleDeCuentasINGRESOSSocio) {
        this.totalValorDetalleDeCuentasINGRESOSSocio = totalValorDetalleDeCuentasINGRESOSSocio;
    }


    /**
     * Gets the totalValorDetalleDeCuentasEGRESOSSocio value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasEGRESOSSocio
     */
    public double getTotalValorDetalleDeCuentasEGRESOSSocio() {
        return totalValorDetalleDeCuentasEGRESOSSocio;
    }


    /**
     * Sets the totalValorDetalleDeCuentasEGRESOSSocio value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasEGRESOSSocio
     */
    public void setTotalValorDetalleDeCuentasEGRESOSSocio(double totalValorDetalleDeCuentasEGRESOSSocio) {
        this.totalValorDetalleDeCuentasEGRESOSSocio = totalValorDetalleDeCuentasEGRESOSSocio;
    }


    /**
     * Gets the totalValorPatrimonioACTIVOGarante value for this Respuesta.
     * 
     * @return totalValorPatrimonioACTIVOGarante
     */
    public double getTotalValorPatrimonioACTIVOGarante() {
        return totalValorPatrimonioACTIVOGarante;
    }


    /**
     * Sets the totalValorPatrimonioACTIVOGarante value for this Respuesta.
     * 
     * @param totalValorPatrimonioACTIVOGarante
     */
    public void setTotalValorPatrimonioACTIVOGarante(double totalValorPatrimonioACTIVOGarante) {
        this.totalValorPatrimonioACTIVOGarante = totalValorPatrimonioACTIVOGarante;
    }


    /**
     * Gets the totalValorPatrimonioPASIVOGarante value for this Respuesta.
     * 
     * @return totalValorPatrimonioPASIVOGarante
     */
    public double getTotalValorPatrimonioPASIVOGarante() {
        return totalValorPatrimonioPASIVOGarante;
    }


    /**
     * Sets the totalValorPatrimonioPASIVOGarante value for this Respuesta.
     * 
     * @param totalValorPatrimonioPASIVOGarante
     */
    public void setTotalValorPatrimonioPASIVOGarante(double totalValorPatrimonioPASIVOGarante) {
        this.totalValorPatrimonioPASIVOGarante = totalValorPatrimonioPASIVOGarante;
    }


    /**
     * Gets the totalValorDetalleDeCuentasINGRESOSGarante value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasINGRESOSGarante
     */
    public double getTotalValorDetalleDeCuentasINGRESOSGarante() {
        return totalValorDetalleDeCuentasINGRESOSGarante;
    }


    /**
     * Sets the totalValorDetalleDeCuentasINGRESOSGarante value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasINGRESOSGarante
     */
    public void setTotalValorDetalleDeCuentasINGRESOSGarante(double totalValorDetalleDeCuentasINGRESOSGarante) {
        this.totalValorDetalleDeCuentasINGRESOSGarante = totalValorDetalleDeCuentasINGRESOSGarante;
    }


    /**
     * Gets the totalValorDetalleDeCuentasEGRESOSGarante value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasEGRESOSGarante
     */
    public double getTotalValorDetalleDeCuentasEGRESOSGarante() {
        return totalValorDetalleDeCuentasEGRESOSGarante;
    }


    /**
     * Sets the totalValorDetalleDeCuentasEGRESOSGarante value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasEGRESOSGarante
     */
    public void setTotalValorDetalleDeCuentasEGRESOSGarante(double totalValorDetalleDeCuentasEGRESOSGarante) {
        this.totalValorDetalleDeCuentasEGRESOSGarante = totalValorDetalleDeCuentasEGRESOSGarante;
    }


    /**
     * Gets the detallePatrimonialSocio value for this Respuesta.
     * 
     * @return detallePatrimonialSocio
     */
    public DetallePatrimonial[] getDetallePatrimonialSocio() {
        return detallePatrimonialSocio;
    }


    /**
     * Sets the detallePatrimonialSocio value for this Respuesta.
     * 
     * @param detallePatrimonialSocio
     */
    public void setDetallePatrimonialSocio(DetallePatrimonial[] detallePatrimonialSocio) {
        this.detallePatrimonialSocio = detallePatrimonialSocio;
    }


    /**
     * Gets the totalValorDetallePatrimonial value for this Respuesta.
     * 
     * @return totalValorDetallePatrimonial
     */
    public double getTotalValorDetallePatrimonial() {
        return totalValorDetallePatrimonial;
    }


    /**
     * Sets the totalValorDetallePatrimonial value for this Respuesta.
     * 
     * @param totalValorDetallePatrimonial
     */
    public void setTotalValorDetallePatrimonial(double totalValorDetallePatrimonial) {
        this.totalValorDetallePatrimonial = totalValorDetallePatrimonial;
    }


    /**
     * Gets the detallePatrominialGarante value for this Respuesta.
     * 
     * @return detallePatrominialGarante
     */
    public DetallePatrimonial[] getDetallePatrominialGarante() {
        return detallePatrominialGarante;
    }


    /**
     * Sets the detallePatrominialGarante value for this Respuesta.
     * 
     * @param detallePatrominialGarante
     */
    public void setDetallePatrominialGarante(DetallePatrimonial[] detallePatrominialGarante) {
        this.detallePatrominialGarante = detallePatrominialGarante;
    }


    /**
     * Gets the totalValorDetallePatrimonialGarante value for this Respuesta.
     * 
     * @return totalValorDetallePatrimonialGarante
     */
    public double getTotalValorDetallePatrimonialGarante() {
        return totalValorDetallePatrimonialGarante;
    }


    /**
     * Sets the totalValorDetallePatrimonialGarante value for this Respuesta.
     * 
     * @param totalValorDetallePatrimonialGarante
     */
    public void setTotalValorDetallePatrimonialGarante(double totalValorDetallePatrimonialGarante) {
        this.totalValorDetallePatrimonialGarante = totalValorDetallePatrimonialGarante;
    }


    /**
     * Gets the garantiasReales value for this Respuesta.
     * 
     * @return garantiasReales
     */
    public GarantiasReales[] getGarantiasReales() {
        return garantiasReales;
    }


    /**
     * Sets the garantiasReales value for this Respuesta.
     * 
     * @param garantiasReales
     */
    public void setGarantiasReales(GarantiasReales[] garantiasReales) {
        this.garantiasReales = garantiasReales;
    }


    /**
     * Gets the referenciasPersonales2 value for this Respuesta.
     * 
     * @return referenciasPersonales2
     */
    public ReferenciasPersonales[] getReferenciasPersonales2() {
        return referenciasPersonales2;
    }


    /**
     * Sets the referenciasPersonales2 value for this Respuesta.
     * 
     * @param referenciasPersonales2
     */
    public void setReferenciasPersonales2(ReferenciasPersonales[] referenciasPersonales2) {
        this.referenciasPersonales2 = referenciasPersonales2;
    }


    /**
     * Gets the referenciasComerciales value for this Respuesta.
     * 
     * @return referenciasComerciales
     */
    public ReferenciasComerciales[] getReferenciasComerciales() {
        return referenciasComerciales;
    }


    /**
     * Sets the referenciasComerciales value for this Respuesta.
     * 
     * @param referenciasComerciales
     */
    public void setReferenciasComerciales(ReferenciasComerciales[] referenciasComerciales) {
        this.referenciasComerciales = referenciasComerciales;
    }


    /**
     * Gets the tipoReferenciaComercialCOD value for this Respuesta.
     * 
     * @return tipoReferenciaComercialCOD
     */
    public java.lang.String getTipoReferenciaComercialCOD() {
        return tipoReferenciaComercialCOD;
    }


    /**
     * Sets the tipoReferenciaComercialCOD value for this Respuesta.
     * 
     * @param tipoReferenciaComercialCOD
     */
    public void setTipoReferenciaComercialCOD(java.lang.String tipoReferenciaComercialCOD) {
        this.tipoReferenciaComercialCOD = tipoReferenciaComercialCOD;
    }


    /**
     * Gets the descripcionRererenciasComerciales value for this Respuesta.
     * 
     * @return descripcionRererenciasComerciales
     */
    public java.lang.String getDescripcionRererenciasComerciales() {
        return descripcionRererenciasComerciales;
    }


    /**
     * Sets the descripcionRererenciasComerciales value for this Respuesta.
     * 
     * @param descripcionRererenciasComerciales
     */
    public void setDescripcionRererenciasComerciales(java.lang.String descripcionRererenciasComerciales) {
        this.descripcionRererenciasComerciales = descripcionRererenciasComerciales;
    }


    /**
     * Gets the valorReferenciasComerciales value for this Respuesta.
     * 
     * @return valorReferenciasComerciales
     */
    public double getValorReferenciasComerciales() {
        return valorReferenciasComerciales;
    }


    /**
     * Sets the valorReferenciasComerciales value for this Respuesta.
     * 
     * @param valorReferenciasComerciales
     */
    public void setValorReferenciasComerciales(double valorReferenciasComerciales) {
        this.valorReferenciasComerciales = valorReferenciasComerciales;
    }


    /**
     * Gets the telefonoReferenciasComerciales value for this Respuesta.
     * 
     * @return telefonoReferenciasComerciales
     */
    public java.lang.String getTelefonoReferenciasComerciales() {
        return telefonoReferenciasComerciales;
    }


    /**
     * Sets the telefonoReferenciasComerciales value for this Respuesta.
     * 
     * @param telefonoReferenciasComerciales
     */
    public void setTelefonoReferenciasComerciales(java.lang.String telefonoReferenciasComerciales) {
        this.telefonoReferenciasComerciales = telefonoReferenciasComerciales;
    }


    /**
     * Gets the observacionReferenciasComerciales value for this Respuesta.
     * 
     * @return observacionReferenciasComerciales
     */
    public java.lang.String getObservacionReferenciasComerciales() {
        return observacionReferenciasComerciales;
    }


    /**
     * Sets the observacionReferenciasComerciales value for this Respuesta.
     * 
     * @param observacionReferenciasComerciales
     */
    public void setObservacionReferenciasComerciales(java.lang.String observacionReferenciasComerciales) {
        this.observacionReferenciasComerciales = observacionReferenciasComerciales;
    }


    /**
     * Gets the patrimonioMontos value for this Respuesta.
     * 
     * @return patrimonioMontos
     */
    public double getPatrimonioMontos() {
        return patrimonioMontos;
    }


    /**
     * Sets the patrimonioMontos value for this Respuesta.
     * 
     * @param patrimonioMontos
     */
    public void setPatrimonioMontos(double patrimonioMontos) {
        this.patrimonioMontos = patrimonioMontos;
    }


    /**
     * Gets the ventasMontos value for this Respuesta.
     * 
     * @return ventasMontos
     */
    public double getVentasMontos() {
        return ventasMontos;
    }


    /**
     * Sets the ventasMontos value for this Respuesta.
     * 
     * @param ventasMontos
     */
    public void setVentasMontos(double ventasMontos) {
        this.ventasMontos = ventasMontos;
    }


    /**
     * Gets the costototal value for this Respuesta.
     * 
     * @return costototal
     */
    public double getCostototal() {
        return costototal;
    }


    /**
     * Sets the costototal value for this Respuesta.
     * 
     * @param costototal
     */
    public void setCostototal(double costototal) {
        this.costototal = costototal;
    }


    /**
     * Gets the totalIngresosFlujo value for this Respuesta.
     * 
     * @return totalIngresosFlujo
     */
    public double getTotalIngresosFlujo() {
        return totalIngresosFlujo;
    }


    /**
     * Sets the totalIngresosFlujo value for this Respuesta.
     * 
     * @param totalIngresosFlujo
     */
    public void setTotalIngresosFlujo(double totalIngresosFlujo) {
        this.totalIngresosFlujo = totalIngresosFlujo;
    }


    /**
     * Gets the ingresosFamiliar value for this Respuesta.
     * 
     * @return ingresosFamiliar
     */
    public double getIngresosFamiliar() {
        return ingresosFamiliar;
    }


    /**
     * Sets the ingresosFamiliar value for this Respuesta.
     * 
     * @param ingresosFamiliar
     */
    public void setIngresosFamiliar(double ingresosFamiliar) {
        this.ingresosFamiliar = ingresosFamiliar;
    }


    /**
     * Gets the ingresosNegocio value for this Respuesta.
     * 
     * @return ingresosNegocio
     */
    public double getIngresosNegocio() {
        return ingresosNegocio;
    }


    /**
     * Sets the ingresosNegocio value for this Respuesta.
     * 
     * @param ingresosNegocio
     */
    public void setIngresosNegocio(double ingresosNegocio) {
        this.ingresosNegocio = ingresosNegocio;
    }


    /**
     * Gets the totalEgresos value for this Respuesta.
     * 
     * @return totalEgresos
     */
    public double getTotalEgresos() {
        return totalEgresos;
    }


    /**
     * Sets the totalEgresos value for this Respuesta.
     * 
     * @param totalEgresos
     */
    public void setTotalEgresos(double totalEgresos) {
        this.totalEgresos = totalEgresos;
    }


    /**
     * Gets the egresosFamiliar value for this Respuesta.
     * 
     * @return egresosFamiliar
     */
    public double getEgresosFamiliar() {
        return egresosFamiliar;
    }


    /**
     * Sets the egresosFamiliar value for this Respuesta.
     * 
     * @param egresosFamiliar
     */
    public void setEgresosFamiliar(double egresosFamiliar) {
        this.egresosFamiliar = egresosFamiliar;
    }


    /**
     * Gets the egresosNegocio value for this Respuesta.
     * 
     * @return egresosNegocio
     */
    public double getEgresosNegocio() {
        return egresosNegocio;
    }


    /**
     * Sets the egresosNegocio value for this Respuesta.
     * 
     * @param egresosNegocio
     */
    public void setEgresosNegocio(double egresosNegocio) {
        this.egresosNegocio = egresosNegocio;
    }


    /**
     * Gets the disponibilidadAntesCredito value for this Respuesta.
     * 
     * @return disponibilidadAntesCredito
     */
    public double getDisponibilidadAntesCredito() {
        return disponibilidadAntesCredito;
    }


    /**
     * Sets the disponibilidadAntesCredito value for this Respuesta.
     * 
     * @param disponibilidadAntesCredito
     */
    public void setDisponibilidadAntesCredito(double disponibilidadAntesCredito) {
        this.disponibilidadAntesCredito = disponibilidadAntesCredito;
    }


    /**
     * Gets the cuoraCredito value for this Respuesta.
     * 
     * @return cuoraCredito
     */
    public double getCuoraCredito() {
        return cuoraCredito;
    }


    /**
     * Sets the cuoraCredito value for this Respuesta.
     * 
     * @param cuoraCredito
     */
    public void setCuoraCredito(double cuoraCredito) {
        this.cuoraCredito = cuoraCredito;
    }


    /**
     * Gets the disponibleNeto value for this Respuesta.
     * 
     * @return disponibleNeto
     */
    public double getDisponibleNeto() {
        return disponibleNeto;
    }


    /**
     * Sets the disponibleNeto value for this Respuesta.
     * 
     * @param disponibleNeto
     */
    public void setDisponibleNeto(double disponibleNeto) {
        this.disponibleNeto = disponibleNeto;
    }


    /**
     * Gets the ventasTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @return ventasTotalesPerdidasYGanancias
     */
    public double getVentasTotalesPerdidasYGanancias() {
        return ventasTotalesPerdidasYGanancias;
    }


    /**
     * Sets the ventasTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @param ventasTotalesPerdidasYGanancias
     */
    public void setVentasTotalesPerdidasYGanancias(double ventasTotalesPerdidasYGanancias) {
        this.ventasTotalesPerdidasYGanancias = ventasTotalesPerdidasYGanancias;
    }


    /**
     * Gets the costosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @return costosTotalesPerdidasYGanancias
     */
    public double getCostosTotalesPerdidasYGanancias() {
        return costosTotalesPerdidasYGanancias;
    }


    /**
     * Sets the costosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @param costosTotalesPerdidasYGanancias
     */
    public void setCostosTotalesPerdidasYGanancias(double costosTotalesPerdidasYGanancias) {
        this.costosTotalesPerdidasYGanancias = costosTotalesPerdidasYGanancias;
    }


    /**
     * Gets the gastosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @return gastosTotalesPerdidasYGanancias
     */
    public double getGastosTotalesPerdidasYGanancias() {
        return gastosTotalesPerdidasYGanancias;
    }


    /**
     * Sets the gastosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @param gastosTotalesPerdidasYGanancias
     */
    public void setGastosTotalesPerdidasYGanancias(double gastosTotalesPerdidasYGanancias) {
        this.gastosTotalesPerdidasYGanancias = gastosTotalesPerdidasYGanancias;
    }


    /**
     * Gets the gastosFinancierosPerdidasYGanancias value for this Respuesta.
     * 
     * @return gastosFinancierosPerdidasYGanancias
     */
    public double getGastosFinancierosPerdidasYGanancias() {
        return gastosFinancierosPerdidasYGanancias;
    }


    /**
     * Sets the gastosFinancierosPerdidasYGanancias value for this Respuesta.
     * 
     * @param gastosFinancierosPerdidasYGanancias
     */
    public void setGastosFinancierosPerdidasYGanancias(double gastosFinancierosPerdidasYGanancias) {
        this.gastosFinancierosPerdidasYGanancias = gastosFinancierosPerdidasYGanancias;
    }


    /**
     * Gets the utilidadNegocioTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @return utilidadNegocioTotalPerdidasYGanancias
     */
    public double getUtilidadNegocioTotalPerdidasYGanancias() {
        return utilidadNegocioTotalPerdidasYGanancias;
    }


    /**
     * Sets the utilidadNegocioTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @param utilidadNegocioTotalPerdidasYGanancias
     */
    public void setUtilidadNegocioTotalPerdidasYGanancias(double utilidadNegocioTotalPerdidasYGanancias) {
        this.utilidadNegocioTotalPerdidasYGanancias = utilidadNegocioTotalPerdidasYGanancias;
    }


    /**
     * Gets the egresosNegocioPerdidasYGanancias value for this Respuesta.
     * 
     * @return egresosNegocioPerdidasYGanancias
     */
    public double getEgresosNegocioPerdidasYGanancias() {
        return egresosNegocioPerdidasYGanancias;
    }


    /**
     * Sets the egresosNegocioPerdidasYGanancias value for this Respuesta.
     * 
     * @param egresosNegocioPerdidasYGanancias
     */
    public void setEgresosNegocioPerdidasYGanancias(double egresosNegocioPerdidasYGanancias) {
        this.egresosNegocioPerdidasYGanancias = egresosNegocioPerdidasYGanancias;
    }


    /**
     * Gets the ingresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @return ingresosFamiliaresTotalPerdidasYGanancias
     */
    public double getIngresosFamiliaresTotalPerdidasYGanancias() {
        return ingresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Sets the ingresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @param ingresosFamiliaresTotalPerdidasYGanancias
     */
    public void setIngresosFamiliaresTotalPerdidasYGanancias(double ingresosFamiliaresTotalPerdidasYGanancias) {
        this.ingresosFamiliaresTotalPerdidasYGanancias = ingresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Gets the egresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @return egresosFamiliaresTotalPerdidasYGanancias
     */
    public double getEgresosFamiliaresTotalPerdidasYGanancias() {
        return egresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Sets the egresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @param egresosFamiliaresTotalPerdidasYGanancias
     */
    public void setEgresosFamiliaresTotalPerdidasYGanancias(double egresosFamiliaresTotalPerdidasYGanancias) {
        this.egresosFamiliaresTotalPerdidasYGanancias = egresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Gets the utilidadNetaPersidasYGanancias value for this Respuesta.
     * 
     * @return utilidadNetaPersidasYGanancias
     */
    public double getUtilidadNetaPersidasYGanancias() {
        return utilidadNetaPersidasYGanancias;
    }


    /**
     * Sets the utilidadNetaPersidasYGanancias value for this Respuesta.
     * 
     * @param utilidadNetaPersidasYGanancias
     */
    public void setUtilidadNetaPersidasYGanancias(double utilidadNetaPersidasYGanancias) {
        this.utilidadNetaPersidasYGanancias = utilidadNetaPersidasYGanancias;
    }


    /**
     * Gets the centralRiesgoSocio value for this Respuesta.
     * 
     * @return centralRiesgoSocio
     */
    public RespuestaCentralRiesgo getCentralRiesgoSocio() {
        return centralRiesgoSocio;
    }


    /**
     * Sets the centralRiesgoSocio value for this Respuesta.
     * 
     * @param centralRiesgoSocio
     */
    public void setCentralRiesgoSocio(RespuestaCentralRiesgo centralRiesgoSocio) {
        this.centralRiesgoSocio = centralRiesgoSocio;
    }


    /**
     * Gets the centralRiesgoConyugeSocio value for this Respuesta.
     * 
     * @return centralRiesgoConyugeSocio
     */
    public RespuestaCentralRiesgo getCentralRiesgoConyugeSocio() {
        return centralRiesgoConyugeSocio;
    }


    /**
     * Sets the centralRiesgoConyugeSocio value for this Respuesta.
     * 
     * @param centralRiesgoConyugeSocio
     */
    public void setCentralRiesgoConyugeSocio(RespuestaCentralRiesgo centralRiesgoConyugeSocio) {
        this.centralRiesgoConyugeSocio = centralRiesgoConyugeSocio;
    }


    /**
     * Gets the centralRiesgoGarante value for this Respuesta.
     * 
     * @return centralRiesgoGarante
     */
    public RespuestaCentralRiesgo getCentralRiesgoGarante() {
        return centralRiesgoGarante;
    }


    /**
     * Sets the centralRiesgoGarante value for this Respuesta.
     * 
     * @param centralRiesgoGarante
     */
    public void setCentralRiesgoGarante(RespuestaCentralRiesgo centralRiesgoGarante) {
        this.centralRiesgoGarante = centralRiesgoGarante;
    }


    /**
     * Gets the centralRiesgoConyugeGarante value for this Respuesta.
     * 
     * @return centralRiesgoConyugeGarante
     */
    public RespuestaCentralRiesgo getCentralRiesgoConyugeGarante() {
        return centralRiesgoConyugeGarante;
    }


    /**
     * Sets the centralRiesgoConyugeGarante value for this Respuesta.
     * 
     * @param centralRiesgoConyugeGarante
     */
    public void setCentralRiesgoConyugeGarante(RespuestaCentralRiesgo centralRiesgoConyugeGarante) {
        this.centralRiesgoConyugeGarante = centralRiesgoConyugeGarante;
    }


    /**
     * Gets the montoTotalEndeudamiento value for this Respuesta.
     * 
     * @return montoTotalEndeudamiento
     */
    public double getMontoTotalEndeudamiento() {
        return montoTotalEndeudamiento;
    }


    /**
     * Sets the montoTotalEndeudamiento value for this Respuesta.
     * 
     * @param montoTotalEndeudamiento
     */
    public void setMontoTotalEndeudamiento(double montoTotalEndeudamiento) {
        this.montoTotalEndeudamiento = montoTotalEndeudamiento;
    }


    /**
     * Gets the totalCarteraVigente value for this Respuesta.
     * 
     * @return totalCarteraVigente
     */
    public double getTotalCarteraVigente() {
        return totalCarteraVigente;
    }


    /**
     * Sets the totalCarteraVigente value for this Respuesta.
     * 
     * @param totalCarteraVigente
     */
    public void setTotalCarteraVigente(double totalCarteraVigente) {
        this.totalCarteraVigente = totalCarteraVigente;
    }


    /**
     * Gets the carteraRiesgo value for this Respuesta.
     * 
     * @return carteraRiesgo
     */
    public double getCarteraRiesgo() {
        return carteraRiesgo;
    }


    /**
     * Sets the carteraRiesgo value for this Respuesta.
     * 
     * @param carteraRiesgo
     */
    public void setCarteraRiesgo(double carteraRiesgo) {
        this.carteraRiesgo = carteraRiesgo;
    }


    /**
     * Gets the calificacionRiesgoCOD value for this Respuesta.
     * 
     * @return calificacionRiesgoCOD
     */
    public java.lang.String getCalificacionRiesgoCOD() {
        return calificacionRiesgoCOD;
    }


    /**
     * Sets the calificacionRiesgoCOD value for this Respuesta.
     * 
     * @param calificacionRiesgoCOD
     */
    public void setCalificacionRiesgoCOD(java.lang.String calificacionRiesgoCOD) {
        this.calificacionRiesgoCOD = calificacionRiesgoCOD;
    }


    /**
     * Gets the castigoDemanda value for this Respuesta.
     * 
     * @return castigoDemanda
     */
    public double getCastigoDemanda() {
        return castigoDemanda;
    }


    /**
     * Sets the castigoDemanda value for this Respuesta.
     * 
     * @param castigoDemanda
     */
    public void setCastigoDemanda(double castigoDemanda) {
        this.castigoDemanda = castigoDemanda;
    }


    /**
     * Gets the peorCalificacion12MesesCOD value for this Respuesta.
     * 
     * @return peorCalificacion12MesesCOD
     */
    public java.lang.String getPeorCalificacion12MesesCOD() {
        return peorCalificacion12MesesCOD;
    }


    /**
     * Sets the peorCalificacion12MesesCOD value for this Respuesta.
     * 
     * @param peorCalificacion12MesesCOD
     */
    public void setPeorCalificacion12MesesCOD(java.lang.String peorCalificacion12MesesCOD) {
        this.peorCalificacion12MesesCOD = peorCalificacion12MesesCOD;
    }


    /**
     * Gets the castigoDemanda12Meses value for this Respuesta.
     * 
     * @return castigoDemanda12Meses
     */
    public double getCastigoDemanda12Meses() {
        return castigoDemanda12Meses;
    }


    /**
     * Sets the castigoDemanda12Meses value for this Respuesta.
     * 
     * @param castigoDemanda12Meses
     */
    public void setCastigoDemanda12Meses(double castigoDemanda12Meses) {
        this.castigoDemanda12Meses = castigoDemanda12Meses;
    }


    /**
     * Gets the numeroCreditosIFI value for this Respuesta.
     * 
     * @return numeroCreditosIFI
     */
    public java.lang.Short getNumeroCreditosIFI() {
        return numeroCreditosIFI;
    }


    /**
     * Sets the numeroCreditosIFI value for this Respuesta.
     * 
     * @param numeroCreditosIFI
     */
    public void setNumeroCreditosIFI(java.lang.Short numeroCreditosIFI) {
        this.numeroCreditosIFI = numeroCreditosIFI;
    }


    /**
     * Gets the numeroOperaciones value for this Respuesta.
     * 
     * @return numeroOperaciones
     */
    public java.lang.Short getNumeroOperaciones() {
        return numeroOperaciones;
    }


    /**
     * Sets the numeroOperaciones value for this Respuesta.
     * 
     * @param numeroOperaciones
     */
    public void setNumeroOperaciones(java.lang.Short numeroOperaciones) {
        this.numeroOperaciones = numeroOperaciones;
    }


    /**
     * Gets the reciprocidad value for this Respuesta.
     * 
     * @return reciprocidad
     */
    public java.lang.String getReciprocidad() {
        return reciprocidad;
    }


    /**
     * Sets the reciprocidad value for this Respuesta.
     * 
     * @param reciprocidad
     */
    public void setReciprocidad(java.lang.String reciprocidad) {
        this.reciprocidad = reciprocidad;
    }


    /**
     * Gets the estadoCentralRiesgo value for this Respuesta.
     * 
     * @return estadoCentralRiesgo
     */
    public java.lang.String getEstadoCentralRiesgo() {
        return estadoCentralRiesgo;
    }


    /**
     * Sets the estadoCentralRiesgo value for this Respuesta.
     * 
     * @param estadoCentralRiesgo
     */
    public void setEstadoCentralRiesgo(java.lang.String estadoCentralRiesgo) {
        this.estadoCentralRiesgo = estadoCentralRiesgo;
    }


    /**
     * Gets the usuarioID value for this Respuesta.
     * 
     * @return usuarioID
     */
    public short getUsuarioID() {
        return usuarioID;
    }


    /**
     * Sets the usuarioID value for this Respuesta.
     * 
     * @param usuarioID
     */
    public void setUsuarioID(short usuarioID) {
        this.usuarioID = usuarioID;
    }


    /**
     * Gets the personaIdCentralRiesgo value for this Respuesta.
     * 
     * @return personaIdCentralRiesgo
     */
    public java.lang.Integer getPersonaIdCentralRiesgo() {
        return personaIdCentralRiesgo;
    }


    /**
     * Sets the personaIdCentralRiesgo value for this Respuesta.
     * 
     * @param personaIdCentralRiesgo
     */
    public void setPersonaIdCentralRiesgo(java.lang.Integer personaIdCentralRiesgo) {
        this.personaIdCentralRiesgo = personaIdCentralRiesgo;
    }


    /**
     * Gets the tieneError value for this Respuesta.
     * 
     * @return tieneError
     */
    public boolean isTieneError() {
        return tieneError;
    }


    /**
     * Sets the tieneError value for this Respuesta.
     * 
     * @param tieneError
     */
    public void setTieneError(boolean tieneError) {
        this.tieneError = tieneError;
    }


    /**
     * Gets the mensaje value for this Respuesta.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this Respuesta.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the respuestaCOD value for this Respuesta.
     * 
     * @return respuestaCOD
     */
    public java.lang.String getRespuestaCOD() {
        return respuestaCOD;
    }


    /**
     * Sets the respuestaCOD value for this Respuesta.
     * 
     * @param respuestaCOD
     */
    public void setRespuestaCOD(java.lang.String respuestaCOD) {
        this.respuestaCOD = respuestaCOD;
    }


    /**
     * Gets the segmento value for this Respuesta.
     * 
     * @return segmento
     */
    public java.lang.String getSegmento() {
        return segmento;
    }


    /**
     * Sets the segmento value for this Respuesta.
     * 
     * @param segmento
     */
    public void setSegmento(java.lang.String segmento) {
        this.segmento = segmento;
    }


    /**
     * Gets the metodo value for this Respuesta.
     * 
     * @return metodo
     */
    public java.lang.String getMetodo() {
        return metodo;
    }


    /**
     * Sets the metodo value for this Respuesta.
     * 
     * @param metodo
     */
    public void setMetodo(java.lang.String metodo) {
        this.metodo = metodo;
    }


    /**
     * Gets the mensajePersonalizado value for this Respuesta.
     * 
     * @return mensajePersonalizado
     */
    public java.lang.String getMensajePersonalizado() {
        return mensajePersonalizado;
    }


    /**
     * Sets the mensajePersonalizado value for this Respuesta.
     * 
     * @param mensajePersonalizado
     */
    public void setMensajePersonalizado(java.lang.String mensajePersonalizado) {
        this.mensajePersonalizado = mensajePersonalizado;
    }


    /**
     * Gets the mensajeTecnico value for this Respuesta.
     * 
     * @return mensajeTecnico
     */
    public java.lang.String getMensajeTecnico() {
        return mensajeTecnico;
    }


    /**
     * Sets the mensajeTecnico value for this Respuesta.
     * 
     * @param mensajeTecnico
     */
    public void setMensajeTecnico(java.lang.String mensajeTecnico) {
        this.mensajeTecnico = mensajeTecnico;
    }

    private java.lang.Object __equalsCalc = null;
    @Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Respuesta other = (Respuesta) obj;
		if (Double.doubleToLongBits(IVA) != Double.doubleToLongBits(other.IVA))
			return false;
		if (__equalsCalc == null) {
			if (other.__equalsCalc != null)
				return false;
		} else if (!__equalsCalc.equals(other.__equalsCalc))
			return false;
		if (__hashCodeCalc != other.__hashCodeCalc)
			return false;
		if (antiguedadNegocio == null) {
			if (other.antiguedadNegocio != null)
				return false;
		} else if (!antiguedadNegocio.equals(other.antiguedadNegocio))
			return false;
		if (antiguedadNegocioMismoLugar == null) {
			if (other.antiguedadNegocioMismoLugar != null)
				return false;
		} else if (!antiguedadNegocioMismoLugar.equals(other.antiguedadNegocioMismoLugar))
			return false;
		if (apellidoMaterno == null) {
			if (other.apellidoMaterno != null)
				return false;
		} else if (!apellidoMaterno.equals(other.apellidoMaterno))
			return false;
		if (apellidoPaterno == null) {
			if (other.apellidoPaterno != null)
				return false;
		} else if (!apellidoPaterno.equals(other.apellidoPaterno))
			return false;
		if (calificacionRiesgoCOD == null) {
			if (other.calificacionRiesgoCOD != null)
				return false;
		} else if (!calificacionRiesgoCOD.equals(other.calificacionRiesgoCOD))
			return false;
		if (Double.doubleToLongBits(carteraRiesgo) != Double.doubleToLongBits(other.carteraRiesgo))
			return false;
		if (Double.doubleToLongBits(castigoDemanda) != Double.doubleToLongBits(other.castigoDemanda))
			return false;
		if (Double.doubleToLongBits(castigoDemanda12Meses) != Double.doubleToLongBits(other.castigoDemanda12Meses))
			return false;
		if (centralRiesgoConyugeGarante == null) {
			if (other.centralRiesgoConyugeGarante != null)
				return false;
		} else if (!centralRiesgoConyugeGarante.equals(other.centralRiesgoConyugeGarante))
			return false;
		if (centralRiesgoConyugeSocio == null) {
			if (other.centralRiesgoConyugeSocio != null)
				return false;
		} else if (!centralRiesgoConyugeSocio.equals(other.centralRiesgoConyugeSocio))
			return false;
		if (centralRiesgoGarante == null) {
			if (other.centralRiesgoGarante != null)
				return false;
		} else if (!centralRiesgoGarante.equals(other.centralRiesgoGarante))
			return false;
		if (centralRiesgoSocio == null) {
			if (other.centralRiesgoSocio != null)
				return false;
		} else if (!centralRiesgoSocio.equals(other.centralRiesgoSocio))
			return false;
		if (comercio != other.comercio)
			return false;
		if (conyugeGarante == null) {
			if (other.conyugeGarante != null)
				return false;
		} else if (!conyugeGarante.equals(other.conyugeGarante))
			return false;
		if (conyugeSocio == null) {
			if (other.conyugeSocio != null)
				return false;
		} else if (!conyugeSocio.equals(other.conyugeSocio))
			return false;
		if (correo == null) {
			if (other.correo != null)
				return false;
		} else if (!correo.equals(other.correo))
			return false;
		if (Double.doubleToLongBits(costosTotalesPerdidasYGanancias) != Double
				.doubleToLongBits(other.costosTotalesPerdidasYGanancias))
			return false;
		if (Double.doubleToLongBits(costototal) != Double.doubleToLongBits(other.costototal))
			return false;
		if (Double.doubleToLongBits(cuoraCredito) != Double.doubleToLongBits(other.cuoraCredito))
			return false;
		if (Double.doubleToLongBits(cuotaCreditoVigente) != Double.doubleToLongBits(other.cuotaCreditoVigente))
			return false;
		if (decisionCOD == null) {
			if (other.decisionCOD != null)
				return false;
		} else if (!decisionCOD.equals(other.decisionCOD))
			return false;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (descripcionRererenciasComerciales == null) {
			if (other.descripcionRererenciasComerciales != null)
				return false;
		} else if (!descripcionRererenciasComerciales.equals(other.descripcionRererenciasComerciales))
			return false;
		if (destinoDetalle == null) {
			if (other.destinoDetalle != null)
				return false;
		} else if (!destinoDetalle.equals(other.destinoDetalle))
			return false;
		if (destinoEconomicoCOD == null) {
			if (other.destinoEconomicoCOD != null)
				return false;
		} else if (!destinoEconomicoCOD.equals(other.destinoEconomicoCOD))
			return false;
		if (!Arrays.equals(detallePatrimonialSocio, other.detallePatrimonialSocio))
			return false;
		if (!Arrays.equals(detallePatrominialGarante, other.detallePatrominialGarante))
			return false;
		if (!Arrays.equals(detalledeCuentasGarante, other.detalledeCuentasGarante))
			return false;
		if (!Arrays.equals(detalledeCuentasSocio, other.detalledeCuentasSocio))
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (direccionInformacionNegocio == null) {
			if (other.direccionInformacionNegocio != null)
				return false;
		} else if (!direccionInformacionNegocio.equals(other.direccionInformacionNegocio))
			return false;
		if (direccionTrabajoConyuge == null) {
			if (other.direccionTrabajoConyuge != null)
				return false;
		} else if (!direccionTrabajoConyuge.equals(other.direccionTrabajoConyuge))
			return false;
		if (Double.doubleToLongBits(disponibilidadAntesCredito) != Double
				.doubleToLongBits(other.disponibilidadAntesCredito))
			return false;
		if (Double.doubleToLongBits(disponibleNeto) != Double.doubleToLongBits(other.disponibleNeto))
			return false;
		if (duenoCasa == null) {
			if (other.duenoCasa != null)
				return false;
		} else if (!duenoCasa.equals(other.duenoCasa))
			return false;
		if (Double.doubleToLongBits(egresosFamiliar) != Double.doubleToLongBits(other.egresosFamiliar))
			return false;
		if (Double.doubleToLongBits(egresosFamiliaresTotalPerdidasYGanancias) != Double
				.doubleToLongBits(other.egresosFamiliaresTotalPerdidasYGanancias))
			return false;
		if (Double.doubleToLongBits(egresosNegocio) != Double.doubleToLongBits(other.egresosNegocio))
			return false;
		if (Double.doubleToLongBits(egresosNegocioPerdidasYGanancias) != Double
				.doubleToLongBits(other.egresosNegocioPerdidasYGanancias))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (estadoCentralRiesgo == null) {
			if (other.estadoCentralRiesgo != null)
				return false;
		} else if (!estadoCentralRiesgo.equals(other.estadoCentralRiesgo))
			return false;
		if (estadoCivilCOD == null) {
			if (other.estadoCivilCOD != null)
				return false;
		} else if (!estadoCivilCOD.equals(other.estadoCivilCOD))
			return false;
		if (fechaApertura == null) {
			if (other.fechaApertura != null)
				return false;
		} else if (!fechaApertura.equals(other.fechaApertura))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (fechaSolicitud == null) {
			if (other.fechaSolicitud != null)
				return false;
		} else if (!fechaSolicitud.equals(other.fechaSolicitud))
			return false;
		if (formaPagoCOD == null) {
			if (other.formaPagoCOD != null)
				return false;
		} else if (!formaPagoCOD.equals(other.formaPagoCOD))
			return false;
		if (garante == null) {
			if (other.garante != null)
				return false;
		} else if (!garante.equals(other.garante))
			return false;
		if (!Arrays.equals(garantiasReales, other.garantiasReales))
			return false;
		if (Double.doubleToLongBits(gastosFinancierosPerdidasYGanancias) != Double
				.doubleToLongBits(other.gastosFinancierosPerdidasYGanancias))
			return false;
		if (Double.doubleToLongBits(gastosTotalesPerdidasYGanancias) != Double
				.doubleToLongBits(other.gastosTotalesPerdidasYGanancias))
			return false;
		if (identificacion == null) {
			if (other.identificacion != null)
				return false;
		} else if (!identificacion.equals(other.identificacion))
			return false;
		if (identificacionConyuge == null) {
			if (other.identificacionConyuge != null)
				return false;
		} else if (!identificacionConyuge.equals(other.identificacionConyuge))
			return false;
		if (identificacionGarante == null) {
			if (other.identificacionGarante != null)
				return false;
		} else if (!identificacionGarante.equals(other.identificacionGarante))
			return false;
		if (identificacionInformacionNegocio == null) {
			if (other.identificacionInformacionNegocio != null)
				return false;
		} else if (!identificacionInformacionNegocio.equals(other.identificacionInformacionNegocio))
			return false;
		if (identificacionSocio == null) {
			if (other.identificacionSocio != null)
				return false;
		} else if (!identificacionSocio.equals(other.identificacionSocio))
			return false;
		if (identificacionSolicitud == null) {
			if (other.identificacionSolicitud != null)
				return false;
		} else if (!identificacionSolicitud.equals(other.identificacionSolicitud))
			return false;
		if (ingreso == null) {
			if (other.ingreso != null)
				return false;
		} else if (!ingreso.equals(other.ingreso))
			return false;
		if (Double.doubleToLongBits(ingresosFamiliar) != Double.doubleToLongBits(other.ingresosFamiliar))
			return false;
		if (Double.doubleToLongBits(ingresosFamiliaresTotalPerdidasYGanancias) != Double
				.doubleToLongBits(other.ingresosFamiliaresTotalPerdidasYGanancias))
			return false;
		if (Double.doubleToLongBits(ingresosNegocio) != Double.doubleToLongBits(other.ingresosNegocio))
			return false;
		if (interesesAmortizacion == null) {
			if (other.interesesAmortizacion != null)
				return false;
		} else if (!interesesAmortizacion.equals(other.interesesAmortizacion))
			return false;
		if (Double.doubleToLongBits(latitud) != Double.doubleToLongBits(other.latitud))
			return false;
		if (localidadCOD == null) {
			if (other.localidadCOD != null)
				return false;
		} else if (!localidadCOD.equals(other.localidadCOD))
			return false;
		if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
			return false;
		if (mensaje == null) {
			if (other.mensaje != null)
				return false;
		} else if (!mensaje.equals(other.mensaje))
			return false;
		if (mensajePersonalizado == null) {
			if (other.mensajePersonalizado != null)
				return false;
		} else if (!mensajePersonalizado.equals(other.mensajePersonalizado))
			return false;
		if (mensajeTecnico == null) {
			if (other.mensajeTecnico != null)
				return false;
		} else if (!mensajeTecnico.equals(other.mensajeTecnico))
			return false;
		if (metodo == null) {
			if (other.metodo != null)
				return false;
		} else if (!metodo.equals(other.metodo))
			return false;
		if (moduloID != other.moduloID)
			return false;
		if (Double.doubleToLongBits(montoSolicitud) != Double.doubleToLongBits(other.montoSolicitud))
			return false;
		if (Double.doubleToLongBits(montoTotalEndeudamiento) != Double.doubleToLongBits(other.montoTotalEndeudamiento))
			return false;
		if (nacionalidadCOD == null) {
			if (other.nacionalidadCOD != null)
				return false;
		} else if (!nacionalidadCOD.equals(other.nacionalidadCOD))
			return false;
		if (nivelEducacionCOD == null) {
			if (other.nivelEducacionCOD != null)
				return false;
		} else if (!nivelEducacionCOD.equals(other.nivelEducacionCOD))
			return false;
		if (nombreInformacionNegocio == null) {
			if (other.nombreInformacionNegocio != null)
				return false;
		} else if (!nombreInformacionNegocio.equals(other.nombreInformacionNegocio))
			return false;
		if (nombreModulo == null) {
			if (other.nombreModulo != null)
				return false;
		} else if (!nombreModulo.equals(other.nombreModulo))
			return false;
		if (nombres == null) {
			if (other.nombres != null)
				return false;
		} else if (!nombres.equals(other.nombres))
			return false;
		if (numeroCarga == null) {
			if (other.numeroCarga != null)
				return false;
		} else if (!numeroCarga.equals(other.numeroCarga))
			return false;
		if (numeroCreditosIFI == null) {
			if (other.numeroCreditosIFI != null)
				return false;
		} else if (!numeroCreditosIFI.equals(other.numeroCreditosIFI))
			return false;
		if (numeroEmpleados == null) {
			if (other.numeroEmpleados != null)
				return false;
		} else if (!numeroEmpleados.equals(other.numeroEmpleados))
			return false;
		if (numeroOperaciones == null) {
			if (other.numeroOperaciones != null)
				return false;
		} else if (!numeroOperaciones.equals(other.numeroOperaciones))
			return false;
		if (observacion == null) {
			if (other.observacion != null)
				return false;
		} else if (!observacion.equals(other.observacion))
			return false;
		if (observacionReferenciasComerciales == null) {
			if (other.observacionReferenciasComerciales != null)
				return false;
		} else if (!observacionReferenciasComerciales.equals(other.observacionReferenciasComerciales))
			return false;
		if (ocupacionCOD == null) {
			if (other.ocupacionCOD != null)
				return false;
		} else if (!ocupacionCOD.equals(other.ocupacionCOD))
			return false;
		if (Double.doubleToLongBits(patrimonioMontos) != Double.doubleToLongBits(other.patrimonioMontos))
			return false;
		if (peorCalificacion12MesesCOD == null) {
			if (other.peorCalificacion12MesesCOD != null)
				return false;
		} else if (!peorCalificacion12MesesCOD.equals(other.peorCalificacion12MesesCOD))
			return false;
		if (periodoGracia == null) {
			if (other.periodoGracia != null)
				return false;
		} else if (!periodoGracia.equals(other.periodoGracia))
			return false;
		if (personaID != other.personaID)
			return false;
		if (personaIdCentralRiesgo == null) {
			if (other.personaIdCentralRiesgo != null)
				return false;
		} else if (!personaIdCentralRiesgo.equals(other.personaIdCentralRiesgo))
			return false;
		if (plazo != other.plazo)
			return false;
		if (Double.doubleToLongBits(primerInteres) != Double.doubleToLongBits(other.primerInteres))
			return false;
		if (Double.doubleToLongBits(primeraCuota) != Double.doubleToLongBits(other.primeraCuota))
			return false;
		if (productoID == null) {
			if (other.productoID != null)
				return false;
		} else if (!productoID.equals(other.productoID))
			return false;
		if (reciprocidad == null) {
			if (other.reciprocidad != null)
				return false;
		} else if (!reciprocidad.equals(other.reciprocidad))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		if (referenciaUbicacion == null) {
			if (other.referenciaUbicacion != null)
				return false;
		} else if (!referenciaUbicacion.equals(other.referenciaUbicacion))
			return false;
		if (!Arrays.equals(referenciasComerciales, other.referenciasComerciales))
			return false;
		if (!Arrays.equals(referenciasPersonales, other.referenciasPersonales))
			return false;
		if (!Arrays.equals(referenciasPersonales2, other.referenciasPersonales2))
			return false;
		if (relacionCOD == null) {
			if (other.relacionCOD != null)
				return false;
		} else if (!relacionCOD.equals(other.relacionCOD))
			return false;
		if (respuestaCOD == null) {
			if (other.respuestaCOD != null)
				return false;
		} else if (!respuestaCOD.equals(other.respuestaCOD))
			return false;
		if (sectorEconomicoCOD == null) {
			if (other.sectorEconomicoCOD != null)
				return false;
		} else if (!sectorEconomicoCOD.equals(other.sectorEconomicoCOD))
			return false;
		if (segmento == null) {
			if (other.segmento != null)
				return false;
		} else if (!segmento.equals(other.segmento))
			return false;
		if (separacionBienes != other.separacionBienes)
			return false;
		if (sexoCOD == null) {
			if (other.sexoCOD != null)
				return false;
		} else if (!sexoCOD.equals(other.sexoCOD))
			return false;
		if (situacionViviendaCOD == null) {
			if (other.situacionViviendaCOD != null)
				return false;
		} else if (!situacionViviendaCOD.equals(other.situacionViviendaCOD))
			return false;
		if (socio == null) {
			if (other.socio != null)
				return false;
		} else if (!socio.equals(other.socio))
			return false;
		if (solicitudID != other.solicitudID)
			return false;
		if (Double.doubleToLongBits(tasa) != Double.doubleToLongBits(other.tasa))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (telefonoCelular == null) {
			if (other.telefonoCelular != null)
				return false;
		} else if (!telefonoCelular.equals(other.telefonoCelular))
			return false;
		if (telefonoDomicilio == null) {
			if (other.telefonoDomicilio != null)
				return false;
		} else if (!telefonoDomicilio.equals(other.telefonoDomicilio))
			return false;
		if (telefonoDuenoCasa == null) {
			if (other.telefonoDuenoCasa != null)
				return false;
		} else if (!telefonoDuenoCasa.equals(other.telefonoDuenoCasa))
			return false;
		if (telefonoReferenciasComerciales == null) {
			if (other.telefonoReferenciasComerciales != null)
				return false;
		} else if (!telefonoReferenciasComerciales.equals(other.telefonoReferenciasComerciales))
			return false;
		if (telefonoTrabajoConyuge == null) {
			if (other.telefonoTrabajoConyuge != null)
				return false;
		} else if (!telefonoTrabajoConyuge.equals(other.telefonoTrabajoConyuge))
			return false;
		if (tiempoViviendaActual == null) {
			if (other.tiempoViviendaActual != null)
				return false;
		} else if (!tiempoViviendaActual.equals(other.tiempoViviendaActual))
			return false;
		if (tiempoViviendaAnterior == null) {
			if (other.tiempoViviendaAnterior != null)
				return false;
		} else if (!tiempoViviendaAnterior.equals(other.tiempoViviendaAnterior))
			return false;
		if (tieneError != other.tieneError)
			return false;
		if (tipoCuotaCOD == null) {
			if (other.tipoCuotaCOD != null)
				return false;
		} else if (!tipoCuotaCOD.equals(other.tipoCuotaCOD))
			return false;
		if (tipoGarantiaCOD == null) {
			if (other.tipoGarantiaCOD != null)
				return false;
		} else if (!tipoGarantiaCOD.equals(other.tipoGarantiaCOD))
			return false;
		if (tipoIdentificacionCOD == null) {
			if (other.tipoIdentificacionCOD != null)
				return false;
		} else if (!tipoIdentificacionCOD.equals(other.tipoIdentificacionCOD))
			return false;
		if (tipoLocalCOD == null) {
			if (other.tipoLocalCOD != null)
				return false;
		} else if (!tipoLocalCOD.equals(other.tipoLocalCOD))
			return false;
		if (tipoPersonaCOD == null) {
			if (other.tipoPersonaCOD != null)
				return false;
		} else if (!tipoPersonaCOD.equals(other.tipoPersonaCOD))
			return false;
		if (tipoReferenciaComercialCOD == null) {
			if (other.tipoReferenciaComercialCOD != null)
				return false;
		} else if (!tipoReferenciaComercialCOD.equals(other.tipoReferenciaComercialCOD))
			return false;
		if (tipoViviendaCOD == null) {
			if (other.tipoViviendaCOD != null)
				return false;
		} else if (!tipoViviendaCOD.equals(other.tipoViviendaCOD))
			return false;
		if (Double.doubleToLongBits(totalCarteraVigente) != Double.doubleToLongBits(other.totalCarteraVigente))
			return false;
		if (Double.doubleToLongBits(totalEgresos) != Double.doubleToLongBits(other.totalEgresos))
			return false;
		if (Double.doubleToLongBits(totalIngresosFlujo) != Double.doubleToLongBits(other.totalIngresosFlujo))
			return false;
		if (Double.doubleToLongBits(totalValorDetalleDeCuentasEGRESOSGarante) != Double
				.doubleToLongBits(other.totalValorDetalleDeCuentasEGRESOSGarante))
			return false;
		if (Double.doubleToLongBits(totalValorDetalleDeCuentasEGRESOSSocio) != Double
				.doubleToLongBits(other.totalValorDetalleDeCuentasEGRESOSSocio))
			return false;
		if (Double.doubleToLongBits(totalValorDetalleDeCuentasINGRESOSGarante) != Double
				.doubleToLongBits(other.totalValorDetalleDeCuentasINGRESOSGarante))
			return false;
		if (Double.doubleToLongBits(totalValorDetalleDeCuentasINGRESOSSocio) != Double
				.doubleToLongBits(other.totalValorDetalleDeCuentasINGRESOSSocio))
			return false;
		if (Double.doubleToLongBits(totalValorDetallePatrimonial) != Double
				.doubleToLongBits(other.totalValorDetallePatrimonial))
			return false;
		if (Double.doubleToLongBits(totalValorDetallePatrimonialGarante) != Double
				.doubleToLongBits(other.totalValorDetallePatrimonialGarante))
			return false;
		if (Double.doubleToLongBits(totalValorPatrimonioACTIVOGarante) != Double
				.doubleToLongBits(other.totalValorPatrimonioACTIVOGarante))
			return false;
		if (Double.doubleToLongBits(totalValorPatrimonioACTIVOSocio) != Double
				.doubleToLongBits(other.totalValorPatrimonioACTIVOSocio))
			return false;
		if (Double.doubleToLongBits(totalValorPatrimonioPASIVOGarante) != Double
				.doubleToLongBits(other.totalValorPatrimonioPASIVOGarante))
			return false;
		if (Double.doubleToLongBits(totalValorPatrimonioPASIVOSocio) != Double
				.doubleToLongBits(other.totalValorPatrimonioPASIVOSocio))
			return false;
		if (unidadAntiguedadNegocioCOD == null) {
			if (other.unidadAntiguedadNegocioCOD != null)
				return false;
		} else if (!unidadAntiguedadNegocioCOD.equals(other.unidadAntiguedadNegocioCOD))
			return false;
		if (unidadAntiguedadNegocioMismoLugarCOD == null) {
			if (other.unidadAntiguedadNegocioMismoLugarCOD != null)
				return false;
		} else if (!unidadAntiguedadNegocioMismoLugarCOD.equals(other.unidadAntiguedadNegocioMismoLugarCOD))
			return false;
		if (unidadTiempoPlazoCOD == null) {
			if (other.unidadTiempoPlazoCOD != null)
				return false;
		} else if (!unidadTiempoPlazoCOD.equals(other.unidadTiempoPlazoCOD))
			return false;
		if (unidadTiempoViviendaActualCOD == null) {
			if (other.unidadTiempoViviendaActualCOD != null)
				return false;
		} else if (!unidadTiempoViviendaActualCOD.equals(other.unidadTiempoViviendaActualCOD))
			return false;
		if (unidadTiempoViviendaAnteriorCOD == null) {
			if (other.unidadTiempoViviendaAnteriorCOD != null)
				return false;
		} else if (!unidadTiempoViviendaAnteriorCOD.equals(other.unidadTiempoViviendaAnteriorCOD))
			return false;
		if (usuarioID != other.usuarioID)
			return false;
		if (usuarioIDSolicitud != other.usuarioIDSolicitud)
			return false;
		if (Double.doubleToLongBits(utilidadNegocioTotalPerdidasYGanancias) != Double
				.doubleToLongBits(other.utilidadNegocioTotalPerdidasYGanancias))
			return false;
		if (Double.doubleToLongBits(utilidadNetaPersidasYGanancias) != Double
				.doubleToLongBits(other.utilidadNetaPersidasYGanancias))
			return false;
		if (Double.doubleToLongBits(valorReferenciasComerciales) != Double
				.doubleToLongBits(other.valorReferenciasComerciales))
			return false;
		if (Double.doubleToLongBits(ventasMontos) != Double.doubleToLongBits(other.ventasMontos))
			return false;
		if (Double.doubleToLongBits(ventasTotalesPerdidasYGanancias) != Double
				.doubleToLongBits(other.ventasTotalesPerdidasYGanancias))
			return false;
		if (viviendaHipotecada != other.viviendaHipotecada)
			return false;
		return true;
	}

    private boolean __hashCodeCalc = false;
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(IVA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((__equalsCalc == null) ? 0 : __equalsCalc.hashCode());
		result = prime * result + (__hashCodeCalc ? 1231 : 1237);
		result = prime * result + ((antiguedadNegocio == null) ? 0 : antiguedadNegocio.hashCode());
		result = prime * result + ((antiguedadNegocioMismoLugar == null) ? 0 : antiguedadNegocioMismoLugar.hashCode());
		result = prime * result + ((apellidoMaterno == null) ? 0 : apellidoMaterno.hashCode());
		result = prime * result + ((apellidoPaterno == null) ? 0 : apellidoPaterno.hashCode());
		result = prime * result + ((calificacionRiesgoCOD == null) ? 0 : calificacionRiesgoCOD.hashCode());
		temp = Double.doubleToLongBits(carteraRiesgo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(castigoDemanda);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(castigoDemanda12Meses);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((centralRiesgoConyugeGarante == null) ? 0 : centralRiesgoConyugeGarante.hashCode());
		result = prime * result + ((centralRiesgoConyugeSocio == null) ? 0 : centralRiesgoConyugeSocio.hashCode());
		result = prime * result + ((centralRiesgoGarante == null) ? 0 : centralRiesgoGarante.hashCode());
		result = prime * result + ((centralRiesgoSocio == null) ? 0 : centralRiesgoSocio.hashCode());
		result = prime * result + (comercio ? 1231 : 1237);
		result = prime * result + ((conyugeGarante == null) ? 0 : conyugeGarante.hashCode());
		result = prime * result + ((conyugeSocio == null) ? 0 : conyugeSocio.hashCode());
		result = prime * result + ((correo == null) ? 0 : correo.hashCode());
		temp = Double.doubleToLongBits(costosTotalesPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(costototal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cuoraCredito);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(cuotaCreditoVigente);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((decisionCOD == null) ? 0 : decisionCOD.hashCode());
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result
				+ ((descripcionRererenciasComerciales == null) ? 0 : descripcionRererenciasComerciales.hashCode());
		result = prime * result + ((destinoDetalle == null) ? 0 : destinoDetalle.hashCode());
		result = prime * result + ((destinoEconomicoCOD == null) ? 0 : destinoEconomicoCOD.hashCode());
		result = prime * result + Arrays.hashCode(detallePatrimonialSocio);
		result = prime * result + Arrays.hashCode(detallePatrominialGarante);
		result = prime * result + Arrays.hashCode(detalledeCuentasGarante);
		result = prime * result + Arrays.hashCode(detalledeCuentasSocio);
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + ((direccionInformacionNegocio == null) ? 0 : direccionInformacionNegocio.hashCode());
		result = prime * result + ((direccionTrabajoConyuge == null) ? 0 : direccionTrabajoConyuge.hashCode());
		temp = Double.doubleToLongBits(disponibilidadAntesCredito);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(disponibleNeto);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((duenoCasa == null) ? 0 : duenoCasa.hashCode());
		temp = Double.doubleToLongBits(egresosFamiliar);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(egresosFamiliaresTotalPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(egresosNegocio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(egresosNegocioPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((estadoCentralRiesgo == null) ? 0 : estadoCentralRiesgo.hashCode());
		result = prime * result + ((estadoCivilCOD == null) ? 0 : estadoCivilCOD.hashCode());
		result = prime * result + ((fechaApertura == null) ? 0 : fechaApertura.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + ((fechaSolicitud == null) ? 0 : fechaSolicitud.hashCode());
		result = prime * result + ((formaPagoCOD == null) ? 0 : formaPagoCOD.hashCode());
		result = prime * result + ((garante == null) ? 0 : garante.hashCode());
		result = prime * result + Arrays.hashCode(garantiasReales);
		temp = Double.doubleToLongBits(gastosFinancierosPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(gastosTotalesPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((identificacion == null) ? 0 : identificacion.hashCode());
		result = prime * result + ((identificacionConyuge == null) ? 0 : identificacionConyuge.hashCode());
		result = prime * result + ((identificacionGarante == null) ? 0 : identificacionGarante.hashCode());
		result = prime * result
				+ ((identificacionInformacionNegocio == null) ? 0 : identificacionInformacionNegocio.hashCode());
		result = prime * result + ((identificacionSocio == null) ? 0 : identificacionSocio.hashCode());
		result = prime * result + ((identificacionSolicitud == null) ? 0 : identificacionSolicitud.hashCode());
		result = prime * result + ((ingreso == null) ? 0 : ingreso.hashCode());
		temp = Double.doubleToLongBits(ingresosFamiliar);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ingresosFamiliaresTotalPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ingresosNegocio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((interesesAmortizacion == null) ? 0 : interesesAmortizacion.hashCode());
		temp = Double.doubleToLongBits(latitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((localidadCOD == null) ? 0 : localidadCOD.hashCode());
		temp = Double.doubleToLongBits(longitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((mensaje == null) ? 0 : mensaje.hashCode());
		result = prime * result + ((mensajePersonalizado == null) ? 0 : mensajePersonalizado.hashCode());
		result = prime * result + ((mensajeTecnico == null) ? 0 : mensajeTecnico.hashCode());
		result = prime * result + ((metodo == null) ? 0 : metodo.hashCode());
		result = prime * result + moduloID;
		temp = Double.doubleToLongBits(montoSolicitud);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(montoTotalEndeudamiento);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((nacionalidadCOD == null) ? 0 : nacionalidadCOD.hashCode());
		result = prime * result + ((nivelEducacionCOD == null) ? 0 : nivelEducacionCOD.hashCode());
		result = prime * result + ((nombreInformacionNegocio == null) ? 0 : nombreInformacionNegocio.hashCode());
		result = prime * result + ((nombreModulo == null) ? 0 : nombreModulo.hashCode());
		result = prime * result + ((nombres == null) ? 0 : nombres.hashCode());
		result = prime * result + ((numeroCarga == null) ? 0 : numeroCarga.hashCode());
		result = prime * result + ((numeroCreditosIFI == null) ? 0 : numeroCreditosIFI.hashCode());
		result = prime * result + ((numeroEmpleados == null) ? 0 : numeroEmpleados.hashCode());
		result = prime * result + ((numeroOperaciones == null) ? 0 : numeroOperaciones.hashCode());
		result = prime * result + ((observacion == null) ? 0 : observacion.hashCode());
		result = prime * result
				+ ((observacionReferenciasComerciales == null) ? 0 : observacionReferenciasComerciales.hashCode());
		result = prime * result + ((ocupacionCOD == null) ? 0 : ocupacionCOD.hashCode());
		temp = Double.doubleToLongBits(patrimonioMontos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((peorCalificacion12MesesCOD == null) ? 0 : peorCalificacion12MesesCOD.hashCode());
		result = prime * result + ((periodoGracia == null) ? 0 : periodoGracia.hashCode());
		result = prime * result + personaID;
		result = prime * result + ((personaIdCentralRiesgo == null) ? 0 : personaIdCentralRiesgo.hashCode());
		result = prime * result + plazo;
		temp = Double.doubleToLongBits(primerInteres);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(primeraCuota);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((productoID == null) ? 0 : productoID.hashCode());
		result = prime * result + ((reciprocidad == null) ? 0 : reciprocidad.hashCode());
		result = prime * result + ((referencia == null) ? 0 : referencia.hashCode());
		result = prime * result + ((referenciaUbicacion == null) ? 0 : referenciaUbicacion.hashCode());
		result = prime * result + Arrays.hashCode(referenciasComerciales);
		result = prime * result + Arrays.hashCode(referenciasPersonales);
		result = prime * result + Arrays.hashCode(referenciasPersonales2);
		result = prime * result + ((relacionCOD == null) ? 0 : relacionCOD.hashCode());
		result = prime * result + ((respuestaCOD == null) ? 0 : respuestaCOD.hashCode());
		result = prime * result + ((sectorEconomicoCOD == null) ? 0 : sectorEconomicoCOD.hashCode());
		result = prime * result + ((segmento == null) ? 0 : segmento.hashCode());
		result = prime * result + (separacionBienes ? 1231 : 1237);
		result = prime * result + ((sexoCOD == null) ? 0 : sexoCOD.hashCode());
		result = prime * result + ((situacionViviendaCOD == null) ? 0 : situacionViviendaCOD.hashCode());
		result = prime * result + ((socio == null) ? 0 : socio.hashCode());
		result = prime * result + solicitudID;
		temp = Double.doubleToLongBits(tasa);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((telefonoCelular == null) ? 0 : telefonoCelular.hashCode());
		result = prime * result + ((telefonoDomicilio == null) ? 0 : telefonoDomicilio.hashCode());
		result = prime * result + ((telefonoDuenoCasa == null) ? 0 : telefonoDuenoCasa.hashCode());
		result = prime * result
				+ ((telefonoReferenciasComerciales == null) ? 0 : telefonoReferenciasComerciales.hashCode());
		result = prime * result + ((telefonoTrabajoConyuge == null) ? 0 : telefonoTrabajoConyuge.hashCode());
		result = prime * result + ((tiempoViviendaActual == null) ? 0 : tiempoViviendaActual.hashCode());
		result = prime * result + ((tiempoViviendaAnterior == null) ? 0 : tiempoViviendaAnterior.hashCode());
		result = prime * result + (tieneError ? 1231 : 1237);
		result = prime * result + ((tipoCuotaCOD == null) ? 0 : tipoCuotaCOD.hashCode());
		result = prime * result + ((tipoGarantiaCOD == null) ? 0 : tipoGarantiaCOD.hashCode());
		result = prime * result + ((tipoIdentificacionCOD == null) ? 0 : tipoIdentificacionCOD.hashCode());
		result = prime * result + ((tipoLocalCOD == null) ? 0 : tipoLocalCOD.hashCode());
		result = prime * result + ((tipoPersonaCOD == null) ? 0 : tipoPersonaCOD.hashCode());
		result = prime * result + ((tipoReferenciaComercialCOD == null) ? 0 : tipoReferenciaComercialCOD.hashCode());
		result = prime * result + ((tipoViviendaCOD == null) ? 0 : tipoViviendaCOD.hashCode());
		temp = Double.doubleToLongBits(totalCarteraVigente);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalEgresos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalIngresosFlujo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorDetalleDeCuentasEGRESOSGarante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorDetalleDeCuentasEGRESOSSocio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorDetalleDeCuentasINGRESOSGarante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorDetalleDeCuentasINGRESOSSocio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorDetallePatrimonial);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorDetallePatrimonialGarante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorPatrimonioACTIVOGarante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorPatrimonioACTIVOSocio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorPatrimonioPASIVOGarante);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(totalValorPatrimonioPASIVOSocio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((unidadAntiguedadNegocioCOD == null) ? 0 : unidadAntiguedadNegocioCOD.hashCode());
		result = prime * result + ((unidadAntiguedadNegocioMismoLugarCOD == null) ? 0
				: unidadAntiguedadNegocioMismoLugarCOD.hashCode());
		result = prime * result + ((unidadTiempoPlazoCOD == null) ? 0 : unidadTiempoPlazoCOD.hashCode());
		result = prime * result
				+ ((unidadTiempoViviendaActualCOD == null) ? 0 : unidadTiempoViviendaActualCOD.hashCode());
		result = prime * result
				+ ((unidadTiempoViviendaAnteriorCOD == null) ? 0 : unidadTiempoViviendaAnteriorCOD.hashCode());
		result = prime * result + usuarioID;
		result = prime * result + usuarioIDSolicitud;
		temp = Double.doubleToLongBits(utilidadNegocioTotalPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(utilidadNetaPersidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(valorReferenciasComerciales);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ventasMontos);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(ventasTotalesPerdidasYGanancias);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (viviendaHipotecada ? 1231 : 1237);
		return result;
	}

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Respuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Respuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciasPersonales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "referenciasPersonales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasPersonales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasPersonales"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreModulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NombreModulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solicitudID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SolicitudID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ProductoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moduloID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ModuloID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCuotaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoCuotaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MontoSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Tasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plazo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Plazo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoPlazoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadTiempoPlazoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formaPagoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FormaPagoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primerInteres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrimerInteres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primeraCuota");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PrimeraCuota"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoGarantiaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoGarantiaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinoEconomicoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DestinoEconomicoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinoDetalle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DestinoDetalle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuotaCreditoVigente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CuotaCreditoVigente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decisionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DecisionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Observacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IVA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IVA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoGracia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PeriodoGracia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interesesAmortizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "InteresesAmortizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioIDSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UsuarioIDSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PersonaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaSolicitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FechaSolicitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RelacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Identificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionConyuge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionConyuge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPersonaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoPersonaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoIdentificacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoIdentificacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApellidoPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apellidoMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ApellidoMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Nombres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCivilCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EstadoCivilCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SexoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCarga");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroCarga"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("separacionBienes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SeparacionBienes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidadCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NacionalidadCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivelEducacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NivelEducacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocupacionCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "OcupacionCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaApertura");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "FechaApertura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localidadCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "LocalidadCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Direccion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoViviendaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoViviendaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("situacionViviendaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SituacionViviendaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viviendaHipotecada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ViviendaHipotecada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duenoCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DuenoCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoDuenoCasa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoDuenoCasa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiempoViviendaActual");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TiempoViviendaActual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoViviendaActualCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadTiempoViviendaActualCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciaUbicacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciaUbicacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiempoViviendaAnterior");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TiempoViviendaAnterior"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoViviendaAnteriorCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadTiempoViviendaAnteriorCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoDomicilio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoDomicilio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoCelular");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoCelular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Socio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Persona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("garante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Garante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Persona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conyugeGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ConyugeGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Persona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conyugeSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ConyugeSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Persona"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identificacionInformacionNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IdentificacionInformacionNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreInformacionNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NombreInformacionNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectorEconomicoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "SectorEconomicoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiguedadNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AntiguedadNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadAntiguedadNegocioCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadAntiguedadNegocioCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroEmpleados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroEmpleados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionInformacionNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DireccionInformacionNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Referencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direccionTrabajoConyuge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DireccionTrabajoConyuge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoTrabajoConyuge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoTrabajoConyuge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("antiguedadNegocioMismoLugar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "AntiguedadNegocioMismoLugar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadAntiguedadNegocioMismoLugarCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UnidadAntiguedadNegocioMismoLugarCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoLocalCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoLocalCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comercio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Comercio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingreso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Ingreso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Latitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitud");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Longitud"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalledeCuentasSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DetalledeCuentasSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DetalleDeCuentas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "DetalleDeCuentas"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detalledeCuentasGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DetalledeCuentasGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DetalleDeCuentas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "DetalleDeCuentas"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorPatrimonioACTIVOSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorPatrimonioACTIVOSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorPatrimonioPASIVOSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorPatrimonioPASIVOSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorDetalleDeCuentasINGRESOSSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorDetalleDeCuentasINGRESOSSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorDetalleDeCuentasEGRESOSSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorDetalleDeCuentasEGRESOSSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorPatrimonioACTIVOGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorPatrimonioACTIVOGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorPatrimonioPASIVOGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorPatrimonioPASIVOGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorDetalleDeCuentasINGRESOSGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorDetalleDeCuentasINGRESOSGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorDetalleDeCuentasEGRESOSGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorDetalleDeCuentasEGRESOSGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detallePatrimonialSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrimonialSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrimonial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrimonial"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorDetallePatrimonial");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorDetallePatrimonial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detallePatrominialGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrominialGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrimonial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "DetallePatrimonial"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalValorDetallePatrimonialGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "totalValorDetallePatrimonialGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("garantiasReales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GarantiasReales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "GarantiasReales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "GarantiasReales"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciasPersonales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasPersonales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasPersonales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasPersonales"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenciasComerciales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasComerciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasComerciales"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ReferenciasComerciales"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoReferenciaComercialCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TipoReferenciaComercialCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcionRererenciasComerciales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DescripcionRererenciasComerciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorReferenciasComerciales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ValorReferenciasComerciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonoReferenciasComerciales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TelefonoReferenciasComerciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("observacionReferenciasComerciales");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ObservacionReferenciasComerciales"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("patrimonioMontos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PatrimonioMontos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ventasMontos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "VentasMontos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costototal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Costototal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalIngresosFlujo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TotalIngresosFlujo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingresosFamiliar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IngresosFamiliar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingresosNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IngresosNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalEgresos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TotalEgresos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egresosFamiliar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EgresosFamiliar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egresosNegocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EgresosNegocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibilidadAntesCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DisponibilidadAntesCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuoraCredito");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CuoraCredito"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponibleNeto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "DisponibleNeto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ventasTotalesPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "ventasTotalesPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costosTotalesPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CostosTotalesPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gastosTotalesPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GastosTotalesPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gastosFinancierosPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GastosFinancierosPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilidadNegocioTotalPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UtilidadNegocioTotalPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egresosNegocioPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EgresosNegocioPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingresosFamiliaresTotalPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "IngresosFamiliaresTotalPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("egresosFamiliaresTotalPerdidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EgresosFamiliaresTotalPerdidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utilidadNetaPersidasYGanancias");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UtilidadNetaPersidasYGanancias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralRiesgoSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CentralRiesgoSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaCentralRiesgo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralRiesgoConyugeSocio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CentralRiesgoConyugeSocio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaCentralRiesgo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralRiesgoGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CentralRiesgoGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaCentralRiesgo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("centralRiesgoConyugeGarante");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CentralRiesgoConyugeGarante"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaCentralRiesgo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoTotalEndeudamiento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MontoTotalEndeudamiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalCarteraVigente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TotalCarteraVigente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carteraRiesgo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CarteraRiesgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calificacionRiesgoCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CalificacionRiesgoCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("castigoDemanda");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CastigoDemanda"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peorCalificacion12MesesCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PeorCalificacion12mesesCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("castigoDemanda12Meses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "CastigoDemanda12meses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCreditosIFI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroCreditosIFI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroOperaciones");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "NumeroOperaciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reciprocidad");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Reciprocidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoCentralRiesgo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "EstadoCentralRiesgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "UsuarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "short"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personaIdCentralRiesgo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "PersonaIdCentralRiesgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tieneError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "TieneError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaCOD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "RespuestaCOD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmento");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Segmento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "Metodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajePersonalizado");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MensajePersonalizado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensajeTecnico");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "MensajeTecnico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
		return "Respuesta [referenciasPersonales=" + Arrays.toString(referenciasPersonales) + ", nombreModulo="
				+ nombreModulo + ", solicitudID=" + solicitudID + ", productoID=" + productoID + ", moduloID="
				+ moduloID + ", tipoCuotaCOD=" + tipoCuotaCOD + ", montoSolicitud=" + montoSolicitud + ", tasa=" + tasa
				+ ", plazo=" + plazo + ", unidadTiempoPlazoCOD=" + unidadTiempoPlazoCOD + ", formaPagoCOD="
				+ formaPagoCOD + ", primerInteres=" + primerInteres + ", primeraCuota=" + primeraCuota
				+ ", tipoGarantiaCOD=" + tipoGarantiaCOD + ", destinoEconomicoCOD=" + destinoEconomicoCOD
				+ ", destinoDetalle=" + destinoDetalle + ", cuotaCreditoVigente=" + cuotaCreditoVigente
				+ ", decisionCOD=" + decisionCOD + ", observacion=" + observacion + ", IVA=" + IVA + ", periodoGracia="
				+ periodoGracia + ", interesesAmortizacion=" + interesesAmortizacion + ", usuarioIDSolicitud="
				+ usuarioIDSolicitud + ", identificacionSolicitud=" + identificacionSolicitud + ", personaID="
				+ personaID + ", fechaSolicitud=" + fechaSolicitud + ", relacionCOD=" + relacionCOD
				+ ", identificacion=" + identificacion + ", identificacionConyuge=" + identificacionConyuge
				+ ", tipoPersonaCOD=" + tipoPersonaCOD + ", tipoIdentificacionCOD=" + tipoIdentificacionCOD
				+ ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", nombres="
				+ nombres + ", fechaNacimiento=" + fechaNacimiento + ", estadoCivilCOD=" + estadoCivilCOD + ", sexoCOD="
				+ sexoCOD + ", numeroCarga=" + numeroCarga + ", separacionBienes=" + separacionBienes
				+ ", nacionalidadCOD=" + nacionalidadCOD + ", nivelEducacionCOD=" + nivelEducacionCOD
				+ ", ocupacionCOD=" + ocupacionCOD + ", correo=" + correo + ", fechaApertura=" + fechaApertura
				+ ", localidadCOD=" + localidadCOD + ", direccion=" + direccion + ", tipoViviendaCOD=" + tipoViviendaCOD
				+ ", situacionViviendaCOD=" + situacionViviendaCOD + ", viviendaHipotecada=" + viviendaHipotecada
				+ ", duenoCasa=" + duenoCasa + ", telefonoDuenoCasa=" + telefonoDuenoCasa + ", tiempoViviendaActual="
				+ tiempoViviendaActual + ", unidadTiempoViviendaActualCOD=" + unidadTiempoViviendaActualCOD
				+ ", referenciaUbicacion=" + referenciaUbicacion + ", tiempoViviendaAnterior=" + tiempoViviendaAnterior
				+ ", unidadTiempoViviendaAnteriorCOD=" + unidadTiempoViviendaAnteriorCOD + ", telefonoDomicilio="
				+ telefonoDomicilio + ", telefonoCelular=" + telefonoCelular + ", socio=" + socio
				+ ", identificacionSocio=" + identificacionSocio + ", garante=" + garante + ", identificacionGarante="
				+ identificacionGarante + ", conyugeGarante=" + conyugeGarante + ", conyugeSocio=" + conyugeSocio
				+ ", identificacionInformacionNegocio=" + identificacionInformacionNegocio
				+ ", nombreInformacionNegocio=" + nombreInformacionNegocio + ", sectorEconomicoCOD="
				+ sectorEconomicoCOD + ", descripcion=" + descripcion + ", antiguedadNegocio=" + antiguedadNegocio
				+ ", unidadAntiguedadNegocioCOD=" + unidadAntiguedadNegocioCOD + ", numeroEmpleados=" + numeroEmpleados
				+ ", direccionInformacionNegocio=" + direccionInformacionNegocio + ", referencia=" + referencia
				+ ", telefono=" + telefono + ", direccionTrabajoConyuge=" + direccionTrabajoConyuge
				+ ", telefonoTrabajoConyuge=" + telefonoTrabajoConyuge + ", antiguedadNegocioMismoLugar="
				+ antiguedadNegocioMismoLugar + ", unidadAntiguedadNegocioMismoLugarCOD="
				+ unidadAntiguedadNegocioMismoLugarCOD + ", tipoLocalCOD=" + tipoLocalCOD + ", comercio=" + comercio
				+ ", ingreso=" + ingreso + ", estado=" + estado + ", latitud=" + latitud + ", longitud=" + longitud
				+ ", detalledeCuentasSocio=" + Arrays.toString(detalledeCuentasSocio) + ", detalledeCuentasGarante="
				+ Arrays.toString(detalledeCuentasGarante) + ", totalValorPatrimonioACTIVOSocio="
				+ totalValorPatrimonioACTIVOSocio + ", totalValorPatrimonioPASIVOSocio="
				+ totalValorPatrimonioPASIVOSocio + ", totalValorDetalleDeCuentasINGRESOSSocio="
				+ totalValorDetalleDeCuentasINGRESOSSocio + ", totalValorDetalleDeCuentasEGRESOSSocio="
				+ totalValorDetalleDeCuentasEGRESOSSocio + ", totalValorPatrimonioACTIVOGarante="
				+ totalValorPatrimonioACTIVOGarante + ", totalValorPatrimonioPASIVOGarante="
				+ totalValorPatrimonioPASIVOGarante + ", totalValorDetalleDeCuentasINGRESOSGarante="
				+ totalValorDetalleDeCuentasINGRESOSGarante + ", totalValorDetalleDeCuentasEGRESOSGarante="
				+ totalValorDetalleDeCuentasEGRESOSGarante + ", detallePatrimonialSocio="
				+ Arrays.toString(detallePatrimonialSocio) + ", totalValorDetallePatrimonial="
				+ totalValorDetallePatrimonial + ", detallePatrominialGarante="
				+ Arrays.toString(detallePatrominialGarante) + ", totalValorDetallePatrimonialGarante="
				+ totalValorDetallePatrimonialGarante + ", garantiasReales=" + Arrays.toString(garantiasReales)
				+ ", referenciasPersonales2=" + Arrays.toString(referenciasPersonales2) + ", referenciasComerciales="
				+ Arrays.toString(referenciasComerciales) + ", tipoReferenciaComercialCOD=" + tipoReferenciaComercialCOD
				+ ", descripcionRererenciasComerciales=" + descripcionRererenciasComerciales
				+ ", valorReferenciasComerciales=" + valorReferenciasComerciales + ", telefonoReferenciasComerciales="
				+ telefonoReferenciasComerciales + ", observacionReferenciasComerciales="
				+ observacionReferenciasComerciales + ", patrimonioMontos=" + patrimonioMontos + ", ventasMontos="
				+ ventasMontos + ", costototal=" + costototal + ", totalIngresosFlujo=" + totalIngresosFlujo
				+ ", ingresosFamiliar=" + ingresosFamiliar + ", ingresosNegocio=" + ingresosNegocio + ", totalEgresos="
				+ totalEgresos + ", egresosFamiliar=" + egresosFamiliar + ", egresosNegocio=" + egresosNegocio
				+ ", disponibilidadAntesCredito=" + disponibilidadAntesCredito + ", cuoraCredito=" + cuoraCredito
				+ ", disponibleNeto=" + disponibleNeto + ", ventasTotalesPerdidasYGanancias="
				+ ventasTotalesPerdidasYGanancias + ", costosTotalesPerdidasYGanancias="
				+ costosTotalesPerdidasYGanancias + ", gastosTotalesPerdidasYGanancias="
				+ gastosTotalesPerdidasYGanancias + ", gastosFinancierosPerdidasYGanancias="
				+ gastosFinancierosPerdidasYGanancias + ", utilidadNegocioTotalPerdidasYGanancias="
				+ utilidadNegocioTotalPerdidasYGanancias + ", egresosNegocioPerdidasYGanancias="
				+ egresosNegocioPerdidasYGanancias + ", ingresosFamiliaresTotalPerdidasYGanancias="
				+ ingresosFamiliaresTotalPerdidasYGanancias + ", egresosFamiliaresTotalPerdidasYGanancias="
				+ egresosFamiliaresTotalPerdidasYGanancias + ", utilidadNetaPersidasYGanancias="
				+ utilidadNetaPersidasYGanancias + ", centralRiesgoSocio=" + centralRiesgoSocio
				+ ", centralRiesgoConyugeSocio=" + centralRiesgoConyugeSocio + ", centralRiesgoGarante="
				+ centralRiesgoGarante + ", centralRiesgoConyugeGarante=" + centralRiesgoConyugeGarante
				+ ", montoTotalEndeudamiento=" + montoTotalEndeudamiento + ", totalCarteraVigente="
				+ totalCarteraVigente + ", carteraRiesgo=" + carteraRiesgo + ", calificacionRiesgoCOD="
				+ calificacionRiesgoCOD + ", castigoDemanda=" + castigoDemanda + ", peorCalificacion12MesesCOD="
				+ peorCalificacion12MesesCOD + ", castigoDemanda12Meses=" + castigoDemanda12Meses
				+ ", numeroCreditosIFI=" + numeroCreditosIFI + ", numeroOperaciones=" + numeroOperaciones
				+ ", reciprocidad=" + reciprocidad + ", estadoCentralRiesgo=" + estadoCentralRiesgo + ", usuarioID="
				+ usuarioID + ", personaIdCentralRiesgo=" + personaIdCentralRiesgo + ", tieneError=" + tieneError
				+ ", mensaje=" + mensaje + ", respuestaCOD=" + respuestaCOD + ", segmento=" + segmento + ", metodo="
				+ metodo + ", mensajePersonalizado=" + mensajePersonalizado + ", mensajeTecnico=" + mensajeTecnico
				+ ", __equalsCalc=" + __equalsCalc + ", __hashCodeCalc=" + __hashCodeCalc + "]";
	}

    
}

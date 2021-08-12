/**
 * Respuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public class Respuesta  implements java.io.Serializable {
    private ReferenciasPersonales[] referenciasPersonales;

    private java.lang.String nombreModulo;

    private int solicitudID;

    private java.lang.Integer productoID;

    private int moduloID;

    private java.lang.String tipoCuotaCOD;

    private java.math.BigDecimal montoSolicitud;

    private java.math.BigDecimal tasa;

    private short plazo;

    private java.lang.String unidadTiempoPlazoCOD;

    private java.lang.String formaPagoCOD;

    private java.math.BigDecimal primerInteres;

    private java.math.BigDecimal primeraCuota;

    private java.lang.String tipoGarantiaCOD;

    private java.lang.String destinoEconomicoCOD;

    private java.lang.String destinoDetalle;

    private java.math.BigDecimal cuotaCreditoVigente;

    private java.lang.String decisionCOD;

    private java.lang.String observacion;

    private java.math.BigDecimal IVA;

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

    private java.math.BigDecimal latitud;

    private java.math.BigDecimal longitud;

    private DetalleDeCuentas[] detalledeCuentasSocio;

    private DetalleDeCuentas[] detalledeCuentasGarante;

    private java.math.BigDecimal totalValorPatrimonioACTIVOSocio;

    private java.math.BigDecimal totalValorPatrimonioPASIVOSocio;

    private java.math.BigDecimal totalValorDetalleDeCuentasINGRESOSSocio;

    private java.math.BigDecimal totalValorDetalleDeCuentasEGRESOSSocio;

    private java.math.BigDecimal totalValorPatrimonioACTIVOGarante;

    private java.math.BigDecimal totalValorPatrimonioPASIVOGarante;

    private java.math.BigDecimal totalValorDetalleDeCuentasINGRESOSGarante;

    private java.math.BigDecimal totalValorDetalleDeCuentasEGRESOSGarante;

    private DetallePatrimonial[] detallePatrimonialSocio;

    private java.math.BigDecimal totalValorDetallePatrimonial;

    private DetallePatrimonial[] detallePatrominialGarante;

    private java.math.BigDecimal totalValorDetallePatrimonialGarante;

    private GarantiasReales[] garantiasReales;

    private ReferenciasPersonales[] referenciasPersonales2;

    private ReferenciasComerciales[] referenciasComerciales;

    private java.lang.String tipoReferenciaComercialCOD;

    private java.lang.String descripcionRererenciasComerciales;

    private java.math.BigDecimal valorReferenciasComerciales;

    private java.lang.String telefonoReferenciasComerciales;

    private java.lang.String observacionReferenciasComerciales;

    private java.math.BigDecimal patrimonioMontos;

    private java.math.BigDecimal ventasMontos;

    private java.math.BigDecimal costototal;

    private java.math.BigDecimal totalIngresosFlujo;

    private java.math.BigDecimal ingresosFamiliar;

    private java.math.BigDecimal ingresosNegocio;

    private java.math.BigDecimal totalEgresos;

    private java.math.BigDecimal egresosFamiliar;

    private java.math.BigDecimal egresosNegocio;

    private java.math.BigDecimal disponibilidadAntesCredito;

    private java.math.BigDecimal cuoraCredito;

    private java.math.BigDecimal disponibleNeto;

    private java.math.BigDecimal ventasTotalesPerdidasYGanancias;

    private java.math.BigDecimal costosTotalesPerdidasYGanancias;

    private java.math.BigDecimal gastosTotalesPerdidasYGanancias;

    private java.math.BigDecimal gastosFinancierosPerdidasYGanancias;

    private java.math.BigDecimal utilidadNegocioTotalPerdidasYGanancias;

    private java.math.BigDecimal egresosNegocioPerdidasYGanancias;

    private java.math.BigDecimal ingresosFamiliaresTotalPerdidasYGanancias;

    private java.math.BigDecimal egresosFamiliaresTotalPerdidasYGanancias;

    private java.math.BigDecimal utilidadNetaPersidasYGanancias;

    private RespuestaCentralRiesgo centralRiesgoSocio;

    private RespuestaCentralRiesgo centralRiesgoConyugeSocio;

    private RespuestaCentralRiesgo centralRiesgoGarante;

    private RespuestaCentralRiesgo centralRiesgoConyugeGarante;

    private java.math.BigDecimal montoTotalEndeudamiento;

    private java.math.BigDecimal totalCarteraVigente;

    private java.math.BigDecimal carteraRiesgo;

    private java.lang.String calificacionRiesgoCOD;

    private java.math.BigDecimal castigoDemanda;

    private java.lang.String peorCalificacion12MesesCOD;

    private java.math.BigDecimal castigoDemanda12Meses;

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
           java.lang.Integer productoID,
           int moduloID,
           java.lang.String tipoCuotaCOD,
           java.math.BigDecimal montoSolicitud,
           java.math.BigDecimal tasa,
           short plazo,
           java.lang.String unidadTiempoPlazoCOD,
           java.lang.String formaPagoCOD,
           java.math.BigDecimal primerInteres,
           java.math.BigDecimal primeraCuota,
           java.lang.String tipoGarantiaCOD,
           java.lang.String destinoEconomicoCOD,
           java.lang.String destinoDetalle,
           java.math.BigDecimal cuotaCreditoVigente,
           java.lang.String decisionCOD,
           java.lang.String observacion,
           java.math.BigDecimal IVA,
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
           java.math.BigDecimal latitud,
           java.math.BigDecimal longitud,
           DetalleDeCuentas[] detalledeCuentasSocio,
           DetalleDeCuentas[] detalledeCuentasGarante,
           java.math.BigDecimal totalValorPatrimonioACTIVOSocio,
           java.math.BigDecimal totalValorPatrimonioPASIVOSocio,
           java.math.BigDecimal totalValorDetalleDeCuentasINGRESOSSocio,
           java.math.BigDecimal totalValorDetalleDeCuentasEGRESOSSocio,
           java.math.BigDecimal totalValorPatrimonioACTIVOGarante,
           java.math.BigDecimal totalValorPatrimonioPASIVOGarante,
           java.math.BigDecimal totalValorDetalleDeCuentasINGRESOSGarante,
           java.math.BigDecimal totalValorDetalleDeCuentasEGRESOSGarante,
           DetallePatrimonial[] detallePatrimonialSocio,
           java.math.BigDecimal totalValorDetallePatrimonial,
           DetallePatrimonial[] detallePatrominialGarante,
           java.math.BigDecimal totalValorDetallePatrimonialGarante,
           GarantiasReales[] garantiasReales,
           ReferenciasPersonales[] referenciasPersonales2,
           ReferenciasComerciales[] referenciasComerciales,
           java.lang.String tipoReferenciaComercialCOD,
           java.lang.String descripcionRererenciasComerciales,
           java.math.BigDecimal valorReferenciasComerciales,
           java.lang.String telefonoReferenciasComerciales,
           java.lang.String observacionReferenciasComerciales,
           java.math.BigDecimal patrimonioMontos,
           java.math.BigDecimal ventasMontos,
           java.math.BigDecimal costototal,
           java.math.BigDecimal totalIngresosFlujo,
           java.math.BigDecimal ingresosFamiliar,
           java.math.BigDecimal ingresosNegocio,
           java.math.BigDecimal totalEgresos,
           java.math.BigDecimal egresosFamiliar,
           java.math.BigDecimal egresosNegocio,
           java.math.BigDecimal disponibilidadAntesCredito,
           java.math.BigDecimal cuoraCredito,
           java.math.BigDecimal disponibleNeto,
           java.math.BigDecimal ventasTotalesPerdidasYGanancias,
           java.math.BigDecimal costosTotalesPerdidasYGanancias,
           java.math.BigDecimal gastosTotalesPerdidasYGanancias,
           java.math.BigDecimal gastosFinancierosPerdidasYGanancias,
           java.math.BigDecimal utilidadNegocioTotalPerdidasYGanancias,
           java.math.BigDecimal egresosNegocioPerdidasYGanancias,
           java.math.BigDecimal ingresosFamiliaresTotalPerdidasYGanancias,
           java.math.BigDecimal egresosFamiliaresTotalPerdidasYGanancias,
           java.math.BigDecimal utilidadNetaPersidasYGanancias,
           RespuestaCentralRiesgo centralRiesgoSocio,
           RespuestaCentralRiesgo centralRiesgoConyugeSocio,
           RespuestaCentralRiesgo centralRiesgoGarante,
           RespuestaCentralRiesgo centralRiesgoConyugeGarante,
           java.math.BigDecimal montoTotalEndeudamiento,
           java.math.BigDecimal totalCarteraVigente,
           java.math.BigDecimal carteraRiesgo,
           java.lang.String calificacionRiesgoCOD,
           java.math.BigDecimal castigoDemanda,
           java.lang.String peorCalificacion12MesesCOD,
           java.math.BigDecimal castigoDemanda12Meses,
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
    public java.lang.Integer getProductoID() {
        return productoID;
    }


    /**
     * Sets the productoID value for this Respuesta.
     * 
     * @param productoID
     */
    public void setProductoID(java.lang.Integer productoID) {
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
    public java.math.BigDecimal getMontoSolicitud() {
        return montoSolicitud;
    }


    /**
     * Sets the montoSolicitud value for this Respuesta.
     * 
     * @param montoSolicitud
     */
    public void setMontoSolicitud(java.math.BigDecimal montoSolicitud) {
        this.montoSolicitud = montoSolicitud;
    }


    /**
     * Gets the tasa value for this Respuesta.
     * 
     * @return tasa
     */
    public java.math.BigDecimal getTasa() {
        return tasa;
    }


    /**
     * Sets the tasa value for this Respuesta.
     * 
     * @param tasa
     */
    public void setTasa(java.math.BigDecimal tasa) {
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
    public java.math.BigDecimal getPrimerInteres() {
        return primerInteres;
    }


    /**
     * Sets the primerInteres value for this Respuesta.
     * 
     * @param primerInteres
     */
    public void setPrimerInteres(java.math.BigDecimal primerInteres) {
        this.primerInteres = primerInteres;
    }


    /**
     * Gets the primeraCuota value for this Respuesta.
     * 
     * @return primeraCuota
     */
    public java.math.BigDecimal getPrimeraCuota() {
        return primeraCuota;
    }


    /**
     * Sets the primeraCuota value for this Respuesta.
     * 
     * @param primeraCuota
     */
    public void setPrimeraCuota(java.math.BigDecimal primeraCuota) {
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
    public java.math.BigDecimal getCuotaCreditoVigente() {
        return cuotaCreditoVigente;
    }


    /**
     * Sets the cuotaCreditoVigente value for this Respuesta.
     * 
     * @param cuotaCreditoVigente
     */
    public void setCuotaCreditoVigente(java.math.BigDecimal cuotaCreditoVigente) {
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
    public java.math.BigDecimal getIVA() {
        return IVA;
    }


    /**
     * Sets the IVA value for this Respuesta.
     * 
     * @param IVA
     */
    public void setIVA(java.math.BigDecimal IVA) {
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
    public java.math.BigDecimal getLatitud() {
        return latitud;
    }


    /**
     * Sets the latitud value for this Respuesta.
     * 
     * @param latitud
     */
    public void setLatitud(java.math.BigDecimal latitud) {
        this.latitud = latitud;
    }


    /**
     * Gets the longitud value for this Respuesta.
     * 
     * @return longitud
     */
    public java.math.BigDecimal getLongitud() {
        return longitud;
    }


    /**
     * Sets the longitud value for this Respuesta.
     * 
     * @param longitud
     */
    public void setLongitud(java.math.BigDecimal longitud) {
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
    public java.math.BigDecimal getTotalValorPatrimonioACTIVOSocio() {
        return totalValorPatrimonioACTIVOSocio;
    }


    /**
     * Sets the totalValorPatrimonioACTIVOSocio value for this Respuesta.
     * 
     * @param totalValorPatrimonioACTIVOSocio
     */
    public void setTotalValorPatrimonioACTIVOSocio(java.math.BigDecimal totalValorPatrimonioACTIVOSocio) {
        this.totalValorPatrimonioACTIVOSocio = totalValorPatrimonioACTIVOSocio;
    }


    /**
     * Gets the totalValorPatrimonioPASIVOSocio value for this Respuesta.
     * 
     * @return totalValorPatrimonioPASIVOSocio
     */
    public java.math.BigDecimal getTotalValorPatrimonioPASIVOSocio() {
        return totalValorPatrimonioPASIVOSocio;
    }


    /**
     * Sets the totalValorPatrimonioPASIVOSocio value for this Respuesta.
     * 
     * @param totalValorPatrimonioPASIVOSocio
     */
    public void setTotalValorPatrimonioPASIVOSocio(java.math.BigDecimal totalValorPatrimonioPASIVOSocio) {
        this.totalValorPatrimonioPASIVOSocio = totalValorPatrimonioPASIVOSocio;
    }


    /**
     * Gets the totalValorDetalleDeCuentasINGRESOSSocio value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasINGRESOSSocio
     */
    public java.math.BigDecimal getTotalValorDetalleDeCuentasINGRESOSSocio() {
        return totalValorDetalleDeCuentasINGRESOSSocio;
    }


    /**
     * Sets the totalValorDetalleDeCuentasINGRESOSSocio value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasINGRESOSSocio
     */
    public void setTotalValorDetalleDeCuentasINGRESOSSocio(java.math.BigDecimal totalValorDetalleDeCuentasINGRESOSSocio) {
        this.totalValorDetalleDeCuentasINGRESOSSocio = totalValorDetalleDeCuentasINGRESOSSocio;
    }


    /**
     * Gets the totalValorDetalleDeCuentasEGRESOSSocio value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasEGRESOSSocio
     */
    public java.math.BigDecimal getTotalValorDetalleDeCuentasEGRESOSSocio() {
        return totalValorDetalleDeCuentasEGRESOSSocio;
    }


    /**
     * Sets the totalValorDetalleDeCuentasEGRESOSSocio value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasEGRESOSSocio
     */
    public void setTotalValorDetalleDeCuentasEGRESOSSocio(java.math.BigDecimal totalValorDetalleDeCuentasEGRESOSSocio) {
        this.totalValorDetalleDeCuentasEGRESOSSocio = totalValorDetalleDeCuentasEGRESOSSocio;
    }


    /**
     * Gets the totalValorPatrimonioACTIVOGarante value for this Respuesta.
     * 
     * @return totalValorPatrimonioACTIVOGarante
     */
    public java.math.BigDecimal getTotalValorPatrimonioACTIVOGarante() {
        return totalValorPatrimonioACTIVOGarante;
    }


    /**
     * Sets the totalValorPatrimonioACTIVOGarante value for this Respuesta.
     * 
     * @param totalValorPatrimonioACTIVOGarante
     */
    public void setTotalValorPatrimonioACTIVOGarante(java.math.BigDecimal totalValorPatrimonioACTIVOGarante) {
        this.totalValorPatrimonioACTIVOGarante = totalValorPatrimonioACTIVOGarante;
    }


    /**
     * Gets the totalValorPatrimonioPASIVOGarante value for this Respuesta.
     * 
     * @return totalValorPatrimonioPASIVOGarante
     */
    public java.math.BigDecimal getTotalValorPatrimonioPASIVOGarante() {
        return totalValorPatrimonioPASIVOGarante;
    }


    /**
     * Sets the totalValorPatrimonioPASIVOGarante value for this Respuesta.
     * 
     * @param totalValorPatrimonioPASIVOGarante
     */
    public void setTotalValorPatrimonioPASIVOGarante(java.math.BigDecimal totalValorPatrimonioPASIVOGarante) {
        this.totalValorPatrimonioPASIVOGarante = totalValorPatrimonioPASIVOGarante;
    }


    /**
     * Gets the totalValorDetalleDeCuentasINGRESOSGarante value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasINGRESOSGarante
     */
    public java.math.BigDecimal getTotalValorDetalleDeCuentasINGRESOSGarante() {
        return totalValorDetalleDeCuentasINGRESOSGarante;
    }


    /**
     * Sets the totalValorDetalleDeCuentasINGRESOSGarante value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasINGRESOSGarante
     */
    public void setTotalValorDetalleDeCuentasINGRESOSGarante(java.math.BigDecimal totalValorDetalleDeCuentasINGRESOSGarante) {
        this.totalValorDetalleDeCuentasINGRESOSGarante = totalValorDetalleDeCuentasINGRESOSGarante;
    }


    /**
     * Gets the totalValorDetalleDeCuentasEGRESOSGarante value for this Respuesta.
     * 
     * @return totalValorDetalleDeCuentasEGRESOSGarante
     */
    public java.math.BigDecimal getTotalValorDetalleDeCuentasEGRESOSGarante() {
        return totalValorDetalleDeCuentasEGRESOSGarante;
    }


    /**
     * Sets the totalValorDetalleDeCuentasEGRESOSGarante value for this Respuesta.
     * 
     * @param totalValorDetalleDeCuentasEGRESOSGarante
     */
    public void setTotalValorDetalleDeCuentasEGRESOSGarante(java.math.BigDecimal totalValorDetalleDeCuentasEGRESOSGarante) {
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
    public java.math.BigDecimal getTotalValorDetallePatrimonial() {
        return totalValorDetallePatrimonial;
    }


    /**
     * Sets the totalValorDetallePatrimonial value for this Respuesta.
     * 
     * @param totalValorDetallePatrimonial
     */
    public void setTotalValorDetallePatrimonial(java.math.BigDecimal totalValorDetallePatrimonial) {
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
    public java.math.BigDecimal getTotalValorDetallePatrimonialGarante() {
        return totalValorDetallePatrimonialGarante;
    }


    /**
     * Sets the totalValorDetallePatrimonialGarante value for this Respuesta.
     * 
     * @param totalValorDetallePatrimonialGarante
     */
    public void setTotalValorDetallePatrimonialGarante(java.math.BigDecimal totalValorDetallePatrimonialGarante) {
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
    public java.math.BigDecimal getValorReferenciasComerciales() {
        return valorReferenciasComerciales;
    }


    /**
     * Sets the valorReferenciasComerciales value for this Respuesta.
     * 
     * @param valorReferenciasComerciales
     */
    public void setValorReferenciasComerciales(java.math.BigDecimal valorReferenciasComerciales) {
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
    public java.math.BigDecimal getPatrimonioMontos() {
        return patrimonioMontos;
    }


    /**
     * Sets the patrimonioMontos value for this Respuesta.
     * 
     * @param patrimonioMontos
     */
    public void setPatrimonioMontos(java.math.BigDecimal patrimonioMontos) {
        this.patrimonioMontos = patrimonioMontos;
    }


    /**
     * Gets the ventasMontos value for this Respuesta.
     * 
     * @return ventasMontos
     */
    public java.math.BigDecimal getVentasMontos() {
        return ventasMontos;
    }


    /**
     * Sets the ventasMontos value for this Respuesta.
     * 
     * @param ventasMontos
     */
    public void setVentasMontos(java.math.BigDecimal ventasMontos) {
        this.ventasMontos = ventasMontos;
    }


    /**
     * Gets the costototal value for this Respuesta.
     * 
     * @return costototal
     */
    public java.math.BigDecimal getCostototal() {
        return costototal;
    }


    /**
     * Sets the costototal value for this Respuesta.
     * 
     * @param costototal
     */
    public void setCostototal(java.math.BigDecimal costototal) {
        this.costototal = costototal;
    }


    /**
     * Gets the totalIngresosFlujo value for this Respuesta.
     * 
     * @return totalIngresosFlujo
     */
    public java.math.BigDecimal getTotalIngresosFlujo() {
        return totalIngresosFlujo;
    }


    /**
     * Sets the totalIngresosFlujo value for this Respuesta.
     * 
     * @param totalIngresosFlujo
     */
    public void setTotalIngresosFlujo(java.math.BigDecimal totalIngresosFlujo) {
        this.totalIngresosFlujo = totalIngresosFlujo;
    }


    /**
     * Gets the ingresosFamiliar value for this Respuesta.
     * 
     * @return ingresosFamiliar
     */
    public java.math.BigDecimal getIngresosFamiliar() {
        return ingresosFamiliar;
    }


    /**
     * Sets the ingresosFamiliar value for this Respuesta.
     * 
     * @param ingresosFamiliar
     */
    public void setIngresosFamiliar(java.math.BigDecimal ingresosFamiliar) {
        this.ingresosFamiliar = ingresosFamiliar;
    }


    /**
     * Gets the ingresosNegocio value for this Respuesta.
     * 
     * @return ingresosNegocio
     */
    public java.math.BigDecimal getIngresosNegocio() {
        return ingresosNegocio;
    }


    /**
     * Sets the ingresosNegocio value for this Respuesta.
     * 
     * @param ingresosNegocio
     */
    public void setIngresosNegocio(java.math.BigDecimal ingresosNegocio) {
        this.ingresosNegocio = ingresosNegocio;
    }


    /**
     * Gets the totalEgresos value for this Respuesta.
     * 
     * @return totalEgresos
     */
    public java.math.BigDecimal getTotalEgresos() {
        return totalEgresos;
    }


    /**
     * Sets the totalEgresos value for this Respuesta.
     * 
     * @param totalEgresos
     */
    public void setTotalEgresos(java.math.BigDecimal totalEgresos) {
        this.totalEgresos = totalEgresos;
    }


    /**
     * Gets the egresosFamiliar value for this Respuesta.
     * 
     * @return egresosFamiliar
     */
    public java.math.BigDecimal getEgresosFamiliar() {
        return egresosFamiliar;
    }


    /**
     * Sets the egresosFamiliar value for this Respuesta.
     * 
     * @param egresosFamiliar
     */
    public void setEgresosFamiliar(java.math.BigDecimal egresosFamiliar) {
        this.egresosFamiliar = egresosFamiliar;
    }


    /**
     * Gets the egresosNegocio value for this Respuesta.
     * 
     * @return egresosNegocio
     */
    public java.math.BigDecimal getEgresosNegocio() {
        return egresosNegocio;
    }


    /**
     * Sets the egresosNegocio value for this Respuesta.
     * 
     * @param egresosNegocio
     */
    public void setEgresosNegocio(java.math.BigDecimal egresosNegocio) {
        this.egresosNegocio = egresosNegocio;
    }


    /**
     * Gets the disponibilidadAntesCredito value for this Respuesta.
     * 
     * @return disponibilidadAntesCredito
     */
    public java.math.BigDecimal getDisponibilidadAntesCredito() {
        return disponibilidadAntesCredito;
    }


    /**
     * Sets the disponibilidadAntesCredito value for this Respuesta.
     * 
     * @param disponibilidadAntesCredito
     */
    public void setDisponibilidadAntesCredito(java.math.BigDecimal disponibilidadAntesCredito) {
        this.disponibilidadAntesCredito = disponibilidadAntesCredito;
    }


    /**
     * Gets the cuoraCredito value for this Respuesta.
     * 
     * @return cuoraCredito
     */
    public java.math.BigDecimal getCuoraCredito() {
        return cuoraCredito;
    }


    /**
     * Sets the cuoraCredito value for this Respuesta.
     * 
     * @param cuoraCredito
     */
    public void setCuoraCredito(java.math.BigDecimal cuoraCredito) {
        this.cuoraCredito = cuoraCredito;
    }


    /**
     * Gets the disponibleNeto value for this Respuesta.
     * 
     * @return disponibleNeto
     */
    public java.math.BigDecimal getDisponibleNeto() {
        return disponibleNeto;
    }


    /**
     * Sets the disponibleNeto value for this Respuesta.
     * 
     * @param disponibleNeto
     */
    public void setDisponibleNeto(java.math.BigDecimal disponibleNeto) {
        this.disponibleNeto = disponibleNeto;
    }


    /**
     * Gets the ventasTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @return ventasTotalesPerdidasYGanancias
     */
    public java.math.BigDecimal getVentasTotalesPerdidasYGanancias() {
        return ventasTotalesPerdidasYGanancias;
    }


    /**
     * Sets the ventasTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @param ventasTotalesPerdidasYGanancias
     */
    public void setVentasTotalesPerdidasYGanancias(java.math.BigDecimal ventasTotalesPerdidasYGanancias) {
        this.ventasTotalesPerdidasYGanancias = ventasTotalesPerdidasYGanancias;
    }


    /**
     * Gets the costosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @return costosTotalesPerdidasYGanancias
     */
    public java.math.BigDecimal getCostosTotalesPerdidasYGanancias() {
        return costosTotalesPerdidasYGanancias;
    }


    /**
     * Sets the costosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @param costosTotalesPerdidasYGanancias
     */
    public void setCostosTotalesPerdidasYGanancias(java.math.BigDecimal costosTotalesPerdidasYGanancias) {
        this.costosTotalesPerdidasYGanancias = costosTotalesPerdidasYGanancias;
    }


    /**
     * Gets the gastosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @return gastosTotalesPerdidasYGanancias
     */
    public java.math.BigDecimal getGastosTotalesPerdidasYGanancias() {
        return gastosTotalesPerdidasYGanancias;
    }


    /**
     * Sets the gastosTotalesPerdidasYGanancias value for this Respuesta.
     * 
     * @param gastosTotalesPerdidasYGanancias
     */
    public void setGastosTotalesPerdidasYGanancias(java.math.BigDecimal gastosTotalesPerdidasYGanancias) {
        this.gastosTotalesPerdidasYGanancias = gastosTotalesPerdidasYGanancias;
    }


    /**
     * Gets the gastosFinancierosPerdidasYGanancias value for this Respuesta.
     * 
     * @return gastosFinancierosPerdidasYGanancias
     */
    public java.math.BigDecimal getGastosFinancierosPerdidasYGanancias() {
        return gastosFinancierosPerdidasYGanancias;
    }


    /**
     * Sets the gastosFinancierosPerdidasYGanancias value for this Respuesta.
     * 
     * @param gastosFinancierosPerdidasYGanancias
     */
    public void setGastosFinancierosPerdidasYGanancias(java.math.BigDecimal gastosFinancierosPerdidasYGanancias) {
        this.gastosFinancierosPerdidasYGanancias = gastosFinancierosPerdidasYGanancias;
    }


    /**
     * Gets the utilidadNegocioTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @return utilidadNegocioTotalPerdidasYGanancias
     */
    public java.math.BigDecimal getUtilidadNegocioTotalPerdidasYGanancias() {
        return utilidadNegocioTotalPerdidasYGanancias;
    }


    /**
     * Sets the utilidadNegocioTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @param utilidadNegocioTotalPerdidasYGanancias
     */
    public void setUtilidadNegocioTotalPerdidasYGanancias(java.math.BigDecimal utilidadNegocioTotalPerdidasYGanancias) {
        this.utilidadNegocioTotalPerdidasYGanancias = utilidadNegocioTotalPerdidasYGanancias;
    }


    /**
     * Gets the egresosNegocioPerdidasYGanancias value for this Respuesta.
     * 
     * @return egresosNegocioPerdidasYGanancias
     */
    public java.math.BigDecimal getEgresosNegocioPerdidasYGanancias() {
        return egresosNegocioPerdidasYGanancias;
    }


    /**
     * Sets the egresosNegocioPerdidasYGanancias value for this Respuesta.
     * 
     * @param egresosNegocioPerdidasYGanancias
     */
    public void setEgresosNegocioPerdidasYGanancias(java.math.BigDecimal egresosNegocioPerdidasYGanancias) {
        this.egresosNegocioPerdidasYGanancias = egresosNegocioPerdidasYGanancias;
    }


    /**
     * Gets the ingresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @return ingresosFamiliaresTotalPerdidasYGanancias
     */
    public java.math.BigDecimal getIngresosFamiliaresTotalPerdidasYGanancias() {
        return ingresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Sets the ingresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @param ingresosFamiliaresTotalPerdidasYGanancias
     */
    public void setIngresosFamiliaresTotalPerdidasYGanancias(java.math.BigDecimal ingresosFamiliaresTotalPerdidasYGanancias) {
        this.ingresosFamiliaresTotalPerdidasYGanancias = ingresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Gets the egresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @return egresosFamiliaresTotalPerdidasYGanancias
     */
    public java.math.BigDecimal getEgresosFamiliaresTotalPerdidasYGanancias() {
        return egresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Sets the egresosFamiliaresTotalPerdidasYGanancias value for this Respuesta.
     * 
     * @param egresosFamiliaresTotalPerdidasYGanancias
     */
    public void setEgresosFamiliaresTotalPerdidasYGanancias(java.math.BigDecimal egresosFamiliaresTotalPerdidasYGanancias) {
        this.egresosFamiliaresTotalPerdidasYGanancias = egresosFamiliaresTotalPerdidasYGanancias;
    }


    /**
     * Gets the utilidadNetaPersidasYGanancias value for this Respuesta.
     * 
     * @return utilidadNetaPersidasYGanancias
     */
    public java.math.BigDecimal getUtilidadNetaPersidasYGanancias() {
        return utilidadNetaPersidasYGanancias;
    }


    /**
     * Sets the utilidadNetaPersidasYGanancias value for this Respuesta.
     * 
     * @param utilidadNetaPersidasYGanancias
     */
    public void setUtilidadNetaPersidasYGanancias(java.math.BigDecimal utilidadNetaPersidasYGanancias) {
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
    public java.math.BigDecimal getMontoTotalEndeudamiento() {
        return montoTotalEndeudamiento;
    }


    /**
     * Sets the montoTotalEndeudamiento value for this Respuesta.
     * 
     * @param montoTotalEndeudamiento
     */
    public void setMontoTotalEndeudamiento(java.math.BigDecimal montoTotalEndeudamiento) {
        this.montoTotalEndeudamiento = montoTotalEndeudamiento;
    }


    /**
     * Gets the totalCarteraVigente value for this Respuesta.
     * 
     * @return totalCarteraVigente
     */
    public java.math.BigDecimal getTotalCarteraVigente() {
        return totalCarteraVigente;
    }


    /**
     * Sets the totalCarteraVigente value for this Respuesta.
     * 
     * @param totalCarteraVigente
     */
    public void setTotalCarteraVigente(java.math.BigDecimal totalCarteraVigente) {
        this.totalCarteraVigente = totalCarteraVigente;
    }


    /**
     * Gets the carteraRiesgo value for this Respuesta.
     * 
     * @return carteraRiesgo
     */
    public java.math.BigDecimal getCarteraRiesgo() {
        return carteraRiesgo;
    }


    /**
     * Sets the carteraRiesgo value for this Respuesta.
     * 
     * @param carteraRiesgo
     */
    public void setCarteraRiesgo(java.math.BigDecimal carteraRiesgo) {
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
    public java.math.BigDecimal getCastigoDemanda() {
        return castigoDemanda;
    }


    /**
     * Sets the castigoDemanda value for this Respuesta.
     * 
     * @param castigoDemanda
     */
    public void setCastigoDemanda(java.math.BigDecimal castigoDemanda) {
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
    public java.math.BigDecimal getCastigoDemanda12Meses() {
        return castigoDemanda12Meses;
    }


    /**
     * Sets the castigoDemanda12Meses value for this Respuesta.
     * 
     * @param castigoDemanda12Meses
     */
    public void setCastigoDemanda12Meses(java.math.BigDecimal castigoDemanda12Meses) {
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
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Respuesta)) return false;
        Respuesta other = (Respuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenciasPersonales==null && other.getReferenciasPersonales()==null) || 
             (this.referenciasPersonales!=null &&
              java.util.Arrays.equals(this.referenciasPersonales, other.getReferenciasPersonales()))) &&
            ((this.nombreModulo==null && other.getNombreModulo()==null) || 
             (this.nombreModulo!=null &&
              this.nombreModulo.equals(other.getNombreModulo()))) &&
            this.solicitudID == other.getSolicitudID() &&
            ((this.productoID==null && other.getProductoID()==null) || 
             (this.productoID!=null &&
              this.productoID.equals(other.getProductoID()))) &&
            this.moduloID == other.getModuloID() &&
            ((this.tipoCuotaCOD==null && other.getTipoCuotaCOD()==null) || 
             (this.tipoCuotaCOD!=null &&
              this.tipoCuotaCOD.equals(other.getTipoCuotaCOD()))) &&
            ((this.montoSolicitud==null && other.getMontoSolicitud()==null) || 
             (this.montoSolicitud!=null &&
              this.montoSolicitud.equals(other.getMontoSolicitud()))) &&
            ((this.tasa==null && other.getTasa()==null) || 
             (this.tasa!=null &&
              this.tasa.equals(other.getTasa()))) &&
            this.plazo == other.getPlazo() &&
            ((this.unidadTiempoPlazoCOD==null && other.getUnidadTiempoPlazoCOD()==null) || 
             (this.unidadTiempoPlazoCOD!=null &&
              this.unidadTiempoPlazoCOD.equals(other.getUnidadTiempoPlazoCOD()))) &&
            ((this.formaPagoCOD==null && other.getFormaPagoCOD()==null) || 
             (this.formaPagoCOD!=null &&
              this.formaPagoCOD.equals(other.getFormaPagoCOD()))) &&
            ((this.primerInteres==null && other.getPrimerInteres()==null) || 
             (this.primerInteres!=null &&
              this.primerInteres.equals(other.getPrimerInteres()))) &&
            ((this.primeraCuota==null && other.getPrimeraCuota()==null) || 
             (this.primeraCuota!=null &&
              this.primeraCuota.equals(other.getPrimeraCuota()))) &&
            ((this.tipoGarantiaCOD==null && other.getTipoGarantiaCOD()==null) || 
             (this.tipoGarantiaCOD!=null &&
              this.tipoGarantiaCOD.equals(other.getTipoGarantiaCOD()))) &&
            ((this.destinoEconomicoCOD==null && other.getDestinoEconomicoCOD()==null) || 
             (this.destinoEconomicoCOD!=null &&
              this.destinoEconomicoCOD.equals(other.getDestinoEconomicoCOD()))) &&
            ((this.destinoDetalle==null && other.getDestinoDetalle()==null) || 
             (this.destinoDetalle!=null &&
              this.destinoDetalle.equals(other.getDestinoDetalle()))) &&
            ((this.cuotaCreditoVigente==null && other.getCuotaCreditoVigente()==null) || 
             (this.cuotaCreditoVigente!=null &&
              this.cuotaCreditoVigente.equals(other.getCuotaCreditoVigente()))) &&
            ((this.decisionCOD==null && other.getDecisionCOD()==null) || 
             (this.decisionCOD!=null &&
              this.decisionCOD.equals(other.getDecisionCOD()))) &&
            ((this.observacion==null && other.getObservacion()==null) || 
             (this.observacion!=null &&
              this.observacion.equals(other.getObservacion()))) &&
            ((this.IVA==null && other.getIVA()==null) || 
             (this.IVA!=null &&
              this.IVA.equals(other.getIVA()))) &&
            ((this.periodoGracia==null && other.getPeriodoGracia()==null) || 
             (this.periodoGracia!=null &&
              this.periodoGracia.equals(other.getPeriodoGracia()))) &&
            ((this.interesesAmortizacion==null && other.getInteresesAmortizacion()==null) || 
             (this.interesesAmortizacion!=null &&
              this.interesesAmortizacion.equals(other.getInteresesAmortizacion()))) &&
            this.usuarioIDSolicitud == other.getUsuarioIDSolicitud() &&
            ((this.identificacionSolicitud==null && other.getIdentificacionSolicitud()==null) || 
             (this.identificacionSolicitud!=null &&
              this.identificacionSolicitud.equals(other.getIdentificacionSolicitud()))) &&
            this.personaID == other.getPersonaID() &&
            ((this.fechaSolicitud==null && other.getFechaSolicitud()==null) || 
             (this.fechaSolicitud!=null &&
              this.fechaSolicitud.equals(other.getFechaSolicitud()))) &&
            ((this.relacionCOD==null && other.getRelacionCOD()==null) || 
             (this.relacionCOD!=null &&
              this.relacionCOD.equals(other.getRelacionCOD()))) &&
            ((this.identificacion==null && other.getIdentificacion()==null) || 
             (this.identificacion!=null &&
              this.identificacion.equals(other.getIdentificacion()))) &&
            ((this.identificacionConyuge==null && other.getIdentificacionConyuge()==null) || 
             (this.identificacionConyuge!=null &&
              this.identificacionConyuge.equals(other.getIdentificacionConyuge()))) &&
            ((this.tipoPersonaCOD==null && other.getTipoPersonaCOD()==null) || 
             (this.tipoPersonaCOD!=null &&
              this.tipoPersonaCOD.equals(other.getTipoPersonaCOD()))) &&
            ((this.tipoIdentificacionCOD==null && other.getTipoIdentificacionCOD()==null) || 
             (this.tipoIdentificacionCOD!=null &&
              this.tipoIdentificacionCOD.equals(other.getTipoIdentificacionCOD()))) &&
            ((this.apellidoPaterno==null && other.getApellidoPaterno()==null) || 
             (this.apellidoPaterno!=null &&
              this.apellidoPaterno.equals(other.getApellidoPaterno()))) &&
            ((this.apellidoMaterno==null && other.getApellidoMaterno()==null) || 
             (this.apellidoMaterno!=null &&
              this.apellidoMaterno.equals(other.getApellidoMaterno()))) &&
            ((this.nombres==null && other.getNombres()==null) || 
             (this.nombres!=null &&
              this.nombres.equals(other.getNombres()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.estadoCivilCOD==null && other.getEstadoCivilCOD()==null) || 
             (this.estadoCivilCOD!=null &&
              this.estadoCivilCOD.equals(other.getEstadoCivilCOD()))) &&
            ((this.sexoCOD==null && other.getSexoCOD()==null) || 
             (this.sexoCOD!=null &&
              this.sexoCOD.equals(other.getSexoCOD()))) &&
            ((this.numeroCarga==null && other.getNumeroCarga()==null) || 
             (this.numeroCarga!=null &&
              this.numeroCarga.equals(other.getNumeroCarga()))) &&
            this.separacionBienes == other.isSeparacionBienes() &&
            ((this.nacionalidadCOD==null && other.getNacionalidadCOD()==null) || 
             (this.nacionalidadCOD!=null &&
              this.nacionalidadCOD.equals(other.getNacionalidadCOD()))) &&
            ((this.nivelEducacionCOD==null && other.getNivelEducacionCOD()==null) || 
             (this.nivelEducacionCOD!=null &&
              this.nivelEducacionCOD.equals(other.getNivelEducacionCOD()))) &&
            ((this.ocupacionCOD==null && other.getOcupacionCOD()==null) || 
             (this.ocupacionCOD!=null &&
              this.ocupacionCOD.equals(other.getOcupacionCOD()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.fechaApertura==null && other.getFechaApertura()==null) || 
             (this.fechaApertura!=null &&
              this.fechaApertura.equals(other.getFechaApertura()))) &&
            ((this.localidadCOD==null && other.getLocalidadCOD()==null) || 
             (this.localidadCOD!=null &&
              this.localidadCOD.equals(other.getLocalidadCOD()))) &&
            ((this.direccion==null && other.getDireccion()==null) || 
             (this.direccion!=null &&
              this.direccion.equals(other.getDireccion()))) &&
            ((this.tipoViviendaCOD==null && other.getTipoViviendaCOD()==null) || 
             (this.tipoViviendaCOD!=null &&
              this.tipoViviendaCOD.equals(other.getTipoViviendaCOD()))) &&
            ((this.situacionViviendaCOD==null && other.getSituacionViviendaCOD()==null) || 
             (this.situacionViviendaCOD!=null &&
              this.situacionViviendaCOD.equals(other.getSituacionViviendaCOD()))) &&
            this.viviendaHipotecada == other.isViviendaHipotecada() &&
            ((this.duenoCasa==null && other.getDuenoCasa()==null) || 
             (this.duenoCasa!=null &&
              this.duenoCasa.equals(other.getDuenoCasa()))) &&
            ((this.telefonoDuenoCasa==null && other.getTelefonoDuenoCasa()==null) || 
             (this.telefonoDuenoCasa!=null &&
              this.telefonoDuenoCasa.equals(other.getTelefonoDuenoCasa()))) &&
            ((this.tiempoViviendaActual==null && other.getTiempoViviendaActual()==null) || 
             (this.tiempoViviendaActual!=null &&
              this.tiempoViviendaActual.equals(other.getTiempoViviendaActual()))) &&
            ((this.unidadTiempoViviendaActualCOD==null && other.getUnidadTiempoViviendaActualCOD()==null) || 
             (this.unidadTiempoViviendaActualCOD!=null &&
              this.unidadTiempoViviendaActualCOD.equals(other.getUnidadTiempoViviendaActualCOD()))) &&
            ((this.referenciaUbicacion==null && other.getReferenciaUbicacion()==null) || 
             (this.referenciaUbicacion!=null &&
              this.referenciaUbicacion.equals(other.getReferenciaUbicacion()))) &&
            ((this.tiempoViviendaAnterior==null && other.getTiempoViviendaAnterior()==null) || 
             (this.tiempoViviendaAnterior!=null &&
              this.tiempoViviendaAnterior.equals(other.getTiempoViviendaAnterior()))) &&
            ((this.unidadTiempoViviendaAnteriorCOD==null && other.getUnidadTiempoViviendaAnteriorCOD()==null) || 
             (this.unidadTiempoViviendaAnteriorCOD!=null &&
              this.unidadTiempoViviendaAnteriorCOD.equals(other.getUnidadTiempoViviendaAnteriorCOD()))) &&
            ((this.telefonoDomicilio==null && other.getTelefonoDomicilio()==null) || 
             (this.telefonoDomicilio!=null &&
              this.telefonoDomicilio.equals(other.getTelefonoDomicilio()))) &&
            ((this.telefonoCelular==null && other.getTelefonoCelular()==null) || 
             (this.telefonoCelular!=null &&
              this.telefonoCelular.equals(other.getTelefonoCelular()))) &&
            ((this.socio==null && other.getSocio()==null) || 
             (this.socio!=null &&
              this.socio.equals(other.getSocio()))) &&
            ((this.identificacionSocio==null && other.getIdentificacionSocio()==null) || 
             (this.identificacionSocio!=null &&
              this.identificacionSocio.equals(other.getIdentificacionSocio()))) &&
            ((this.garante==null && other.getGarante()==null) || 
             (this.garante!=null &&
              this.garante.equals(other.getGarante()))) &&
            ((this.identificacionGarante==null && other.getIdentificacionGarante()==null) || 
             (this.identificacionGarante!=null &&
              this.identificacionGarante.equals(other.getIdentificacionGarante()))) &&
            ((this.conyugeGarante==null && other.getConyugeGarante()==null) || 
             (this.conyugeGarante!=null &&
              this.conyugeGarante.equals(other.getConyugeGarante()))) &&
            ((this.conyugeSocio==null && other.getConyugeSocio()==null) || 
             (this.conyugeSocio!=null &&
              this.conyugeSocio.equals(other.getConyugeSocio()))) &&
            ((this.identificacionInformacionNegocio==null && other.getIdentificacionInformacionNegocio()==null) || 
             (this.identificacionInformacionNegocio!=null &&
              this.identificacionInformacionNegocio.equals(other.getIdentificacionInformacionNegocio()))) &&
            ((this.nombreInformacionNegocio==null && other.getNombreInformacionNegocio()==null) || 
             (this.nombreInformacionNegocio!=null &&
              this.nombreInformacionNegocio.equals(other.getNombreInformacionNegocio()))) &&
            ((this.sectorEconomicoCOD==null && other.getSectorEconomicoCOD()==null) || 
             (this.sectorEconomicoCOD!=null &&
              this.sectorEconomicoCOD.equals(other.getSectorEconomicoCOD()))) &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.antiguedadNegocio==null && other.getAntiguedadNegocio()==null) || 
             (this.antiguedadNegocio!=null &&
              this.antiguedadNegocio.equals(other.getAntiguedadNegocio()))) &&
            ((this.unidadAntiguedadNegocioCOD==null && other.getUnidadAntiguedadNegocioCOD()==null) || 
             (this.unidadAntiguedadNegocioCOD!=null &&
              this.unidadAntiguedadNegocioCOD.equals(other.getUnidadAntiguedadNegocioCOD()))) &&
            ((this.numeroEmpleados==null && other.getNumeroEmpleados()==null) || 
             (this.numeroEmpleados!=null &&
              this.numeroEmpleados.equals(other.getNumeroEmpleados()))) &&
            ((this.direccionInformacionNegocio==null && other.getDireccionInformacionNegocio()==null) || 
             (this.direccionInformacionNegocio!=null &&
              this.direccionInformacionNegocio.equals(other.getDireccionInformacionNegocio()))) &&
            ((this.referencia==null && other.getReferencia()==null) || 
             (this.referencia!=null &&
              this.referencia.equals(other.getReferencia()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.direccionTrabajoConyuge==null && other.getDireccionTrabajoConyuge()==null) || 
             (this.direccionTrabajoConyuge!=null &&
              this.direccionTrabajoConyuge.equals(other.getDireccionTrabajoConyuge()))) &&
            ((this.telefonoTrabajoConyuge==null && other.getTelefonoTrabajoConyuge()==null) || 
             (this.telefonoTrabajoConyuge!=null &&
              this.telefonoTrabajoConyuge.equals(other.getTelefonoTrabajoConyuge()))) &&
            ((this.antiguedadNegocioMismoLugar==null && other.getAntiguedadNegocioMismoLugar()==null) || 
             (this.antiguedadNegocioMismoLugar!=null &&
              this.antiguedadNegocioMismoLugar.equals(other.getAntiguedadNegocioMismoLugar()))) &&
            ((this.unidadAntiguedadNegocioMismoLugarCOD==null && other.getUnidadAntiguedadNegocioMismoLugarCOD()==null) || 
             (this.unidadAntiguedadNegocioMismoLugarCOD!=null &&
              this.unidadAntiguedadNegocioMismoLugarCOD.equals(other.getUnidadAntiguedadNegocioMismoLugarCOD()))) &&
            ((this.tipoLocalCOD==null && other.getTipoLocalCOD()==null) || 
             (this.tipoLocalCOD!=null &&
              this.tipoLocalCOD.equals(other.getTipoLocalCOD()))) &&
            this.comercio == other.isComercio() &&
            ((this.ingreso==null && other.getIngreso()==null) || 
             (this.ingreso!=null &&
              this.ingreso.equals(other.getIngreso()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.latitud==null && other.getLatitud()==null) || 
             (this.latitud!=null &&
              this.latitud.equals(other.getLatitud()))) &&
            ((this.longitud==null && other.getLongitud()==null) || 
             (this.longitud!=null &&
              this.longitud.equals(other.getLongitud()))) &&
            ((this.detalledeCuentasSocio==null && other.getDetalledeCuentasSocio()==null) || 
             (this.detalledeCuentasSocio!=null &&
              java.util.Arrays.equals(this.detalledeCuentasSocio, other.getDetalledeCuentasSocio()))) &&
            ((this.detalledeCuentasGarante==null && other.getDetalledeCuentasGarante()==null) || 
             (this.detalledeCuentasGarante!=null &&
              java.util.Arrays.equals(this.detalledeCuentasGarante, other.getDetalledeCuentasGarante()))) &&
            ((this.totalValorPatrimonioACTIVOSocio==null && other.getTotalValorPatrimonioACTIVOSocio()==null) || 
             (this.totalValorPatrimonioACTIVOSocio!=null &&
              this.totalValorPatrimonioACTIVOSocio.equals(other.getTotalValorPatrimonioACTIVOSocio()))) &&
            ((this.totalValorPatrimonioPASIVOSocio==null && other.getTotalValorPatrimonioPASIVOSocio()==null) || 
             (this.totalValorPatrimonioPASIVOSocio!=null &&
              this.totalValorPatrimonioPASIVOSocio.equals(other.getTotalValorPatrimonioPASIVOSocio()))) &&
            ((this.totalValorDetalleDeCuentasINGRESOSSocio==null && other.getTotalValorDetalleDeCuentasINGRESOSSocio()==null) || 
             (this.totalValorDetalleDeCuentasINGRESOSSocio!=null &&
              this.totalValorDetalleDeCuentasINGRESOSSocio.equals(other.getTotalValorDetalleDeCuentasINGRESOSSocio()))) &&
            ((this.totalValorDetalleDeCuentasEGRESOSSocio==null && other.getTotalValorDetalleDeCuentasEGRESOSSocio()==null) || 
             (this.totalValorDetalleDeCuentasEGRESOSSocio!=null &&
              this.totalValorDetalleDeCuentasEGRESOSSocio.equals(other.getTotalValorDetalleDeCuentasEGRESOSSocio()))) &&
            ((this.totalValorPatrimonioACTIVOGarante==null && other.getTotalValorPatrimonioACTIVOGarante()==null) || 
             (this.totalValorPatrimonioACTIVOGarante!=null &&
              this.totalValorPatrimonioACTIVOGarante.equals(other.getTotalValorPatrimonioACTIVOGarante()))) &&
            ((this.totalValorPatrimonioPASIVOGarante==null && other.getTotalValorPatrimonioPASIVOGarante()==null) || 
             (this.totalValorPatrimonioPASIVOGarante!=null &&
              this.totalValorPatrimonioPASIVOGarante.equals(other.getTotalValorPatrimonioPASIVOGarante()))) &&
            ((this.totalValorDetalleDeCuentasINGRESOSGarante==null && other.getTotalValorDetalleDeCuentasINGRESOSGarante()==null) || 
             (this.totalValorDetalleDeCuentasINGRESOSGarante!=null &&
              this.totalValorDetalleDeCuentasINGRESOSGarante.equals(other.getTotalValorDetalleDeCuentasINGRESOSGarante()))) &&
            ((this.totalValorDetalleDeCuentasEGRESOSGarante==null && other.getTotalValorDetalleDeCuentasEGRESOSGarante()==null) || 
             (this.totalValorDetalleDeCuentasEGRESOSGarante!=null &&
              this.totalValorDetalleDeCuentasEGRESOSGarante.equals(other.getTotalValorDetalleDeCuentasEGRESOSGarante()))) &&
            ((this.detallePatrimonialSocio==null && other.getDetallePatrimonialSocio()==null) || 
             (this.detallePatrimonialSocio!=null &&
              java.util.Arrays.equals(this.detallePatrimonialSocio, other.getDetallePatrimonialSocio()))) &&
            ((this.totalValorDetallePatrimonial==null && other.getTotalValorDetallePatrimonial()==null) || 
             (this.totalValorDetallePatrimonial!=null &&
              this.totalValorDetallePatrimonial.equals(other.getTotalValorDetallePatrimonial()))) &&
            ((this.detallePatrominialGarante==null && other.getDetallePatrominialGarante()==null) || 
             (this.detallePatrominialGarante!=null &&
              java.util.Arrays.equals(this.detallePatrominialGarante, other.getDetallePatrominialGarante()))) &&
            ((this.totalValorDetallePatrimonialGarante==null && other.getTotalValorDetallePatrimonialGarante()==null) || 
             (this.totalValorDetallePatrimonialGarante!=null &&
              this.totalValorDetallePatrimonialGarante.equals(other.getTotalValorDetallePatrimonialGarante()))) &&
            ((this.garantiasReales==null && other.getGarantiasReales()==null) || 
             (this.garantiasReales!=null &&
              java.util.Arrays.equals(this.garantiasReales, other.getGarantiasReales()))) &&
            ((this.referenciasPersonales2==null && other.getReferenciasPersonales2()==null) || 
             (this.referenciasPersonales2!=null &&
              java.util.Arrays.equals(this.referenciasPersonales2, other.getReferenciasPersonales2()))) &&
            ((this.referenciasComerciales==null && other.getReferenciasComerciales()==null) || 
             (this.referenciasComerciales!=null &&
              java.util.Arrays.equals(this.referenciasComerciales, other.getReferenciasComerciales()))) &&
            ((this.tipoReferenciaComercialCOD==null && other.getTipoReferenciaComercialCOD()==null) || 
             (this.tipoReferenciaComercialCOD!=null &&
              this.tipoReferenciaComercialCOD.equals(other.getTipoReferenciaComercialCOD()))) &&
            ((this.descripcionRererenciasComerciales==null && other.getDescripcionRererenciasComerciales()==null) || 
             (this.descripcionRererenciasComerciales!=null &&
              this.descripcionRererenciasComerciales.equals(other.getDescripcionRererenciasComerciales()))) &&
            ((this.valorReferenciasComerciales==null && other.getValorReferenciasComerciales()==null) || 
             (this.valorReferenciasComerciales!=null &&
              this.valorReferenciasComerciales.equals(other.getValorReferenciasComerciales()))) &&
            ((this.telefonoReferenciasComerciales==null && other.getTelefonoReferenciasComerciales()==null) || 
             (this.telefonoReferenciasComerciales!=null &&
              this.telefonoReferenciasComerciales.equals(other.getTelefonoReferenciasComerciales()))) &&
            ((this.observacionReferenciasComerciales==null && other.getObservacionReferenciasComerciales()==null) || 
             (this.observacionReferenciasComerciales!=null &&
              this.observacionReferenciasComerciales.equals(other.getObservacionReferenciasComerciales()))) &&
            ((this.patrimonioMontos==null && other.getPatrimonioMontos()==null) || 
             (this.patrimonioMontos!=null &&
              this.patrimonioMontos.equals(other.getPatrimonioMontos()))) &&
            ((this.ventasMontos==null && other.getVentasMontos()==null) || 
             (this.ventasMontos!=null &&
              this.ventasMontos.equals(other.getVentasMontos()))) &&
            ((this.costototal==null && other.getCostototal()==null) || 
             (this.costototal!=null &&
              this.costototal.equals(other.getCostototal()))) &&
            ((this.totalIngresosFlujo==null && other.getTotalIngresosFlujo()==null) || 
             (this.totalIngresosFlujo!=null &&
              this.totalIngresosFlujo.equals(other.getTotalIngresosFlujo()))) &&
            ((this.ingresosFamiliar==null && other.getIngresosFamiliar()==null) || 
             (this.ingresosFamiliar!=null &&
              this.ingresosFamiliar.equals(other.getIngresosFamiliar()))) &&
            ((this.ingresosNegocio==null && other.getIngresosNegocio()==null) || 
             (this.ingresosNegocio!=null &&
              this.ingresosNegocio.equals(other.getIngresosNegocio()))) &&
            ((this.totalEgresos==null && other.getTotalEgresos()==null) || 
             (this.totalEgresos!=null &&
              this.totalEgresos.equals(other.getTotalEgresos()))) &&
            ((this.egresosFamiliar==null && other.getEgresosFamiliar()==null) || 
             (this.egresosFamiliar!=null &&
              this.egresosFamiliar.equals(other.getEgresosFamiliar()))) &&
            ((this.egresosNegocio==null && other.getEgresosNegocio()==null) || 
             (this.egresosNegocio!=null &&
              this.egresosNegocio.equals(other.getEgresosNegocio()))) &&
            ((this.disponibilidadAntesCredito==null && other.getDisponibilidadAntesCredito()==null) || 
             (this.disponibilidadAntesCredito!=null &&
              this.disponibilidadAntesCredito.equals(other.getDisponibilidadAntesCredito()))) &&
            ((this.cuoraCredito==null && other.getCuoraCredito()==null) || 
             (this.cuoraCredito!=null &&
              this.cuoraCredito.equals(other.getCuoraCredito()))) &&
            ((this.disponibleNeto==null && other.getDisponibleNeto()==null) || 
             (this.disponibleNeto!=null &&
              this.disponibleNeto.equals(other.getDisponibleNeto()))) &&
            ((this.ventasTotalesPerdidasYGanancias==null && other.getVentasTotalesPerdidasYGanancias()==null) || 
             (this.ventasTotalesPerdidasYGanancias!=null &&
              this.ventasTotalesPerdidasYGanancias.equals(other.getVentasTotalesPerdidasYGanancias()))) &&
            ((this.costosTotalesPerdidasYGanancias==null && other.getCostosTotalesPerdidasYGanancias()==null) || 
             (this.costosTotalesPerdidasYGanancias!=null &&
              this.costosTotalesPerdidasYGanancias.equals(other.getCostosTotalesPerdidasYGanancias()))) &&
            ((this.gastosTotalesPerdidasYGanancias==null && other.getGastosTotalesPerdidasYGanancias()==null) || 
             (this.gastosTotalesPerdidasYGanancias!=null &&
              this.gastosTotalesPerdidasYGanancias.equals(other.getGastosTotalesPerdidasYGanancias()))) &&
            ((this.gastosFinancierosPerdidasYGanancias==null && other.getGastosFinancierosPerdidasYGanancias()==null) || 
             (this.gastosFinancierosPerdidasYGanancias!=null &&
              this.gastosFinancierosPerdidasYGanancias.equals(other.getGastosFinancierosPerdidasYGanancias()))) &&
            ((this.utilidadNegocioTotalPerdidasYGanancias==null && other.getUtilidadNegocioTotalPerdidasYGanancias()==null) || 
             (this.utilidadNegocioTotalPerdidasYGanancias!=null &&
              this.utilidadNegocioTotalPerdidasYGanancias.equals(other.getUtilidadNegocioTotalPerdidasYGanancias()))) &&
            ((this.egresosNegocioPerdidasYGanancias==null && other.getEgresosNegocioPerdidasYGanancias()==null) || 
             (this.egresosNegocioPerdidasYGanancias!=null &&
              this.egresosNegocioPerdidasYGanancias.equals(other.getEgresosNegocioPerdidasYGanancias()))) &&
            ((this.ingresosFamiliaresTotalPerdidasYGanancias==null && other.getIngresosFamiliaresTotalPerdidasYGanancias()==null) || 
             (this.ingresosFamiliaresTotalPerdidasYGanancias!=null &&
              this.ingresosFamiliaresTotalPerdidasYGanancias.equals(other.getIngresosFamiliaresTotalPerdidasYGanancias()))) &&
            ((this.egresosFamiliaresTotalPerdidasYGanancias==null && other.getEgresosFamiliaresTotalPerdidasYGanancias()==null) || 
             (this.egresosFamiliaresTotalPerdidasYGanancias!=null &&
              this.egresosFamiliaresTotalPerdidasYGanancias.equals(other.getEgresosFamiliaresTotalPerdidasYGanancias()))) &&
            ((this.utilidadNetaPersidasYGanancias==null && other.getUtilidadNetaPersidasYGanancias()==null) || 
             (this.utilidadNetaPersidasYGanancias!=null &&
              this.utilidadNetaPersidasYGanancias.equals(other.getUtilidadNetaPersidasYGanancias()))) &&
            ((this.centralRiesgoSocio==null && other.getCentralRiesgoSocio()==null) || 
             (this.centralRiesgoSocio!=null &&
              this.centralRiesgoSocio.equals(other.getCentralRiesgoSocio()))) &&
            ((this.centralRiesgoConyugeSocio==null && other.getCentralRiesgoConyugeSocio()==null) || 
             (this.centralRiesgoConyugeSocio!=null &&
              this.centralRiesgoConyugeSocio.equals(other.getCentralRiesgoConyugeSocio()))) &&
            ((this.centralRiesgoGarante==null && other.getCentralRiesgoGarante()==null) || 
             (this.centralRiesgoGarante!=null &&
              this.centralRiesgoGarante.equals(other.getCentralRiesgoGarante()))) &&
            ((this.centralRiesgoConyugeGarante==null && other.getCentralRiesgoConyugeGarante()==null) || 
             (this.centralRiesgoConyugeGarante!=null &&
              this.centralRiesgoConyugeGarante.equals(other.getCentralRiesgoConyugeGarante()))) &&
            ((this.montoTotalEndeudamiento==null && other.getMontoTotalEndeudamiento()==null) || 
             (this.montoTotalEndeudamiento!=null &&
              this.montoTotalEndeudamiento.equals(other.getMontoTotalEndeudamiento()))) &&
            ((this.totalCarteraVigente==null && other.getTotalCarteraVigente()==null) || 
             (this.totalCarteraVigente!=null &&
              this.totalCarteraVigente.equals(other.getTotalCarteraVigente()))) &&
            ((this.carteraRiesgo==null && other.getCarteraRiesgo()==null) || 
             (this.carteraRiesgo!=null &&
              this.carteraRiesgo.equals(other.getCarteraRiesgo()))) &&
            ((this.calificacionRiesgoCOD==null && other.getCalificacionRiesgoCOD()==null) || 
             (this.calificacionRiesgoCOD!=null &&
              this.calificacionRiesgoCOD.equals(other.getCalificacionRiesgoCOD()))) &&
            ((this.castigoDemanda==null && other.getCastigoDemanda()==null) || 
             (this.castigoDemanda!=null &&
              this.castigoDemanda.equals(other.getCastigoDemanda()))) &&
            ((this.peorCalificacion12MesesCOD==null && other.getPeorCalificacion12MesesCOD()==null) || 
             (this.peorCalificacion12MesesCOD!=null &&
              this.peorCalificacion12MesesCOD.equals(other.getPeorCalificacion12MesesCOD()))) &&
            ((this.castigoDemanda12Meses==null && other.getCastigoDemanda12Meses()==null) || 
             (this.castigoDemanda12Meses!=null &&
              this.castigoDemanda12Meses.equals(other.getCastigoDemanda12Meses()))) &&
            ((this.numeroCreditosIFI==null && other.getNumeroCreditosIFI()==null) || 
             (this.numeroCreditosIFI!=null &&
              this.numeroCreditosIFI.equals(other.getNumeroCreditosIFI()))) &&
            ((this.numeroOperaciones==null && other.getNumeroOperaciones()==null) || 
             (this.numeroOperaciones!=null &&
              this.numeroOperaciones.equals(other.getNumeroOperaciones()))) &&
            ((this.reciprocidad==null && other.getReciprocidad()==null) || 
             (this.reciprocidad!=null &&
              this.reciprocidad.equals(other.getReciprocidad()))) &&
            ((this.estadoCentralRiesgo==null && other.getEstadoCentralRiesgo()==null) || 
             (this.estadoCentralRiesgo!=null &&
              this.estadoCentralRiesgo.equals(other.getEstadoCentralRiesgo()))) &&
            this.usuarioID == other.getUsuarioID() &&
            ((this.personaIdCentralRiesgo==null && other.getPersonaIdCentralRiesgo()==null) || 
             (this.personaIdCentralRiesgo!=null &&
              this.personaIdCentralRiesgo.equals(other.getPersonaIdCentralRiesgo()))) &&
            this.tieneError == other.isTieneError() &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.respuestaCOD==null && other.getRespuestaCOD()==null) || 
             (this.respuestaCOD!=null &&
              this.respuestaCOD.equals(other.getRespuestaCOD()))) &&
            ((this.segmento==null && other.getSegmento()==null) || 
             (this.segmento!=null &&
              this.segmento.equals(other.getSegmento()))) &&
            ((this.metodo==null && other.getMetodo()==null) || 
             (this.metodo!=null &&
              this.metodo.equals(other.getMetodo()))) &&
            ((this.mensajePersonalizado==null && other.getMensajePersonalizado()==null) || 
             (this.mensajePersonalizado!=null &&
              this.mensajePersonalizado.equals(other.getMensajePersonalizado()))) &&
            ((this.mensajeTecnico==null && other.getMensajeTecnico()==null) || 
             (this.mensajeTecnico!=null &&
              this.mensajeTecnico.equals(other.getMensajeTecnico())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getReferenciasPersonales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenciasPersonales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenciasPersonales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNombreModulo() != null) {
            _hashCode += getNombreModulo().hashCode();
        }
        _hashCode += getSolicitudID();
        if (getProductoID() != null) {
            _hashCode += getProductoID().hashCode();
        }
        _hashCode += getModuloID();
        if (getTipoCuotaCOD() != null) {
            _hashCode += getTipoCuotaCOD().hashCode();
        }
        if (getMontoSolicitud() != null) {
            _hashCode += getMontoSolicitud().hashCode();
        }
        if (getTasa() != null) {
            _hashCode += getTasa().hashCode();
        }
        _hashCode += getPlazo();
        if (getUnidadTiempoPlazoCOD() != null) {
            _hashCode += getUnidadTiempoPlazoCOD().hashCode();
        }
        if (getFormaPagoCOD() != null) {
            _hashCode += getFormaPagoCOD().hashCode();
        }
        if (getPrimerInteres() != null) {
            _hashCode += getPrimerInteres().hashCode();
        }
        if (getPrimeraCuota() != null) {
            _hashCode += getPrimeraCuota().hashCode();
        }
        if (getTipoGarantiaCOD() != null) {
            _hashCode += getTipoGarantiaCOD().hashCode();
        }
        if (getDestinoEconomicoCOD() != null) {
            _hashCode += getDestinoEconomicoCOD().hashCode();
        }
        if (getDestinoDetalle() != null) {
            _hashCode += getDestinoDetalle().hashCode();
        }
        if (getCuotaCreditoVigente() != null) {
            _hashCode += getCuotaCreditoVigente().hashCode();
        }
        if (getDecisionCOD() != null) {
            _hashCode += getDecisionCOD().hashCode();
        }
        if (getObservacion() != null) {
            _hashCode += getObservacion().hashCode();
        }
        if (getIVA() != null) {
            _hashCode += getIVA().hashCode();
        }
        if (getPeriodoGracia() != null) {
            _hashCode += getPeriodoGracia().hashCode();
        }
        if (getInteresesAmortizacion() != null) {
            _hashCode += getInteresesAmortizacion().hashCode();
        }
        _hashCode += getUsuarioIDSolicitud();
        if (getIdentificacionSolicitud() != null) {
            _hashCode += getIdentificacionSolicitud().hashCode();
        }
        _hashCode += getPersonaID();
        if (getFechaSolicitud() != null) {
            _hashCode += getFechaSolicitud().hashCode();
        }
        if (getRelacionCOD() != null) {
            _hashCode += getRelacionCOD().hashCode();
        }
        if (getIdentificacion() != null) {
            _hashCode += getIdentificacion().hashCode();
        }
        if (getIdentificacionConyuge() != null) {
            _hashCode += getIdentificacionConyuge().hashCode();
        }
        if (getTipoPersonaCOD() != null) {
            _hashCode += getTipoPersonaCOD().hashCode();
        }
        if (getTipoIdentificacionCOD() != null) {
            _hashCode += getTipoIdentificacionCOD().hashCode();
        }
        if (getApellidoPaterno() != null) {
            _hashCode += getApellidoPaterno().hashCode();
        }
        if (getApellidoMaterno() != null) {
            _hashCode += getApellidoMaterno().hashCode();
        }
        if (getNombres() != null) {
            _hashCode += getNombres().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getEstadoCivilCOD() != null) {
            _hashCode += getEstadoCivilCOD().hashCode();
        }
        if (getSexoCOD() != null) {
            _hashCode += getSexoCOD().hashCode();
        }
        if (getNumeroCarga() != null) {
            _hashCode += getNumeroCarga().hashCode();
        }
        _hashCode += (isSeparacionBienes() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNacionalidadCOD() != null) {
            _hashCode += getNacionalidadCOD().hashCode();
        }
        if (getNivelEducacionCOD() != null) {
            _hashCode += getNivelEducacionCOD().hashCode();
        }
        if (getOcupacionCOD() != null) {
            _hashCode += getOcupacionCOD().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getFechaApertura() != null) {
            _hashCode += getFechaApertura().hashCode();
        }
        if (getLocalidadCOD() != null) {
            _hashCode += getLocalidadCOD().hashCode();
        }
        if (getDireccion() != null) {
            _hashCode += getDireccion().hashCode();
        }
        if (getTipoViviendaCOD() != null) {
            _hashCode += getTipoViviendaCOD().hashCode();
        }
        if (getSituacionViviendaCOD() != null) {
            _hashCode += getSituacionViviendaCOD().hashCode();
        }
        _hashCode += (isViviendaHipotecada() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDuenoCasa() != null) {
            _hashCode += getDuenoCasa().hashCode();
        }
        if (getTelefonoDuenoCasa() != null) {
            _hashCode += getTelefonoDuenoCasa().hashCode();
        }
        if (getTiempoViviendaActual() != null) {
            _hashCode += getTiempoViviendaActual().hashCode();
        }
        if (getUnidadTiempoViviendaActualCOD() != null) {
            _hashCode += getUnidadTiempoViviendaActualCOD().hashCode();
        }
        if (getReferenciaUbicacion() != null) {
            _hashCode += getReferenciaUbicacion().hashCode();
        }
        if (getTiempoViviendaAnterior() != null) {
            _hashCode += getTiempoViviendaAnterior().hashCode();
        }
        if (getUnidadTiempoViviendaAnteriorCOD() != null) {
            _hashCode += getUnidadTiempoViviendaAnteriorCOD().hashCode();
        }
        if (getTelefonoDomicilio() != null) {
            _hashCode += getTelefonoDomicilio().hashCode();
        }
        if (getTelefonoCelular() != null) {
            _hashCode += getTelefonoCelular().hashCode();
        }
        if (getSocio() != null) {
            _hashCode += getSocio().hashCode();
        }
        if (getIdentificacionSocio() != null) {
            _hashCode += getIdentificacionSocio().hashCode();
        }
        if (getGarante() != null) {
            _hashCode += getGarante().hashCode();
        }
        if (getIdentificacionGarante() != null) {
            _hashCode += getIdentificacionGarante().hashCode();
        }
        if (getConyugeGarante() != null) {
            _hashCode += getConyugeGarante().hashCode();
        }
        if (getConyugeSocio() != null) {
            _hashCode += getConyugeSocio().hashCode();
        }
        if (getIdentificacionInformacionNegocio() != null) {
            _hashCode += getIdentificacionInformacionNegocio().hashCode();
        }
        if (getNombreInformacionNegocio() != null) {
            _hashCode += getNombreInformacionNegocio().hashCode();
        }
        if (getSectorEconomicoCOD() != null) {
            _hashCode += getSectorEconomicoCOD().hashCode();
        }
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getAntiguedadNegocio() != null) {
            _hashCode += getAntiguedadNegocio().hashCode();
        }
        if (getUnidadAntiguedadNegocioCOD() != null) {
            _hashCode += getUnidadAntiguedadNegocioCOD().hashCode();
        }
        if (getNumeroEmpleados() != null) {
            _hashCode += getNumeroEmpleados().hashCode();
        }
        if (getDireccionInformacionNegocio() != null) {
            _hashCode += getDireccionInformacionNegocio().hashCode();
        }
        if (getReferencia() != null) {
            _hashCode += getReferencia().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getDireccionTrabajoConyuge() != null) {
            _hashCode += getDireccionTrabajoConyuge().hashCode();
        }
        if (getTelefonoTrabajoConyuge() != null) {
            _hashCode += getTelefonoTrabajoConyuge().hashCode();
        }
        if (getAntiguedadNegocioMismoLugar() != null) {
            _hashCode += getAntiguedadNegocioMismoLugar().hashCode();
        }
        if (getUnidadAntiguedadNegocioMismoLugarCOD() != null) {
            _hashCode += getUnidadAntiguedadNegocioMismoLugarCOD().hashCode();
        }
        if (getTipoLocalCOD() != null) {
            _hashCode += getTipoLocalCOD().hashCode();
        }
        _hashCode += (isComercio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIngreso() != null) {
            _hashCode += getIngreso().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getLatitud() != null) {
            _hashCode += getLatitud().hashCode();
        }
        if (getLongitud() != null) {
            _hashCode += getLongitud().hashCode();
        }
        if (getDetalledeCuentasSocio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalledeCuentasSocio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalledeCuentasSocio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDetalledeCuentasGarante() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetalledeCuentasGarante());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetalledeCuentasGarante(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalValorPatrimonioACTIVOSocio() != null) {
            _hashCode += getTotalValorPatrimonioACTIVOSocio().hashCode();
        }
        if (getTotalValorPatrimonioPASIVOSocio() != null) {
            _hashCode += getTotalValorPatrimonioPASIVOSocio().hashCode();
        }
        if (getTotalValorDetalleDeCuentasINGRESOSSocio() != null) {
            _hashCode += getTotalValorDetalleDeCuentasINGRESOSSocio().hashCode();
        }
        if (getTotalValorDetalleDeCuentasEGRESOSSocio() != null) {
            _hashCode += getTotalValorDetalleDeCuentasEGRESOSSocio().hashCode();
        }
        if (getTotalValorPatrimonioACTIVOGarante() != null) {
            _hashCode += getTotalValorPatrimonioACTIVOGarante().hashCode();
        }
        if (getTotalValorPatrimonioPASIVOGarante() != null) {
            _hashCode += getTotalValorPatrimonioPASIVOGarante().hashCode();
        }
        if (getTotalValorDetalleDeCuentasINGRESOSGarante() != null) {
            _hashCode += getTotalValorDetalleDeCuentasINGRESOSGarante().hashCode();
        }
        if (getTotalValorDetalleDeCuentasEGRESOSGarante() != null) {
            _hashCode += getTotalValorDetalleDeCuentasEGRESOSGarante().hashCode();
        }
        if (getDetallePatrimonialSocio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetallePatrimonialSocio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetallePatrimonialSocio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalValorDetallePatrimonial() != null) {
            _hashCode += getTotalValorDetallePatrimonial().hashCode();
        }
        if (getDetallePatrominialGarante() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetallePatrominialGarante());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetallePatrominialGarante(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalValorDetallePatrimonialGarante() != null) {
            _hashCode += getTotalValorDetallePatrimonialGarante().hashCode();
        }
        if (getGarantiasReales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGarantiasReales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGarantiasReales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenciasPersonales2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenciasPersonales2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenciasPersonales2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReferenciasComerciales() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReferenciasComerciales());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReferenciasComerciales(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoReferenciaComercialCOD() != null) {
            _hashCode += getTipoReferenciaComercialCOD().hashCode();
        }
        if (getDescripcionRererenciasComerciales() != null) {
            _hashCode += getDescripcionRererenciasComerciales().hashCode();
        }
        if (getValorReferenciasComerciales() != null) {
            _hashCode += getValorReferenciasComerciales().hashCode();
        }
        if (getTelefonoReferenciasComerciales() != null) {
            _hashCode += getTelefonoReferenciasComerciales().hashCode();
        }
        if (getObservacionReferenciasComerciales() != null) {
            _hashCode += getObservacionReferenciasComerciales().hashCode();
        }
        if (getPatrimonioMontos() != null) {
            _hashCode += getPatrimonioMontos().hashCode();
        }
        if (getVentasMontos() != null) {
            _hashCode += getVentasMontos().hashCode();
        }
        if (getCostototal() != null) {
            _hashCode += getCostototal().hashCode();
        }
        if (getTotalIngresosFlujo() != null) {
            _hashCode += getTotalIngresosFlujo().hashCode();
        }
        if (getIngresosFamiliar() != null) {
            _hashCode += getIngresosFamiliar().hashCode();
        }
        if (getIngresosNegocio() != null) {
            _hashCode += getIngresosNegocio().hashCode();
        }
        if (getTotalEgresos() != null) {
            _hashCode += getTotalEgresos().hashCode();
        }
        if (getEgresosFamiliar() != null) {
            _hashCode += getEgresosFamiliar().hashCode();
        }
        if (getEgresosNegocio() != null) {
            _hashCode += getEgresosNegocio().hashCode();
        }
        if (getDisponibilidadAntesCredito() != null) {
            _hashCode += getDisponibilidadAntesCredito().hashCode();
        }
        if (getCuoraCredito() != null) {
            _hashCode += getCuoraCredito().hashCode();
        }
        if (getDisponibleNeto() != null) {
            _hashCode += getDisponibleNeto().hashCode();
        }
        if (getVentasTotalesPerdidasYGanancias() != null) {
            _hashCode += getVentasTotalesPerdidasYGanancias().hashCode();
        }
        if (getCostosTotalesPerdidasYGanancias() != null) {
            _hashCode += getCostosTotalesPerdidasYGanancias().hashCode();
        }
        if (getGastosTotalesPerdidasYGanancias() != null) {
            _hashCode += getGastosTotalesPerdidasYGanancias().hashCode();
        }
        if (getGastosFinancierosPerdidasYGanancias() != null) {
            _hashCode += getGastosFinancierosPerdidasYGanancias().hashCode();
        }
        if (getUtilidadNegocioTotalPerdidasYGanancias() != null) {
            _hashCode += getUtilidadNegocioTotalPerdidasYGanancias().hashCode();
        }
        if (getEgresosNegocioPerdidasYGanancias() != null) {
            _hashCode += getEgresosNegocioPerdidasYGanancias().hashCode();
        }
        if (getIngresosFamiliaresTotalPerdidasYGanancias() != null) {
            _hashCode += getIngresosFamiliaresTotalPerdidasYGanancias().hashCode();
        }
        if (getEgresosFamiliaresTotalPerdidasYGanancias() != null) {
            _hashCode += getEgresosFamiliaresTotalPerdidasYGanancias().hashCode();
        }
        if (getUtilidadNetaPersidasYGanancias() != null) {
            _hashCode += getUtilidadNetaPersidasYGanancias().hashCode();
        }
        if (getCentralRiesgoSocio() != null) {
            _hashCode += getCentralRiesgoSocio().hashCode();
        }
        if (getCentralRiesgoConyugeSocio() != null) {
            _hashCode += getCentralRiesgoConyugeSocio().hashCode();
        }
        if (getCentralRiesgoGarante() != null) {
            _hashCode += getCentralRiesgoGarante().hashCode();
        }
        if (getCentralRiesgoConyugeGarante() != null) {
            _hashCode += getCentralRiesgoConyugeGarante().hashCode();
        }
        if (getMontoTotalEndeudamiento() != null) {
            _hashCode += getMontoTotalEndeudamiento().hashCode();
        }
        if (getTotalCarteraVigente() != null) {
            _hashCode += getTotalCarteraVigente().hashCode();
        }
        if (getCarteraRiesgo() != null) {
            _hashCode += getCarteraRiesgo().hashCode();
        }
        if (getCalificacionRiesgoCOD() != null) {
            _hashCode += getCalificacionRiesgoCOD().hashCode();
        }
        if (getCastigoDemanda() != null) {
            _hashCode += getCastigoDemanda().hashCode();
        }
        if (getPeorCalificacion12MesesCOD() != null) {
            _hashCode += getPeorCalificacion12MesesCOD().hashCode();
        }
        if (getCastigoDemanda12Meses() != null) {
            _hashCode += getCastigoDemanda12Meses().hashCode();
        }
        if (getNumeroCreditosIFI() != null) {
            _hashCode += getNumeroCreditosIFI().hashCode();
        }
        if (getNumeroOperaciones() != null) {
            _hashCode += getNumeroOperaciones().hashCode();
        }
        if (getReciprocidad() != null) {
            _hashCode += getReciprocidad().hashCode();
        }
        if (getEstadoCentralRiesgo() != null) {
            _hashCode += getEstadoCentralRiesgo().hashCode();
        }
        _hashCode += getUsuarioID();
        if (getPersonaIdCentralRiesgo() != null) {
            _hashCode += getPersonaIdCentralRiesgo().hashCode();
        }
        _hashCode += (isTieneError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getRespuestaCOD() != null) {
            _hashCode += getRespuestaCOD().hashCode();
        }
        if (getSegmento() != null) {
            _hashCode += getSegmento().hashCode();
        }
        if (getMetodo() != null) {
            _hashCode += getMetodo().hashCode();
        }
        if (getMensajePersonalizado() != null) {
            _hashCode += getMensajePersonalizado().hashCode();
        }
        if (getMensajeTecnico() != null) {
            _hashCode += getMensajeTecnico().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
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

}


package com.passcop.client;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for respuesta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="respuesta"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="antiguedadNegocio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="antiguedadNegocioMismoLugar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="calificacionRiesgoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="carteraRiesgo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="castigoDemanda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="castigoDemanda12Meses" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="centralRiesgoConyugeGarante" type="{http://soap.source.passcop.com/}respuestaCentralRiesgo" minOccurs="0"/&gt;
 *         &lt;element name="centralRiesgoConyugeSocio" type="{http://soap.source.passcop.com/}respuestaCentralRiesgo" minOccurs="0"/&gt;
 *         &lt;element name="centralRiesgoGarante" type="{http://soap.source.passcop.com/}respuestaCentralRiesgo" minOccurs="0"/&gt;
 *         &lt;element name="centralRiesgoSocio" type="{http://soap.source.passcop.com/}respuestaCentralRiesgo" minOccurs="0"/&gt;
 *         &lt;element name="comercio" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="conyugeGarante" type="{http://soap.source.passcop.com/}persona" minOccurs="0"/&gt;
 *         &lt;element name="conyugeSocio" type="{http://soap.source.passcop.com/}persona" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="costosTotalesPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="costototal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cuoraCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="cuotaCreditoVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="decisionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcionRererenciasComerciales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinoDetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="destinoEconomicoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="detallePatrimonialSocio" type="{http://soap.source.passcop.com/}detallePatrimonial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="detallePatrominialGarante" type="{http://soap.source.passcop.com/}detallePatrimonial" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="detalledeCuentasGarante" type="{http://soap.source.passcop.com/}detalleDeCuentas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="detalledeCuentasSocio" type="{http://soap.source.passcop.com/}detalleDeCuentas" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionInformacionNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direccionTrabajoConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="disponibilidadAntesCredito" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="disponibleNeto" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="duenoCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="egresosFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="egresosFamiliaresTotalPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="egresosNegocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="egresosNegocioPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="estado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCentralRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="estadoCivilCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaApertura" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="fechaSolicitud" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="formaPagoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="garante" type="{http://soap.source.passcop.com/}persona" minOccurs="0"/&gt;
 *         &lt;element name="garantiasReales" type="{http://soap.source.passcop.com/}garantiasReales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="gastosFinancierosPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="gastosTotalesPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="IVA" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="identificacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionGarante" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionInformacionNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionSocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="identificacionSolicitud" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ingreso" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ingresosFamiliar" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ingresosFamiliaresTotalPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ingresosNegocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="interesesAmortizacion" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="latitud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="localidadCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="longitud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="mensaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajePersonalizado" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="mensajeTecnico" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="metodo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moduloID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="montoSolicitud" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="montoTotalEndeudamiento" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="nacionalidadCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nivelEducacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreInformacionNegocio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombreModulo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nombres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="numeroCarga" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numeroCreditosIFI" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numeroEmpleados" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="numeroOperaciones" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="observacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="observacionReferenciasComerciales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ocupacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="patrimonioMontos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="peorCalificacion12MesesCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="periodoGracia" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="personaID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="personaIdCentralRiesgo" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="plazo" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="primerInteres" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="primeraCuota" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="productoID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="reciprocidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenciaUbicacion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenciasComerciales" type="{http://soap.source.passcop.com/}referenciasComerciales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenciasPersonales" type="{http://soap.source.passcop.com/}referenciasPersonales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="referenciasPersonales2" type="{http://soap.source.passcop.com/}referenciasPersonales" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="respuestaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sectorEconomicoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="segmento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="separacionBienes" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="sexoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="situacionViviendaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="socio" type="{http://soap.source.passcop.com/}persona" minOccurs="0"/&gt;
 *         &lt;element name="solicitudID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tasa" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="telefono" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoCelular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoDomicilio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoDuenoCasa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoReferenciasComerciales" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telefonoTrabajoConyuge" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tiempoViviendaActual" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tiempoViviendaAnterior" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tieneError" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="tipoCuotaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoGarantiaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoIdentificacionCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoLocalCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoPersonaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoReferenciaComercialCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipoViviendaCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="totalCarteraVigente" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalEgresos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalIngresosFlujo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorDetalleDeCuentasEGRESOSGarante" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorDetalleDeCuentasEGRESOSSocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorDetalleDeCuentasINGRESOSGarante" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorDetalleDeCuentasINGRESOSSocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorDetallePatrimonial" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorDetallePatrimonialGarante" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorPatrimonioACTIVOGarante" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorPatrimonioACTIVOSocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorPatrimonioPASIVOGarante" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="totalValorPatrimonioPASIVOSocio" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="unidadAntiguedadNegocioCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadAntiguedadNegocioMismoLugarCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadTiempoPlazoCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadTiempoViviendaActualCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="unidadTiempoViviendaAnteriorCOD" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="usuarioID" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="usuarioIDSolicitud" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="utilidadNegocioTotalPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="utilidadNetaPersidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="valorReferenciasComerciales" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ventasMontos" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="ventasTotalesPerdidasYGanancias" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
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
@XmlType(name = "respuesta", propOrder = {
    "antiguedadNegocio",
    "antiguedadNegocioMismoLugar",
    "apellidoMaterno",
    "apellidoPaterno",
    "calificacionRiesgoCOD",
    "carteraRiesgo",
    "castigoDemanda",
    "castigoDemanda12Meses",
    "centralRiesgoConyugeGarante",
    "centralRiesgoConyugeSocio",
    "centralRiesgoGarante",
    "centralRiesgoSocio",
    "comercio",
    "conyugeGarante",
    "conyugeSocio",
    "correo",
    "costosTotalesPerdidasYGanancias",
    "costototal",
    "cuoraCredito",
    "cuotaCreditoVigente",
    "decisionCOD",
    "descripcion",
    "descripcionRererenciasComerciales",
    "destinoDetalle",
    "destinoEconomicoCOD",
    "detallePatrimonialSocio",
    "detallePatrominialGarante",
    "detalledeCuentasGarante",
    "detalledeCuentasSocio",
    "direccion",
    "direccionInformacionNegocio",
    "direccionTrabajoConyuge",
    "disponibilidadAntesCredito",
    "disponibleNeto",
    "duenoCasa",
    "egresosFamiliar",
    "egresosFamiliaresTotalPerdidasYGanancias",
    "egresosNegocio",
    "egresosNegocioPerdidasYGanancias",
    "estado",
    "estadoCentralRiesgo",
    "estadoCivilCOD",
    "fechaApertura",
    "fechaNacimiento",
    "fechaSolicitud",
    "formaPagoCOD",
    "garante",
    "garantiasReales",
    "gastosFinancierosPerdidasYGanancias",
    "gastosTotalesPerdidasYGanancias",
    "iva",
    "identificacion",
    "identificacionConyuge",
    "identificacionGarante",
    "identificacionInformacionNegocio",
    "identificacionSocio",
    "identificacionSolicitud",
    "ingreso",
    "ingresosFamiliar",
    "ingresosFamiliaresTotalPerdidasYGanancias",
    "ingresosNegocio",
    "interesesAmortizacion",
    "latitud",
    "localidadCOD",
    "longitud",
    "mensaje",
    "mensajePersonalizado",
    "mensajeTecnico",
    "metodo",
    "moduloID",
    "montoSolicitud",
    "montoTotalEndeudamiento",
    "nacionalidadCOD",
    "nivelEducacionCOD",
    "nombreInformacionNegocio",
    "nombreModulo",
    "nombres",
    "numeroCarga",
    "numeroCreditosIFI",
    "numeroEmpleados",
    "numeroOperaciones",
    "observacion",
    "observacionReferenciasComerciales",
    "ocupacionCOD",
    "patrimonioMontos",
    "peorCalificacion12MesesCOD",
    "periodoGracia",
    "personaID",
    "personaIdCentralRiesgo",
    "plazo",
    "primerInteres",
    "primeraCuota",
    "productoID",
    "reciprocidad",
    "referencia",
    "referenciaUbicacion",
    "referenciasComerciales",
    "referenciasPersonales",
    "referenciasPersonales2",
    "relacionCOD",
    "respuestaCOD",
    "sectorEconomicoCOD",
    "segmento",
    "separacionBienes",
    "sexoCOD",
    "situacionViviendaCOD",
    "socio",
    "solicitudID",
    "tasa",
    "telefono",
    "telefonoCelular",
    "telefonoDomicilio",
    "telefonoDuenoCasa",
    "telefonoReferenciasComerciales",
    "telefonoTrabajoConyuge",
    "tiempoViviendaActual",
    "tiempoViviendaAnterior",
    "tieneError",
    "tipoCuotaCOD",
    "tipoGarantiaCOD",
    "tipoIdentificacionCOD",
    "tipoLocalCOD",
    "tipoPersonaCOD",
    "tipoReferenciaComercialCOD",
    "tipoViviendaCOD",
    "totalCarteraVigente",
    "totalEgresos",
    "totalIngresosFlujo",
    "totalValorDetalleDeCuentasEGRESOSGarante",
    "totalValorDetalleDeCuentasEGRESOSSocio",
    "totalValorDetalleDeCuentasINGRESOSGarante",
    "totalValorDetalleDeCuentasINGRESOSSocio",
    "totalValorDetallePatrimonial",
    "totalValorDetallePatrimonialGarante",
    "totalValorPatrimonioACTIVOGarante",
    "totalValorPatrimonioACTIVOSocio",
    "totalValorPatrimonioPASIVOGarante",
    "totalValorPatrimonioPASIVOSocio",
    "unidadAntiguedadNegocioCOD",
    "unidadAntiguedadNegocioMismoLugarCOD",
    "unidadTiempoPlazoCOD",
    "unidadTiempoViviendaActualCOD",
    "unidadTiempoViviendaAnteriorCOD",
    "usuarioID",
    "usuarioIDSolicitud",
    "utilidadNegocioTotalPerdidasYGanancias",
    "utilidadNetaPersidasYGanancias",
    "valorReferenciasComerciales",
    "ventasMontos",
    "ventasTotalesPerdidasYGanancias",
    "viviendaHipotecada"
})
public class Respuesta {

    protected Integer antiguedadNegocio;
    protected Integer antiguedadNegocioMismoLugar;
    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected String calificacionRiesgoCOD;
    protected BigDecimal carteraRiesgo;
    protected BigDecimal castigoDemanda;
    protected BigDecimal castigoDemanda12Meses;
    protected RespuestaCentralRiesgo centralRiesgoConyugeGarante;
    protected RespuestaCentralRiesgo centralRiesgoConyugeSocio;
    protected RespuestaCentralRiesgo centralRiesgoGarante;
    protected RespuestaCentralRiesgo centralRiesgoSocio;
    protected boolean comercio;
    protected Persona conyugeGarante;
    protected Persona conyugeSocio;
    protected String correo;
    protected BigDecimal costosTotalesPerdidasYGanancias;
    protected BigDecimal costototal;
    protected BigDecimal cuoraCredito;
    protected BigDecimal cuotaCreditoVigente;
    protected String decisionCOD;
    protected String descripcion;
    protected String descripcionRererenciasComerciales;
    protected String destinoDetalle;
    protected String destinoEconomicoCOD;
    @XmlElement(nillable = true)
    protected List<DetallePatrimonial> detallePatrimonialSocio;
    @XmlElement(nillable = true)
    protected List<DetallePatrimonial> detallePatrominialGarante;
    @XmlElement(nillable = true)
    protected List<DetalleDeCuentas> detalledeCuentasGarante;
    @XmlElement(nillable = true)
    protected List<DetalleDeCuentas> detalledeCuentasSocio;
    protected String direccion;
    protected String direccionInformacionNegocio;
    protected String direccionTrabajoConyuge;
    protected BigDecimal disponibilidadAntesCredito;
    protected BigDecimal disponibleNeto;
    protected String duenoCasa;
    protected BigDecimal egresosFamiliar;
    protected BigDecimal egresosFamiliaresTotalPerdidasYGanancias;
    protected BigDecimal egresosNegocio;
    protected BigDecimal egresosNegocioPerdidasYGanancias;
    protected String estado;
    protected String estadoCentralRiesgo;
    protected String estadoCivilCOD;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaApertura;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaNacimiento;
  
    protected Calendar fechaSolicitud;
    protected String formaPagoCOD;
    protected Persona garante;
    @XmlElement(nillable = true)
    protected List<GarantiasReales> garantiasReales;
    protected BigDecimal gastosFinancierosPerdidasYGanancias;
    protected BigDecimal gastosTotalesPerdidasYGanancias;
    @XmlElement(name = "IVA")
    protected BigDecimal iva;
    protected String identificacion;
    protected String identificacionConyuge;
    protected String identificacionGarante;
    protected String identificacionInformacionNegocio;
    protected String identificacionSocio;
    protected String identificacionSolicitud;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ingreso;
    protected BigDecimal ingresosFamiliar;
    protected BigDecimal ingresosFamiliaresTotalPerdidasYGanancias;
    protected BigDecimal ingresosNegocio;
    protected Boolean interesesAmortizacion;
    protected BigDecimal latitud;
    protected String localidadCOD;
    protected BigDecimal longitud;
    protected String mensaje;
    protected String mensajePersonalizado;
    protected String mensajeTecnico;
    protected String metodo;
    protected int moduloID;
    protected BigDecimal montoSolicitud;
    protected BigDecimal montoTotalEndeudamiento;
    protected String nacionalidadCOD;
    protected String nivelEducacionCOD;
    protected String nombreInformacionNegocio;
    protected String nombreModulo;
    protected String nombres;
    protected Short numeroCarga;
    protected Short numeroCreditosIFI;
    protected Short numeroEmpleados;
    protected Short numeroOperaciones;
    protected String observacion;
    protected String observacionReferenciasComerciales;
    protected String ocupacionCOD;
    protected BigDecimal patrimonioMontos;
    protected String peorCalificacion12MesesCOD;
    protected Integer periodoGracia;
    protected int personaID;
    protected Integer personaIdCentralRiesgo;
    protected short plazo;
    protected BigDecimal primerInteres;
    protected BigDecimal primeraCuota;
    protected Integer productoID;
    protected String reciprocidad;
    protected String referencia;
    protected String referenciaUbicacion;
    @XmlElement(nillable = true)
    protected List<ReferenciasComerciales> referenciasComerciales;
    @XmlElement(nillable = true)
    protected List<ReferenciasPersonales> referenciasPersonales;
    @XmlElement(nillable = true)
    protected List<ReferenciasPersonales> referenciasPersonales2;
    protected String relacionCOD;
    protected String respuestaCOD;
    protected String sectorEconomicoCOD;
    protected String segmento;
    protected boolean separacionBienes;
    protected String sexoCOD;
    protected String situacionViviendaCOD;
    protected Persona socio;
    protected int solicitudID;
    protected BigDecimal tasa;
    protected String telefono;
    protected String telefonoCelular;
    protected String telefonoDomicilio;
    protected String telefonoDuenoCasa;
    protected String telefonoReferenciasComerciales;
    protected String telefonoTrabajoConyuge;
    protected Short tiempoViviendaActual;
    protected Short tiempoViviendaAnterior;
    protected boolean tieneError;
    protected String tipoCuotaCOD;
    protected String tipoGarantiaCOD;
    protected String tipoIdentificacionCOD;
    protected String tipoLocalCOD;
    protected String tipoPersonaCOD;
    protected String tipoReferenciaComercialCOD;
    protected String tipoViviendaCOD;
    protected BigDecimal totalCarteraVigente;
    protected BigDecimal totalEgresos;
    protected BigDecimal totalIngresosFlujo;
    protected BigDecimal totalValorDetalleDeCuentasEGRESOSGarante;
    protected BigDecimal totalValorDetalleDeCuentasEGRESOSSocio;
    protected BigDecimal totalValorDetalleDeCuentasINGRESOSGarante;
    protected BigDecimal totalValorDetalleDeCuentasINGRESOSSocio;
    protected BigDecimal totalValorDetallePatrimonial;
    protected BigDecimal totalValorDetallePatrimonialGarante;
    protected BigDecimal totalValorPatrimonioACTIVOGarante;
    protected BigDecimal totalValorPatrimonioACTIVOSocio;
    protected BigDecimal totalValorPatrimonioPASIVOGarante;
    protected BigDecimal totalValorPatrimonioPASIVOSocio;
    protected String unidadAntiguedadNegocioCOD;
    protected String unidadAntiguedadNegocioMismoLugarCOD;
    protected String unidadTiempoPlazoCOD;
    protected String unidadTiempoViviendaActualCOD;
    protected String unidadTiempoViviendaAnteriorCOD;
    protected short usuarioID;
    protected short usuarioIDSolicitud;
    protected BigDecimal utilidadNegocioTotalPerdidasYGanancias;
    protected BigDecimal utilidadNetaPersidasYGanancias;
    protected BigDecimal valorReferenciasComerciales;
    protected BigDecimal ventasMontos;
    protected BigDecimal ventasTotalesPerdidasYGanancias;
    protected boolean viviendaHipotecada;

    /**
     * Gets the value of the antiguedadNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiguedadNegocio() {
        return antiguedadNegocio;
    }

    /**
     * Sets the value of the antiguedadNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiguedadNegocio(Integer value) {
        this.antiguedadNegocio = value;
    }

    /**
     * Gets the value of the antiguedadNegocioMismoLugar property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAntiguedadNegocioMismoLugar() {
        return antiguedadNegocioMismoLugar;
    }

    /**
     * Sets the value of the antiguedadNegocioMismoLugar property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAntiguedadNegocioMismoLugar(Integer value) {
        this.antiguedadNegocioMismoLugar = value;
    }

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
     * Gets the value of the centralRiesgoConyugeGarante property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public RespuestaCentralRiesgo getCentralRiesgoConyugeGarante() {
        return centralRiesgoConyugeGarante;
    }

    /**
     * Sets the value of the centralRiesgoConyugeGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public void setCentralRiesgoConyugeGarante(RespuestaCentralRiesgo value) {
        this.centralRiesgoConyugeGarante = value;
    }

    /**
     * Gets the value of the centralRiesgoConyugeSocio property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public RespuestaCentralRiesgo getCentralRiesgoConyugeSocio() {
        return centralRiesgoConyugeSocio;
    }

    /**
     * Sets the value of the centralRiesgoConyugeSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public void setCentralRiesgoConyugeSocio(RespuestaCentralRiesgo value) {
        this.centralRiesgoConyugeSocio = value;
    }

    /**
     * Gets the value of the centralRiesgoGarante property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public RespuestaCentralRiesgo getCentralRiesgoGarante() {
        return centralRiesgoGarante;
    }

    /**
     * Sets the value of the centralRiesgoGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public void setCentralRiesgoGarante(RespuestaCentralRiesgo value) {
        this.centralRiesgoGarante = value;
    }

    /**
     * Gets the value of the centralRiesgoSocio property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public RespuestaCentralRiesgo getCentralRiesgoSocio() {
        return centralRiesgoSocio;
    }

    /**
     * Sets the value of the centralRiesgoSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCentralRiesgo }
     *     
     */
    public void setCentralRiesgoSocio(RespuestaCentralRiesgo value) {
        this.centralRiesgoSocio = value;
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
     * Gets the value of the conyugeGarante property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getConyugeGarante() {
        return conyugeGarante;
    }

    /**
     * Sets the value of the conyugeGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setConyugeGarante(Persona value) {
        this.conyugeGarante = value;
    }

    /**
     * Gets the value of the conyugeSocio property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getConyugeSocio() {
        return conyugeSocio;
    }

    /**
     * Sets the value of the conyugeSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setConyugeSocio(Persona value) {
        this.conyugeSocio = value;
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
     * Gets the value of the costosTotalesPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostosTotalesPerdidasYGanancias() {
        return costosTotalesPerdidasYGanancias;
    }

    /**
     * Sets the value of the costosTotalesPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostosTotalesPerdidasYGanancias(BigDecimal value) {
        this.costosTotalesPerdidasYGanancias = value;
    }

    /**
     * Gets the value of the costototal property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCostototal() {
        return costototal;
    }

    /**
     * Sets the value of the costototal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCostototal(BigDecimal value) {
        this.costototal = value;
    }

    /**
     * Gets the value of the cuoraCredito property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuoraCredito() {
        return cuoraCredito;
    }

    /**
     * Sets the value of the cuoraCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuoraCredito(BigDecimal value) {
        this.cuoraCredito = value;
    }

    /**
     * Gets the value of the cuotaCreditoVigente property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCuotaCreditoVigente() {
        return cuotaCreditoVigente;
    }

    /**
     * Sets the value of the cuotaCreditoVigente property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCuotaCreditoVigente(BigDecimal value) {
        this.cuotaCreditoVigente = value;
    }

    /**
     * Gets the value of the decisionCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecisionCOD() {
        return decisionCOD;
    }

    /**
     * Sets the value of the decisionCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecisionCOD(String value) {
        this.decisionCOD = value;
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
     * Gets the value of the descripcionRererenciasComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionRererenciasComerciales() {
        return descripcionRererenciasComerciales;
    }

    /**
     * Sets the value of the descripcionRererenciasComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionRererenciasComerciales(String value) {
        this.descripcionRererenciasComerciales = value;
    }

    /**
     * Gets the value of the destinoDetalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoDetalle() {
        return destinoDetalle;
    }

    /**
     * Sets the value of the destinoDetalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoDetalle(String value) {
        this.destinoDetalle = value;
    }

    /**
     * Gets the value of the destinoEconomicoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinoEconomicoCOD() {
        return destinoEconomicoCOD;
    }

    /**
     * Sets the value of the destinoEconomicoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinoEconomicoCOD(String value) {
        this.destinoEconomicoCOD = value;
    }

    /**
     * Gets the value of the detallePatrimonialSocio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallePatrimonialSocio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallePatrimonialSocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallePatrimonial }
     * 
     * 
     */
    public List<DetallePatrimonial> getDetallePatrimonialSocio() {
        if (detallePatrimonialSocio == null) {
            detallePatrimonialSocio = new ArrayList<DetallePatrimonial>();
        }
        return this.detallePatrimonialSocio;
    }

    public void setDetallePatrimonialSocio(List<DetallePatrimonial> detallePatrimonialSocio) {
		this.detallePatrimonialSocio = detallePatrimonialSocio;
	}

	/**
     * Gets the value of the detallePatrominialGarante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detallePatrominialGarante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetallePatrominialGarante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetallePatrimonial }
     * 
     * 
     */
    public List<DetallePatrimonial> getDetallePatrominialGarante() {
        if (detallePatrominialGarante == null) {
            detallePatrominialGarante = new ArrayList<DetallePatrimonial>();
        }
        return this.detallePatrominialGarante;
    }

    /**
     * Gets the value of the detalledeCuentasGarante property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalledeCuentasGarante property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalledeCuentasGarante().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleDeCuentas }
     * 
     * 
     */
    public List<DetalleDeCuentas> getDetalledeCuentasGarante() {
        if (detalledeCuentasGarante == null) {
            detalledeCuentasGarante = new ArrayList<DetalleDeCuentas>();
        }
        return this.detalledeCuentasGarante;
    }
    
    public void setDetalledeCuentasGarante(List<DetalleDeCuentas> detalledeCuentasGarante) {
		this.detalledeCuentasGarante = detalledeCuentasGarante;
	}

	/**
     * Gets the value of the detalledeCuentasSocio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detalledeCuentasSocio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetalledeCuentasSocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DetalleDeCuentas }
     * 
     * 
     */
    public List<DetalleDeCuentas> getDetalledeCuentasSocio() {
        if (detalledeCuentasSocio == null) {
            detalledeCuentasSocio = new ArrayList<DetalleDeCuentas>();
        }
        return this.detalledeCuentasSocio;
    }

    
    public void setDetalledeCuentasSocio(List<DetalleDeCuentas> detalledeCuentasSocio) {
		this.detalledeCuentasSocio = detalledeCuentasSocio;
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
     * Gets the value of the direccionInformacionNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionInformacionNegocio() {
        return direccionInformacionNegocio;
    }

    /**
     * Sets the value of the direccionInformacionNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionInformacionNegocio(String value) {
        this.direccionInformacionNegocio = value;
    }

    /**
     * Gets the value of the direccionTrabajoConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionTrabajoConyuge() {
        return direccionTrabajoConyuge;
    }

    /**
     * Sets the value of the direccionTrabajoConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionTrabajoConyuge(String value) {
        this.direccionTrabajoConyuge = value;
    }

    /**
     * Gets the value of the disponibilidadAntesCredito property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibilidadAntesCredito() {
        return disponibilidadAntesCredito;
    }

    /**
     * Sets the value of the disponibilidadAntesCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibilidadAntesCredito(BigDecimal value) {
        this.disponibilidadAntesCredito = value;
    }

    /**
     * Gets the value of the disponibleNeto property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisponibleNeto() {
        return disponibleNeto;
    }

    /**
     * Sets the value of the disponibleNeto property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisponibleNeto(BigDecimal value) {
        this.disponibleNeto = value;
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
     * Gets the value of the egresosFamiliar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosFamiliar() {
        return egresosFamiliar;
    }

    /**
     * Sets the value of the egresosFamiliar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosFamiliar(BigDecimal value) {
        this.egresosFamiliar = value;
    }

    /**
     * Gets the value of the egresosFamiliaresTotalPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosFamiliaresTotalPerdidasYGanancias() {
        return egresosFamiliaresTotalPerdidasYGanancias;
    }

    /**
     * Sets the value of the egresosFamiliaresTotalPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosFamiliaresTotalPerdidasYGanancias(BigDecimal value) {
        this.egresosFamiliaresTotalPerdidasYGanancias = value;
    }

    /**
     * Gets the value of the egresosNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosNegocio() {
        return egresosNegocio;
    }

    /**
     * Sets the value of the egresosNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosNegocio(BigDecimal value) {
        this.egresosNegocio = value;
    }

    /**
     * Gets the value of the egresosNegocioPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEgresosNegocioPerdidasYGanancias() {
        return egresosNegocioPerdidasYGanancias;
    }

    /**
     * Sets the value of the egresosNegocioPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEgresosNegocioPerdidasYGanancias(BigDecimal value) {
        this.egresosNegocioPerdidasYGanancias = value;
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
     * Gets the value of the estadoCentralRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCentralRiesgo() {
        return estadoCentralRiesgo;
    }

    /**
     * Sets the value of the estadoCentralRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCentralRiesgo(String value) {
        this.estadoCentralRiesgo = value;
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
     * Gets the value of the fechaSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public Calendar getFechaSolicitud() {
        return fechaSolicitud;
    }

    /**
     * Sets the value of the fechaSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaSolicitud(Calendar value) {
        this.fechaSolicitud = value;
    }

    /**
     * Gets the value of the formaPagoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaPagoCOD() {
        return formaPagoCOD;
    }

    /**
     * Sets the value of the formaPagoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaPagoCOD(String value) {
        this.formaPagoCOD = value;
    }

    /**
     * Gets the value of the garante property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getGarante() {
        return garante;
    }

    /**
     * Sets the value of the garante property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setGarante(Persona value) {
        this.garante = value;
    }

    /**
     * Gets the value of the garantiasReales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the garantiasReales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGarantiasReales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GarantiasReales }
     * 
     * 
     */
    public List<GarantiasReales> getGarantiasReales() {
        if (garantiasReales == null) {
            garantiasReales = new ArrayList<GarantiasReales>();
        }
        return this.garantiasReales;
    }

    /**
     * Gets the value of the gastosFinancierosPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosFinancierosPerdidasYGanancias() {
        return gastosFinancierosPerdidasYGanancias;
    }

    /**
     * Sets the value of the gastosFinancierosPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosFinancierosPerdidasYGanancias(BigDecimal value) {
        this.gastosFinancierosPerdidasYGanancias = value;
    }

    /**
     * Gets the value of the gastosTotalesPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGastosTotalesPerdidasYGanancias() {
        return gastosTotalesPerdidasYGanancias;
    }

    /**
     * Sets the value of the gastosTotalesPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGastosTotalesPerdidasYGanancias(BigDecimal value) {
        this.gastosTotalesPerdidasYGanancias = value;
    }

    /**
     * Gets the value of the iva property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIVA() {
        return iva;
    }

    /**
     * Sets the value of the iva property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIVA(BigDecimal value) {
        this.iva = value;
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
     * Gets the value of the identificacionGarante property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionGarante() {
        return identificacionGarante;
    }

    /**
     * Sets the value of the identificacionGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionGarante(String value) {
        this.identificacionGarante = value;
    }

    /**
     * Gets the value of the identificacionInformacionNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionInformacionNegocio() {
        return identificacionInformacionNegocio;
    }

    /**
     * Sets the value of the identificacionInformacionNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionInformacionNegocio(String value) {
        this.identificacionInformacionNegocio = value;
    }

    /**
     * Gets the value of the identificacionSocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionSocio() {
        return identificacionSocio;
    }

    /**
     * Sets the value of the identificacionSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionSocio(String value) {
        this.identificacionSocio = value;
    }

    /**
     * Gets the value of the identificacionSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionSolicitud() {
        return identificacionSolicitud;
    }

    /**
     * Sets the value of the identificacionSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionSolicitud(String value) {
        this.identificacionSolicitud = value;
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
     * Gets the value of the ingresosFamiliar property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosFamiliar() {
        return ingresosFamiliar;
    }

    /**
     * Sets the value of the ingresosFamiliar property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosFamiliar(BigDecimal value) {
        this.ingresosFamiliar = value;
    }

    /**
     * Gets the value of the ingresosFamiliaresTotalPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosFamiliaresTotalPerdidasYGanancias() {
        return ingresosFamiliaresTotalPerdidasYGanancias;
    }

    /**
     * Sets the value of the ingresosFamiliaresTotalPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosFamiliaresTotalPerdidasYGanancias(BigDecimal value) {
        this.ingresosFamiliaresTotalPerdidasYGanancias = value;
    }

    /**
     * Gets the value of the ingresosNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getIngresosNegocio() {
        return ingresosNegocio;
    }

    /**
     * Sets the value of the ingresosNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setIngresosNegocio(BigDecimal value) {
        this.ingresosNegocio = value;
    }

    /**
     * Gets the value of the interesesAmortizacion property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInteresesAmortizacion() {
        return interesesAmortizacion;
    }

    /**
     * Sets the value of the interesesAmortizacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInteresesAmortizacion(Boolean value) {
        this.interesesAmortizacion = value;
    }

    /**
     * Gets the value of the latitud property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitud() {
        return latitud;
    }

    /**
     * Sets the value of the latitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitud(BigDecimal value) {
        this.latitud = value;
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
     * Gets the value of the longitud property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitud() {
        return longitud;
    }

    /**
     * Sets the value of the longitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitud(BigDecimal value) {
        this.longitud = value;
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
     * Gets the value of the metodo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetodo() {
        return metodo;
    }

    /**
     * Sets the value of the metodo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetodo(String value) {
        this.metodo = value;
    }

    /**
     * Gets the value of the moduloID property.
     * 
     */
    public int getModuloID() {
        return moduloID;
    }

    /**
     * Sets the value of the moduloID property.
     * 
     */
    public void setModuloID(int value) {
        this.moduloID = value;
    }

    /**
     * Gets the value of the montoSolicitud property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoSolicitud() {
        return montoSolicitud;
    }

    /**
     * Sets the value of the montoSolicitud property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoSolicitud(BigDecimal value) {
        this.montoSolicitud = value;
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
     * Gets the value of the nombreInformacionNegocio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreInformacionNegocio() {
        return nombreInformacionNegocio;
    }

    /**
     * Sets the value of the nombreInformacionNegocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreInformacionNegocio(String value) {
        this.nombreInformacionNegocio = value;
    }

    /**
     * Gets the value of the nombreModulo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreModulo() {
        return nombreModulo;
    }

    /**
     * Sets the value of the nombreModulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreModulo(String value) {
        this.nombreModulo = value;
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
     * Gets the value of the numeroEmpleados property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getNumeroEmpleados() {
        return numeroEmpleados;
    }

    /**
     * Sets the value of the numeroEmpleados property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setNumeroEmpleados(Short value) {
        this.numeroEmpleados = value;
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
     * Gets the value of the observacionReferenciasComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacionReferenciasComerciales() {
        return observacionReferenciasComerciales;
    }

    /**
     * Sets the value of the observacionReferenciasComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacionReferenciasComerciales(String value) {
        this.observacionReferenciasComerciales = value;
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
     * Gets the value of the patrimonioMontos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPatrimonioMontos() {
        return patrimonioMontos;
    }

    /**
     * Sets the value of the patrimonioMontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPatrimonioMontos(BigDecimal value) {
        this.patrimonioMontos = value;
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
     * Gets the value of the periodoGracia property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodoGracia() {
        return periodoGracia;
    }

    /**
     * Sets the value of the periodoGracia property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodoGracia(Integer value) {
        this.periodoGracia = value;
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
     * Gets the value of the personaIdCentralRiesgo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPersonaIdCentralRiesgo() {
        return personaIdCentralRiesgo;
    }

    /**
     * Sets the value of the personaIdCentralRiesgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPersonaIdCentralRiesgo(Integer value) {
        this.personaIdCentralRiesgo = value;
    }

    /**
     * Gets the value of the plazo property.
     * 
     */
    public short getPlazo() {
        return plazo;
    }

    /**
     * Sets the value of the plazo property.
     * 
     */
    public void setPlazo(short value) {
        this.plazo = value;
    }

    /**
     * Gets the value of the primerInteres property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimerInteres() {
        return primerInteres;
    }

    /**
     * Sets the value of the primerInteres property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimerInteres(BigDecimal value) {
        this.primerInteres = value;
    }

    /**
     * Gets the value of the primeraCuota property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPrimeraCuota() {
        return primeraCuota;
    }

    /**
     * Sets the value of the primeraCuota property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPrimeraCuota(BigDecimal value) {
        this.primeraCuota = value;
    }

    /**
     * Gets the value of the productoID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductoID() {
        return productoID;
    }

    /**
     * Sets the value of the productoID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductoID(Integer value) {
        this.productoID = value;
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
     * Gets the value of the referencia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferencia() {
        return referencia;
    }

    /**
     * Sets the value of the referencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferencia(String value) {
        this.referencia = value;
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
     * Gets the value of the referenciasComerciales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenciasComerciales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenciasComerciales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenciasComerciales }
     * 
     * 
     */
    public List<ReferenciasComerciales> getReferenciasComerciales() {
        if (referenciasComerciales == null) {
            referenciasComerciales = new ArrayList<ReferenciasComerciales>();
        }
        return this.referenciasComerciales;
    }
    

    public void setReferenciasComerciales(List<ReferenciasComerciales> referenciasComerciales) {
		this.referenciasComerciales = referenciasComerciales;
	}

	/**
     * Gets the value of the referenciasPersonales property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenciasPersonales property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenciasPersonales().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenciasPersonales }
     * 
     * 
     */
    public List<ReferenciasPersonales> getReferenciasPersonales() {
        if (referenciasPersonales == null) {
            referenciasPersonales = new ArrayList<ReferenciasPersonales>();
        }
        return this.referenciasPersonales;
    }

    
    public void setReferenciasPersonales(List<ReferenciasPersonales> referenciasPersonales) {
		this.referenciasPersonales = referenciasPersonales;
	}

	/**
     * Gets the value of the referenciasPersonales2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenciasPersonales2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenciasPersonales2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReferenciasPersonales }
     * 
     * 
     */
    public List<ReferenciasPersonales> getReferenciasPersonales2() {
        if (referenciasPersonales2 == null) {
            referenciasPersonales2 = new ArrayList<ReferenciasPersonales>();
        }
        return this.referenciasPersonales2;
    }

    
    public void setReferenciasPersonales2(List<ReferenciasPersonales> referenciasPersonales2) {
		this.referenciasPersonales2 = referenciasPersonales2;
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
     * Gets the value of the sectorEconomicoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectorEconomicoCOD() {
        return sectorEconomicoCOD;
    }

    /**
     * Sets the value of the sectorEconomicoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectorEconomicoCOD(String value) {
        this.sectorEconomicoCOD = value;
    }

    /**
     * Gets the value of the segmento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmento() {
        return segmento;
    }

    /**
     * Sets the value of the segmento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmento(String value) {
        this.segmento = value;
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
     * Gets the value of the socio property.
     * 
     * @return
     *     possible object is
     *     {@link Persona }
     *     
     */
    public Persona getSocio() {
        return socio;
    }

    /**
     * Sets the value of the socio property.
     * 
     * @param value
     *     allowed object is
     *     {@link Persona }
     *     
     */
    public void setSocio(Persona value) {
        this.socio = value;
    }

    /**
     * Gets the value of the solicitudID property.
     * 
     */
    public int getSolicitudID() {
        return solicitudID;
    }

    /**
     * Sets the value of the solicitudID property.
     * 
     */
    public void setSolicitudID(int value) {
        this.solicitudID = value;
    }

    /**
     * Gets the value of the tasa property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTasa() {
        return tasa;
    }

    /**
     * Sets the value of the tasa property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTasa(BigDecimal value) {
        this.tasa = value;
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
     * Gets the value of the telefonoReferenciasComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoReferenciasComerciales() {
        return telefonoReferenciasComerciales;
    }

    /**
     * Sets the value of the telefonoReferenciasComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoReferenciasComerciales(String value) {
        this.telefonoReferenciasComerciales = value;
    }

    /**
     * Gets the value of the telefonoTrabajoConyuge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoTrabajoConyuge() {
        return telefonoTrabajoConyuge;
    }

    /**
     * Sets the value of the telefonoTrabajoConyuge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoTrabajoConyuge(String value) {
        this.telefonoTrabajoConyuge = value;
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
     * Gets the value of the tipoCuotaCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoCuotaCOD() {
        return tipoCuotaCOD;
    }

    /**
     * Sets the value of the tipoCuotaCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoCuotaCOD(String value) {
        this.tipoCuotaCOD = value;
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
     * Gets the value of the tipoLocalCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoLocalCOD() {
        return tipoLocalCOD;
    }

    /**
     * Sets the value of the tipoLocalCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoLocalCOD(String value) {
        this.tipoLocalCOD = value;
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
     * Gets the value of the tipoReferenciaComercialCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoReferenciaComercialCOD() {
        return tipoReferenciaComercialCOD;
    }

    /**
     * Sets the value of the tipoReferenciaComercialCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoReferenciaComercialCOD(String value) {
        this.tipoReferenciaComercialCOD = value;
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

    /**
     * Gets the value of the totalEgresos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalEgresos() {
        return totalEgresos;
    }

    /**
     * Sets the value of the totalEgresos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalEgresos(BigDecimal value) {
        this.totalEgresos = value;
    }

    /**
     * Gets the value of the totalIngresosFlujo property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalIngresosFlujo() {
        return totalIngresosFlujo;
    }

    /**
     * Sets the value of the totalIngresosFlujo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalIngresosFlujo(BigDecimal value) {
        this.totalIngresosFlujo = value;
    }

    /**
     * Gets the value of the totalValorDetalleDeCuentasEGRESOSGarante property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorDetalleDeCuentasEGRESOSGarante() {
        return totalValorDetalleDeCuentasEGRESOSGarante;
    }

    /**
     * Sets the value of the totalValorDetalleDeCuentasEGRESOSGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorDetalleDeCuentasEGRESOSGarante(BigDecimal value) {
        this.totalValorDetalleDeCuentasEGRESOSGarante = value;
    }

    /**
     * Gets the value of the totalValorDetalleDeCuentasEGRESOSSocio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorDetalleDeCuentasEGRESOSSocio() {
        return totalValorDetalleDeCuentasEGRESOSSocio;
    }

    /**
     * Sets the value of the totalValorDetalleDeCuentasEGRESOSSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorDetalleDeCuentasEGRESOSSocio(BigDecimal value) {
        this.totalValorDetalleDeCuentasEGRESOSSocio = value;
    }

    /**
     * Gets the value of the totalValorDetalleDeCuentasINGRESOSGarante property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorDetalleDeCuentasINGRESOSGarante() {
        return totalValorDetalleDeCuentasINGRESOSGarante;
    }

    /**
     * Sets the value of the totalValorDetalleDeCuentasINGRESOSGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorDetalleDeCuentasINGRESOSGarante(BigDecimal value) {
        this.totalValorDetalleDeCuentasINGRESOSGarante = value;
    }

    /**
     * Gets the value of the totalValorDetalleDeCuentasINGRESOSSocio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorDetalleDeCuentasINGRESOSSocio() {
        return totalValorDetalleDeCuentasINGRESOSSocio;
    }

    /**
     * Sets the value of the totalValorDetalleDeCuentasINGRESOSSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorDetalleDeCuentasINGRESOSSocio(BigDecimal value) {
        this.totalValorDetalleDeCuentasINGRESOSSocio = value;
    }

    /**
     * Gets the value of the totalValorDetallePatrimonial property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorDetallePatrimonial() {
        return totalValorDetallePatrimonial;
    }

    /**
     * Sets the value of the totalValorDetallePatrimonial property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorDetallePatrimonial(BigDecimal value) {
        this.totalValorDetallePatrimonial = value;
    }

    /**
     * Gets the value of the totalValorDetallePatrimonialGarante property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorDetallePatrimonialGarante() {
        return totalValorDetallePatrimonialGarante;
    }

    /**
     * Sets the value of the totalValorDetallePatrimonialGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorDetallePatrimonialGarante(BigDecimal value) {
        this.totalValorDetallePatrimonialGarante = value;
    }

    /**
     * Gets the value of the totalValorPatrimonioACTIVOGarante property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorPatrimonioACTIVOGarante() {
        return totalValorPatrimonioACTIVOGarante;
    }

    /**
     * Sets the value of the totalValorPatrimonioACTIVOGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorPatrimonioACTIVOGarante(BigDecimal value) {
        this.totalValorPatrimonioACTIVOGarante = value;
    }

    /**
     * Gets the value of the totalValorPatrimonioACTIVOSocio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorPatrimonioACTIVOSocio() {
        return totalValorPatrimonioACTIVOSocio;
    }

    /**
     * Sets the value of the totalValorPatrimonioACTIVOSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorPatrimonioACTIVOSocio(BigDecimal value) {
        this.totalValorPatrimonioACTIVOSocio = value;
    }

    /**
     * Gets the value of the totalValorPatrimonioPASIVOGarante property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorPatrimonioPASIVOGarante() {
        return totalValorPatrimonioPASIVOGarante;
    }

    /**
     * Sets the value of the totalValorPatrimonioPASIVOGarante property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorPatrimonioPASIVOGarante(BigDecimal value) {
        this.totalValorPatrimonioPASIVOGarante = value;
    }

    /**
     * Gets the value of the totalValorPatrimonioPASIVOSocio property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalValorPatrimonioPASIVOSocio() {
        return totalValorPatrimonioPASIVOSocio;
    }

    /**
     * Sets the value of the totalValorPatrimonioPASIVOSocio property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalValorPatrimonioPASIVOSocio(BigDecimal value) {
        this.totalValorPatrimonioPASIVOSocio = value;
    }

    /**
     * Gets the value of the unidadAntiguedadNegocioCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadAntiguedadNegocioCOD() {
        return unidadAntiguedadNegocioCOD;
    }

    /**
     * Sets the value of the unidadAntiguedadNegocioCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadAntiguedadNegocioCOD(String value) {
        this.unidadAntiguedadNegocioCOD = value;
    }

    /**
     * Gets the value of the unidadAntiguedadNegocioMismoLugarCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadAntiguedadNegocioMismoLugarCOD() {
        return unidadAntiguedadNegocioMismoLugarCOD;
    }

    /**
     * Sets the value of the unidadAntiguedadNegocioMismoLugarCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadAntiguedadNegocioMismoLugarCOD(String value) {
        this.unidadAntiguedadNegocioMismoLugarCOD = value;
    }

    /**
     * Gets the value of the unidadTiempoPlazoCOD property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadTiempoPlazoCOD() {
        return unidadTiempoPlazoCOD;
    }

    /**
     * Sets the value of the unidadTiempoPlazoCOD property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadTiempoPlazoCOD(String value) {
        this.unidadTiempoPlazoCOD = value;
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
     * Gets the value of the usuarioIDSolicitud property.
     * 
     */
    public short getUsuarioIDSolicitud() {
        return usuarioIDSolicitud;
    }

    /**
     * Sets the value of the usuarioIDSolicitud property.
     * 
     */
    public void setUsuarioIDSolicitud(short value) {
        this.usuarioIDSolicitud = value;
    }

    /**
     * Gets the value of the utilidadNegocioTotalPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadNegocioTotalPerdidasYGanancias() {
        return utilidadNegocioTotalPerdidasYGanancias;
    }

    /**
     * Sets the value of the utilidadNegocioTotalPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadNegocioTotalPerdidasYGanancias(BigDecimal value) {
        this.utilidadNegocioTotalPerdidasYGanancias = value;
    }

    /**
     * Gets the value of the utilidadNetaPersidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getUtilidadNetaPersidasYGanancias() {
        return utilidadNetaPersidasYGanancias;
    }

    /**
     * Sets the value of the utilidadNetaPersidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setUtilidadNetaPersidasYGanancias(BigDecimal value) {
        this.utilidadNetaPersidasYGanancias = value;
    }

    /**
     * Gets the value of the valorReferenciasComerciales property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorReferenciasComerciales() {
        return valorReferenciasComerciales;
    }

    /**
     * Sets the value of the valorReferenciasComerciales property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorReferenciasComerciales(BigDecimal value) {
        this.valorReferenciasComerciales = value;
    }

    /**
     * Gets the value of the ventasMontos property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentasMontos() {
        return ventasMontos;
    }

    /**
     * Sets the value of the ventasMontos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVentasMontos(BigDecimal value) {
        this.ventasMontos = value;
    }

    /**
     * Gets the value of the ventasTotalesPerdidasYGanancias property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVentasTotalesPerdidasYGanancias() {
        return ventasTotalesPerdidasYGanancias;
    }

    /**
     * Sets the value of the ventasTotalesPerdidasYGanancias property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVentasTotalesPerdidasYGanancias(BigDecimal value) {
        this.ventasTotalesPerdidasYGanancias = value;
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

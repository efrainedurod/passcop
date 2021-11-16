
package com.passcop.source.soap;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.passcop.source.soap package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ConsultarServicioPersona_QNAME = new QName("http://soap.source.passcop.com/", "ConsultarServicioPersona");
    private final static QName _ConsultarServicioPersonaResponse_QNAME = new QName("http://soap.source.passcop.com/", "ConsultarServicioPersonaResponse");
    private final static QName _EnviarDatosOperacion_QNAME = new QName("http://soap.source.passcop.com/", "EnviarDatosOperacion");
    private final static QName _EnviarDatosOperacionResponse_QNAME = new QName("http://soap.source.passcop.com/", "EnviarDatosOperacionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.passcop.source.soap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarServicioPersona }
     * 
     */
    public ConsultarServicioPersona createConsultarServicioPersona() {
        return new ConsultarServicioPersona();
    }

    /**
     * Create an instance of {@link ConsultarServicioPersonaResponse }
     * 
     */
    public ConsultarServicioPersonaResponse createConsultarServicioPersonaResponse() {
        return new ConsultarServicioPersonaResponse();
    }

    /**
     * Create an instance of {@link EnviarDatosOperacion }
     * 
     */
    public EnviarDatosOperacion createEnviarDatosOperacion() {
        return new EnviarDatosOperacion();
    }

    /**
     * Create an instance of {@link EnviarDatosOperacionResponse }
     * 
     */
    public EnviarDatosOperacionResponse createEnviarDatosOperacionResponse() {
        return new EnviarDatosOperacionResponse();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link Respuesta }
     * 
     */
    public Respuesta createRespuesta() {
        return new Respuesta();
    }

    /**
     * Create an instance of {@link RespuestaCentralRiesgo }
     * 
     */
    public RespuestaCentralRiesgo createRespuestaCentralRiesgo() {
        return new RespuestaCentralRiesgo();
    }

    /**
     * Create an instance of {@link DetallePatrimonial }
     * 
     */
    public DetallePatrimonial createDetallePatrimonial() {
        return new DetallePatrimonial();
    }

    /**
     * Create an instance of {@link DetalleDeCuentas }
     * 
     */
    public DetalleDeCuentas createDetalleDeCuentas() {
        return new DetalleDeCuentas();
    }

    /**
     * Create an instance of {@link GarantiasReales }
     * 
     */
    public GarantiasReales createGarantiasReales() {
        return new GarantiasReales();
    }

    /**
     * Create an instance of {@link ReferenciasComerciales }
     * 
     */
    public ReferenciasComerciales createReferenciasComerciales() {
        return new ReferenciasComerciales();
    }

    /**
     * Create an instance of {@link ReferenciasPersonales }
     * 
     */
    public ReferenciasPersonales createReferenciasPersonales() {
        return new ReferenciasPersonales();
    }

    /**
     * Create an instance of {@link RespuestaSolicitud }
     * 
     */
    public RespuestaSolicitud createRespuestaSolicitud() {
        return new RespuestaSolicitud();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarServicioPersona }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "ConsultarServicioPersona")
    public JAXBElement<ConsultarServicioPersona> createConsultarServicioPersona(ConsultarServicioPersona value) {
        return new JAXBElement<ConsultarServicioPersona>(_ConsultarServicioPersona_QNAME, ConsultarServicioPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarServicioPersonaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "ConsultarServicioPersonaResponse")
    public JAXBElement<ConsultarServicioPersonaResponse> createConsultarServicioPersonaResponse(ConsultarServicioPersonaResponse value) {
        return new JAXBElement<ConsultarServicioPersonaResponse>(_ConsultarServicioPersonaResponse_QNAME, ConsultarServicioPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarDatosOperacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "EnviarDatosOperacion")
    public JAXBElement<EnviarDatosOperacion> createEnviarDatosOperacion(EnviarDatosOperacion value) {
        return new JAXBElement<EnviarDatosOperacion>(_EnviarDatosOperacion_QNAME, EnviarDatosOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarDatosOperacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "EnviarDatosOperacionResponse")
    public JAXBElement<EnviarDatosOperacionResponse> createEnviarDatosOperacionResponse(EnviarDatosOperacionResponse value) {
        return new JAXBElement<EnviarDatosOperacionResponse>(_EnviarDatosOperacionResponse_QNAME, EnviarDatosOperacionResponse.class, null, value);
    }

}

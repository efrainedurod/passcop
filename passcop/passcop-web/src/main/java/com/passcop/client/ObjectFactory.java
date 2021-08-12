
package com.passcop.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.passcop.client package. 
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

    private final static QName _ConsultarPersonaNuevo_QNAME = new QName("http://soap.source.passcop.com/", "consultarPersonaNuevo");
    private final static QName _ConsultarPersonaNuevo2_QNAME = new QName("http://soap.source.passcop.com/", "consultarPersonaNuevo2");
    private final static QName _ConsultarPersonaNuevo2Response_QNAME = new QName("http://soap.source.passcop.com/", "consultarPersonaNuevo2Response");
    private final static QName _ConsultarPersonaNuevoResponse_QNAME = new QName("http://soap.source.passcop.com/", "consultarPersonaNuevoResponse");
    private final static QName _ContultaDetail_QNAME = new QName("http://soap.source.passcop.com/", "contultaDetail");
    private final static QName _ContultaDetailResponse_QNAME = new QName("http://soap.source.passcop.com/", "contultaDetailResponse");
    private final static QName _EnviarOperacion_QNAME = new QName("http://soap.source.passcop.com/", "enviarOperacion");
    private final static QName _EnviarOperacionResponse_QNAME = new QName("http://soap.source.passcop.com/", "enviarOperacionResponse");
    private final static QName _Exception_QNAME = new QName("http://soap.source.passcop.com/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.passcop.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultarPersonaNuevo }
     * 
     */
    public ConsultarPersonaNuevo createConsultarPersonaNuevo() {
        return new ConsultarPersonaNuevo();
    }

    /**
     * Create an instance of {@link ConsultarPersonaNuevo2 }
     * 
     */
    public ConsultarPersonaNuevo2 createConsultarPersonaNuevo2() {
        return new ConsultarPersonaNuevo2();
    }

    /**
     * Create an instance of {@link ConsultarPersonaNuevo2Response }
     * 
     */
    public ConsultarPersonaNuevo2Response createConsultarPersonaNuevo2Response() {
        return new ConsultarPersonaNuevo2Response();
    }

    /**
     * Create an instance of {@link ConsultarPersonaNuevoResponse }
     * 
     */
    public ConsultarPersonaNuevoResponse createConsultarPersonaNuevoResponse() {
        return new ConsultarPersonaNuevoResponse();
    }

    /**
     * Create an instance of {@link ContultaDetail }
     * 
     */
    public ContultaDetail createContultaDetail() {
        return new ContultaDetail();
    }

    /**
     * Create an instance of {@link ContultaDetailResponse }
     * 
     */
    public ContultaDetailResponse createContultaDetailResponse() {
        return new ContultaDetailResponse();
    }

    /**
     * Create an instance of {@link EnviarOperacion }
     * 
     */
    public EnviarOperacion createEnviarOperacion() {
        return new EnviarOperacion();
    }

    /**
     * Create an instance of {@link EnviarOperacionResponse }
     * 
     */
    public EnviarOperacionResponse createEnviarOperacionResponse() {
        return new EnviarOperacionResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
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
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPersonaNuevo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "consultarPersonaNuevo")
    public JAXBElement<ConsultarPersonaNuevo> createConsultarPersonaNuevo(ConsultarPersonaNuevo value) {
        return new JAXBElement<ConsultarPersonaNuevo>(_ConsultarPersonaNuevo_QNAME, ConsultarPersonaNuevo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPersonaNuevo2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "consultarPersonaNuevo2")
    public JAXBElement<ConsultarPersonaNuevo2> createConsultarPersonaNuevo2(ConsultarPersonaNuevo2 value) {
        return new JAXBElement<ConsultarPersonaNuevo2>(_ConsultarPersonaNuevo2_QNAME, ConsultarPersonaNuevo2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPersonaNuevo2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "consultarPersonaNuevo2Response")
    public JAXBElement<ConsultarPersonaNuevo2Response> createConsultarPersonaNuevo2Response(ConsultarPersonaNuevo2Response value) {
        return new JAXBElement<ConsultarPersonaNuevo2Response>(_ConsultarPersonaNuevo2Response_QNAME, ConsultarPersonaNuevo2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultarPersonaNuevoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "consultarPersonaNuevoResponse")
    public JAXBElement<ConsultarPersonaNuevoResponse> createConsultarPersonaNuevoResponse(ConsultarPersonaNuevoResponse value) {
        return new JAXBElement<ConsultarPersonaNuevoResponse>(_ConsultarPersonaNuevoResponse_QNAME, ConsultarPersonaNuevoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContultaDetail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "contultaDetail")
    public JAXBElement<ContultaDetail> createContultaDetail(ContultaDetail value) {
        return new JAXBElement<ContultaDetail>(_ContultaDetail_QNAME, ContultaDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContultaDetailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "contultaDetailResponse")
    public JAXBElement<ContultaDetailResponse> createContultaDetailResponse(ContultaDetailResponse value) {
        return new JAXBElement<ContultaDetailResponse>(_ContultaDetailResponse_QNAME, ContultaDetailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarOperacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "enviarOperacion")
    public JAXBElement<EnviarOperacion> createEnviarOperacion(EnviarOperacion value) {
        return new JAXBElement<EnviarOperacion>(_EnviarOperacion_QNAME, EnviarOperacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnviarOperacionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "enviarOperacionResponse")
    public JAXBElement<EnviarOperacionResponse> createEnviarOperacionResponse(EnviarOperacionResponse value) {
        return new JAXBElement<EnviarOperacionResponse>(_EnviarOperacionResponse_QNAME, EnviarOperacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://soap.source.passcop.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}

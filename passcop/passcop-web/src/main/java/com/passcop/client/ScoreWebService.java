package com.passcop.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2021-08-03T22:57:45.011-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://soap.source.passcop.com/", name = "ScoreWebService")
@XmlSeeAlso({ObjectFactory.class})
public interface ScoreWebService {

    @WebMethod
    @RequestWrapper(localName = "enviarOperacion", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.EnviarOperacion")
    @ResponseWrapper(localName = "enviarOperacionResponse", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.EnviarOperacionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String enviarOperacion(
        @WebParam(name = "operacion", targetNamespace = "")
        com.passcop.client.Respuesta operacion
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "contultaDetail", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.ContultaDetail")
    @ResponseWrapper(localName = "contultaDetailResponse", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.ContultaDetailResponse")
    @WebResult(name = "return", targetNamespace = "")
    public java.lang.String contultaDetail(
        @WebParam(name = "identificacion", targetNamespace = "")
        java.lang.String identificacion
    ) throws Exception_Exception;

    @WebMethod
    @RequestWrapper(localName = "consultarPersonaNuevo2", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.ConsultarPersonaNuevo2")
    @ResponseWrapper(localName = "consultarPersonaNuevo2Response", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.ConsultarPersonaNuevo2Response")
    @WebResult(name = "return", targetNamespace = "")
    public java.util.List<com.passcop.client.Persona> consultarPersonaNuevo2(
        @WebParam(name = "identificacion", targetNamespace = "")
        java.lang.String identificacion
    );

    @WebMethod
    @RequestWrapper(localName = "consultarPersonaNuevo", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.ConsultarPersonaNuevo")
    @ResponseWrapper(localName = "consultarPersonaNuevoResponse", targetNamespace = "http://soap.source.passcop.com/", className = "com.passcop.client.ConsultarPersonaNuevoResponse")
    @WebResult(name = "return", targetNamespace = "")
    public com.passcop.client.Persona consultarPersonaNuevo(
        @WebParam(name = "identificacion", targetNamespace = "")
        java.lang.String identificacion,
        @WebParam(name = "UsuarioID", targetNamespace = "")
        java.lang.Short usuarioID
    ) throws Exception_Exception;
}

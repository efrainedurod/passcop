/**
 * WsMicroScoreBISoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.passcop.source.request;

public interface WsMicroScoreBISoap extends java.rmi.Remote {
    public Respuesta enviarDatosOperacion(int solicitudID, short oficialID, java.lang.String oficialCOD, org.apache.axis.types.UnsignedByte nivel) throws java.rmi.RemoteException;
    public Persona consultarServicioPersona(java.lang.String identificacion, short usuarioID) throws java.rmi.RemoteException;
}

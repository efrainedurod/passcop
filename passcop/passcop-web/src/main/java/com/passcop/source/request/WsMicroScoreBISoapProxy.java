package com.passcop.source.request;

public class WsMicroScoreBISoapProxy implements WsMicroScoreBISoap {
  private String _endpoint = null;
  private WsMicroScoreBISoap wsMicroScoreBISoap = null;
  
  public WsMicroScoreBISoapProxy() {
    _initWsMicroScoreBISoapProxy();
  }
  
  public WsMicroScoreBISoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initWsMicroScoreBISoapProxy();
  }
  
  private void _initWsMicroScoreBISoapProxy() {
    try {
      wsMicroScoreBISoap = (new WsMicroScoreBILocator()).getwsMicroScoreBISoap();
      if (wsMicroScoreBISoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)wsMicroScoreBISoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)wsMicroScoreBISoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (wsMicroScoreBISoap != null)
      ((javax.xml.rpc.Stub)wsMicroScoreBISoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public WsMicroScoreBISoap getWsMicroScoreBISoap() {
    if (wsMicroScoreBISoap == null)
      _initWsMicroScoreBISoapProxy();
    return wsMicroScoreBISoap;
  }
  
  public Respuesta enviarDatosOperacion(int solicitudID, short oficialID, java.lang.String oficialCOD, org.apache.axis.types.UnsignedByte nivel) throws java.rmi.RemoteException{
    if (wsMicroScoreBISoap == null)
      _initWsMicroScoreBISoapProxy();
    return wsMicroScoreBISoap.enviarDatosOperacion(solicitudID, oficialID, oficialCOD, nivel);
  }
  
  public Persona consultarServicioPersona(java.lang.String identificacion, short usuarioID) throws java.rmi.RemoteException{
    if (wsMicroScoreBISoap == null)
      _initWsMicroScoreBISoapProxy();
    return wsMicroScoreBISoap.consultarServicioPersona(identificacion, usuarioID);
  }
  
  
}
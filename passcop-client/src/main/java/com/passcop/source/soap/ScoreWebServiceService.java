package com.passcop.source.soap;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2021-11-30T19:55:14.133-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "ScoreWebServiceService", 
                  wsdlLocation = "http://localhost:8580/passcop-web/ScoreWebService?wsdl",
                  targetNamespace = "http://soap.source.passcop.com/") 
public class ScoreWebServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soap.source.passcop.com/", "ScoreWebServiceService");
    public final static QName ScoreWebServicePort = new QName("http://soap.source.passcop.com/", "ScoreWebServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8580/passcop-web/ScoreWebService?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ScoreWebServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:8580/passcop-web/ScoreWebService?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ScoreWebServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ScoreWebServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ScoreWebServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public ScoreWebServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public ScoreWebServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public ScoreWebServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns ScoreWebService
     */
    @WebEndpoint(name = "ScoreWebServicePort")
    public ScoreWebService getScoreWebServicePort() {
        return super.getPort(ScoreWebServicePort, ScoreWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ScoreWebService
     */
    @WebEndpoint(name = "ScoreWebServicePort")
    public ScoreWebService getScoreWebServicePort(WebServiceFeature... features) {
        return super.getPort(ScoreWebServicePort, ScoreWebService.class, features);
    }

}

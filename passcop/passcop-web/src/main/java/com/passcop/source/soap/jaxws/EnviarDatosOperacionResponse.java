
package com.passcop.source.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.6
 * Wed Nov 10 15:12:38 ECT 2021
 * Generated source version: 3.1.6
 */

@XmlRootElement(name = "EnviarDatosOperacionResponse", namespace = "http://soap.source.passcop.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarDatosOperacionResponse", namespace = "http://soap.source.passcop.com/")

public class EnviarDatosOperacionResponse {

    @XmlElement(name = "return")
    private com.passcop.source.request.RespuestaSolicitud _return;

    public com.passcop.source.request.RespuestaSolicitud getReturn() {
        return this._return;
    }

    public void setReturn(com.passcop.source.request.RespuestaSolicitud new_return)  {
        this._return = new_return;
    }

}


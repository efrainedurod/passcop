
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

@XmlRootElement(name = "EnviarDatosOperacion", namespace = "http://soap.source.passcop.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarDatosOperacion", namespace = "http://soap.source.passcop.com/")

public class EnviarDatosOperacion {

    @XmlElement(name = "operacion")
    private com.passcop.source.request.Respuesta operacion;

    public com.passcop.source.request.Respuesta getOperacion() {
        return this.operacion;
    }

    public void setOperacion(com.passcop.source.request.Respuesta newOperacion)  {
        this.operacion = newOperacion;
    }

}


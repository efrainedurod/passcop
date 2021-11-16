
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnviarDatosOperacionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnviarDatosOperacionResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://soap.source.passcop.com/}respuestaSolicitud" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarDatosOperacionResponse", propOrder = {
    "_return"
})
public class EnviarDatosOperacionResponse {

    @XmlElement(name = "return")
    protected RespuestaSolicitud _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaSolicitud }
     *     
     */
    public RespuestaSolicitud getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaSolicitud }
     *     
     */
    public void setReturn(RespuestaSolicitud value) {
        this._return = value;
    }

}

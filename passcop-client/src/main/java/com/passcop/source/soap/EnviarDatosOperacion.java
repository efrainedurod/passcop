
package com.passcop.source.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnviarDatosOperacion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnviarDatosOperacion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="operacion" type="{http://soap.source.passcop.com/}respuesta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnviarDatosOperacion", propOrder = {
    "operacion"
})
public class EnviarDatosOperacion {

    protected Respuesta operacion;

    /**
     * Gets the value of the operacion property.
     * 
     * @return
     *     possible object is
     *     {@link Respuesta }
     *     
     */
    public Respuesta getOperacion() {
        return operacion;
    }

    /**
     * Sets the value of the operacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Respuesta }
     *     
     */
    public void setOperacion(Respuesta value) {
        this.operacion = value;
    }

}

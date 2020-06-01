
package eu.chorevolution.farmbusinessstartup.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmBusinessStartupRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="messageData" type="{http://eu.chorevolution.farmbusinessstartup/cduser}farmBusinessStartupRequest"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupRequestType", propOrder = {
    "messageData"
})
public class FarmBusinessStartupRequestType {

    @XmlElement(required = true)
    protected FarmBusinessStartupRequest messageData;

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupRequest }
     *     
     */
    public FarmBusinessStartupRequest getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupRequest }
     *     
     */
    public void setMessageData(FarmBusinessStartupRequest value) {
        this.messageData = value;
    }

}

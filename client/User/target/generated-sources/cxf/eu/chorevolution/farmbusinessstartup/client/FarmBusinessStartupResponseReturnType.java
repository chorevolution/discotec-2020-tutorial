
package eu.chorevolution.farmbusinessstartup.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for farmBusinessStartupResponseReturnType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="farmBusinessStartupResponseReturnType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="choreographyId" type="{http://eu.chorevolution.farmbusinessstartup/cduser}choreographyInstanceRequest"/&gt;
 *         &lt;element name="messageData" type="{http://eu.chorevolution.farmbusinessstartup/cduser}farmBusinessStartupResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "farmBusinessStartupResponseReturnType", propOrder = {
    "choreographyId",
    "messageData"
})
public class FarmBusinessStartupResponseReturnType {

    @XmlElement(required = true)
    protected ChoreographyInstanceRequest choreographyId;
    @XmlElement(required = true)
    protected FarmBusinessStartupResponse messageData;

    /**
     * Gets the value of the choreographyId property.
     * 
     * @return
     *     possible object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public ChoreographyInstanceRequest getChoreographyId() {
        return choreographyId;
    }

    /**
     * Sets the value of the choreographyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChoreographyInstanceRequest }
     *     
     */
    public void setChoreographyId(ChoreographyInstanceRequest value) {
        this.choreographyId = value;
    }

    /**
     * Gets the value of the messageData property.
     * 
     * @return
     *     possible object is
     *     {@link FarmBusinessStartupResponse }
     *     
     */
    public FarmBusinessStartupResponse getMessageData() {
        return messageData;
    }

    /**
     * Sets the value of the messageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarmBusinessStartupResponse }
     *     
     */
    public void setMessageData(FarmBusinessStartupResponse value) {
        this.messageData = value;
    }

}

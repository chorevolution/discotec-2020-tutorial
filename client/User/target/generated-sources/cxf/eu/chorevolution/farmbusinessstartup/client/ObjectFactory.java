
package eu.chorevolution.farmbusinessstartup.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.chorevolution.farmbusinessstartup.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FarmBusinessStartupRequestElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/cduser", "farmBusinessStartupRequestElementRequest");
    private final static QName _FarmBusinessStartupResponseElementResponse_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/cduser", "farmBusinessStartupResponseElementResponse");
    private final static QName _FarmBusinessStartupResponseElementRequest_QNAME = new QName("http://eu.chorevolution.farmbusinessstartup/cduser", "farmBusinessStartupResponseElementRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.chorevolution.farmbusinessstartup.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FarmBusinessStartupRequestType }
     * 
     */
    public FarmBusinessStartupRequestType createFarmBusinessStartupRequestType() {
        return new FarmBusinessStartupRequestType();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupResponseReturnType }
     * 
     */
    public FarmBusinessStartupResponseReturnType createFarmBusinessStartupResponseReturnType() {
        return new FarmBusinessStartupResponseReturnType();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupResponseType }
     * 
     */
    public FarmBusinessStartupResponseType createFarmBusinessStartupResponseType() {
        return new FarmBusinessStartupResponseType();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupRequest }
     * 
     */
    public FarmBusinessStartupRequest createFarmBusinessStartupRequest() {
        return new FarmBusinessStartupRequest();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupRequestFormDetails }
     * 
     */
    public FarmBusinessStartupRequestFormDetails createFarmBusinessStartupRequestFormDetails() {
        return new FarmBusinessStartupRequestFormDetails();
    }

    /**
     * Create an instance of {@link PersonData }
     * 
     */
    public PersonData createPersonData() {
        return new PersonData();
    }

    /**
     * Create an instance of {@link AddressDetails }
     * 
     */
    public AddressDetails createAddressDetails() {
        return new AddressDetails();
    }

    /**
     * Create an instance of {@link FarmDetails }
     * 
     */
    public FarmDetails createFarmDetails() {
        return new FarmDetails();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionRequest }
     * 
     */
    public FarmSiteInspectionRequest createFarmSiteInspectionRequest() {
        return new FarmSiteInspectionRequest();
    }

    /**
     * Create an instance of {@link FarmSiteInspectionResponse }
     * 
     */
    public FarmSiteInspectionResponse createFarmSiteInspectionResponse() {
        return new FarmSiteInspectionResponse();
    }

    /**
     * Create an instance of {@link VeterinarySiteInspectionDetails }
     * 
     */
    public VeterinarySiteInspectionDetails createVeterinarySiteInspectionDetails() {
        return new VeterinarySiteInspectionDetails();
    }

    /**
     * Create an instance of {@link FarmOpeningNotification }
     * 
     */
    public FarmOpeningNotification createFarmOpeningNotification() {
        return new FarmOpeningNotification();
    }

    /**
     * Create an instance of {@link FarmRegistrationRequest }
     * 
     */
    public FarmRegistrationRequest createFarmRegistrationRequest() {
        return new FarmRegistrationRequest();
    }

    /**
     * Create an instance of {@link FarmRegistrationResponse }
     * 
     */
    public FarmRegistrationResponse createFarmRegistrationResponse() {
        return new FarmRegistrationResponse();
    }

    /**
     * Create an instance of {@link FarmBusinessStartupResponse }
     * 
     */
    public FarmBusinessStartupResponse createFarmBusinessStartupResponse() {
        return new FarmBusinessStartupResponse();
    }

    /**
     * Create an instance of {@link FarmRegistrationNotification }
     * 
     */
    public FarmRegistrationNotification createFarmRegistrationNotification() {
        return new FarmRegistrationNotification();
    }

    /**
     * Create an instance of {@link FarmBusinessCodeStartupNotification }
     * 
     */
    public FarmBusinessCodeStartupNotification createFarmBusinessCodeStartupNotification() {
        return new FarmBusinessCodeStartupNotification();
    }

    /**
     * Create an instance of {@link ChoreographyInstanceRequest }
     * 
     */
    public ChoreographyInstanceRequest createChoreographyInstanceRequest() {
        return new ChoreographyInstanceRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmBusinessStartupRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/cduser", name = "farmBusinessStartupRequestElementRequest")
    public JAXBElement<FarmBusinessStartupRequestType> createFarmBusinessStartupRequestElementRequest(FarmBusinessStartupRequestType value) {
        return new JAXBElement<FarmBusinessStartupRequestType>(_FarmBusinessStartupRequestElementRequest_QNAME, FarmBusinessStartupRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmBusinessStartupResponseReturnType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/cduser", name = "farmBusinessStartupResponseElementResponse")
    public JAXBElement<FarmBusinessStartupResponseReturnType> createFarmBusinessStartupResponseElementResponse(FarmBusinessStartupResponseReturnType value) {
        return new JAXBElement<FarmBusinessStartupResponseReturnType>(_FarmBusinessStartupResponseElementResponse_QNAME, FarmBusinessStartupResponseReturnType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FarmBusinessStartupResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://eu.chorevolution.farmbusinessstartup/cduser", name = "farmBusinessStartupResponseElementRequest")
    public JAXBElement<FarmBusinessStartupResponseType> createFarmBusinessStartupResponseElementRequest(FarmBusinessStartupResponseType value) {
        return new JAXBElement<FarmBusinessStartupResponseType>(_FarmBusinessStartupResponseElementRequest_QNAME, FarmBusinessStartupResponseType.class, null, value);
    }

}

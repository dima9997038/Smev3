package mipris.smev3.etalon.modelClientSendRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "addressRegistration","getLicenseAddress", "huntingLicenseApplicant","huntingLicenseDocData","huntingLicenseDocumentReferences"})
public class ApplicationDetails {


    private AddressRegistration addressRegistration;
    private GetLicenseAddress getLicenseAddress;
    private HuntingLicenseApplicant huntingLicenseApplicant;
    private HuntingLicenseDocData huntingLicenseDocData;
    private HuntingLicenseDocumentReferences huntingLicenseDocumentReferences;

    public HuntingLicenseDocumentReferences getHuntingLicenseDocumentReferences() {
        return huntingLicenseDocumentReferences;
    }
    @XmlElement(name = "ns:HuntingLicenseDocumentReferences")
    public void setHuntingLicenseDocumentReferences(HuntingLicenseDocumentReferences huntingLicenseDocumentReferences) {
        this.huntingLicenseDocumentReferences = huntingLicenseDocumentReferences;
    }



    public AddressRegistration getAddressRegistration() {
        return addressRegistration;
    }
    @XmlElement(name = "ns:AddressRegistration")
    public void setAddressRegistration(AddressRegistration addressRegistration) {
        this.addressRegistration = addressRegistration;
    }

    public GetLicenseAddress getGetLicenseAddress() {
        return getLicenseAddress;
    }

    @XmlElement(name = "ns:GetLicenseAddress")
    public void setGetLicenseAddress(GetLicenseAddress getLicenseAddress) {
        this.getLicenseAddress = getLicenseAddress;
    }

    public HuntingLicenseApplicant getHuntingLicenseApplicant() {
        return huntingLicenseApplicant;
    }
    @XmlElement(name = "ns:HuntingLicenseApplicant")
    public void setHuntingLicenseApplicant(HuntingLicenseApplicant huntingLicenseApplicant) {
        this.huntingLicenseApplicant = huntingLicenseApplicant;
    }

    public HuntingLicenseDocData getHuntingLicenseDocData() {
        return huntingLicenseDocData;
    }
    @XmlElement(name = "ns:HuntingLicenseDocData")
    public void setHuntingLicenseDocData(HuntingLicenseDocData huntingLicenseDocData) {
        this.huntingLicenseDocData = huntingLicenseDocData;
    }
}

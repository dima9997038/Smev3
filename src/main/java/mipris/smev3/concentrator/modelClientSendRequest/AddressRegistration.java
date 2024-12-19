package mipris.smev3.concentrator.modelClientSendRequest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"fullAddress","index","region","street","house","building1","apartment"})
public class AddressRegistration {


    private String fullAddress;
    private String index;
    private Region region;
    private Street street;
    private House house;

    public House getHouse() {
        return house;
    }
    @XmlElement(name = "ns:House")
    public void setHouse(House house) {
        this.house = house;
    }
    public Region getRegion() {
        return region;
    }
    @XmlElement(name = "ns:Region")
    public void setRegion(Region region) {
        this.region = region;
    }

    private String building1;
    private String apartment;

    public String getFullAddress() {
        return fullAddress;
    }

    @XmlElement(name = "ns:FullAddress")
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public String getIndex() {
        return index;
    }
    @XmlElement(name = "ns:Index")
    public void setIndex(String index) {
        this.index = index;
    }

    public Street getStreet() {
        return street;
    }
    @XmlElement(name = "ns:Street")
    public void setStreet(Street street) {
        this.street = street;
    }

    public String getBuilding1() {
        return building1;
    }
    @XmlElement(name = "ns:Building1")
    public void setBuilding1(String building1) {
        this.building1 = building1;
    }

    public String getApartment() {
        return apartment;
    }
    @XmlElement(name = "ns:Apartment")
    public void setApartment(String apartment) {
        this.apartment = apartment;
    }
}

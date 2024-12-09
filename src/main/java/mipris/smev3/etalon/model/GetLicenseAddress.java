package mipris.smev3.etalon.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"fullAddress","index","region","street","house","building1","apartment"})
public class GetLicenseAddress {
    private String fullAddress;
    private String index;
    private Region region;
    private Street street;
    private House house;
    @XmlElement(name = "ns:House")
    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
    @XmlElement(name = "ns:Region")
    public Region getRegion() {
        return region;
    }

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
    @XmlElement(name = "ns:Street")
    public Street getStreet() {
        return street;
    }

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

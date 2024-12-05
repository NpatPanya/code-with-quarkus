package org.acme.SOAP_service.AllinOne.material;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OBJD {
    @XmlElement
    private String address;
    @XmlElement
    private String district;
    @XmlElement
    private String city;
    @XmlElement
    private int postal;

    public OBJD() {}

//    public OBJD(String address, String district, String city, int postal) {
//        this.address = address;
//        this.district = district;
//        this.city = city;
//        this.postal = postal;
//    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getPostal() {
        return postal;
    }
    public void setPostal(int postal) {
        this.postal = postal;
    }


}

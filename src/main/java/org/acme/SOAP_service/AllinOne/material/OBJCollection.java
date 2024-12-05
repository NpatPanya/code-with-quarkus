package org.acme.SOAP_service.AllinOne.material;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Objects;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class OBJCollection {
    @XmlElement
    private ArrayList<Object> userDetails = new ArrayList<>();
    @XmlElement
    private ArrayList<Object> contractDetails = new ArrayList<>();

    public OBJCollection() {}

//    public OBJCollection(ArrayList<Object> userDetails , ArrayList<Object> contractDetails) {
//        this.userDetails  = userDetails ;
//        this.contractDetails = contractDetails;
//    }

    public ArrayList<Object> getUserDetails() {
        return userDetails ;
    }
    public void setUserDetails(ArrayList<Object> userDetails) {
        this.userDetails  = userDetails;
    }
    public ArrayList<Object> getContractDetails() {
        return contractDetails;
    }
    public void setContractDetails(ArrayList<Object> contractDetails) {
        this.contractDetails = contractDetails;
    }

    public void addUserDetails(Object userDetails ) {
        this.userDetails.add(userDetails );
    }
    public void addContractDetails(Object contractDetails) {
        this.contractDetails.add(contractDetails);
    }
}



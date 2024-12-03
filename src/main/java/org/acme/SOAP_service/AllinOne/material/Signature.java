package org.acme.SOAP_service.AllinOne.material;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Signature {
    @XmlElement
    private ArrayList<String> signature = new ArrayList<>();

    public Signature() {}

    public Signature(ArrayList<String> signature) {
        this.signature = signature;
    }

    public void setSignature(ArrayList<String> signature) {
        this.signature = signature;
    }

    public ArrayList<String> getSignature() {
        return signature;
    }
    public void addSignature(String signature) {
        this.signature.add(signature);
    }
}

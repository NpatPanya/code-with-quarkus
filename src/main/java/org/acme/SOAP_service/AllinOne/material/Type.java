package org.acme.SOAP_service.AllinOne.material;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Type {
    @XmlElement
    private String type;

    public Type(){}

    public Type(String type){
        this.type = type;
    }
//    @XmlElement(name = "type")
    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

}

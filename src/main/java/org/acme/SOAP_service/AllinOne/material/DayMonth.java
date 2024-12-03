package org.acme.SOAP_service.AllinOne.material;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DayMonth {
    @XmlAttribute
    private Date date;

    public DayMonth() {}

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

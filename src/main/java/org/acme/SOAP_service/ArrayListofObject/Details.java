package org.acme.SOAP_service.ArrayListofObject;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)  // Use this to access getters instead of fields directly
public class Details {
    @XmlElement
    private String name;
    @XmlElement
    private Date date;
    @XmlElement
    private String description;

    public Details(String name, Date date, String description) {
        this.name = name;
        this.date = date;
        this.description = description;
    }

    public Details() {}

    // Getters and Setters
//    @XmlElement  // Use @XmlElement on getter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @XmlElement  // Use @XmlElement on getter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

//    @XmlElement  // Use @XmlElement on getter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Details {name=" + name + ", date=" + date + ", description=" + description + "}";
    }
}

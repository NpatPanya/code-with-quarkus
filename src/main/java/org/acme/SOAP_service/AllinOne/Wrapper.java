package org.acme.SOAP_service.AllinOne;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.acme.SOAP_service.AllinOne.material.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Wrapper {
    private static final Logger log = LoggerFactory.getLogger(Wrapper.class);
    @XmlElement
    private Type type;
    @XmlElement
    private DayMonth day;
    @XmlElement
    private Signature signature;
    @XmlElement
    private OBJD objd;
    @XmlElement
    private OBJCollection collection;

    public Wrapper() {}


    // Getters and Setters (Optional, if needed)
    public Type getType() {
        return type;
    }

    public void setType(Type value) {
        this.type = value;
    }

    public DayMonth getDay() {
        return day;
    }

    public void setDay(DayMonth value) {
        this.day = value;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature sign) {
        this.signature = sign;
    }

    public OBJD getObjd() {
        return objd;
    }

    public void setObjd(OBJD obj) {
        this.objd = obj;
    }

    public OBJCollection getCollection() {
        return collection;
    }

    public void setCollection(OBJCollection collection) {
        this.collection = collection;
    }


    @Override
    public String toString() {
        return "CombinedObject{" +
                "type=" + type +
                ", day=" + day +
                ", signature=" + signature +
                ", objd=" + objd +
                ", collection=" + collection +
                '}';
    }
}

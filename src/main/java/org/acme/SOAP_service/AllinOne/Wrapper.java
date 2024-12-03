package org.acme.SOAP_service.AllinOne;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import org.acme.SOAP_service.AllinOne.material.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Wrapper {
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

    public Wrapper(Type type, DayMonth day, Signature signature, OBJD objd, OBJCollection collection) {
        this.type = type;
        this.day = day;
        this.signature = signature;
        this.objd = objd;
        this.collection = collection;
    }

    // Getters and Setters (Optional, if needed)
    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public DayMonth getDay() {
        return day;
    }

    public void setDay(DayMonth day) {
        this.day = day;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    public OBJD getObjd() {
        return objd;
    }

    public void setObjd(OBJD objd) {
        this.objd = objd;
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

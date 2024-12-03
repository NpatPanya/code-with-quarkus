package org.acme.SOAP_service.AllinOne;


import io.quarkiverse.cxf.annotation.CXFEndpoint;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;

import jakarta.xml.bind.annotation.XmlRootElement;
import org.acme.SOAP_service.AllinOne.material.*;


@CXFEndpoint("/DataBatch")
@WebService(serviceName = "Dataset")
@XmlRootElement
public class ALLinOneImpl implements AllInOneService {

    private Type type;
    private DayMonth day;
    private Signature signature;
    private OBJD objd;
    private OBJCollection collection;

    public ALLinOneImpl() {
        this.type = new Type();
        this.day = new DayMonth();
        this.signature = new Signature();
        this.objd = new OBJD();
        this.collection = new OBJCollection();
    }

    @WebMethod
    public Wrapper combineStructure(String name, Date dayMonth, ArrayList<String> sign, OBJD objd, OBJCollection collection ){
        type.setType(name);
        day.setDate(dayMonth);
        signature.setSignature(sign);
        this.objd=objd;
        this.collection=collection;

        Wrapper wrapper = new Wrapper(type,day,signature,objd,collection);

        return wrapper;




    }
}

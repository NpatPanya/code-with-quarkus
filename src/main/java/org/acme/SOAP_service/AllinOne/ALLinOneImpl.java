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
    private DayMonth dayset;
    private Signature signature;
    private OBJD objd;
    private OBJCollection collection;

    public ALLinOneImpl() {
        this.type = new Type();
        this.dayset = new DayMonth();
        this.signature = new Signature();
        this.objd = new OBJD();
        this.collection = new OBJCollection();

    }

    @WebMethod
    public Wrapper combineStructure(String name, Date date, ArrayList<String> sign, OBJD objd, OBJCollection collection ){
        Wrapper wrapper = new Wrapper();
        try {
            type.setType(name);
            wrapper.setType(type);

            dayset.setDate(date);
            wrapper.setDay(dayset);

            signature.setSignature(sign);
            wrapper.setSignature(signature);

            wrapper.setObjd(objd);

            wrapper.setCollection(collection);

        } catch (IllegalArgumentException e) {
            // Handle expected exceptions (invalid arguments)
            // Log the error and return a meaningful message in the response
            e.printStackTrace();  // You can replace this with a logger to log the error
            throw new RuntimeException("Invalid input: " + e.getMessage());
        }
        catch (Exception e) {
            e.printStackTrace();  // You can replace this with a logger to log the error
            throw new RuntimeException("An unexpected error occurred: " + e.getMessage());
        }
        return wrapper;
    }
}


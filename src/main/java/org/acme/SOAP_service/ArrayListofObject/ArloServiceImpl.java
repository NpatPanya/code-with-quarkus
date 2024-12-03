package org.acme.SOAP_service.ArrayListofObject;

import io.quarkiverse.cxf.annotation.CXFEndpoint;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.Date;

@XmlRootElement
@CXFEndpoint("/transactions")
@WebService(serviceName = "ArloService", targetNamespace = "http://ArrayListofObject.SOAP_service.acme.org/")
public class ArloServiceImpl implements ArloService {

    @WebMethod
    public ArrayList<History> transaction(String name, Date date, String description, int transactionID, int amount) {
        ArrayList<History> newobj = new ArrayList<>();

        Details details = new Details(name, date, description);
        History history = new History(transactionID, amount, details);

        newobj.add(history);

        for (Object o : newobj) {
            System.out.println(o);
        }

        return newobj;
    }
}

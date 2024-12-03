package org.acme.SOAP_service.ArrayListofObject;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;


@WebService(name = "ArloService", serviceName = "ArloService")
public interface ArloService {

    @WebMethod
    ArrayList<History> transaction(String name, Date date, String description, int transactionID,int amount);
}

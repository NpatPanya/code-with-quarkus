package org.acme.SOAP_service.AllinOne;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;

import org.acme.SOAP_service.AllinOne.material.OBJCollection;
import org.acme.SOAP_service.AllinOne.material.OBJD;


@WebService(name = "Dataset" , serviceName = "Dataset")
public interface AllInOneService {

    @WebMethod
    Wrapper combineStructure(String name, Date dayMonth,ArrayList<String> sign, OBJD objd, OBJCollection collection );
}

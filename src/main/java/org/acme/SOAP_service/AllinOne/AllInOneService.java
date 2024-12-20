package org.acme.SOAP_service.AllinOne;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.ArrayList;
import java.util.Date;

import org.acme.SOAP_service.AllinOne.material.OBJCollection;
import org.acme.SOAP_service.AllinOne.material.OBJD;


@WebService(name = "Dataset" , serviceName = "Dataset")
public interface AllInOneService {

//    @WebMethod
//    Wrapper combineStructure(String type, Date date, ArrayList<String> sign, OBJD objd, OBJCollection collection );
//}

        @WebMethod
        Wrapper combineStructure(
                @WebParam(name = "type") String type,
                @WebParam(name = "date") Date date,
                @WebParam(name = "sign") ArrayList<String> sign,
                @WebParam(name = "objd") OBJD objd,
                @WebParam(name = "collection") OBJCollection collection
        );
}

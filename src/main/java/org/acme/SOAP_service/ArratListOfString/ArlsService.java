package org.acme.SOAP_service.ArratListOfString;


import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;

@WebService(name = "ArlsService" , serviceName = "ArlsService" )
public interface ArlsService {

    @WebMethod
   void setText(String data);
}

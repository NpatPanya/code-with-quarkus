package org.acme.SOAP_service.ObjectwithField;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;

@WebService(name = "MainService", serviceName = "MainService")
public interface MainService {

    @WebMethod
    ArrayList<User> main(String street, String city, String state, int postalCode, String name, int age);
}

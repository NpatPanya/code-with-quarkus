package org.acme.SOAP_service.ObjectwithField;

import io.quarkiverse.cxf.annotation.CXFEndpoint;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlRootElement;


@CXFEndpoint("/ReceiveUserData")
@WebService(serviceName = "MainService")
@XmlRootElement
public class MainServiceImpl implements MainService {


    @WebMethod
    public ArrayList<User> main(String street, String city, String state, int postalCode, String name, int age){
        ArrayList<User> UserData = new ArrayList<>();
        Address address1 = new Address(street,city,state,postalCode);
        User user1 = new User(name,age,address1);


        UserData.add(user1);



        for (Object object : UserData) {
            System.out.println(object);
        }
        return UserData;
    }
}

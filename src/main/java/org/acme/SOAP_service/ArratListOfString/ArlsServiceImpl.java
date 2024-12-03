package org.acme.SOAP_service.ArratListOfString;


import io.quarkiverse.cxf.annotation.CXFEndpoint;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;

@CXFEndpoint("/ArrayListOfString")
@WebService(serviceName = "ArlsService")
public class ArlsServiceImpl {
    private ArrayList<String> ListOfString = new ArrayList<>();

    @WebMethod
    public void setText(String data) {
        ListOfString.add(data);
    }

    public ArlsServiceImpl() {}

    public ArlsServiceImpl(ArrayList<String> ListOfString) {
        this.ListOfString = ListOfString;
    }

    public ArrayList<String> getListOfString() {
        return ListOfString;
    }

    @Override
    public String toString() {
        return "ArlsServiceImpl [ListOfString=" + ListOfString + "]";
    }
}
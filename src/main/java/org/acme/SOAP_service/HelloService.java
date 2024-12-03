package org.acme.SOAP_service;

import io.quarkiverse.cxf.annotation.CXFEndpoint;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.ws.rs.core.Response;

import java.util.Date;
import java.util.List;

/**
 * The simplest Hello service.
 */

@WebService(name = "HelloService", serviceName = "HelloService")
public interface HelloService {

    @WebMethod
    String hello(String text);

    @WebMethod
    Date ProcessDate(Date date);

    @WebMethod
    int add(int a, int b);

}

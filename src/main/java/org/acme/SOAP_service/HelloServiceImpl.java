package org.acme.SOAP_service;

import io.quarkiverse.cxf.annotation.CXFEndpoint;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

import java.util.Date;

/**
 * The simplest Hello service implementation.
 */
@CXFEndpoint("/HelloReader") // ใช้กำหนด path http://localhost:8080/soap/ตรงนี้
@WebService(serviceName = "HelloService")
public class HelloServiceImpl implements HelloService {


    @WebMethod
    @Override
    public String hello(String text) {
        return "Hello " + text + "!";
    }

    @Override
    @WebMethod
    public Date ProcessDate(Date date){
        return date;
    }

    @WebMethod
    @Override
    public int add(int a,int b) {

        return a + b;
    }




}
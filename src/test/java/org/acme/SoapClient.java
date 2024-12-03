//package org.acme;
//
//import io.quarkiverse.cxf.annotation.CXFClient;
//import io.quarkiverse.cxf.annotation.CXFEndpoint;
//import io.quarkus.logging.Log;
//import jakarta.enterprise.context.ApplicationScoped;
//import jakarta.inject.Inject;
//
//
//@CXFClient("/HelloReader")
//@ApplicationScoped
//public class SoapClient {
//
//    @Inject
//    HelloService helloService;
//
//    public void callHelloService() {
//        String response = helloService.hello("World");
//        Log.info("Response from SOAP service :" + response);
//
//        String collectionResponse = helloService.collection(1);
//        Log.info("Collection response:" + collectionResponse);
//    }
//
//    public String callSoapService(String name) {
//        // Implement SOAP request/response logic
//        return "Hello, " + name;
//    }
//
//
//
//}

//package org.acme;
//
//import SOAP_Client.SOAPClient;
//import io.quarkus.test.junit.QuarkusTest;
//import jakarta.inject.Inject;
//import org.hibernate.annotations.CollectionIdJavaType;
//import org.junit.jupiter.api.Test;
//
//import static io.smallrye.common.constraint.Assert.assertNotNull;
//
//@QuarkusTest
//public class SoapClientTest {
//
//    @Inject
//    SoapClient soapClient;
//
//    @Test
//    public void testSoapService(){
//        String response = soapClient.callSoapService("World");
//        assertNotNull(response);
//
////    soapClient.callHelloService();
//        }
//}
package com.mengli.webservice.client;

import com.mengli.webservice.inter.IMyService;

import java.net.MalformedURLException;
import java.net.URL;


import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * Created by mlhuang on 7/7/16.
 */
public class TestClient {
    public static void main(String[] args) {
        try {
            URL url=new URL("http://localhost:8888/ns?wsdl");
            QName sName=new QName("http://impl.webservice.mengli.com/","MyServiceImplService");
            Service service=Service.create(url, sName);
            IMyService myService=service.getPort(IMyService.class);
            System.out.println(myService.add("testClient",10, 9));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}

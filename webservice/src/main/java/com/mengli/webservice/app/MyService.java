package com.mengli.webservice.app;

import com.mengli.webservice.impl.MyServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Created by mlhuang on 7/5/16.
 */
public class MyService {
    public static void main(String[] args){
        String address="http://localhost:8888/ns";
        Endpoint.publish(address,new MyServiceImpl());
        System.out.println("service started ......");
    }
}

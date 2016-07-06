package com.mengli.webservice.impl;

import com.mengli.webservice.inter.IMyService;

import javax.jws.WebService;

/**
 * Created by mlhuang on 7/5/16.
 */

@WebService(endpointInterface = "com.mengli.webservice.inter.IMyService")
public class MyServiceImpl implements IMyService{
    @Override
    public int add(String source,int a, int b) {
        System.out.println(source+": "+a+"+"+b+"="+(a+b));
        return (a+b);
    }

    @Override
    public int minus(String source,int a, int b) {
        System.out.println(source+": "+a+"-"+b+"="+(a-b));
        return (a-b);
    }
}

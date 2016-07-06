package com.mengli.webservice.inter;

/**
 * Created by mlhuang on 7/5/16.
 */
import javax.jws.WebService;

@WebService()
public interface IMyService {
    int add(String source,int a, int b);
    int minus(String source,int a, int b);
}

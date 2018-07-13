package com.hqins.dp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied; // not interface
    public DynamicProxyHandler(Object proxied){
        this.proxied = proxied;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        return method.invoke(proxied,args);
    }
}

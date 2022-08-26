package com.dj.proxy.jdkProxy;

import java.lang.reflect.Proxy;

/**
 * @author DJ
 * @className Client
 * @Description
 * @date 2022-08-24 10:46
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
    
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
    
        Subject proxyInstance = (Subject)Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        int i = proxyInstance.sellBooks();
        String speak = proxyInstance.speak();
        System.out.println(i);
        System.out.println(speak);
    
    }
}

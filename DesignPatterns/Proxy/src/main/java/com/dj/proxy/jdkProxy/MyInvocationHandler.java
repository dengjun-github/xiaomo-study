package com.dj.proxy.jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Subject target;
    
    public MyInvocationHandler(Subject subject) {
        target = subject;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("sellBooks")) {
            int invoke = (int) method.invoke(target, args);
            System.out.println("调用的是卖书的方法");
            return invoke;
        } else {
            String invoke = (String) method.invoke(target, args);
            System.out.println("调用的是说话的方法");
            return invoke;
        }
    }
}

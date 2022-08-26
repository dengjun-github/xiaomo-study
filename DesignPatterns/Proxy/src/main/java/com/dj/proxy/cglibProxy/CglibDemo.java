package com.dj.proxy.cglibProxy;

/**
 * @author DJ
 * @className CglibDemo
 * @Description
 * @date 2022-08-24 11:14
 */
public class CglibDemo {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy(new Engineer());
        Engineer proxy = (Engineer)cglibProxy.getProxy();
        proxy.eat();
    }
}

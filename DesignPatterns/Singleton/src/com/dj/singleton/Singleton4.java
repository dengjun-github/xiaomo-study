package com.dj.singleton;

/**
 * @author DJ
 * @className Singleton4
 * @Description
 * @date 2022-08-18 15:24
 */
public class Singleton4 {
    private static volatile Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if(instance == null){
            // 判断对象是否以及实例化过，没有则进入加锁代码块，此处可能有多个线程同时进来，等待类对象锁
            synchronized(Singleton4.class){
                // 获取类对象锁，其他线程在外等待，其他线程进来再次判断，如果对象实例化了，则不需要再实例化
                if(instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
    
    
}

package com.dj.singleton;

/**
 * @author DJ
 * @className Singleton2
 * @Description
 * @date 2022-08-18 15:23
 */
public class Singleton2 {
    private static Singleton2 instance;
    private Singleton2 (){}
    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

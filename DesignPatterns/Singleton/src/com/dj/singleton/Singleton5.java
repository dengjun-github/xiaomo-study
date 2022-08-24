package com.dj.singleton;

/**
 * @author DJ
 * @className Singleton5
 * @Description
 * @date 2022-08-18 15:26
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5 (){}
    public static Singleton5 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}

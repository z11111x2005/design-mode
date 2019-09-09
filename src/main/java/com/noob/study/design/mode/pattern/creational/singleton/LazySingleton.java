package com.noob.study.design.mode.pattern.creational.singleton;

/**
 * created by noob
 * 2019/9/9 21:11
 * 懒汉式，线程不安全
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    public LazySingleton() {
    }

    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

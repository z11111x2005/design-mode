package com.noob.study.design.mode.pattern.creational.singleton;

import java.io.Serializable;

/**
 * created by noob
 * 2019/9/10 22:18
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrySingleton;

    static {
        hungrySingleton = new HungrySingleton();
    }

    private HungrySingleton() {
        if (hungrySingleton != null) {
            throw new RuntimeException("单利构造器禁止反射调用！");
        }
    }

    public static HungrySingleton getInstance() {
        return hungrySingleton;
    }

    private Object readResolve() {
        return hungrySingleton;
    }

}

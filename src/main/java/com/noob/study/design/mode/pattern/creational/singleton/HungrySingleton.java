package com.noob.study.design.mode.pattern.creational.singleton;

import java.io.Serializable;

/**
 * @Auther: liuym
 * @Date: 2019/9/10 17:09
 * @Description：饿汉式,线程安全
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

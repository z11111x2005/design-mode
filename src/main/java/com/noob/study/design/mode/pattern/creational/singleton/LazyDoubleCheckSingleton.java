package com.noob.study.design.mode.pattern.creational.singleton;

/**
 * created by noob
 * 2019/9/9 21:54
 * 双重检查
 */
public class LazyDoubleCheckSingleton {

    // volatile用于解决重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    public LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (lazyDoubleCheckSingleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazyDoubleCheckSingleton == null) {
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}

package com.noob.study.design.mode.pattern.creational.singleton;

/**
 * created by noob
 * 2019/9/9 21:29
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
//        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazyDoubleCheckSingleton lazySingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);
    }
}

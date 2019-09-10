package com.noob.study.design.mode.pattern.creational.singleton;

/**
 * created by noob
 * 2019/9/9 21:29
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
//        LazySingleton instance = LazySingleton.getInstance();
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

//        ContainerSingleton.putInstance("object", new Object());
//        Object instance = ContainerSingleton.getInstance("object");

        ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}

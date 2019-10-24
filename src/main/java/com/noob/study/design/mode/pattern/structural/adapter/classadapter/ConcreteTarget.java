package com.noob.study.design.mode.pattern.structural.adapter.classadapter;

/**
 * @Auther: noob
 * @Date: 2019/9/16 14:50
 * @Description：
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}

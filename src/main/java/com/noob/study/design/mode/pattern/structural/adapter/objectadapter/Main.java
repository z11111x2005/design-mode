package com.noob.study.design.mode.pattern.structural.adapter.objectadapter;


/**
 * @Auther: liuym
 * @Date: 2019/9/16 14:54
 * @Description： 对象适配-适配器模式
 */
public class Main {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}

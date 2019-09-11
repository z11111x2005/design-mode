package com.noob.study.design.mode.pattern.creational.prototype.abstractprototype;

/**
 * @Auther: liuym
 * @Date: 2019/9/11 15:30
 * @Description：
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("调用了A的clone方法");
        return super.clone();
    }
}

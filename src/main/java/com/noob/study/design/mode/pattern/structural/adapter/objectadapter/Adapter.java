package com.noob.study.design.mode.pattern.structural.adapter.objectadapter;


/**
 * @Auther: noob
 * @Date: 2019/9/16 14:51
 * @Description：
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}

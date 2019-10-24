package com.noob.study.design.mode.pattern.structural.adapter.classadapter;

/**
 * @Auther: noob
 * @Date: 2019/9/16 14:51
 * @Description：
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.adapteeRequest();
    }
}

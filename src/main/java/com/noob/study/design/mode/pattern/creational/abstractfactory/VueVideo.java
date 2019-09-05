package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: liuym
 * @Date: 2019/9/5 11:35
 * @Description：
 */
public class VueVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制vue视频");
    }
}

package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: noob
 * @Date: 2019/9/5 11:33
 * @Description：
 */
public class JavaVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制JAVA课程视频");
    }
}

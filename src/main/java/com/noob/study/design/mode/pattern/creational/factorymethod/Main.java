package com.noob.study.design.mode.pattern.creational.factorymethod;

/**
 * @Auther: liuym
 * @Date: 2019/9/4 14:29
 * @Description：工厂方法模型
 */
public class Main {
    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.product();
    }
}

package com.noob.study.design.mode.pattern.creational.simplefactory;

/**
 * @Auther: liuym
 * @Date: 2019/9/4 14:29
 * @Description：简单工厂模型
 */
public class Main {
    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.product();

//        VideoFactory factory = new VideoFactory();
//        Video video = factory.getVideo("java");
//        if (null == video) {
//            return;
//        }
//        video.product();

        VideoFactory factory = new VideoFactory();
        Video video = factory.getVideo(JavaVideo.class);
        if (null == video) {
            return;
        }
        video.product();
    }
}

package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:10
 * 状态模式
 */
public class Main {
    public static void main(String[] args) {
        CourseVideoContent courseVideoContent = new CourseVideoContent();
        courseVideoContent.setCourseVideoState(new PlayState());
        System.out.println("当前状态："+courseVideoContent.getCourseVideoState().getClass().getName());

        courseVideoContent.pause();
        System.out.println("当前状态："+courseVideoContent.getCourseVideoState().getClass().getName());

        courseVideoContent.speed();
        System.out.println("当前状态："+courseVideoContent.getCourseVideoState().getClass().getName());

        courseVideoContent.stop();
        System.out.println("当前状态："+courseVideoContent.getCourseVideoState().getClass().getName());

    }
}

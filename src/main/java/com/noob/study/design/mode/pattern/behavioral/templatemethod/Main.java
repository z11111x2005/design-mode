package com.noob.study.design.mode.pattern.behavioral.templatemethod;

/**
 * created by noob
 * 2019/10/22 0:25
 * 模板方法模式
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end---");

    }
}

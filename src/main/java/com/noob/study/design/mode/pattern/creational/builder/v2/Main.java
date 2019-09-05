package com.noob.study.design.mode.pattern.creational.builder.v2;

/**
 * created by noob
 * 2019/9/6 0:55
 * 建造者模式
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .buildCourseName("java设计模式")
                .buildCoursePPT("java设计模式PPT")
                .buildCourseVideo("java设计模式视频")
                .build();
        System.out.println(course);
    }
}

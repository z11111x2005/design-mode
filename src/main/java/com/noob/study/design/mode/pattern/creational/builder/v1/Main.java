package com.noob.study.design.mode.pattern.creational.builder.v1;

/**
 * created by noob
 * 2019/9/5 23:57
 */
public class Main {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式", "java设计模式PPT", "java设计模式视频",
                "java设计模式手记", "java设计模式问答");
        System.out.println(course);
    }
}

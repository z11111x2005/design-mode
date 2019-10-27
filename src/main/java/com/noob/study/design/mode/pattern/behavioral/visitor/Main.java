package com.noob.study.design.mode.pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * created by noob
 * 2019/10/28 0:55
 * 访问者模式
 */
public class Main {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("免费java");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("收费java");
        codingCourse.setPrice(200);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        courseList.forEach(course -> course.accept(new Visitor()));
    }
}

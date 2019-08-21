package com.noob.study.design.mode.principle.dependenceinversion;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("noob在学习Java课程");
    }
}

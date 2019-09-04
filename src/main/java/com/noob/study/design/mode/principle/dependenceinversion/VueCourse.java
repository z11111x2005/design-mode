package com.noob.study.design.mode.principle.dependenceinversion;

public class VueCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("noob在学习Vue课程");
    }
}

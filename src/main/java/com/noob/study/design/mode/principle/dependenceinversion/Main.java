package com.noob.study.design.mode.principle.dependenceinversion;

public class Main {

    public static void main(String[] args) {
        // v1
//        Noob noob = new Noob();
//        noob.studyJavaCourse();
//        noob.studyVueCourse();

        // v2 接口注入
//        Noob noob = new Noob();
//        noob.studyImoocCourse(new JavaCourse());
//        noob.studyImoocCourse(new VueCourse());

        // v3 构造器注入
//        Noob noob = new Noob(new JavaCourse());
//        noob.studyImoocCourse();

        // v4 使用set方法
        Noob noob = new Noob();
        noob.setiCourse(new JavaCourse());
        noob.studyImoocCourse();
        noob.setiCourse(new VueCourse());
        noob.studyImoocCourse();
    }

}

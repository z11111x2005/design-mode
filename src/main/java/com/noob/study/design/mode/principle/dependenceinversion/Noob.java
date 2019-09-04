package com.noob.study.design.mode.principle.dependenceinversion;

/**
 *
 */
public class Noob {
    // v1
//    public void studyJavaCourse() {
//        System.out.println("noob在学习Java课程");
//    }
//    public void studyVuewCourse() {
//        System.out.println("noob在学习Java课程");
//    }


    // v2
//    public void studyImoocCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }
//

    // v3
//    private ICourse iCourse;
//    public Noob(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
//    public void studyImoocCourse(){
//        iCourse.studyCourse();
//    }

    private ICourse iCourse;
    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }
}

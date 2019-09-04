package com.noob.study.design.mode.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by noob
 * 2019/8/26 23:12
 */
public class TeamLeader {
    // v1
//    public void checkNumberOfCourses(List<Course> list) {
//        System.out.println("在线课程数是："+ list.size());
//    }

    public void checkNumberOfCourses() {
        List<Course> list = new ArrayList<>();
        for(int i=0; i<20; i++){
            list.add(new Course());
        }
        System.out.println("在线课程数是："+ list.size());
    }
}

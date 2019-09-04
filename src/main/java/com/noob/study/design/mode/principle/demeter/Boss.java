package com.noob.study.design.mode.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * created by noob
 * 2019/8/26 23:12
 */
public class Boss {
    // v1
//    public void commandCheckNumber(TeamLeader teamLeader){
//        List<Course> list = new ArrayList<>();
//        for(int i=0; i<20; i++){
//            list.add(new Course());
//        }
//        teamLeader.checkNumberOfCourses(list);
//    }
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}

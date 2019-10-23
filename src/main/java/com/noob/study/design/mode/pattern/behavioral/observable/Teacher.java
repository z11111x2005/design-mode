package com.noob.study.design.mode.pattern.behavioral.observable;

import java.util.Observable;
import java.util.Observer;

/**
 * created by noob
 * 2019/10/24 1:28
 */
public class Teacher implements Observer {
    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接受到一个" + question.getUserName() + "提交的问答:" + question.getQuestionContent());
    }
}

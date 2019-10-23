package com.noob.study.design.mode.pattern.behavioral.observable;

import java.util.Observable;

/**
 * created by noob
 * 2019/10/24 1:27
 */
public class Course extends Observable {
    private String CourseName;

    public String getCourseName() {
        return CourseName;
    }

    public Course(String courseName) {
        CourseName = courseName;
    }

    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了" + question.getQuestionContent());
        setChanged();
        notifyObservers(question);
    }
}

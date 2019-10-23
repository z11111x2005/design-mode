package com.noob.study.design.mode.pattern.behavioral.iterator;

/**
 * created by noob
 * 2019/10/23 23:48
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}

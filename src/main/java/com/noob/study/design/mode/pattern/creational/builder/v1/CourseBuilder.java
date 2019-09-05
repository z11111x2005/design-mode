package com.noob.study.design.mode.pattern.creational.builder.v1;

/**
 * @Auther: liuym
 * @Date: 2019/9/5 16:36
 * @Description：
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}

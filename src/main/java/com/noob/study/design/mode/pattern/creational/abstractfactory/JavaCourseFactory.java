package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: noob
 * @Date: 2019/9/5 11:32
 * @Description：
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}

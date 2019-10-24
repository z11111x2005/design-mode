package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: noob
 * @Date: 2019/9/5 11:36
 * @Description：
 */
public class VueCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new VueVideo();
    }

    @Override
    public Article getArticle() {
        return new VueArticle();
    }
}

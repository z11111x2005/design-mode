package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: liuym
 * @Date: 2019/9/5 11:35
 * @Description：抽象工厂模型
 */
public class Main {

    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Article article = courseFactory.getArticle();
        article.produce();
        Video video = courseFactory.getVideo();
        video.produce();
    }

}

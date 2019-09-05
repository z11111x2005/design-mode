package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: liuym
 * @Date: 2019/9/5 11:34
 * @Description：
 */
public class JavaArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写JAVA课程手记");
    }
}

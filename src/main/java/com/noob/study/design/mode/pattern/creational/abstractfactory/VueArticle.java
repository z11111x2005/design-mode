package com.noob.study.design.mode.pattern.creational.abstractfactory;

/**
 * @Auther: liuym
 * @Date: 2019/9/5 11:36
 * @Description：
 */
public class VueArticle extends Article {
    @Override
    public void produce() {
        System.out.println("编写vue手记");
    }
}

package com.noob.study.design.mode.pattern.behavioral.templatemethod;

/**
 * created by noob
 * 2019/10/22 0:27
 */
public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}

package com.noob.study.design.mode.pattern.behavioral.visitor;

/**
 * created by noob
 * 2019/10/28 0:55
 */
public class FreeCourse extends Course{
    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}

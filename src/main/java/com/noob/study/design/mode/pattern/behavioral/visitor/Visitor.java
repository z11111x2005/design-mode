package com.noob.study.design.mode.pattern.behavioral.visitor;

/**
 * created by noob
 * 2019/10/28 0:55
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("收费课程" + codingCourse.getName() + ",价格" + codingCourse.getPrice());
    }
}

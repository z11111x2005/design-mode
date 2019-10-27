package com.noob.study.design.mode.pattern.behavioral.visitor;

/**
 * created by noob
 * 2019/10/28 0:55
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);

}

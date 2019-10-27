package com.noob.study.design.mode.pattern.behavioral.visitor;

/**
 * created by noob
 * 2019/10/28 0:54
 */
public abstract class Course {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept(IVisitor iVisitor);
}

package com.noob.study.design.mode.pattern.behavioral.visitor;

/**
 * created by noob
 * 2019/10/28 0:54
 */
public class CodingCourse extends Course {
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}

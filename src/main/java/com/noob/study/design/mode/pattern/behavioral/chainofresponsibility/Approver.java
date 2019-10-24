package com.noob.study.design.mode.pattern.behavioral.chainofresponsibility;

/**
 * @Auther: noob
 * @Date: 2019/10/24 18:06
 * @Description：
 */
public abstract class Approver {
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}

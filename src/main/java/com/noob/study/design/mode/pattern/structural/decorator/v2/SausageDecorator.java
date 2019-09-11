package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * created by noob
 * 2019/9/11 21:52
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加根香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}

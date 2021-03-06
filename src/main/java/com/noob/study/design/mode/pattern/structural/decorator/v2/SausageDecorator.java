package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * @Auther: noob
 * @Date: 2019/9/16 11:01
 * @Description：
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public Integer cost() {
        return super.cost() + 2;
    }
}

package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * @Auther: liuym
 * @Date: 2019/9/16 10:59
 * @Description：
 */
public class AbstractDecorator extends ABattercake {

    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    public String getDesc() {
        return aBattercake.getDesc();
    }

    @Override
    public Integer cost() {
        return aBattercake.cost();
    }
}

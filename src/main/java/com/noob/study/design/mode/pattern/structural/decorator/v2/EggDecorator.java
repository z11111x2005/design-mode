package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * @Auther: liuym
 * @Date: 2019/9/16 11:00
 * @Description：
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}

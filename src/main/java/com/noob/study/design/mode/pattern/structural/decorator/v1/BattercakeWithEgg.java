package com.noob.study.design.mode.pattern.structural.decorator.v1;

/**
 * @Auther: noob
 * @Date: 2019/9/16 10:45
 * @Description：
 */
public class BattercakeWithEgg extends Battercake {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    public Integer cost() {
        return super.cost() + 1;
    }
}

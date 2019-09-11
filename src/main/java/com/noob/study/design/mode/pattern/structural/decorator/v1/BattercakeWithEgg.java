package com.noob.study.design.mode.pattern.structural.decorator.v1;

/**
 * created by noob
 * 2019/9/11 21:37
 * 煎饼加鸡蛋
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDesc() {
        return super.getDesc() + "加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}

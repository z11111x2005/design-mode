package com.noob.study.design.mode.pattern.structural.decorator.v1;

/**
 * created by noob
 * 2019/9/11 21:38
 * 煎饼加鸡蛋加香肠
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg{

    @Override
    public String getDesc() {
        return super.getDesc()+"加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}

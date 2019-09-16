package com.noob.study.design.mode.pattern.structural.decorator.v1;

/**
 * @Auther: liuym
 * @Date: 2019/9/16 10:45
 * @Description：
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {

    @Override
    public String getDesc() {
        return super.getDesc() + " 加一根香肠";
    }

    @Override
    public Integer cost() {
        return super.cost() + 2;
    }
}

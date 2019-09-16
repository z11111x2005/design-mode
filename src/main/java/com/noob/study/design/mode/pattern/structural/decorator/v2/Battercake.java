package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * @Auther: liuym
 * @Date: 2019/9/16 10:57
 * @Description：
 */
public class Battercake extends ABattercake {
    @Override
    public String getDesc() {
        return "煎饼";
    }

    @Override
    public Integer cost() {
        return 8;
    }
}

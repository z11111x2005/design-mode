package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * created by noob
 * 2019/9/11 21:35
 * 煎饼
 */
public class Battercake extends ABattercake {

    public String getDesc() {
        return "煎饼";
    }

    public int cost() {
        return 8;
    }
}

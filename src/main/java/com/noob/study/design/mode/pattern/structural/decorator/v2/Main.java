package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * @Auther: noob
 * @Date: 2019/9/16 11:03
 * @Description：
 */
public class Main {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + " 销售价格:" + aBattercake.cost());
    }
}

package com.noob.study.design.mode.pattern.structural.decorator.v2;

/**
 * created by noob
 * 2019/9/11 21:53
 */
public class Main {

    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);


        System.out.println(aBattercake.getDesc()+" 销售价格"+aBattercake.cost());
    }
}

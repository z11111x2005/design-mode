package com.noob.study.design.mode.pattern.structural.decorator.v1;

/**
 * created by noob
 * 2019/9/11 21:44
 */
public class Main {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc()+"销售价格"+battercake.cost());

        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc()+"销售价格"+battercakeWithEgg.cost());

        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc()+"销售价格"+battercakeWithEggSausage.cost());
    }
}

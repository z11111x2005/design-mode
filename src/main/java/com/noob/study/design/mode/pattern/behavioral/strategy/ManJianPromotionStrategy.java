package com.noob.study.design.mode.pattern.behavioral.strategy;

/**
 * created by noob
 * 2019/10/24 0:28
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}

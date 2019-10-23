package com.noob.study.design.mode.pattern.behavioral.strategy;

/**
 * created by noob
 * 2019/10/24 0:29
 */
public class LiJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("立减促销,课程的价格直接减去配置的价格");
    }
}

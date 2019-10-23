package com.noob.study.design.mode.pattern.behavioral.strategy;

/**
 * created by noob
 * 2019/10/24 0:42
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销");
    }
}

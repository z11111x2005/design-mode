package com.noob.study.design.mode.pattern.behavioral.strategy;

/**
 * created by noob
 * 2019/10/24 0:29
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放到慕课网用户的余额中");
    }
}

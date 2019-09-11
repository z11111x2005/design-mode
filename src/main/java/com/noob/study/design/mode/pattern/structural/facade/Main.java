package com.noob.study.design.mode.pattern.structural.facade;

/**
 * @Auther: liuym
 * @Date: 2019/9/11 17:35
 * @Description：
 */
public class Main {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("礼物");

        GiftExchaneService giftExchaneService = new GiftExchaneService();
        giftExchaneService.gifExchange(pointsGift);
    }
}

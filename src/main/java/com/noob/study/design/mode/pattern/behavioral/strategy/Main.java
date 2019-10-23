package com.noob.study.design.mode.pattern.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

/**
 * created by noob
 * 2019/10/24 0:27
 * 策略模式
 */
public class Main {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity618.executePromotionStrategy();
//        promotionActivity1111.executePromotionStrategy();
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if(StringUtils.endsWith(promotionKey, "LIJIAN")){
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if(StringUtils.endsWith(promotionKey, "MANJIAN")){
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }
//        promotionActivity.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";
        promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}

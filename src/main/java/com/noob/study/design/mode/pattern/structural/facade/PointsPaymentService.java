package com.noob.study.design.mode.pattern.structural.facade;

/**
 * @Auther: liuym
 * @Date: 2019/9/11 17:32
 * @Description：
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        System.out.println("支付"+pointsGift.getName()+"积分成功");
        return true;
    }
}

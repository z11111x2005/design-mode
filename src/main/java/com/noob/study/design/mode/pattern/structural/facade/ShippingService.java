package com.noob.study.design.mode.pattern.structural.facade;

/**
 * @Auther: liuym
 * @Date: 2019/9/11 17:33
 * @Description：
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666";
        return shippingOrderNo;
    }
}

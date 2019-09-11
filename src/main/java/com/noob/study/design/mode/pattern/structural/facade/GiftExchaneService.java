package com.noob.study.design.mode.pattern.structural.facade;

/**
 * @Auther: liuym
 * @Date: 2019/9/11 17:36
 * @Description：
 */
public class GiftExchaneService {
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void gifExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            if (pointsPaymentService.pay(pointsGift)) {
                String shipGift = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，订单号是：" + shipGift);
            }
        }
    }
}

package com.noob.study.design.mode.pattern.structural.facade;

/**
 * @Auther: noob
 * @Date: 2019/9/11 17:17
 * @Description：
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift){
        System.out.println("校验"+pointsGift.getName()+"积分资格通过库存通过");
        return true;
    }
}

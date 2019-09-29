package com.noob.study.design.mode.pattern.structural.proxy;

/**
 * @Auther: liuym
 * @Date: 2019/9/29 11:07
 * @Description：
 */
public class Order {
    private Object orderInfo;
    private Integer userId;

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderInfo=" + orderInfo +
                ", userId=" + userId +
                '}';
    }
}

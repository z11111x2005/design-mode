package com.noob.study.design.mode.pattern.structural.proxy;


import com.noob.study.design.mode.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @Auther: liuym
 * @Date: 2019/9/29 11:13
 * @Description：代理模式
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}

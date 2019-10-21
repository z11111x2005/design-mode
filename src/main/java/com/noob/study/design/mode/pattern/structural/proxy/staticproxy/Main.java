package com.noob.study.design.mode.pattern.structural.proxy.staticproxy;


import com.noob.study.design.mode.pattern.structural.proxy.Order;
import com.noob.study.design.mode.pattern.structural.proxy.staticproxy.OrderServiceStaticProxy;

/**
 * @Auther: liuym
 * @Date: 2019/9/29 11:13
 * @Description：静态代理
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}

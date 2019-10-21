package com.noob.study.design.mode.pattern.structural.proxy.dynamicproxy;

import com.noob.study.design.mode.pattern.structural.proxy.IOrderService;
import com.noob.study.design.mode.pattern.structural.proxy.Order;
import com.noob.study.design.mode.pattern.structural.proxy.OrderServiceImpl;

/**
 * created by noob
 * 2019/10/21 23:50
 * 动态代理
 */
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(2);

        IOrderService orderServiceDynamicproxy = (IOrderService) new OrderServiceDynamicproxy(new OrderServiceImpl()).bind();
        orderServiceDynamicproxy.save(order);
    }
}

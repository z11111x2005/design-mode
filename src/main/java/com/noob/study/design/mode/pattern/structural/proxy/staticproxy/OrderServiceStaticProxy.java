package com.noob.study.design.mode.pattern.structural.proxy.staticproxy;

import com.noob.study.design.mode.pattern.structural.proxy.IOrderService;
import com.noob.study.design.mode.pattern.structural.proxy.Order;
import com.noob.study.design.mode.pattern.structural.proxy.OrderServiceImpl;
import com.noob.study.design.mode.pattern.structural.proxy.db.DataSourceContextHolder;

/**
 * @Auther: liuym
 * @Date: 2019/9/29 11:14
 * @Description：
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService;

    public int saveOrder(Order order) {
        beforeMethod(order);
        iOrderService = new OrderServiceImpl();
        int result = iOrderService.save(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");
        System.out.println("静态代理 before code");
        // TODO 设置dataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}

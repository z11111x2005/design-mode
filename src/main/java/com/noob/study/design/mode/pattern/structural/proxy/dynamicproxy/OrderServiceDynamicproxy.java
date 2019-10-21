package com.noob.study.design.mode.pattern.structural.proxy.dynamicproxy;

import com.noob.study.design.mode.pattern.structural.proxy.Order;
import com.noob.study.design.mode.pattern.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * created by noob
 * 2019/10/21 23:37
 */
public class OrderServiceDynamicproxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicproxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class cls = target.getClass();
        return Proxy.newProxyInstance(getClass().getClassLoader(), cls.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object   ;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before core");
        if(obj instanceof Order){
            Order order = (Order) obj;
            userId = order.getUserId();
        }

        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");
        // TODO 设置dataSource
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}

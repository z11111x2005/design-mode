package com.noob.study.design.mode.pattern.structural.proxy;

/**
 * @Auther: noob
 * @Date: 2019/9/29 11:09
 * @Description：
 */
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {
        System.out.println("Dao层添加Order成功");
        return 1;
    }
}

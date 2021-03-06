package com.noob.study.design.mode.pattern.structural.proxy;

/**
 * @Auther: noob
 * @Date: 2019/9/29 11:10
 * @Description：
 */
public class OrderServiceImpl implements IOrderService {

    private IOrderDao iOrderDao;

    @Override
    public int saveOrder(Order order) {
        iOrderDao = new OrderDaoImpl();
        System.out.println("service层调用dao层添加order");
        return iOrderDao.insert(order);
    }
}

package com.noob.study.design.mode.principle.openclose;

/**
 * @Auther: noob
 * @Date: 2019/8/21 17:35
 * @Description：
 */
public class DiscountServiceImpl extends CourseServiceImpl {

    public DiscountServiceImpl(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 原价
     * @return
     */
    public Double originalPrice(){
        return super.price();
    }

    /**
     * 折扣价
     * @return
     */
    @Override
    public Double price() {
        return super.price()*0.8;
    }
}

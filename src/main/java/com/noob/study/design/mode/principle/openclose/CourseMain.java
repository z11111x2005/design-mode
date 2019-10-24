package com.noob.study.design.mode.principle.openclose;

/**
 * @Auther: noob
 * @Date: 2019/8/21 17:31
 * @Description：
 */
public class CourseMain {
    public static void main(String[] args) {
        CourseServiceImpl courseService = new DiscountServiceImpl(90, "java编程思想", 300d);
        DiscountServiceImpl discountService = (DiscountServiceImpl) courseService;
        System.out.println("id:" + courseService.id() + ",名字:" + courseService.name()
                + ",原价:" + discountService.originalPrice() + ",折扣价" + discountService.price());
    }
}

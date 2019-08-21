package com.noob.study.design.mode.principle.openclose;

/**
 * @Auther: liuym
 * @Date: 2019/8/21 17:29
 * @Description：
 */
public class CourseServiceImpl implements CourseService{

    private Integer id;

    private String name;

    private Double price;

    public CourseServiceImpl(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer id() {
        return this.id;
    }

    @Override
    public String name() {
        return this.name;
    }

    @Override
    public Double price() {
        return this.price;
    }
}

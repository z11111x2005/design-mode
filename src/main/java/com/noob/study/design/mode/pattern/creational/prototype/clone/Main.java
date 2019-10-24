package com.noob.study.design.mode.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Auther: noob
 * @Date: 2019/9/11 15:38
 * @Description：
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇", birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println("pig1:" + pig1);
        System.out.println("pig2:" + pig2);

        pig1.getBirthday().setTime(66666666L);

        System.out.println("pig1:" + pig1);
        System.out.println("pig2:" + pig2);

    }
}

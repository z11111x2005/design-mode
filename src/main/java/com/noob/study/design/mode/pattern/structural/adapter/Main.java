package com.noob.study.design.mode.pattern.structural.adapter;

/**
 * @Auther: noob
 * @Date: 2019/9/16 15:10
 * @Description：
 */
public class Main {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}

package com.noob.study.design.mode.principle.liskosubstitution.methodinput;

import java.util.Map;

/**
 * @Auther: liuym
 * @Date: 2019/8/29 11:35
 * @Description：
 */
public class Child extends Base{

//    @Override
//    public void method(HashMap hashMap) {
//        System.out.println("子类hashMap入参被执行");
//    }

    public void method(Map map){
        System.out.println("子类map入参被执行");
    }

}

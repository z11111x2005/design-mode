package com.noob.study.design.mode.principle.liskosubstitution.methodinput;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: liuym
 * @Date: 2019/8/29 11:38
 * @Description：
 */
public class Main {

    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);

        Map map = new HashMap();
        child.method(map);
    }
}

package com.noob.study.design.mode.principle.liskosubstitution.mehtodoutput;

import java.util.HashMap;

/**
 * @Auther: noob
 * @Date: 2019/8/29 13:52
 * @Description：
 */
public class Child extends Base {
    @Override
    public HashMap method() {
        HashMap hashMap = new HashMap();
        System.out.println("子类method被执行");
        hashMap.put("message", "子类method被执行");
        return hashMap;
    }
}

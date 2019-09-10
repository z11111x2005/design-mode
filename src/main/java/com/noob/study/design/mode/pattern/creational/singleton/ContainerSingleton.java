package com.noob.study.design.mode.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * created by noob
 * 2019/9/11 0:05
 * 容器单例
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }

    private static Map<String, Object> singletonMap = new HashMap<>();

    public static void putInstance(String key, Object instace){
        if(StringUtils.isNotBlank(key)&&instace!=null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key, instace);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }
}

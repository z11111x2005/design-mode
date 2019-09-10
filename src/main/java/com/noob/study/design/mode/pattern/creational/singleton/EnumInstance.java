package com.noob.study.design.mode.pattern.creational.singleton;

/**
 * created by noob
 * 2019/9/10 23:53
 */
public enum  EnumInstance {

    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance(){
        return INSTANCE;
    }
}

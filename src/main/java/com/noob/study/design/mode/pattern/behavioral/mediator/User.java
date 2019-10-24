package com.noob.study.design.mode.pattern.behavioral.mediator;

/**
 * @Auther: noob
 * @Date: 2019/10/24 16:52
 * @Description：
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message){
        StudyGroup.showMessage(this, message);
    }
}

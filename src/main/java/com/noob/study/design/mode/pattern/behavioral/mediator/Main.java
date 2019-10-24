package com.noob.study.design.mode.pattern.behavioral.mediator;

/**
 * @Auther: noob
 * @Date: 2019/10/24 16:51
 * @Description：中介者模式
 */
public class Main {
    public static void main(String[] args) {
        User user = new User("user");
        User stu = new User("stu");

        user.sendMessage("Hi!stu!");
        stu.sendMessage("Hi!");
    }
}

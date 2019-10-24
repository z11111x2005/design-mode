package com.noob.study.design.mode.pattern.behavioral.mediator;

import java.util.Date;

/**
 * @Auther: noob
 * @Date: 2019/10/24 16:51
 * @Description：
 */
public class StudyGroup {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + "["+user.getName()+"]:"+message);
    }
}

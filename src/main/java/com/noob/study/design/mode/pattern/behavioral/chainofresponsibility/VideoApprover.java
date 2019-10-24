package com.noob.study.design.mode.pattern.behavioral.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;

/**
 * @Auther: noob
 * @Date: 2019/10/24 18:11
 * @Description：
 */
public class VideoApprover extends Approver {

    @Override
    public void deploy(Course course) {
        if (StringUtils.isNotEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (approver != null) {
                approver.deploy(course);
            }
        }else {
            System.out.println(course.getName()+"不含有视频，不批准");
            return;
        }
    }
}

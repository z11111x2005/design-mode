package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:14
 */
public class StopState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.SPEED_STATE);

    }

    @Override
    public void speed() {
        System.out.println("只有正常播放视频的状态，才能停止");
    }

    @Override
    public void pause() {
        System.out.println("只有正常播放视频的状态，才能停止");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频的状态");
    }
}

package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:13
 */
public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放视频的状态");
    }

    @Override
    public void speed() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.SPEED_STATE);
    }

    @Override
    public void pause() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.STOP_STATE);
    }
}

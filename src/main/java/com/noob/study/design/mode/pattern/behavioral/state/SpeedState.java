package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:13
 */
public class SpeedState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.PLAY_STATE);

    }

    @Override
    public void speed() {
        System.out.println("快进播放视频的状态");
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

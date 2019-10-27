package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:13
 */
public class PauseState extends CourseVideoState {

    @Override
    public void play() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.SPEED_STATE);

    }

    @Override
    public void speed() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.SPEED_STATE);
    }

    @Override
    public void pause() {
        System.out.println("暂停播放视频的状态");

    }

    @Override
    public void stop() {
        super.courseVideoContent.setCourseVideoState(CourseVideoContent.STOP_STATE);
    }
}

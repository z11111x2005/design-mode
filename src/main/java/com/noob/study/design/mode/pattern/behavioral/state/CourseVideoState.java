package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:11
 */
public abstract class CourseVideoState {
    protected CourseVideoContent courseVideoContent;

    public void setCourseVideoContent(CourseVideoContent courseVideoContent) {
        this.courseVideoContent = courseVideoContent;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}

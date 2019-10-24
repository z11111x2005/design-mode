package com.noob.study.design.mode.pattern.behavioral.command;

/**
 * @Auther: liuym
 * @Date: 2019/10/24 16:37
 * @Description：
 */
public class OpenCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}

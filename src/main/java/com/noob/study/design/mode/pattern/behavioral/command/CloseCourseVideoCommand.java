package com.noob.study.design.mode.pattern.behavioral.command;

/**
 * @Auther: liuym
 * @Date: 2019/10/24 16:37
 * @Description：
 */
public class CloseCourseVideoCommand implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideoCommand(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.close();
    }
}

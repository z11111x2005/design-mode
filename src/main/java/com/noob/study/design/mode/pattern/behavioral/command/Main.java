package com.noob.study.design.mode.pattern.behavioral.command;

/**
 * @Auther: liuym
 * @Date: 2019/10/24 16:41
 * @Description：命令模式
 */
public class Main {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("java设计模式");
        OpenCourseVideoCommand openCourseVideoCommand = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand closeCourseVideoCommand = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(openCourseVideoCommand);
        staff.addCommand(closeCourseVideoCommand);

        staff.executeCommand();
    }
}

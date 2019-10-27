package com.noob.study.design.mode.pattern.behavioral.state;

/**
 * created by noob
 * 2019/10/28 1:12
 */
public class CourseVideoContent {

    private CourseVideoState courseVideoState;
    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState STOP_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public CourseVideoState getCourseVideoState() {
        return courseVideoState;
    }

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        this.courseVideoState.setCourseVideoContent(this);
    }

    public void play(){
        this.courseVideoState.play();
    }

    public void speed(){
        this.courseVideoState.speed();
    }

    public void pause(){
        this.courseVideoState.pause();
    }

    public void stop(){
        this.courseVideoState.stop();
    }
}

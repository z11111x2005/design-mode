package com.noob.study.design.mode.principle.singleresponsibility;

/**
 * created by noob
 * 2019/8/26 22:11
 */
public class Main {

    public static void main(String[] args) {
        // v1
//        Bird bird = new Bird();
//        bird.mainMoveWay("大雁");
//        bird.mainMoveWay("鸵鸟");

        // v2
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveWay("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveWay("鸵鸟");
    }
}

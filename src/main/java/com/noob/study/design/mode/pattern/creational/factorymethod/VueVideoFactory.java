package com.noob.study.design.mode.pattern.creational.factorymethod;

/**
 * created by noob
 * 2019/9/5 0:52
 */
public class VueVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new VueVideo();
    }
}

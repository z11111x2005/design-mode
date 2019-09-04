package com.noob.study.design.mode.pattern.creational.simplefactory;

/**
 * @Auther: liuym
 * @Date: 2019/9/4 14:33
 * @Description：
 */
public class VideoFactory {
    public Video getVideo(Class clazz) {
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

//    public Video getVideo(String type) {
//        if ("java".equalsIgnoreCase(type)) {
//            return new JavaVideo();
//        } else if ("vue".equalsIgnoreCase(type)) {
//            return new VueVideo();
//        }
//        return null;
//    }
}

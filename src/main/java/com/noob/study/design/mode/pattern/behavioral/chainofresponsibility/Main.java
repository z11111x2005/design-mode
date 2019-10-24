package com.noob.study.design.mode.pattern.behavioral.chainofresponsibility;

/**
 * @Auther: noob
 * @Date: 2019/10/24 18:10
 * @Description：责任链模式
 */
public class Main {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java设计模式");
        course.setArticle("java设计模式手记");
        course.setVideo("java设计模式视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}

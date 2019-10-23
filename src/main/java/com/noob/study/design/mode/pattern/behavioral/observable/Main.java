package com.noob.study.design.mode.pattern.behavioral.observable;

/**
 * created by noob
 * 2019/10/24 1:27
 * 观察者模式
 */
public class Main {
    public static void main(String[] args) {
        Course course = new Course("java设计模式");
        Teacher teacher1 = new Teacher("teacher1");
        Teacher teacher2 = new Teacher("teacher2");
        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question();
        question.setUserName("noob");
        question.setQuestionContent("java的主函数如何编写");

        course.produceQuestion(course, question);
    }
}

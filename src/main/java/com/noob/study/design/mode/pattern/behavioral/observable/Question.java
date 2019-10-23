package com.noob.study.design.mode.pattern.behavioral.observable;

/**
 * created by noob
 * 2019/10/24 1:28
 */
public class Question {
    private String userName;

    private String QuestionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return QuestionContent;
    }

    public void setQuestionContent(String questionContent) {
        QuestionContent = questionContent;
    }
}

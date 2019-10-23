package com.noob.study.design.mode.pattern.behavioral.interpreter;

/**
 * created by noob
 * 2019/10/24 0:57
 * 解释器模式
 */
public class Main {
    public static void main(String[] args) {
        String inputStr = "6 100 11 + *";
        GeelyExpressionParser expressionParser = new GeelyExpressionParser();
        int result = expressionParser.parse(inputStr);
        System.out.println("解释器计算结果：" + result);
    }
}

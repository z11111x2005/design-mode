package com.noob.study.design.mode.pattern.behavioral.interpreter;

/**
 * created by noob
 * 2019/10/24 0:58
 */
public class OperatorUtil {
    public static boolean isOperator(String symbol) {
        return (symbol.equals("+") || symbol.equals("*"));
    }

    public static Interpreter getExpressionObject(Interpreter firstExpression, Interpreter secondExpression, String symbol) {
        if (symbol.equals("+")) {
            return new AddInterpreter(firstExpression, secondExpression);
        } else if (symbol.equals("*")) {
            return new MultiInterpreter(firstExpression, secondExpression);
        }
        return null;
    }
}

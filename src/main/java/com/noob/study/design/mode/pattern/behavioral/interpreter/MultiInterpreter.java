package com.noob.study.design.mode.pattern.behavioral.interpreter;

/**
 * created by noob
 * 2019/10/24 0:58
 */
public class MultiInterpreter implements Interpreter {
    private Interpreter firstExpression, secondExpression;

    public MultiInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public int interpreter() {
        return this.firstExpression.interpreter()*this.secondExpression.interpreter();
    }

    @Override
    public String toString() {
        return "*";
    }
}

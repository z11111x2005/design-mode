package com.noob.study.design.mode.pattern.behavioral.interpreter;

/**
 * created by noob
 * 2019/10/24 0:58
 */
public class NumberInterpreter implements Interpreter {
    private int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.parseInt(number);
    }

    @Override
    public int interpreter() {
        return this.number;
    }
}

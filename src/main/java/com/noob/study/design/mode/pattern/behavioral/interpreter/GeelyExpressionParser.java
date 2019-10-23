package com.noob.study.design.mode.pattern.behavioral.interpreter;

import java.util.Stack;

/**
 * created by noob
 * 2019/10/24 0:58
 */
public class GeelyExpressionParser {
    private Stack<Interpreter> stack = new Stack<Interpreter>();

    public int parse(String str){
        String[] strItemArray = str.split(" ");
        for(String symbol:strItemArray){
            if(!OperatorUtil.isOperator(symbol)){
                Interpreter numberExpression = new NumberInterpreter(symbol);
                stack.push(numberExpression);
                System.out.println(String.format("入栈：%d", numberExpression.interpreter()));
            } else {
                Interpreter firstExpression = stack.pop();
                Interpreter secondExpression = stack.pop();
                System.out.println(String.format("出栈：%d 和 %d",
                        firstExpression.interpreter(), secondExpression.interpreter()));
                Interpreter operator = OperatorUtil.getExpressionObject(firstExpression, secondExpression, symbol);
                System.out.println(String.format("应用运算符：%s", operator));
                int result = operator.interpreter();
                NumberInterpreter resultNumberInterpreter = new NumberInterpreter(result);
                stack.push(resultNumberInterpreter);
                System.out.println(String.format("阶段结果入栈：%d", resultNumberInterpreter.interpreter()));
            }
        }
        int result = stack.pop().interpreter();
        return result;
    }
}

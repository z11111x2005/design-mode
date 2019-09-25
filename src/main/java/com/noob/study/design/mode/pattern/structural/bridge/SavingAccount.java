package com.noob.study.design.mode.pattern.structural.bridge;

/**
 * created by noob
 * 2019/9/26 0:25
 */
public class SavingAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户");
    }
}

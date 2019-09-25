package com.noob.study.design.mode.pattern.structural.bridge;

/**
 * created by noob
 * 2019/9/26 0:25
 */
public class DepositAccount implements Account {
    @Override
    public Account openAccount() {
        System.out.println("打开定期账户");
        return new DepositAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个定期账户");
    }
}

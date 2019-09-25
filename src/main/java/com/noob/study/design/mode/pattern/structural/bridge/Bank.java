package com.noob.study.design.mode.pattern.structural.bridge;

/**
 * created by noob
 * 2019/9/26 0:27
 */
public abstract class Bank {
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    abstract Account openAccount();
}

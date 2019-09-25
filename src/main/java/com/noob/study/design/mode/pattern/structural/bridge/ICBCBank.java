package com.noob.study.design.mode.pattern.structural.bridge;

/**
 * created by noob
 * 2019/9/26 0:32
 */
public class ICBCBank extends Bank{

    public ICBCBank(Account account) {
        super(account);
    }

    @Override
    Account openAccount() {
        System.out.println("打开中国工商银行账号");
        account.openAccount();
        return account;
    }
}

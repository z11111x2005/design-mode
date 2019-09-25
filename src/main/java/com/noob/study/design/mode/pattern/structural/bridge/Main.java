package com.noob.study.design.mode.pattern.structural.bridge;

/**
 * created by noob
 * 2019/9/26 0:22
 * 桥接模式
 */
public class Main {
    public static void main(String[] args) {
        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbcBank.openAccount();
        icbcAccount.showAccountType();

        Bank icbcBank2 = new ICBCBank(new SavingAccount());
        Account icbcAccount2 = icbcBank2.openAccount();
        icbcAccount2.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account abcAccount = abcBank.openAccount();
        abcAccount.showAccountType();

        Bank abcBank2 = new ABCBank(new DepositAccount());
        Account abcAccount2 = abcBank2.openAccount();
        abcAccount2.showAccountType();
    }
}

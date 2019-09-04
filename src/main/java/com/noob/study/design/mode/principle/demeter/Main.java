package com.noob.study.design.mode.principle.demeter;

/**
 * created by noob
 * 2019/8/26 23:11
 */
public class Main {

    public static void main(String[] args) {
        // v1
//        Boss boss = new Boss();
//        TeamLeader teamLeader = new TeamLeader();
//        boss.commandCheckNumber(teamLeader);

        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}

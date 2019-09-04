package com.noob.study.design.mode.principle.compositionaggregation;

/**
 * created by noob
 * 2019/9/4 0:57
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据连接";
    }
}

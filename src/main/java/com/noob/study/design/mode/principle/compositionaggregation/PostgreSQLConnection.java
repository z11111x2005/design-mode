package com.noob.study.design.mode.principle.compositionaggregation;

/**
 * created by noob
 * 2019/9/4 0:58
 */
public class PostgreSQLConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "PostgreSQL数据连接";
    }
}

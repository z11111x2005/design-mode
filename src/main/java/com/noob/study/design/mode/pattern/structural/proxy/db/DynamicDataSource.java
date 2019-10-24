package com.noob.study.design.mode.pattern.structural.proxy.db;


import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @Auther: noob
 * @Date: 2019/9/29 11:18
 * @Description：
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}

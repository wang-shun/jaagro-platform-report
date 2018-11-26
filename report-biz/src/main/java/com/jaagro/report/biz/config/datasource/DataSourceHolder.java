package com.jaagro.report.biz.config.datasource;

import org.springframework.stereotype.Component;

/**
 * 使datasource注解产生作用
 *
 * @author tony
 */
@Component
public class DataSourceHolder {
    private static final ThreadLocal<String> HOLDER = new ThreadLocal<String>();

    public static void setDataSource(String dataSource) {
        HOLDER.set(dataSource);
    }

    public static String getDataSource() {
        return HOLDER.get();
    }
}
package com.jaagro.report.biz.config;

import org.springframework.stereotype.Component;

/**
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
package com.jaagro.report.api.service;

/**
 * 司机报表任务服务
 * @author yj
 * @since 2018/11/27
 */
public interface DriverReportTaskService {
    /**
     * 生成日报表
     * @param day yyyy-MM-dd
     */
    void createDailyReport(String day);
    /**
     * 生成月报表
     * @param month yyyy-MM
     */
    void createMonthlyReport(String month);
    /**
     * 异步生成日报表
     * @param day yyyy-MM-dd
     */
    void createDailyReportAsync(String day);
    /**
     * 异步生成月报表
     * @param month yyyy-MM
     */
    void createMonthlyReportAsync(String month);

}

package com.jaagro.report.api.service;
/**
 * 运单费用 日 月报表统计服务
 * @author @Gao.
 **/
public interface WaybillFeeReportTaskService {
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

}

package com.jaagro.report.api.service;

/**
 * 订单报表接口
 * @author gavin
 * @since 2018/11/28
 */
public interface OrderReportService {
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


//    List<DeptOrderDaily> orderDailyReport queryList(queryDto);
}

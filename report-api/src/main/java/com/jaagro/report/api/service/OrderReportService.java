package com.jaagro.report.api.service;

import com.jaagro.report.api.dto.OrderReportDto;
import com.jaagro.report.api.entity.DeptOrderDaily;
import com.jaagro.report.api.entity.DeptOrderMonthly;

import java.util.List;

/**
 * 订单报表接口
 * @author gavin
 * @since 2018/11/28
 */
public interface OrderReportService {
    /**
     * 生成日报表
     * @param orderReportDto yyyy-MM-dd
     */
    void createDailyReport(OrderReportDto orderReportDto);
    /**
     * 生成月报表
     * @param orderReportDto yyyy-MM
     */
    void createMonthlyReport(OrderReportDto orderReportDto);

    /**
     * 从tms统计日报表需要的数据
     * @param orderReportDto
     * @return
     */
    List<DeptOrderDaily> getDeptOrderDailyDataListFromTms(OrderReportDto orderReportDto);

    /**
     * 从日报表中获取月报表的数据
     * @param orderReportDto
     * @return
     */
    List<DeptOrderMonthly> getOrderMonthlyDataFromOrderDaily(OrderReportDto orderReportDto);

    /**
     * web查询日报表数据
     * @param dto
     * @return
     */
    List<DeptOrderDaily> listOrderDailyReport(OrderReportDto dto);

    /**
     * web查询月报表数据
     * @param dto
     * @return
     */
    List<DeptOrderMonthly> listOrderMonthlyReport(OrderReportDto dto);
}

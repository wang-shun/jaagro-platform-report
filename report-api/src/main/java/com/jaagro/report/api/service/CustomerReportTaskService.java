package com.jaagro.report.api.service;

import com.jaagro.report.api.dto.ListCustomerReportCriteriaDto;
import com.jaagro.report.api.dto.WaybillFeeReportDto;
import com.jaagro.report.api.entity.CustomerOrderDaily;
import com.jaagro.report.api.entity.CustomerOrderMonthly;
import com.jaagro.report.api.entity.DeptWaybillfeeDaily;
import com.jaagro.report.api.entity.DeptWaybillfeeMonthly;

import java.util.List;


/**
 * @author baiyiran
 */
public interface CustomerReportTaskService {
    /**
     * 生成日报表
     *
     * @param day yyyy-MM-dd
     */
    void createDailyReport(String day);

    /**
     * 生成月报表
     *
     * @param month yyyy-MM
     */
    void createMonthlyReport(String month);

    /**
     * 客户日报表列表
     *
     * @param dto
     * @return
     */
    List<CustomerOrderDaily> listCustomerDailyReport(ListCustomerReportCriteriaDto dto);

    /**
     * 客户月报表列表
     *
     * @param dto
     * @return
     */
    List<CustomerOrderMonthly> listCustomerMonthReport(ListCustomerReportCriteriaDto dto);
}

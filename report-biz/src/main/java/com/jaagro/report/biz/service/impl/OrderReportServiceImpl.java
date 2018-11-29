package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.service.OrderReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 订单报表实现类
 * @author gavin
 * @since 2018/11/28
 */
@Service
@Slf4j
public class OrderReportServiceImpl implements OrderReportService {
    /**
     * 生成日报表
     *
     * @param day yyyy-MM-dd
     */
    @Override
    public void createDailyReport(String day) {
        //day = '20181128'
        //查询


    }

    /**
     * 生成月报表
     *
     * @param month yyyy-MM
     */
    @Override
    public void createMonthlyReport(String month) {

    }
}

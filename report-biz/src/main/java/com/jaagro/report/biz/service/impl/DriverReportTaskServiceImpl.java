package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.service.DriverReportTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 司机报表任务服务
 * @author yj
 * @since 2018/11/27
 */
@Service
@Slf4j
public class DriverReportTaskServiceImpl implements DriverReportTaskService {
    /**
     * 生成日报表
     *
     * @param day yyyy-MM-dd
     */
    @Override
    public void createDailyReport(String day) {

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

package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.entity.DeptWaybillfeeDaily;
import com.jaagro.report.api.service.WaybillFeeReportTaskService;
import com.jaagro.report.biz.mapper.report.DeptWaybillfeeDailyMapperExt;
import com.jaagro.report.biz.mapper.tms.WaybillFeeReportMapperExt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 运单费用 日 月报表统计服务
 *
 * @author @Gao.
 */
@Service
@Slf4j
public class WaybillFeeReportTaskServiceImpl implements WaybillFeeReportTaskService {

    @Autowired
    private WaybillFeeReportMapperExt waybillFeeReportMapper;
    @Autowired
    private DeptWaybillfeeDailyMapperExt deptWaybillfeeDailyMapper;

    /**
     * 生成日报表
     *
     * @param day yyyy-MM-dd
     */
    @Override
    public void createDailyReport(String day) {
        List<DeptWaybillfeeDaily> deptWaybillfeeDailies = waybillFeeReportMapper.listWaybillFeeStatisticsByDay("2018-11-20");
        try {
            deptWaybillfeeDailyMapper.batchWaybillFeeDailyInsert(deptWaybillfeeDailies);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("批量插入日报表失败={}", e);
            deptWaybillfeeDailyMapper.batchDeleteWaybillFeeDailyByDay(day);
            throw e;
        }
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

package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.dto.WaybillFeeReportDto;
import com.jaagro.report.api.entity.DeptWaybillfeeDaily;
import com.jaagro.report.api.entity.DeptWaybillfeeMonthly;
import com.jaagro.report.api.service.WaybillFeeReportTaskService;
import com.jaagro.report.biz.mapper.report.DeptWaybillfeeDailyMapperExt;
import com.jaagro.report.biz.mapper.report.DeptWaybillfeeMonthlyMapperExt;
import com.jaagro.report.biz.mapper.tms.WaybillFeeReportMapperExt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
    @Autowired
    private DeptWaybillfeeMonthlyMapperExt deptWaybillfeeMonthlyMapper;


    /**
     * 生成日报表
     *
     * @param day yyyy-MM-dd
     */
    @Override
    public void createDailyReport(String day) {
        List<DeptWaybillfeeDaily> deptWaybillfeeDailies = waybillFeeReportMapper.listWaybillFeeStatisticsByDay(day);
        try {
            if (!CollectionUtils.isEmpty(deptWaybillfeeDailies)) {
                //删除当天报表
                deptWaybillfeeDailyMapper.batchDeleteWaybillFeeDailyByDay(day);
                //插入最新日报表
                deptWaybillfeeDailyMapper.batchWaybillFeeDailyInsert(deptWaybillfeeDailies);
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("批量插入日报表失败={}", e);
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
        List<DeptWaybillfeeMonthly> deptWaybillfeeMonthlies = deptWaybillfeeDailyMapper.listWaybillFeeStatisticsByMonth("2018-10");
        if (!CollectionUtils.isEmpty(deptWaybillfeeMonthlies)) {
            try {
                //删除当月报表
                deptWaybillfeeMonthlyMapper.batchDeleteWaybillFeeDailyByMonth(month);
                //插入最新月报表
                deptWaybillfeeMonthlyMapper.batchWaybillFeeMonthInsert(deptWaybillfeeMonthlies);
            } catch (Exception e) {
                e.printStackTrace();
                log.error("批量插入月报表失败={}", e);
                throw e;
            }
        }
    }

    /**
     * 运单费用日报表列表
     *
     * @param dto
     * @return
     */
    @Override
    public List<DeptWaybillfeeDaily> listWaybillFeeDailyReport(WaybillFeeReportDto dto) {
        return deptWaybillfeeDailyMapper.listWaybillFeeDailyReport(dto);
    }

    /**
     * 运单费用月报表列表
     *
     * @param dto
     * @return
     */
    @Override
    public List<DeptWaybillfeeMonthly> listWaybillFeeMonthReport(WaybillFeeReportDto dto) {
        return deptWaybillfeeMonthlyMapper.listWaybillFeeMonthReport(dto);
    }
}

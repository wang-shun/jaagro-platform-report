package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.service.DriverReportTaskService;
import com.jaagro.report.api.entity.DriverOrderDaily;
import com.jaagro.report.biz.mapper.tms.DriverReportMapperExt;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 司机报表任务服务
 * @author yj
 * @since 2018/11/27
 */
@Service
@Slf4j
public class DriverReportTaskServiceImpl implements DriverReportTaskService {
    @Autowired
    private DriverReportMapperExt driverReportMapperExt;
    /**
     * 生成日报表
     *
     * @param day yyyy-MM-dd
     */
    @Override
    public void createDailyReport(String day) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Set<DriverOrderDaily> driverOrderDailySet = new HashSet<>();
            Date beginDate = sdf.parse(day);
            Date endDate = DateUtils.addDays(beginDate,1);
            // 接单量拒单量
            List<HashMap<String, Object>> recAndRef = driverReportMapperExt.listRecAndRefCount(beginDate, endDate);
            // 异常费用
            List<HashMap<String, Object>> anomalyCost = driverReportMapperExt.listAnomalyCost(beginDate, endDate);
            // 异常数
            List<HashMap<String, Object>> anomalyCount = driverReportMapperExt.listAnomalyCount(beginDate, endDate);
            // 平均接单时长
            List<HashMap<String, Object>> avgRecDuration = driverReportMapperExt.listAvgRecDuration(beginDate, endDate);
            // 完成量
            List<HashMap<String, Object>> completeCount = driverReportMapperExt.listCompleteCount(beginDate, endDate);
            // 装货总运单量,准时数
            List<HashMap<String, Object>> loadTotalAndPunctuality = driverReportMapperExt.listLoadTotalAndPunctuality(beginDate, endDate);
            // TODO 公里数 运费 费用合计
            // 合并查询结果集
            unionListToDailySet(driverOrderDailySet,recAndRef);
        }catch (Exception ex){
           log.error("createDailyReport error day="+day,ex);
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

    private Set<DriverOrderDaily> unionListToDailySet(Set<DriverOrderDaily> driverOrderDailySet, List<HashMap<String, Object>> list) {
        if (!CollectionUtils.isEmpty(list)){
            DriverOrderDaily driverOrderDaily = new DriverOrderDaily();
            //driverOrderDaily.setDriverId()
        }
        return null;
    }
}

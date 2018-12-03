package com.jaagro.report.biz.mapper.tms;

import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 司机报表数据统计
 * @author yj
 * @since 2018/11/28
 */
public interface OrderReportMapperExt {
    /**
     * 接单量拒单量
     * @param beginDate
     * @param endDate
     * @return driver_id,receive_waybill_quantity,refuse_waybill_quantity
     */
    List<HashMap<String,Object>> listRecAndRefCount(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
    /**
     * 异常数
     * @param beginDate
     * @param endDate
     * @return driver_id,anomaly_waybill_quantity
     */
    List<HashMap<String,Object>> listAnomalyCount(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
    /**
     * 完成量
     * @param beginDate
     * @param endDate
     * @return driver_id,complete_waybill_quantity
     */
    List<HashMap<String,Object>> listCompleteCount(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
    /**
     * 平均接单时长(秒)
     * @param beginDate
     * @param endDate
     * @return driver_id,avg_receive_duration
     */
    List<HashMap<String,Object>> listAvgRecDuration(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
    /**
     * 总接单数装货准时数
     * @param beginDate
     * @param endDate
     * @return driver_id,total,punctuality
     */
    List<HashMap<String,Object>> listLoadTotalAndPunctuality(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
    /**
     * 异常费用
     * @param beginDate
     * @param endDate
     * @return driver_id,anomaly_cost
     */
    List<HashMap<String,Object>> listAnomalyCost(@Param("beginDate") Date beginDate, @Param("endDate") Date endDate);
}

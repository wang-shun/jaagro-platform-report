package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.entity.DriverOrderDaily;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/26
 */
public interface DriverOrderDailyMapperExt extends DriverOrderDailyMapper {
    /**
     * 根据日期物理删除
     * @param reportTime
     */
    void deleteByReportTime(@Param("reportTime") String reportTime);

    /**
     * 批量插入
     * @param driverOrderDailyList
     */
    void batchInsert(@Param("driverOrderDailyList") List<DriverOrderDaily> driverOrderDailyList);
}

package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderDaily;
import com.jaagro.report.api.entity.DriverOrderMonthly;
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

    /**
     * 根据起始时间查询司机订单日报表用于生成月报表
     * @param beginMonth
     * @param endMonth
     * @return
     */
    List<DriverOrderMonthly> listByBeginTimeAndEndTime(@Param("beginMonth") String beginMonth, @Param("endMonth")String endMonth);

    /**
     * 查询日报表列表
     * @param listDriverReportCriteriaDto
     * @return
     */
    List<DriverOrderDaily> listByCriteria(@Param("listDriverReportCriteriaDto") ListDriverReportCriteriaDto listDriverReportCriteriaDto);
}

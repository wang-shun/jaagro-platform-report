package com.jaagro.report.biz.mapper.report;

import org.apache.ibatis.annotations.Param;

/**
 * @author yj
 * @since 2018/11/26
 */
public interface DriverOrderMonthlyMapperExt extends DriverOrderMonthlyMapper {
    /**
     * 根据月份物理删除报表
     * @param reportTime
     * @return
     */
    Integer deleteByReportTime(@Param("reportTime") String reportTime);
}

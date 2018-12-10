package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderMonthly;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    /**
     * 批量插入
     * @param driverOrderMonthlyList
     * @return
     */
    Integer batchInsert(@Param("driverOrderMonthlyList") List<DriverOrderMonthly> driverOrderMonthlyList);

    /**
     * 查询月报表列表
     * @param listDriverReportCriteriaDto
     * @return
     */
    List<DriverOrderMonthly> listByCriteria(ListDriverReportCriteriaDto listDriverReportCriteriaDto);
}

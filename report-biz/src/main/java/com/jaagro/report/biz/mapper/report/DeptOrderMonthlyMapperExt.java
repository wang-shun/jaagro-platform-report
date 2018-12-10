package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.OrderReportDto;
import com.jaagro.report.api.entity.DeptOrderMonthly;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author gavin
 * @since 2018/11/26
 */
public interface DeptOrderMonthlyMapperExt extends DeptOrderMonthlyMapper {

    /**
     * @param list
     * @return
     */
    int batchInsert(List<DeptOrderMonthly> list);

    /**
     * @param reportTime
     * @return
     */

    int batchDelete(@Param("reportTime") String reportTime);

    /**
     * web查询月报表数据
     *
     * @param dto
     * @return
     */
    List<DeptOrderMonthly> listOrderMonthlyReport(OrderReportDto dto);
}

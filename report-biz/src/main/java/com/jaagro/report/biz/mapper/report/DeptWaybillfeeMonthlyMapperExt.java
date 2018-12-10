package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.WaybillFeeReportDto;
import com.jaagro.report.api.entity.DeptWaybillfeeMonthly;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/26
 */
public interface DeptWaybillfeeMonthlyMapperExt extends DeptWaybillfeeMonthlyMapper {
    /**
     * 批量插入月报表数据
     *
     * @param deptWaybillfeeMonthly
     */
    void batchWaybillFeeMonthInsert(@Param("deptWaybillfeeMonthly") List<DeptWaybillfeeMonthly> deptWaybillfeeMonthly);

    /**
     * 批量删除当月报表数据
     *
     * @param month
     */
    void batchDeleteWaybillFeeDailyByMonth(@Param("month") String month);

    /**
     * 运单费用月报表列表
     * @param dto
     * @return
     */
    List<DeptWaybillfeeMonthly> listWaybillFeeMonthReport(WaybillFeeReportDto dto);

}

package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.WaybillFeeReportDto;
import com.jaagro.report.api.entity.DeptWaybillfeeDaily;
import com.jaagro.report.api.entity.DeptWaybillfeeMonthly;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/26
 */
public interface DeptWaybillfeeDailyMapperExt extends DeptWaybillfeeDailyMapper {
    /**
     * 批量插入运单费用日统计报表数据
     *
     * @param deptWaybillfeeDailies
     */
    void batchWaybillFeeDailyInsert(@Param("deptWaybillfeeDailies") List<DeptWaybillfeeDaily> deptWaybillfeeDailies);

    /**
     * 根据时间删除
     *
     * @param day
     */
    void batchDeleteWaybillFeeDailyByDay(@Param("day") String day);

    /**
     * 在日报表获取月报表数据
     *
     * @param month
     * @return
     */
    List<DeptWaybillfeeMonthly> listWaybillFeeStatisticsByMonth(@Param("month") String month);

    /**
     * 运单费用日报表列表
     * @param dto
     * @return
     */
    List<DeptWaybillfeeDaily> listWaybillFeeDailyReport(WaybillFeeReportDto dto);
}

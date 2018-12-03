package com.jaagro.report.biz.mapper.tms;

import com.jaagro.report.api.dto.OrderReportDto;
import com.jaagro.report.api.entity.DeptOrderDaily;
import com.jaagro.report.api.entity.DeptOrderMonthly;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 订单、运单数据统计
 *
 * @author gavin
 * @since 2018/11/29
 */
public interface OrderReportMapperExt {
    /**
     * 从tms统计日报表的数据
     *
     * @param orderReportDto
     * @return
     */
    List<DeptOrderDaily> getDeptOrderDailyDataListFromTms(OrderReportDto orderReportDto);

    /**
     * 从tms统计月报表的数据
     * @param orderReportDto
     * @return
     */
//    List<DeptOrderMonthly> getDeptOrderMonthlyDataListFromTms(OrderReportDto orderReportDto);

}

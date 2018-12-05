package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.ListCustomerReportCriteriaDto;
import com.jaagro.report.api.entity.CustomerOrderDaily;
import com.jaagro.report.api.entity.CustomerOrderMonthly;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/26
 */
public interface CustomerOrderMonthlyMapperExt extends CustomerOrderMonthlyMapper {
    /**
     * 客户月报表
     *
     * @param dto
     * @return
     */
    List<CustomerOrderMonthly> listCustomerMonthByCriteria(ListCustomerReportCriteriaDto dto);

    /**
     * 循环插入
     *
     * @param customerOrderMonthList
     */
    void batchInsert(@Param("customerOrderMonthList") List<CustomerOrderMonthly> customerOrderMonthList);
}

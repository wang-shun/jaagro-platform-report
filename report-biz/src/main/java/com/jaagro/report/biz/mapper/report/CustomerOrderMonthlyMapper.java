package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.biz.entity.CustomerOrderMonthly;

public interface CustomerOrderMonthlyMapper {
    /**
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-11-26
     */
    int insert(CustomerOrderMonthly record);

    /**
     * @mbggenerated 2018-11-26
     */
    int insertSelective(CustomerOrderMonthly record);

    /**
     * @mbggenerated 2018-11-26
     */
    CustomerOrderMonthly selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(CustomerOrderMonthly record);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(CustomerOrderMonthly record);
}
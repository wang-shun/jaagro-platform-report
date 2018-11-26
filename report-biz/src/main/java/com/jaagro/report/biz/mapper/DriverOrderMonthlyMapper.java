package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DriverOrderMonthly;

public interface DriverOrderMonthlyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DriverOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DriverOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DriverOrderMonthly selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DriverOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DriverOrderMonthly record);
}
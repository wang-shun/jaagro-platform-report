package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DepartOrderMonthly;

public interface DepartOrderMonthlyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DepartOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DepartOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DepartOrderMonthly selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DepartOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DepartOrderMonthly record);
}
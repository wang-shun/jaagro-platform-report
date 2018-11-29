package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.entity.DeptOrderMonthly ;

public interface DeptOrderMonthlyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DeptOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DeptOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DeptOrderMonthly selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DeptOrderMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DeptOrderMonthly record);
}
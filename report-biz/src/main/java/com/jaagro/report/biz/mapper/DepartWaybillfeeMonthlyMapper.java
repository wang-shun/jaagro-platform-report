package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DepartWaybillfeeMonthly;

public interface DepartWaybillfeeMonthlyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DepartWaybillfeeMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DepartWaybillfeeMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DepartWaybillfeeMonthly selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DepartWaybillfeeMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DepartWaybillfeeMonthly record);
}
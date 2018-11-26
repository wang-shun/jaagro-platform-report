package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.biz.entity.DeptWaybillfeeMonthly;

public interface DeptWaybillfeeMonthlyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DeptWaybillfeeMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DeptWaybillfeeMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DeptWaybillfeeMonthly selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DeptWaybillfeeMonthly record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DeptWaybillfeeMonthly record);
}
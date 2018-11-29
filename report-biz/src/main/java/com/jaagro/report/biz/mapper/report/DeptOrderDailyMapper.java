package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.entity.DeptOrderDaily;

public interface DeptOrderDailyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DeptOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DeptOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DeptOrderDaily selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DeptOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DeptOrderDaily record);
}
package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DeptOrderDaily;

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
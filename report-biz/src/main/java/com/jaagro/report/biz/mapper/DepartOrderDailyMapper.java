package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DepartOrderDaily;

public interface DepartOrderDailyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DepartOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DepartOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DepartOrderDaily selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DepartOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DepartOrderDaily record);
}
package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DriverOrderDaily;

public interface DriverOrderDailyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DriverOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DriverOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DriverOrderDaily selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DriverOrderDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DriverOrderDaily record);
}
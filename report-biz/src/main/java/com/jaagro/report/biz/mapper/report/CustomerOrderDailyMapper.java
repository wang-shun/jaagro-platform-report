package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.entity.CustomerOrderDaily;

public interface CustomerOrderDailyMapper {
    /**
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-11-26
     */
    int insert(CustomerOrderDaily record);

    /**
     * @mbggenerated 2018-11-26
     */
    int insertSelective(CustomerOrderDaily record);

    /**
     * @mbggenerated 2018-11-26
     */
    CustomerOrderDaily selectByPrimaryKey(Integer id);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(CustomerOrderDaily record);

    /**
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(CustomerOrderDaily record);
}
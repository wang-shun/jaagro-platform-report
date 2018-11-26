package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DepartWaybillfeeDaily;

public interface DepartWaybillfeeDailyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DepartWaybillfeeDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DepartWaybillfeeDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DepartWaybillfeeDaily selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DepartWaybillfeeDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DepartWaybillfeeDaily record);
}
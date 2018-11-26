package com.jaagro.report.biz.mapper;

import com.jaagro.report.biz.entity.DeptWaybillfeeDaily;

public interface DeptWaybillfeeDailyMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(DeptWaybillfeeDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(DeptWaybillfeeDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    DeptWaybillfeeDaily selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(DeptWaybillfeeDaily record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(DeptWaybillfeeDaily record);
}
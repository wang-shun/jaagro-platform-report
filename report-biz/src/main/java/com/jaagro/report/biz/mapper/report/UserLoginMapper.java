package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.biz.entity.UserLogin;

public interface UserLoginMapper {
    /**
     *
     * @mbggenerated 2018-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insert(UserLogin record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int insertSelective(UserLogin record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    UserLogin selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKeySelective(UserLogin record);

    /**
     *
     * @mbggenerated 2018-11-26
     */
    int updateByPrimaryKey(UserLogin record);
}
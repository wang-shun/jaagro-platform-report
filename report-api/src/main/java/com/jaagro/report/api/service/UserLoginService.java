package com.jaagro.report.api.service;

import com.jaagro.report.api.dto.UserLoginCriteriaDto;
import com.jaagro.report.api.dto.UserLoginDto;

import java.util.List;

/**
 * @author tony
 */
public interface UserLoginService {

    /**
     * 插入用户登录记录
     * @param userLoginDto 对象
     * @return 返回值
     */
    void createUserLogin(UserLoginDto userLoginDto);

    /**
     * 根据条件查询登录记录
     * @param userLoginCriteriaDto
     * @return
     */
    List<UserLoginDto> listUserLogin(UserLoginCriteriaDto userLoginCriteriaDto);

    /**
     * 获取单条记录
     * @param id
     * @return
     */
    UserLoginDto getUserLoginById(int id);

    /**
     * 后台强制注销
     * @param id
     * @return
     */
    int logOutUserById(int id);
}

package com.jaagro.report.biz.mapper.report;

import com.jaagro.report.api.dto.UserLoginCriteriaDto;
import com.jaagro.report.api.entity.UserLogin;

/**
 * @author yj
 * @since 2018/11/26
 */
public interface UserLoginMapperExt extends UserLoginMapper {
    /**
     * 根据条件获取userLogin，用于判断当天当前用户是否已经登录过
     * @param userLoginCriteriaDto
     * @return
     */
    UserLogin getUserLoginByCriteria(UserLoginCriteriaDto userLoginCriteriaDto);
}

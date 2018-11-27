package com.jaagro.report.api.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author tony
 */
@Data
@Accessors(chain = true)
public class UserLoginCriteriaDto implements Serializable {

    /**
     * 登录日期
     */
    private Date loginDate;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户类型
     */
    private String userType;
}

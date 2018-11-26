package com.jaagro.report.biz.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yj
 * @since 20181126
 */
@Data
@Accessors(chain = true)
public class UserLogin implements Serializable{
    /**
     * 
     */
    private Integer id;

    /**
     * 登录日期
     */
    private Date loginDate;

    /**
     * 用户id
     */
    private Integer userId;

    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户类型
     */
    private String userType;

    /**
     * 登录ip
     */
    private String loginIp;

    /**
     * 最新一次登录时间
     */
    private Date newLoginTime;

    /**
     * 登录次数
     */
    private Integer loginCount;

    /**
     * 
     * @return id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 登录日期
     * @return login_date 登录日期
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 登录日期
     * @param loginDate 登录日期
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 用户id
     * @return user_id 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 用户id
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 用户名称
     * @return user_name 用户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 用户名称
     * @param userName 用户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 用户类型
     * @return user_type 用户类型
     */
    public String getUserType() {
        return userType;
    }

    /**
     * 用户类型
     * @param userType 用户类型
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * 登录ip
     * @return login_ip 登录ip
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 登录ip
     * @param loginIp 登录ip
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * 最新一次登录时间
     * @return new_login_time 最新一次登录时间
     */
    public Date getNewLoginTime() {
        return newLoginTime;
    }

    /**
     * 最新一次登录时间
     * @param newLoginTime 最新一次登录时间
     */
    public void setNewLoginTime(Date newLoginTime) {
        this.newLoginTime = newLoginTime;
    }

    /**
     * 登录次数
     * @return login_count 登录次数
     */
    public Integer getLoginCount() {
        return loginCount;
    }

    /**
     * 登录次数
     * @param loginCount 登录次数
     */
    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }
}
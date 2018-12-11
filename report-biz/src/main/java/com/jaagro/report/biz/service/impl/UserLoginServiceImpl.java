package com.jaagro.report.biz.service.impl;

import com.alibaba.fastjson.JSON;
import com.jaagro.report.api.dto.UserLoginCriteriaDto;
import com.jaagro.report.api.dto.UserLoginDto;
import com.jaagro.report.api.entity.UserLogin;
import com.jaagro.report.api.service.UserLoginService;
import com.jaagro.report.biz.config.RabbitMqConfig;
import com.jaagro.report.biz.mapper.report.UserLoginMapperExt;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author tony
 */
@Slf4j
@Service
public class UserLoginServiceImpl implements UserLoginService {

    @Autowired
    private UserLoginMapperExt userLoginMapper;

    /**
     * 插入用户登录记录
     *
     * @param userLoginDto 对象
     * @return 返回值
     */
    @Override
    public void createUserLogin(UserLoginDto userLoginDto) {
        UserLoginCriteriaDto ulc = new UserLoginCriteriaDto();
        BeanUtils.copyProperties(userLoginDto, ulc);
        UserLogin userLoginData = userLoginMapper.getUserLoginByCriteria(ulc);
        UserLogin userLogin = new UserLogin();
        BeanUtils.copyProperties(userLoginDto, userLogin);
        if (userLoginData == null) {
            userLogin.setId(null)
                    .setLoginDate(new Date());
            int result = userLoginMapper.insertSelective(userLogin);
            if (result < 1) {
                log.warn("O createUserLogin: createUserLogin failed：{}", userLoginDto);
            }
        }
    }

    @RabbitListener(queues = RabbitMqConfig.USER_LOGIN_SEND_QUEUE)
    private void createUserLoginByMq(String result) {
        UserLoginDto userLoginDto = JSON.parseObject(result, UserLoginDto.class);
        createUserLogin(userLoginDto);
    }

    /**
     * 根据条件查询登录记录
     *
     * @param userLoginCriteriaDto
     * @return
     */
    @Override
    public List<UserLoginDto> listUserLogin(UserLoginCriteriaDto userLoginCriteriaDto) {

        return null;
    }

    /**
     * 获取单条记录
     *
     * @param id
     * @return
     */
    @Override
    public UserLoginDto getUserLoginById(int id) {
        UserLogin userLogin = userLoginMapper.selectByPrimaryKey(id);
        if (null == userLogin) {
            throw new NullPointerException(id + ": id does not exist");
        }
        UserLoginDto userLoginDto = new UserLoginDto();
        BeanUtils.copyProperties(userLogin, userLoginDto);

        return null;
    }

    /**
     * 后台强制注销
     *
     * @param id
     * @return
     */
    @Override
    public int logOutUserById(int id) {
        return 0;
    }
}

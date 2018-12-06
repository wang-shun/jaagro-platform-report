package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderMonthly;
import com.jaagro.report.api.service.DriverOrderMonthlyService;
import com.jaagro.report.biz.mapper.report.DriverOrderMonthlyMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/30
 */
@Service
@CacheConfig(keyGenerator = "wiselyKeyGenerator", cacheNames = "driverOrderReport")
public class DriverOrderMonthlyServiceImpl implements DriverOrderMonthlyService {
    @Autowired
    private DriverOrderMonthlyMapperExt driverOrderMonthlyMapperExt;

    /**
     * 查询日报表列表
     *
     * @param listDriverReportCriteriaDto
     * @return
     */
    @Override
    //@Cacheable
    public List<DriverOrderMonthly> listByCriteria(ListDriverReportCriteriaDto listDriverReportCriteriaDto) {
        return driverOrderMonthlyMapperExt.listByCriteria(listDriverReportCriteriaDto);
    }
}

package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderDaily;
import com.jaagro.report.api.service.DriverOrderDailyService;
import com.jaagro.report.biz.mapper.report.DriverOrderDailyMapperExt;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@CacheConfig(keyGenerator = "wiselyKeyGenerator", cacheNames = "driverOrderReport")
public class DriverOrderDailyServiceImpl implements DriverOrderDailyService {
    @Autowired
    private DriverOrderDailyMapperExt driverOrderDailyMapperExt;

    /**
     * 查询司机日报表列表
     *
     * @param listDriverReportCriteriaDto
     * @return
     */
    @Override
    //@Cacheable
    public List<DriverOrderDaily> listByCriteria(ListDriverReportCriteriaDto listDriverReportCriteriaDto) {
        return driverOrderDailyMapperExt.listByCriteria(listDriverReportCriteriaDto);
    }
}

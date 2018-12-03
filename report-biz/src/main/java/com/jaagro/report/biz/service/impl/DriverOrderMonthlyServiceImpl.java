package com.jaagro.report.biz.service.impl;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderMonthly;
import com.jaagro.report.api.service.DriverOrderMonthlyService;
import com.jaagro.report.biz.mapper.report.DriverOrderMonthlyMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/30
 */
@Service
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
    public List<DriverOrderMonthly> listByCriteria(ListDriverReportCriteriaDto listDriverReportCriteriaDto) {
        return driverOrderMonthlyMapperExt.listByCriteria(listDriverReportCriteriaDto);
    }
}

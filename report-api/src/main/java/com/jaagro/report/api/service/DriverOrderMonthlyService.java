package com.jaagro.report.api.service;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderMonthly;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/30
 */
public interface DriverOrderMonthlyService {
    /**
     * 查询日报表列表
     * @param listDriverReportCriteriaDto
     * @return
     */
    List<DriverOrderMonthly> listByCriteria(ListDriverReportCriteriaDto listDriverReportCriteriaDto);
}

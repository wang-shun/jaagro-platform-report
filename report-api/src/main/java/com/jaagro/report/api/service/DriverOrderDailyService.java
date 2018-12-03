package com.jaagro.report.api.service;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderDaily;

import java.util.List;

/**
 * @author yj
 * @since 2018/11/30
 */
public interface DriverOrderDailyService {
    /**
     * 查询司机日报表列表
     *
     * @param listDriverReportCriteriaDto
     * @return
     */
    List<DriverOrderDaily> listByCriteria(ListDriverReportCriteriaDto listDriverReportCriteriaDto);
}

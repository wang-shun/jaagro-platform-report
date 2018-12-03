package com.jaagro.report.web.controller;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderDaily;
import com.jaagro.report.api.entity.DriverOrderMonthly;
import com.jaagro.report.api.service.DriverOrderDailyService;
import com.jaagro.report.api.service.DriverOrderMonthlyService;
import com.jaagro.report.api.service.DriverReportTaskService;
import com.jaagro.report.web.vo.DriverOrderReportVo;
import com.jaagro.utils.BaseResponse;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


/**
 * @author yj
 * @since 2018/11/30
 */
@RestController
@Slf4j
public class DriverOrderReportController {
    @Autowired
    private DriverOrderDailyService driverOrderDailyService;
    @Autowired
    private DriverOrderMonthlyService driverOrderMonthlyService;
    @Autowired
    private DriverReportTaskService driverReportTaskService;

    @ApiOperation(value = "司机订单日报表列表")
    @PostMapping("/ListDriverOrderDailyByCriteria")
    public BaseResponse<List<DriverOrderReportVo>> ListDriverOrderDailyByCriteria(@RequestBody ListDriverReportCriteriaDto listDriverReportCriteriaDto) {
        List<DriverOrderDaily> driverOrderDailyList = driverOrderDailyService.listByCriteria(listDriverReportCriteriaDto);
        return BaseResponse.successInstance(generateDriverOrderDailyVo(driverOrderDailyList));
    }

    @ApiOperation(value = "司机订单月报表列表")
    @PostMapping("/ListDriverOrderMonthlyByCriteria")
    public BaseResponse<List<DriverOrderReportVo>> ListDriverOrderMonthlyByCriteria(@RequestBody ListDriverReportCriteriaDto listDriverReportCriteriaDto) {
        List<DriverOrderMonthly> driverOrderMonthlyList = driverOrderMonthlyService.listByCriteria(listDriverReportCriteriaDto);
        return BaseResponse.successInstance(generateDriverOrderMonthlyVo(driverOrderMonthlyList));
    }

    @ApiOperation(value = "生成司机订单日报表")
    @PostMapping("/createDriverOrderDaily")
    public BaseResponse createDriverOrderDaily(@RequestParam("day") String day) {
        driverReportTaskService.createDailyReportAsync(day);
        return BaseResponse.successInstance("生成司机订单日报表任务提交成功");
    }

    @ApiOperation(value = "生成司机订单月报表")
    @PostMapping("/createDriverOrderMonthly")
    public BaseResponse createDriverOrderMonthly(@RequestParam("month") String month) {
        driverReportTaskService.createMonthlyReportAsync(month);
        return BaseResponse.successInstance("生成司机订单月报表任务提交成功");
    }

    private List<DriverOrderReportVo> generateDriverOrderDailyVo(List<DriverOrderDaily> driverOrderDailyList) {
        if (!CollectionUtils.isEmpty(driverOrderDailyList)) {
            List<DriverOrderReportVo> orderReportVoList = new ArrayList<>();
            for (DriverOrderDaily orderDaily : driverOrderDailyList) {
                DriverOrderReportVo driverOrderReportVo = new DriverOrderReportVo();
                BeanUtils.copyProperties(orderDaily, driverOrderReportVo);
                orderReportVoList.add(driverOrderReportVo);
            }
            return orderReportVoList;
        }
        return null;
    }

    private List<DriverOrderReportVo> generateDriverOrderMonthlyVo(List<DriverOrderMonthly> driverOrderMonthlyList) {
        if (!CollectionUtils.isEmpty(driverOrderMonthlyList)) {
            List<DriverOrderReportVo> orderReportVoList = new ArrayList<>();
            for (DriverOrderMonthly orderMonthly : driverOrderMonthlyList) {
                DriverOrderReportVo driverOrderReportVo = new DriverOrderReportVo();
                BeanUtils.copyProperties(orderMonthly, driverOrderReportVo);
                orderReportVoList.add(driverOrderReportVo);
            }
            return orderReportVoList;
        }
        return null;
    }

}

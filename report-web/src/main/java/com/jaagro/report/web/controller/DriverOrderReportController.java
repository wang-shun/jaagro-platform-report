package com.jaagro.report.web.controller;

import com.jaagro.report.api.dto.ListDriverReportCriteriaDto;
import com.jaagro.report.api.entity.DriverOrderDaily;
import com.jaagro.report.api.entity.DriverOrderMonthly;
import com.jaagro.report.api.service.DriverOrderDailyService;
import com.jaagro.report.api.service.DriverOrderMonthlyService;
import com.jaagro.report.api.service.DriverReportTaskService;
import com.jaagro.report.web.vo.DriverOrderReportVo;
import com.jaagro.utils.BaseResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * @author yj
 * @since 2018/11/30
 */
@RestController
@Api(description = "司机订单报表", produces = MediaType.APPLICATION_JSON_VALUE)
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
        log.info("O ListDriverOrderDailyByCriteria listDriverReportCriteriaDto={}",listDriverReportCriteriaDto);
        List<DriverOrderDaily> driverOrderDailyList = driverOrderDailyService.listByCriteria(listDriverReportCriteriaDto);
        // 值都是0或者空的不展示
        deleteNullOrderDaily(driverOrderDailyList);
        return BaseResponse.successInstance(generateDriverOrderDailyVo(driverOrderDailyList));
    }

    @ApiOperation(value = "司机订单月报表列表")
    @PostMapping("/ListDriverOrderMonthlyByCriteria")
    public BaseResponse<List<DriverOrderReportVo>> ListDriverOrderMonthlyByCriteria(@RequestBody ListDriverReportCriteriaDto listDriverReportCriteriaDto) {
        log.info("O ListDriverOrderMonthlyByCriteria listDriverReportCriteriaDto={}",listDriverReportCriteriaDto);
        List<DriverOrderMonthly> driverOrderMonthlyList = driverOrderMonthlyService.listByCriteria(listDriverReportCriteriaDto);
        // 值都是0或者空的不展示
        deleteNullOrderMonthly(driverOrderMonthlyList);
        return BaseResponse.successInstance(generateDriverOrderMonthlyVo(driverOrderMonthlyList));
    }

    @ApiOperation(value = "生成司机订单日报表")
    @PostMapping("/createDriverOrderDaily")
    public BaseResponse createDriverOrderDaily(@RequestParam("day") String day) {
        log.info("O createDriverOrderDaily day={}",day);
        driverReportTaskService.createDailyReportAsync(day);
        return BaseResponse.successInstance("生成司机订单日报表任务提交成功");
    }

    @ApiOperation(value = "生成司机订单月报表")
    @PostMapping("/createDriverOrderMonthly")
    public BaseResponse createDriverOrderMonthly(@RequestParam("month") String month) {
        log.info("O createDriverOrderMonthly month={}",month);
        driverReportTaskService.createMonthlyReportAsync(month);
        return BaseResponse.successInstance("生成司机订单月报表任务提交成功");
    }

    private List<DriverOrderReportVo> generateDriverOrderDailyVo(List<DriverOrderDaily> driverOrderDailyList) {
        List<DriverOrderReportVo> orderReportVoList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(driverOrderDailyList)) {
            for (DriverOrderDaily orderDaily : driverOrderDailyList) {
                DriverOrderReportVo driverOrderReportVo = new DriverOrderReportVo();
                BeanUtils.copyProperties(orderDaily, driverOrderReportVo);
                orderReportVoList.add(driverOrderReportVo);
            }
        }
        return orderReportVoList;
    }

    private List<DriverOrderReportVo> generateDriverOrderMonthlyVo(List<DriverOrderMonthly> driverOrderMonthlyList) {
        List<DriverOrderReportVo> orderReportVoList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(driverOrderMonthlyList)) {
            for (DriverOrderMonthly orderMonthly : driverOrderMonthlyList) {
                DriverOrderReportVo driverOrderReportVo = new DriverOrderReportVo();
                BeanUtils.copyProperties(orderMonthly, driverOrderReportVo);
                orderReportVoList.add(driverOrderReportVo);
            }
        }
        return orderReportVoList;
    }

    private void deleteNullOrderDaily(List<DriverOrderDaily> driverOrderDailyList){
        if (!CollectionUtils.isEmpty(driverOrderDailyList)) {
            Iterator<DriverOrderDaily> iterator = driverOrderDailyList.iterator();
            BigDecimal zero = new BigDecimal("0");
            while (iterator.hasNext()) {
                DriverOrderDaily orderDaily = iterator.next();
                boolean isNull = (orderDaily.getAvgReceiveDuration() == null || orderDaily.getAvgReceiveDuration().compareTo(zero) == 0)
                        && orderDaily.getAnomalyWaybillQuantity().equals(0) && (orderDaily.getAnomalyCost() == null || orderDaily.getAnomalyCost().compareTo(zero) == 0)
                        && orderDaily.getCompleteWaybillQuantity().equals(0) && (orderDaily.getFreight() == null || orderDaily.getFreight().compareTo(zero) == 0)
                        && (orderDaily.getLoadPunctualityRate() == null || orderDaily.getLoadPunctualityRate().compareTo(zero) == 0)
                        && (orderDaily.getMileage() == null || orderDaily.getMileage().compareTo(zero) == 0)
                        && orderDaily.getReceiveWaybillQuantity().equals(0) && orderDaily.getRefuseWaybillQuantity().equals(0)
                        && (orderDaily.getTotalCost() == null || orderDaily.getTotalCost().compareTo(zero) == 0)
                        && (orderDaily.getUnloadPunctualityRate() == null || orderDaily.getUnloadPunctualityRate().compareTo(zero) == 0);
                if (isNull){
                    iterator.remove();
                }
            }
        }
    }

    private void deleteNullOrderMonthly(List<DriverOrderMonthly> driverOrderMonthlyList){
        if (!CollectionUtils.isEmpty(driverOrderMonthlyList)) {
            Iterator<DriverOrderMonthly> iterator = driverOrderMonthlyList.iterator();
            BigDecimal zero = new BigDecimal("0");
            while (iterator.hasNext()) {
                DriverOrderMonthly orderMonthly = iterator.next();
                boolean isNull = (orderMonthly.getAvgReceiveDuration() == null || orderMonthly.getAvgReceiveDuration().compareTo(zero) == 0)
                        && orderMonthly.getAnomalyWaybillQuantity().equals(0) && (orderMonthly.getAnomalyCost() == null || orderMonthly.getAnomalyCost().compareTo(zero) == 0)
                        && orderMonthly.getCompleteWaybillQuantity().equals(0) && (orderMonthly.getFreight() == null || orderMonthly.getFreight().compareTo(zero) == 0)
                        && (orderMonthly.getLoadPunctualityRate() == null || orderMonthly.getLoadPunctualityRate().compareTo(zero) == 0)
                        && (orderMonthly.getMileage() == null || orderMonthly.getMileage().compareTo(zero) == 0)
                        && orderMonthly.getReceiveWaybillQuantity().equals(0) && orderMonthly.getRefuseWaybillQuantity().equals(0)
                        && (orderMonthly.getTotalCost() == null || orderMonthly.getTotalCost().compareTo(zero) == 0)
                        && (orderMonthly.getUnloadPunctualityRate() == null || orderMonthly.getUnloadPunctualityRate().compareTo(zero) == 0);
                if (isNull){
                    iterator.remove();
                }
            }
        }
    }
}

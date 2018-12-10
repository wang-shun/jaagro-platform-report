package com.jaagro.report.web.controller;

import com.jaagro.report.api.dto.WaybillFeeReportDto;
import com.jaagro.report.api.service.WaybillFeeReportTaskService;
import com.jaagro.utils.BaseResponse;
import com.jaagro.utils.ResponseStatusCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :@Gao.
 */
@RestController
@Slf4j
@Api(description = "运单费用报表生成", produces = MediaType.APPLICATION_JSON_VALUE)
public class WaybillFeeReportController {
    @Autowired
    private WaybillFeeReportTaskService waybillFeeReportTaskService;

    @ApiOperation(value = "生成运单费用日报表")
    @PostMapping("/createWaybillFeeDailyReport/{day}")
    public BaseResponse createWaybillFeeDailyReport(@PathVariable String day) {
        waybillFeeReportTaskService.createDailyReport(day);
        return BaseResponse.successInstance(ResponseStatusCode.OPERATION_SUCCESS);
    }

    @ApiOperation(value = "生成运单费用月报表")
    @PostMapping("/createWaybillFeeMonthReport/{month}")
    public BaseResponse createWaybillFeeMonthReport(@PathVariable String month) {
        waybillFeeReportTaskService.createMonthlyReport(month);
        return BaseResponse.successInstance(ResponseStatusCode.OPERATION_SUCCESS);
    }

    @ApiOperation(value = "运单费用日报表列表")
    @PostMapping("/listWaybillFeeDailyReport")
    public BaseResponse listWaybillFeeDailyReport(@RequestBody WaybillFeeReportDto dto) {
        return BaseResponse.successInstance(waybillFeeReportTaskService.listWaybillFeeDailyReport(dto));
    }

    @ApiOperation(value = "运单费用月报表列表")
    @PostMapping("/listWaybillFeeMonthReport")
    public BaseResponse listWaybillFeeMonthReport(@RequestBody WaybillFeeReportDto dto) {
        return BaseResponse.successInstance(waybillFeeReportTaskService.listWaybillFeeMonthReport(dto));
    }
}

package com.jaagro.report.web.controller;

import com.jaagro.report.api.dto.ListCustomerReportCriteriaDto;
import com.jaagro.report.api.dto.WaybillFeeReportDto;
import com.jaagro.report.api.entity.CustomerOrderDaily;
import com.jaagro.report.api.entity.CustomerOrderMonthly;
import com.jaagro.report.api.service.CustomerReportTaskService;
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

import java.util.List;


/**
 * @author baiyiran
 */
@RestController
@Slf4j
@Api(description = "客户报表生成", produces = MediaType.APPLICATION_JSON_VALUE)
public class CustomerReportController {
    @Autowired
    private CustomerReportTaskService customerReportTaskService;

    @ApiOperation(value = "生成客户日报表")
    @PostMapping("/createCustomerDailyReport/{day}")
    public BaseResponse<String> createWaybillFeeDailyReport(@PathVariable String day) {
        customerReportTaskService.createDailyReport(day);
        return BaseResponse.successInstance(ResponseStatusCode.OPERATION_SUCCESS.getMsg());
    }

    @ApiOperation(value = "生成客户月报表")
    @PostMapping("/createCustomerMonthReport/{month}")
    public BaseResponse<String> createWaybillFeeMonthReport(@PathVariable String month) {
        customerReportTaskService.createMonthlyReport(month);
        return BaseResponse.successInstance(ResponseStatusCode.OPERATION_SUCCESS.getMsg());
    }

    @ApiOperation(value = "客户日报表列表")
    @PostMapping("/listCustomerDailyReport")
    public BaseResponse<List<CustomerOrderDaily>> listWaybillFeeDailyReport(@RequestBody ListCustomerReportCriteriaDto dto) {
        return BaseResponse.successInstance(customerReportTaskService.listCustomerDailyReport(dto));
    }

    @ApiOperation(value = "客户月报表列表")
    @PostMapping("/listCustomerMonthReport")
    public BaseResponse<List<CustomerOrderMonthly>> listWaybillFeeMonthReport(@RequestBody ListCustomerReportCriteriaDto dto) {
        return BaseResponse.successInstance(customerReportTaskService.listCustomerMonthReport(dto));
    }
}

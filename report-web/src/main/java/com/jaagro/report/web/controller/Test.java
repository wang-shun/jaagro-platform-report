package com.jaagro.report.web.controller;

import com.jaagro.report.api.service.WaybillFeeReportTaskService;
import com.jaagro.report.biz.mapper.report.UserLoginMapperExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tony
 */
@RestController
public class Test {

    @Autowired
    private UserLoginMapperExt userLoginMapper;
    @Autowired
    private WaybillFeeReportTaskService waybillFeeReportTaskService;

    @GetMapping("/test")
    public void test() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }
    @GetMapping("/test1")
    public void test1() {
      waybillFeeReportTaskService.createDailyReport(null);
    }
}

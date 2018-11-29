package com.jaagro.report.web.controller;

import com.jaagro.report.biz.config.RabbitMqConfig;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author :gavin
 * @Date :20181128
 */
@RestController
public class OrderReportController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     *
     * @param
     */
    @ApiOperation("司机定位数据采集")
    @PostMapping("/pushOderReportDataIntoMQ")
    public void insertBatchMq(@RequestBody String date) {
    }
}

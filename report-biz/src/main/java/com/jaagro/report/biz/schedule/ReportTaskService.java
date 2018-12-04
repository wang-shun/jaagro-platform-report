package com.jaagro.report.biz.schedule;

import com.jaagro.report.api.constant.ReportDateType;
import com.jaagro.report.api.constant.ReportTaskType;
import com.jaagro.report.api.dto.ReportTaskDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static com.jaagro.report.biz.config.RabbitMqConfig.TOPIC_EXCHANGE;

/**
 * 报表定时将报表任务放入RabbitMq队列
 *
 * @author yj
 * @since 2018/11/27
 */
@Service
@Slf4j
public class ReportTaskService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     * 将司机日报表任务塞入mq队列
     */
    @Scheduled(cron = "0 0 1 * * ?")
    public void driverDailyReportTaskToQueue() {
        log.info("S-driverDailyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.DRIVER, ReportDateType.DAILY);
        putToQueue(new ReportTaskDto(ReportTaskType.DRIVER, ReportDateType.DAILY));
    }

    /**
     * 将司机月报表任务塞入mq队列
     */
    @Scheduled(cron = "0 30 1 * * ?")
    public void driverMonthlyReportTaskToQueue() {
        log.info("S-driverMonthlyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.DRIVER, ReportDateType.MONTHLY);
        putToQueue(new ReportTaskDto(ReportTaskType.DRIVER, ReportDateType.MONTHLY));
    }

    /**
     * 将客户日报表任务塞入mq队列
     */
    @Scheduled(cron = "0 0 2 * * ?")
    public void customerDailyReportTaskToQueue() {
        log.info("S-customerDailyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.CUSTOMER, ReportDateType.DAILY);
        putToQueue(new ReportTaskDto(ReportTaskType.CUSTOMER, ReportDateType.DAILY));
    }

    /**
     * 将客户月报表任务塞入mq队列
     */
    @Scheduled(cron = "0 30 2 * * ?")
    public void customerMonthlyReportTaskToQueue() {
        log.info("S-customerMonthlyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.CUSTOMER, ReportDateType.MONTHLY);
        putToQueue(new ReportTaskDto(ReportTaskType.CUSTOMER, ReportDateType.MONTHLY));
    }

    /**
     * 将订单数据日报表任务塞入mq队列
     */
    @Scheduled(cron = "0 0 3 * * ?")
    public void deptOrderDailyReportTaskToQueue() {
        log.info("S-deptOrderDailyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.ORDER, ReportDateType.DAILY);
        putToQueue(new ReportTaskDto(ReportTaskType.ORDER, ReportDateType.DAILY));
    }

    /**
     * 将订单数据月日报表任务塞入mq队列
     */

    @Scheduled(cron = "0 30 3 * * ?")
    public void deptOrderMonthlyReportTaskToQueue() {
        log.info("S-deptOrderMonthlyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.ORDER, ReportDateType.MONTHLY);
        putToQueue(new ReportTaskDto(ReportTaskType.ORDER, ReportDateType.MONTHLY));
    }

    /**
     * 将运单费用日报表任务塞入mq队列
     */
    @Scheduled(cron = "0 0 4 * * ?")
    public void deptWaybillFeeDailyReportTaskToQueue() {
        log.info("S-deptWaybillFeeDailyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.WAYBILL_FEE, ReportDateType.DAILY);
        putToQueue(new ReportTaskDto(ReportTaskType.WAYBILL_FEE, ReportDateType.DAILY));
    }

    /**
     * 将运单费用月报表任务塞入mq队列
     */
    @Scheduled(cron = "0 30 4 * * ?")
    public void deptWaybillFeeMonthlyReportTaskToQueue() {
        log.info("S-deptWaybillFeeMonthlyReportTaskToQueue-[reportTaskType={},reportDateType={}]", ReportTaskType.WAYBILL_FEE, ReportDateType.MONTHLY);
        putToQueue(new ReportTaskDto(ReportTaskType.WAYBILL_FEE, ReportDateType.MONTHLY));
    }

    private void putToQueue(ReportTaskDto reportTaskDto) {
        amqpTemplate.convertAndSend(TOPIC_EXCHANGE, "report.send", reportTaskDto);
    }

}

package com.jaagro.report.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author tony
 */
@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients(basePackages = {"com.jaagro.report.biz"})
@SpringBootApplication(scanBasePackages = {"com.jaagro.report"})
@EnableTransactionManagement
@EnableScheduling
@EnableAsync
@EnableCaching
public class ReportApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReportApplication.class, args);
    }
}
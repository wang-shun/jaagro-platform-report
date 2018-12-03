package com.jaagro.report.biz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 线程池配置
 * @author yj
 * @since 2018/12/2
 */
@Configuration
public class ThreadPoolConfig {
    /**
     * 线程池维护线程的最少数量=内核数+1,如果运行的线程少于corePoolSize，
     * 则创建新线程来执行新任务，即使线程池中的其他线程是空闲的
     */
    private int corePoolSize = 3;
    /**
     * 最大线程数，可允许创建的线程数，corePoolSize和maximumPoolSize设置的边界自动调整池大小
     */
    private int maxPoolSize = 10;
    /**
     * 缓存队列长度 corePoolSize <运行的线程数< maximumPoolSize:仅当队列满时才创建新线程
     */
    private int queueCapacity = 5;
    /**
     * 允许的空闲时间 
     */
    private int keepAlive = 60;
    @Bean
    public Executor reportExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        executor.setQueueCapacity(queueCapacity);
        executor.setThreadNamePrefix("reportExecutor-");
        //rejection-policy：当pool已经达到max size的时候，它直接在 execute 方法的调用线程中运行被拒绝的任务；如果执行程序已关闭，则会丢弃该任务
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.setKeepAliveSeconds(keepAlive);
        executor.initialize();
        return executor;
    }
}

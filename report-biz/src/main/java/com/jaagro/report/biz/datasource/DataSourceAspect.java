package com.jaagro.report.biz.datasource;

import com.jaagro.report.api.annotation.DataSource;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author tony
 */
@Aspect
@Order(5)
@Slf4j
@Component
public class DataSourceAspect {

    @Before("execution(* com.jaagro.report.biz.service..*.*(..))")
    public void before(JoinPoint point) {
        Object target = point.getTarget();
        String method = point.getSignature().getName();
        System.out.println("aop apply to " + method);
        Class clazz = target.getClass();
        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())
                .getMethod().getParameterTypes();

        try {
            Method m = clazz.getMethod(method, parameterTypes);
            if (m != null && m.isAnnotationPresent(DataSource.class)) {
                DataSource data = m.getAnnotation(DataSource.class);
                DataSourceHolder.setDataSource(data.value());
                log.info("Current datasource is " + data.value());
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

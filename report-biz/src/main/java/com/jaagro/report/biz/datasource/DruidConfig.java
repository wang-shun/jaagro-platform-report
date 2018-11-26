package com.jaagro.report.biz.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.jaagro.report.biz.config.cat.CatMybatisPlugin;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author tony
 */
@Configuration
public class DruidConfig {

    @Bean(name = "primaryDataSource")
    @Qualifier("primaryDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSource primaryDataSource() {
        return new DruidDataSource();
    }

    @Bean(name = "tmsDataSource")
    @Qualifier("tmsDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.tms")
    public DataSource tmsDataSource() {
        return new DruidDataSource();
    }

    @Bean
    public DynamicDataSource dataSource() {
        DynamicDataSource dynamicDataSource = new DynamicDataSource();
        Map<Object, Object> targetDataSources = new LinkedHashMap<>();
        targetDataSources.put("primary", primaryDataSource());
        targetDataSources.put("tms", tmsDataSource());
        dynamicDataSource.setTargetDataSources(targetDataSources);
        return dynamicDataSource;
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DynamicDataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //dataSource
        sqlSessionFactoryBean.setDataSource(dataSource);
        //mybatisPlugin
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new CatMybatisPlugin()});
        //mapperLocation
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mapper/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResources("classpath*:/mybatis/mybatis_config.xml")[0]);
        return sqlSessionFactoryBean;
    }

    @Bean
    public ServletRegistrationBean statViewServlet() {

        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String, String> initParam = new HashMap<>(16);

        initParam.put("loginUsername", "admin");
        initParam.put("loginPassword", "123");
        initParam.put("allow", "");

        bean.setInitParameters(initParam);
        return bean;
    }

    @Bean
    public FilterRegistrationBean webStatFilter() {

        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String, String> initParam = new HashMap<>();
        // 忽略资源
        initParam.put("exclusions", "*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid/*");
        bean.setInitParameters(initParam);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}

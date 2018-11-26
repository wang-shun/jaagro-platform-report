package com.jaagro.report.biz.config.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import com.jaagro.report.biz.config.cat.CatMybatisPlugin;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * @author tony
 */
@Configuration
@MapperScan(basePackages = "com.jaagro.report.biz.mapper.report", sqlSessionTemplateRef = "primarySqlSessionTemplate")
public class PrimaryDataSourceConfig {

    @Bean(name = "primaryDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    @Primary
    public DataSource primaryDataSource(){
        return new DruidDataSource();
    }

    @Bean(name = "primarySqlSessionFactoryBean")
    @Primary
    public SqlSessionFactoryBean primarySqlSessionFactoryBean(DataSource dataSource) throws IOException {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        //dataSource
        sqlSessionFactoryBean.setDataSource(dataSource);
        //mybatisPlugin
        sqlSessionFactoryBean.setPlugins(new Interceptor[]{new CatMybatisPlugin()});
        //mapperLocation
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath*:/mapper/report/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(resolver.getResources("classpath*:/mybatis/mybatis_config.xml")[0]);
        return sqlSessionFactoryBean;
    }

    @Bean(name = "primarySqlSessionTemplate")
    @Primary
    public SqlSessionTemplate setSqlSessionTemplate(@Qualifier("primarySqlSessionFactoryBean") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}

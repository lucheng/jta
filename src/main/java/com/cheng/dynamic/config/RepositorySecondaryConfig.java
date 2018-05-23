package com.cheng.dynamic.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
@MapperScan(basePackages = "com.cheng.dynamic.repository.secondary", sqlSessionTemplateRef  = "sqlSessionTemplateSecondary")
public class RepositorySecondaryConfig {
	@Autowired
    private Environment env;
    @Autowired 
    @Qualifier("secondaryDS")
    private DataSource secondaryDS;

    @Bean(name="sqlSessionFactorySecondary")
    public SqlSessionFactory sqlSessionFactorySecondary() throws Exception{
        SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
        fb.setDataSource(secondaryDS);
        fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage2"));//指定基包
        fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations2")));//指定xml文件位置
        return fb.getObject();
    }
    
    @Bean(name = "sqlSessionTemplateSecondary")
    public SqlSessionTemplate sqlSessionTemplateSecondary(@Qualifier("sqlSessionFactorySecondary") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);
    }
}
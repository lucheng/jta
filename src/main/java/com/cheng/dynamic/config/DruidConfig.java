package com.cheng.dynamic.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.filter.stat.StatFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.wall.WallConfig;
import com.alibaba.druid.wall.WallFilter;

@Configuration
public class DruidConfig {
	 @Bean
	    public ServletRegistrationBean<StatViewServlet> druidServlet() {
	        ServletRegistrationBean<StatViewServlet> servletRegistrationBean = new ServletRegistrationBean<>(new StatViewServlet(), "/druid/*");

	        //控制台管理用户，加入下面2行 进入druid后台就需要登录
	        //servletRegistrationBean.addInitParameter("loginUsername", "admin");
	        //servletRegistrationBean.addInitParameter("loginPassword", "admin");
	        return servletRegistrationBean;
	    }

	    @Bean
	    public FilterRegistrationBean<WebStatFilter> filterRegistrationBean() {
	        FilterRegistrationBean<WebStatFilter> filterRegistrationBean = new FilterRegistrationBean<>();
	        filterRegistrationBean.setFilter(new WebStatFilter());
	        filterRegistrationBean.addUrlPatterns("/*");
	        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
	        filterRegistrationBean.addInitParameter("profileEnable", "true");
	        return filterRegistrationBean;
	    }

	    @Bean
	    public StatFilter statFilter(){
	        StatFilter statFilter = new StatFilter();
	        statFilter.setLogSlowSql(true); //slowSqlMillis用来配置SQL慢的标准，执行时间超过slowSqlMillis的就是慢。
	        statFilter.setMergeSql(true); //SQL合并配置
	        statFilter.setSlowSqlMillis(1000);//slowSqlMillis的缺省值为3000，也就是3秒。
	        return statFilter;
	    }

	    @Bean
	    public WallFilter wallFilter(){
	        WallFilter wallFilter = new WallFilter();
	        //允许执行多条SQL
	        WallConfig config = new WallConfig();
	        config.setMultiStatementAllow(true);
	        wallFilter.setConfig(config);
	        return wallFilter;
	    }
}

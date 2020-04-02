package com.qq.tx;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DelegatingDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@EnableTransactionManagement
@ComponentScan("com.qq.tx")
@Configuration
public class TxConfig {

	// 数据源
	@Bean
	public DataSource dataSource() throws Exception {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setUser("root");
		dataSource.setPassword("123456");
		dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/gx?useUnicode=true&characterEncoding=utf-8&useSSL=false");
	
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() throws Exception {
		//Spring对@Configuration类会特殊处理；给容器中加组件的方法，多次调用都只是从容器中找组件
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
		return jdbcTemplate;
	}
	
	//加入事务管理组件
	@Bean
	public PlatformTransactionManager transactionManager() throws Exception {
		return new DataSourceTransactionManager(dataSource());
	}
	
}

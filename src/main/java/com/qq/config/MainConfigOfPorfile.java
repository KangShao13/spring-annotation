package com.qq.config;

import java.beans.PropertyVetoException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * Profile：
 * 		Spring为我们提供的可以根据当前环境，动态的激活和切换一系列组件的功能；
 * 
 * 开发环境、测试环境、生产环境；
 * 数据源：(/A)(/B)(/C)；
 * 
 * 
 * @Profile：指定组件在哪个环境的情况下才能被注册到容器中，不指定，任何环境下都能注册这个组件
 * 
 * 1）、加了环境标识的bean，只有这个环境被激活的时候才能注册到容器中。默认是default环境
 * 2）、写在配置类上，只有是指定的环境的时候，整个配置类里面的所有配置才能开始生效
 * 3）、没有标注环境标识的bean在，任何环境下都是加载的；
 */


@Profile("test")
@PropertySource("classpath:/datasouse.properties")
@CacheConfig
public class MainConfigOfPorfile {
	
	@Value("${db.user}")
	private String user;
	
	@Value("${db.driverClass}")
	private String driverClass;
	
	
	@Bean("datasource01")
	public DataSource dataSource01(@Value("${db.password}")String password) throws PropertyVetoException {
		ComboPooledDataSource DataSource = new ComboPooledDataSource();
		DataSource.setUser(user);
		DataSource.setPassword(password);
		DataSource.setDriverClass(driverClass);
		DataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cloudDB01");
		return DataSource;
	}
	
//	@Profile("dev")
	@Bean("datasource02")
	public DataSource dataSource02(@Value("${db.password}")String password) throws PropertyVetoException {
		ComboPooledDataSource DataSource = new ComboPooledDataSource();
		DataSource.setUser(user);
		DataSource.setPassword(password);
		DataSource.setDriverClass(driverClass);
		DataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cloudDB02");
		return DataSource;
	}
	
//	@Profile("pro")
	@Bean("datasource03")
	public DataSource dataSource03(@Value("${db.password}")String password) throws PropertyVetoException {
		ComboPooledDataSource DataSource = new ComboPooledDataSource();
		DataSource.setUser(user);
		DataSource.setPassword(password);
		DataSource.setDriverClass(driverClass);
		DataSource.setJdbcUrl("jdbc:mysql://localhost:3306/cloudDB03");
		return DataSource;
	}

}

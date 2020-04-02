package com.qq.config;

import java.nio.channels.Selector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.qq.bean.Person;
import com.qq.outclass.AllImport;
import com.qq.outclass.Green;
import com.qq.outclass.MyImport;
import com.qq.outclass.Red;



@Configuration
public class MainConfig4 {

	
	@Bean
	public FactoryBean coloFactoryBean() {
		return new FactoryBean();
	}
}

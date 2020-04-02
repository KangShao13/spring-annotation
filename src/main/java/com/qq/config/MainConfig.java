package com.qq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.qq.bean.Person;

//@ComponentScan(value = "com.qq",excludeFilters = {
//		@Filter(type = FilterType.ANNOTATION,classes = {
//				Controller.class
//		})
//})

//@ComponentScan(value = "com.qq",includeFilters = {
//		@Filter(type = FilterType.ANNOTATION,classes = Controller.class)
//},useDefaultFilters = false)

@ComponentScan(value = "com.qq")
@Configuration
@ComponentScans(value = {
		@ComponentScan(value = "com.qq", includeFilters = {
				@Filter(type = FilterType.ANNOTATION, classes = Controller.class) }, useDefaultFilters = false),
		@ComponentScan(value = "com.qq", excludeFilters = {
				@Filter(type = FilterType.ANNOTATION, classes = { Controller.class }) }) })
public class MainConfig {

	@Bean
	public Person person() {
		return new Person(20, "lisi","new");
	}
}

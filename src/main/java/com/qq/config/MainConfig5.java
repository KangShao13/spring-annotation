package com.qq.config;

import java.nio.channels.Selector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.qq.bean.Car;
import com.qq.bean.Person;
import com.qq.outclass.AllImport;
import com.qq.outclass.Green;
import com.qq.outclass.MyImport;
import com.qq.outclass.Red;

@Configuration
public class MainConfig5 {

	// bean创建：
//1.单实例：在容器启动就自动创建bean对象
//2.多实例：在每次获取的时候创建bean对象
//bean的初始化：
//对象创建完成，并赋值好，调用初始化方法
//bean的销毁：
//1.单实例：容器关闭之前执行销毁方法
//2.多实例：容器关闭不会自动调用销毁方法，需要自己手动调用销毁方法

	@Scope("prototype")
	@Bean(initMethod = "init", destroyMethod = "destroy" )
	public Car Car() {
		return new Car();
	}

}

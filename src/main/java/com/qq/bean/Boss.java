package com.qq.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boss {

	private Car car;

	public Car getCar() {
		return car;
	}

	
	//当容器创建该对象的时候就会调用这个注解标注的方法，完成自动装配
	public void setCar( @Autowired Car car) {
		this.car = car;
	}

	
	public Boss(@Autowired Car car) {
		super();
		this.car = car;
	}
	
	
	
}

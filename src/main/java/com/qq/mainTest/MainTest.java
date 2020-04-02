package com.qq.mainTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qq.bean.Person;
import com.qq.config.MainConfig;

public class MainTest {
	
	public static void main(String[] args) {
	 
//		ApplicationContext applicationContextxml = new ClassPathXmlApplicationContext("applicationContext.xml");

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
		Person bean = applicationContext.getBean(Person.class);
		System.out.println(bean);
	}

}

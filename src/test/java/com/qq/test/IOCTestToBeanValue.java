package com.qq.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.qq.bean.Person;
import com.qq.config.MainConfigToBeanValue;


public class IOCTestToBeanValue {

	@SuppressWarnings("resource")
	@Test
	public void tset01() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(MainConfigToBeanValue.class);
		
		String[] beanname= ApplicationContext.getBeanDefinitionNames();
		for(String name:beanname) {
			System.out.println(name);
		}
		System.out.println("=========");
		Person person= (Person) ApplicationContext.getBean("person");
		System.out.println(person);
		
		System.out.println("=========");
		ConfigurableEnvironment environment = ApplicationContext.getEnvironment();
		String property = environment.getProperty("person.nikename");
		System.out.println(property);
	}
	
}

package com.qq.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.qq.config.Autowiredconfig;
import com.qq.service.BookService;


public class IOCTestAutowired {

	@SuppressWarnings("resource")
	@Test
	public void tset01() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(Autowiredconfig.class);
		
		String[] beanname= ApplicationContext.getBeanDefinitionNames();
		for(String name:beanname) {
			System.out.println(name);
		}
		System.out.println("=========");
		
		BookService bookService = (BookService) ApplicationContext.getBean("bookService");
		System.out.println(bookService);
		Object bean = ApplicationContext.getBean("bean");
		
	}
	
}

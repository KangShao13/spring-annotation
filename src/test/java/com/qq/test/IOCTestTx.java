package com.qq.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qq.tx.TxConfig;
import com.qq.tx.UserService;

public class IOCTestTx {

	@Test
	public void test01(){
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);
	
		userService.insteruser();
		
		applicationContext.close();
	}
	
	
}

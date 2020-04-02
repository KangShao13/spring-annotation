package com.qq.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.qq.config.MainConfigOfPorfile;


public class IOCTestPorfile {

	@SuppressWarnings("resource")
	@Test
	public void tset01() {
		//1.使用无参构造器创建 ApplicationContext 容器
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext();
		//2.给容器设置需要激活的环境
		ApplicationContext.getEnvironment().setActiveProfiles("test");
		//3.注册配置类
		ApplicationContext.register(MainConfigOfPorfile.class);
		//4.刷新容器
		ApplicationContext.refresh();
		String[] beanname= ApplicationContext.getBeanNamesForType(DataSource.class);
		for(String name:beanname) {
			System.out.println("=========");
			System.out.println(name);
		}
		
		
	}
	
}

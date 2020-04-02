package com.qq.test;

import org.junit.Test;
import org.omg.CORBA.Environment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import com.qq.bean.Car;
import com.qq.config.FactoryBean;
import com.qq.config.MainConfig;
import com.qq.config.MainConfig2;
import com.qq.config.MainConfig3;
import com.qq.config.MainConfig4;
import com.qq.config.MainConfig5;
import com.qq.config.MainConfig6;
import com.qq.outclass.Color;

public class IOCTest {

	@SuppressWarnings("resource")
	@Test
	public void tset01() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(MainConfig2.class);
		ConfigurableEnvironment environment=  ApplicationContext.getEnvironment();
		String environmentname=environment.getProperty("os.name");
		System.out.println(environmentname);
		String[] beanname= ApplicationContext.getBeanDefinitionNames();
		for(String name:beanname) {
			System.out.println(name);
		}
		
	}
	
	@Test
	public void test02() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(MainConfig3.class);
		String[] beanname= ApplicationContext.getBeanDefinitionNames();
		for(String name:beanname) {
			System.out.println(name);
		}
	}
	@Test
	public void test03() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(MainConfig4.class);
		//得到工厂的bean，但是返回的是 class com.qq.outclass.Color 的bean，因为工厂中的下面的方法
//		@Override
//		public Color getObject() throws Exception {
//			// TODO Auto-generated method stub
//			return new Color();
//		}
		Object colorbean = ApplicationContext.getBean("coloFactoryBean");
		System.out.println(colorbean.getClass());
		//得到工厂本身的类 返回的是  class com.qq.config.FactoryBean
		Object factorybean = ApplicationContext.getBean("&coloFactoryBean");
		System.out.println(factorybean.getClass());
		
		String[] beanname= ApplicationContext.getBeanDefinitionNames();
		for(String name:beanname) {
			System.out.println(name);
		}
	}
	
	@Test
	public void tset05() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(MainConfig5.class);
		System.out.println("容器创建");
		Car car1= (Car) ApplicationContext.getBean("Car");
		//多实例时需要手动调用销毁方法
		car1.destroy();
		//多实例中容器关闭不会调用销毁方法
		ApplicationContext.close();
		
	}
	@Test
	public void tset06() {
		AnnotationConfigApplicationContext ApplicationContext=new AnnotationConfigApplicationContext(MainConfig6.class);
		System.out.println("容器创建");

		ApplicationContext.close();
		
	}
}

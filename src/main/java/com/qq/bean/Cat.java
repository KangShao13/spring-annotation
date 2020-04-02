package com.qq.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cat implements InitializingBean,DisposableBean {
	

	public Cat() {
		System.out.println("创建cat的---bean实例--- Cat()");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("销毁cat的--bean实例----destroy()");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("等赋值完成后调用的方法---afterPropertiesSet(");
	}
	
	

}

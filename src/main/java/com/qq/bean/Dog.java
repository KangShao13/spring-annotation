package com.qq.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Dog {

	public Dog() {
		System.out.println("对象已经创建，并赋值");
	}

	@PostConstruct
	public void PostConstructMethod() {
		System.out.println("dog.......PostConstruct....");
	}
	
	@PreDestroy
	public void PreDestroyMethod() {
		System.out.println("dog....PreDestroy.....");
	}
}

package com.qq.bean;

public class Car {

	public Car() {
		System.out.println("构造函数");
		
	}

	public void init() {
		System.out.println("init---初始化");
	}
	public void destroy() {
		System.out.println("destroy----销毁");
	}
	
}

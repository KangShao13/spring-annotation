package com.qq.bean;

import org.springframework.beans.factory.annotation.Value;

public class Person {

	//使用@value赋值
	//1.基本数值--@Value("北京")
	//2.可以写SqEl表达式--@Value("#{20-2}")
	//3.可以写${},取出配置文件中的值--@Value("${person.nikename}")
	//  该方式需要单独写配置文件（配置文件会加到运行环境中）
	@Value("#{20-2}")
	private Integer age;
	
	@Value("北京")
	private String name;
	
	@Value("${person.nikename}")
	private String nikename;
	

	public String getNikename() {
		return nikename;
	}

	public void setNikename(String nikename) {
		this.nikename = nikename;
	}

	public Integer getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(Integer age, String name, String nikename) {
		super();
		this.age = age;
		this.name = name;
		this.nikename = nikename;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", nikename=" + nikename + "]";
	}

	

	
}

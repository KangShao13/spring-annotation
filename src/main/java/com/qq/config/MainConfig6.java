package com.qq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.qq.bean.Cat;
import com.qq.bean.Dog;

@ComponentScan("com.qq.bean")
@Configuration
public class MainConfig6 {

//	@Bean
//	public Cat Cat() {
//		return new Cat();
//	}
	
	@Bean
	public Dog Dog() {
		return new Dog();
	}

}

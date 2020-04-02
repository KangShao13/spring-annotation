package com.qq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.qq.bean.Person;
import com.qq.conditional.IsApple;
import com.qq.conditional.IsWin;


@Configuration
public class MainConfig2 {

//	@Scope("prototype")  //多实例   选择多实例，在创建ioc容器时，并不会直接创建bean实例，
									//而是在需要使用该bean时，创建一个新的对象（new的模式）
	@Scope("singleton")  //单实例（默认的） 选择单实例，在创建ioc容器完成，
									//就会创建一个bean，以供后面需要时候获取。（get的模式）
//	@Scope("request")    //每一次请求，创建一个实例（web）
//	@Scope("session")    //每一个session，创建一个实例（web）
	@Lazy
	@Bean
	public Person person() {
		return new Person(23, "李龙兔","new");
	}
	
	@Conditional(IsApple.class)
	@Bean("allpe")
	public Person person2() {
		return new Person(100, "苹果","new");
	}
	
	@Conditional(IsWin.class)
	@Bean("win")
	public Person person3() {
		return new Person(200, "win","new");
	}
}

package com.qq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.qq.bean.Cat;
import com.qq.bean.Dog;
import com.qq.bean.Person;

@PropertySource(value= {"classpath:person.properties"})
@Configuration
public class MainConfigToBeanValue {

	@Bean
	public Person person() {
		return new Person();
	}

}

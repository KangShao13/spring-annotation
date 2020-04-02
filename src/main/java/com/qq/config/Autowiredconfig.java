package com.qq.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import com.qq.dao.BookDao;


@ComponentScan({ "com.qq.service", "com.qq.dao" })
@Configuration
public class Autowiredconfig {

	//向容器中新加一个id为bookDao2，类型为BookDao的组件
	@Primary
	@Bean("bookDao2")
	public BookDao bookDao() {

		BookDao bookDao = new BookDao();
		bookDao.setLable("2");
		return bookDao;
	}
}

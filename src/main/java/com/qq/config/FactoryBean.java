package com.qq.config;

import java.nio.channels.Selector;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.ComponentScans;

import com.qq.bean.Person;
import com.qq.outclass.AllImport;
import com.qq.outclass.Color;
import com.qq.outclass.Green;
import com.qq.outclass.MyImport;
import com.qq.outclass.Red;



@Configuration
public class FactoryBean implements org.springframework.beans.factory.FactoryBean<Color> {

	//创建一个对象，并返回
	@Override
	public Color getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Color();
	}

	//返回对象的类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Color.class;
	}

	//是否是单例的，
	//	true：是单例的
	//	false：不是单例的，每次获取都创建一个新的对象
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

	
}

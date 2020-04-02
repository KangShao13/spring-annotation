package com.qq.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class MybeanPostProcessBefore implements BeanPostProcessor{

	//在初始化之前工作（init方法前）
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" postProcessBeforeInitialization"+"======"+beanName+"-----"+bean);
		return bean;
	}

	//在初始化之后工作（init方法后）
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println(" postProcessAfterInitialization"+"======"+beanName+"-----"+bean);
		return bean;
	}

}

package com.qq.outclass;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImport implements  ImportBeanDefinitionRegistrar{

	//AnnotationMetadata importingClassMetadata:当前类的注解信息
	//BeanDefinitionRegistry registry:注册类
									//把所需要加入到容器中的bean调用
									//BeanDefinitionRegistry.
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		//判断容器中是否存在一个bean，id是com.qq.outclass.Red
		boolean containsBeanDefinition = registry.containsBeanDefinition("com.qq.outclass.Red");
		//判断容器中是否存在一个bean，id是com.qq.outclass.Green
		boolean containsBeanDefinition2 = registry.containsBeanDefinition("com.qq.outclass.Green");
		//如果两个都满足，则在去注册一个彩虹类
		if(containsBeanDefinition && containsBeanDefinition2) {
			//得到彩虹类的信息
			RootBeanDefinition beanDefinition=new RootBeanDefinition(Rainbow.class);
			//向容器注册一个bean，bean的id是自己设置的-----rainbow
			registry.registerBeanDefinition("rainbow", beanDefinition);
		}
		
		
		
		
	}

}

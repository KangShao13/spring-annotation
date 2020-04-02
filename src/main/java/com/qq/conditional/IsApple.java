package com.qq.conditional;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IsApple implements Condition{
	//ConditionContext context  判断条件可以使用的上下文
	//AnnotatedTypeMetadata metadata   注释信息
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO 这里做判断返回，系统是否为苹果系统
		//1.获取到beanfactory
		ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
		//2.获取类加载器
		ClassLoader classLoader = context.getClassLoader();
		//3.获取运行环境，信息
		Environment environment = context.getEnvironment();
		//4.获取类注册器
		BeanDefinitionRegistry registry = context.getRegistry();
		
		 boolean containsBeanDefinition = registry.containsBeanDefinition("person");
		
		//判断运行的系统是不是苹果
		String property = environment.getProperty("os.name");
		if(property.contains("OS")) {
			return true;
		}
		return false;
	}
}

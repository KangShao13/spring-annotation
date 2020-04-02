package com.qq.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class IsWin implements Condition {

	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO 判断是不是win系统
		
		Environment environment = context.getEnvironment();
		String property = environment.getProperty("os.name");
		if(property.contains("win")) {
			return true;
		}
		
		return false;
	}

	
}

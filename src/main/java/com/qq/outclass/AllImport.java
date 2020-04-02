package com.qq.outclass;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AllImport implements ImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		return new String[] {"com.qq.outclass.Yellow","com.qq.outclass.Blue"};
	}

}

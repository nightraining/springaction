package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.aop.AopConfig;
import com.thit.aop.DemoAnnotationService;
import com.thit.aop.DemoMethodService;

public class AopTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		DemoAnnotationService demoAnnotationService = 
				ctx.getBean(DemoAnnotationService.class);
		DemoMethodService demoMethodService = 
				ctx.getBean(DemoMethodService.class);
		demoAnnotationService.add();
		demoMethodService.add();
		ctx.close();
		
	}
}

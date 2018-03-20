package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.aware.AwareConfig;
import com.thit.aware.AwareService;

public class AwareTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AwareConfig.class);
		AwareService service = context.getBean(AwareService.class);
		service.outputResult();
		context.close();
		
	}
}

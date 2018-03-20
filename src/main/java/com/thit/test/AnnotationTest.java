package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.annotation.DemoConfig;
import com.thit.annotation.DemoService;

public class AnnotationTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoService service = context.getBean(DemoService.class);
		service.print();
		context.close();
	}
}

package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.impt.DeConfig;
import com.thit.impt.DemoService;
import com.thit.impt.Enums;
import com.thit.impt.SelectService;

public class ImptTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DeConfig.class);
		DemoService service = context.getBean(DemoService.class);
		SelectService selectService = context.getBean(SelectService.class);
		selectService.dosomething(Enums.spring);
		service.println();
		context.close();
	}
}

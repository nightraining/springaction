package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.conditional.ConditionConfig;
import com.thit.conditional.ListService;

public class ConditionTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConditionConfig.class);
		ListService list = context.getBean(ListService.class);
		System.out.println(context.getEnvironment().getProperty("os.name")+
				"系统下的列表命令为："+list.showListCmd());
		context.close();
	}
}

package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.el.ElConfig;

public class ElTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ElConfig.class);
		ElConfig config = ctx.getBean(ElConfig.class);
		config.outputResource();
		ctx.close();
	}
}

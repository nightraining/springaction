package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.prepost.BeanWayService;
import com.thit.prepost.JSR250WayService;
import com.thit.prepost.PrePostConfig;

/**
 * Bean的初始化和销毁方式
 * (1)Java配置方式：使用Bean的initMethod和destroyMethod。
 * (2)注解方式：利用JSR-250的@PostConstruct和@PreDestroy
 * @author 李争辉
 *
 */
public class PrePostTest {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(PrePostConfig.class);
		System.out.println("Bean使用之前");
		BeanWayService beanWayService = ctx.getBean(BeanWayService.class);
		
		JSR250WayService jsr250WayService = ctx.getBean(JSR250WayService.class);
		System.out.println("Bean使用之后");
		ctx.close();
	}
}

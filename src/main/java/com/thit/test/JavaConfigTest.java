package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.javaconfig.JavaConfig;
import com.thit.javaconfig.UseFunctionService;

/**
 * Java配置是通过@Configuration和@Bean来实现的。
 * @Configuration 声明当前类是一个配置类，相当于一个Spring配置的XML文件。
 * @Bean注解在方法上，声明当前方法的返回值是一个Bean，Bean的名称是方法名。
 * 
 * @author xiangyang
 */
public class JavaConfigTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(JavaConfig.class);
		UseFunctionService useFunctionService = 
				ctx.getBean(UseFunctionService.class);
		
		System.out.println(useFunctionService.sayHello("java config"));
		ctx.close();
	}
}

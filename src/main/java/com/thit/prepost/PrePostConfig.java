package com.thit.prepost;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 * initMethod与destroyMethod指定BeanWayService类的init和destory方法
 * 在构造方法之后，Bean销毁之前执行。
 * @author xiangyang
 *
 */
@Configuration
@ComponentScan("com.thit.prepost")
public class PrePostConfig {

	@Bean(initMethod="init",destroyMethod="destory")
	BeanWayService beanWayService(){
		return new BeanWayService();
	}
	
	@Bean
	JSR250WayService jsr250WayService(){
		return new JSR250WayService();
	}
}

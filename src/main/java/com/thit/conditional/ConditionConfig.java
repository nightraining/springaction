package com.thit.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.thit.conditional")
public class ConditionConfig {

	@Bean
	@Conditional(WinCondition.class)
	public ListService winListService(){
		return new WinListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)
	public ListService linuxListService(){
		return new LinuxListService();
	}
}

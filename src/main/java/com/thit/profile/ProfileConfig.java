package com.thit.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Profile为dev时实例化的devDemoBean
 * Profile为prod时实例化的prodDemoBean
 * @author 李争辉
 *
 */
@Configuration
public class ProfileConfig {

	@Bean
	@Profile("dev")
	public DemoBean devDemoBean(){
		return new DemoBean("from development profile");
	}
	
	@Bean
	@Profile("prod")
	public DemoBean prodDemoBean(){
		return new DemoBean("from production profile");
	}
}

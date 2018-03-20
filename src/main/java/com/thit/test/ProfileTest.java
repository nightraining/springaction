package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.profile.DemoBean;
import com.thit.profile.ProfileConfig;

public class ProfileTest {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("dev");
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.register(ProfileConfig.class);
		ctx.refresh();
		
		DemoBean demoBean = ctx.getBean(DemoBean.class);
		System.out.println(demoBean.getContext());
		ctx.close();
	}

	
}

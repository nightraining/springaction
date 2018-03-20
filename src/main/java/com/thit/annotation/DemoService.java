package com.thit.annotation;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

	public void print(){
		System.out.println("从组合注解中照样获得的Bean");
	}
}

package com.thit.di;

import org.springframework.stereotype.Service;

/**
 * 使用@Service注解声明当前FunctionService类是Spring管理的一个Bean。
 * @author xiangyang
 *
 */
@Service
public class FunctionService {
	public String sayHello(String word){
		return "Hello "+ word +" !";
	}
}

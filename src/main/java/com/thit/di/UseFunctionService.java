package com.thit.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * （1）使用@Service注解声明当前UseFunctionService类是Spring管理的一个Bean。
 * （2）使用@Autowired注解将FunctionService的实体Bean注入到UseFunctionService中，让UseFunctionService
 * 		具备FunctionService的功能。（用@Inject，@Resource等效）
 * @author xiangyang
 *
 */
@Service
public class UseFunctionService {

	@Autowired
	FunctionService functionService;
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
}

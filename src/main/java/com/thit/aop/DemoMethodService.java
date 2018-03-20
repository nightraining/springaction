package com.thit.aop;

import org.springframework.stereotype.Service;

/**
 * 使用方法规则的被拦截类
 * @author xiangyang
 *
 */
@Service
public class DemoMethodService {

	public void add(){
		System.out.println("小明HH");
	}
}

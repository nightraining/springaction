package com.thit.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @PostConstruct:在构造函数执之后执行
 * @PreDestroy：在Bean销毁之前执行
 * @author xiangyang
 *
 */
public class JSR250WayService {

	@PostConstruct
	public void init(){
		System.out.println("jsr250-init-method");
	}
	
	public JSR250WayService(){
		System.out.println("初始化构造函数-JSR250WayService");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("jsr250-destory-method");
	}
}

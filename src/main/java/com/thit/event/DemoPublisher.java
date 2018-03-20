package com.thit.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * （1）注入ApplicationContext用来发布事件
 * （2）使用ApplicaContext的PublishEvent方法发布事件。
 *
 */
@Component
public class DemoPublisher {

	@Autowired
	ApplicationContext context;
	
	public void publish(String msg){
		context.publishEvent(new DemoEvent(this, msg)); //2
	}
}

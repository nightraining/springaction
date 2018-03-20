package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.event.DemoPublisher;
import com.thit.event.EventConfig;

public class EventTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(EventConfig.class);
		DemoPublisher demoPublic = context.getBean(DemoPublisher.class);
		demoPublic.publish("hello application event");
		context.close();
	}
}

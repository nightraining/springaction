package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.taskScheduler.TaskSchedulerConfig;

public class TaskSchedulerTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}

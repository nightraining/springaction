package com.thit.test;

import java.util.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.taskexecutor.AsyncTaskService;
import com.thit.taskexecutor.TaskExecutorConfig;

public class TaskExecutorTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService  service = context.getBean(AsyncTaskService.class);
		Date start = new Date();
		for (int i = 0; i < 10; i++) {
			service.executeAsyncTask(i);
			service.executeAsyncTaskPlus(i);
		}
		System.out.println(new Date().getTime()-start.getTime());
		context.close();
	}
}

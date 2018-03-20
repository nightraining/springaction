package com.thit.taskexecutor;

import java.util.concurrent.Executor;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * 多线程
 * 
 * Spring通过任务执行器（TaskExecutor）来实现多线程和并发编程。使用
 * ThreadPoolTaskExecutor可实现一个基于线程池的TaskExecutor。而在实际开发中任务一般是非
 * 阻碍的，即异步的，所以我们要在配置类中通过@EnableAsync开启对异步任务的支持，并通过在
 * 实际执行的Bean的方法中使用@Async注解来声明其是一个异步任务。
 * 
 * (1)利用@EnableAsync注解开启异步任务支持。
 * (2)配置类实现AsyncConfigurer接口并重写getAsyncExecutor 方法，并返回一个
 * ThreadPoolTaskExecutor，这样就获得了一个基于线程池taskExecutor。
 */
@Configuration
@ComponentScan("com.thit.taskexecutor")
@EnableAsync //(1)
public class TaskExecutorConfig implements AsyncConfigurer{

	public Executor getAsyncExecutor() { //(2)
		ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(5);
		taskExecutor.setMaxPoolSize(10);
		taskExecutor.setQueueCapacity(25);
		taskExecutor.initialize();
		return taskExecutor;
	}

	public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
		return null;
	}

	
}

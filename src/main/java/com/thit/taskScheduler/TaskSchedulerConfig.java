package com.thit.taskScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 使用 @EnableScheduling 开启对计划任务的支持
 *
 */
@Configuration
@ComponentScan("com.thit.taskScheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}

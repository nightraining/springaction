package com.thit.taskScheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 1 通过 @Scheduled 声明改方法是计划任务，使用fixedRate属性每隔固定时间执行。
 * 2 使用cron属性克按照指定时间执行，本例指的是每天10点43分执行；cron是UNIX和类UNIX（LINUX）系统下的定时任务。
 *
 */
@Service
public class SchedulerTaskService {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime(){
		System.out.println("每个5秒执行一次："+dateFormat.format(new Date()));
	}
	
	@Scheduled(cron = "0 43 10 ? * *")
	public void fixTimeExecution(){
		System.out.println("在指定时间 "+dateFormat.format(new Date())+" 执行");
	}
}

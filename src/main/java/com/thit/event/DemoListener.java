package com.thit.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 定义事件监听器
 * （1）实现ApplicationListener接口，并制定监听的事件类型。
 * （2）使用onApplicationEvent方法对消息进行接受处理。
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {

	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我（Bean-demoListener）接收到了bean-demoPublisher发布的消息："+msg);
	}

}

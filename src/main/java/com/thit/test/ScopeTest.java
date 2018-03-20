package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.scope.DemoPrototypeService;
import com.thit.scope.DemoSingletonService;
import com.thit.scope.ScopeConfig;

/**
 * Scope描述的是spring容器是如何创建Bean的实例的。Spring通过@Scope注解来实现。
 * 1.Singleton:一个Spring容器中只有一个Bean的实例,为Spring默认配置，全容器共享一个Bean实例。
 * 2.Prototype：每次调用新建一个Bean实例。
 * 3.Request:在web项目中，给每一个http request新建一个Bean实例。
 * 4.session:在Web项目中，给每一个Http session新建一个Bean实例。
 * 5.GlobalSession:只在protal应用中有用，给每一个global http session新建一个Bean实例。
 * @author xiangyang
 *
 */
public class ScopeTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService s1 = ctx.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = ctx.getBean(DemoSingletonService.class);
		
		DemoPrototypeService p1 = ctx.getBean(DemoPrototypeService.class);
		DemoPrototypeService p2 = ctx.getBean(DemoPrototypeService.class);
		
		System.out.println("s1与s2是否相等："+s1.equals(s2));
		System.out.println("p1与p2是否相等："+p1.equals(p2));
		
		ctx.close();
	}
}

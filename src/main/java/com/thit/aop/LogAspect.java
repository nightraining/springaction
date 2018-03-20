package com.thit.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;
/**
 * AOP可以改变代码的执行顺序。
 * @author xiangyang
 *
 */
@Aspect //注解声明一个切面
@Component //此切面称为spring容器管理的Bean
public class LogAspect {

	//声明切点
	@Pointcut("@annotation(com.thit.aop.Action)")
	public void annotationPointCut(){};
	
	//声明一个建言，并使用@PointCut定义的切点
	@After("annotationPointCut()")
	public void after(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		Action action = method.getAnnotation(Action.class);
		//通过反射可获取注解上的属性
		System.out.println("注解式拦截:"+ action.name());
	}
	
	//声明一个建言，此建言直接使用拦截规则作为参数
	@Before("execution(* com.thit.aop.DemoMethodService.*(..))")
	public void before(JoinPoint joinPoint){
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则式拦截，"+method.getName());
	}
}

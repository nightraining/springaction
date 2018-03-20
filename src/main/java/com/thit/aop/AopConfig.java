package com.thit.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
/**
 * 使用@EnableAspectJAutoProxy注解开启spring对AspectJ代理的支持
 * @author xaingyang
 *
 */
@Configuration
@ComponentScan("com.thit.aop")
@EnableAspectJAutoProxy  
public class AopConfig {

}

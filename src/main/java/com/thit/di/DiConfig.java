package com.thit.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration声明当前类是一个配置类
 * @ComponentScan自动扫描包名下所使用的@Service，@Component,@Repository,@Controller的类，并注册为Bean。
 * 
 * @author xiangyang
 *
 */
@Configuration
@ComponentScan("com.thit.di")
public class DiConfig {

}

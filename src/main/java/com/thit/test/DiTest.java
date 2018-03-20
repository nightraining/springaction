package com.thit.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.thit.di.DiConfig;
import com.thit.di.UseFunctionService;


/**
 * 	控制反转（IOC）是通过依赖注入实现的。
 *  依赖注入:指的是容器负责创建对象和维护对象之间的依赖关系，而不是通过对象
 *  		本身负责自己的创建和解决自己的依赖，目的是为了解耦。
 * 	Spring IOC容器（ApplicationContext）负责创建Bean，并通过容器将功能类Bean注入到你需要的Bean中。
 * 	Spring提供使用XML、注解、Java配置、groovy配置实现Bean的创建的注入。
 * 
 * 	声明Bean的注解：@Component、@Service、@Respository、@Controller
 * 	注入Bean的注解：@Autowired、@Inject、@Resource，这三个注解可以注解在set方法上或属性上。
 * 
 * （1）使用AnnotationConfigApplicationContext作为Spring容器，接收一个配置类作为参数。
 * （2）获得声明配置的UseFunctionService的Bean
 * 
 * @author xiangyang
 *
 */
public class DiTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(DiConfig.class);
		UseFunctionService useFunctionService = 
				ctx.getBean(UseFunctionService.class);
		
		System.out.println(useFunctionService.sayHello("di"));
		ctx.close();
	}

}

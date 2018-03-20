package com.thit.javaconfig;

/**
 * 此处没有使用@Service 声明Bean，也没有使用@Autowired注解注入Bean。
 * @author xiangyang
 *
 */
public class UseFunctionService {

	FunctionService functionService;

	public void setFunctionService(FunctionService functionService){
		this.functionService = functionService;
	}
	
	public String sayHello(String word){
		return functionService.sayHello(word);
	}
	
}

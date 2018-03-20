package com.thit.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * Spring Aware的目的是为了让Bean获的Spring容器的服务。
 * (1)实现BeanNameAware、ResourceLoaderAware接口，获得加载Bean名称和资源的服务。
 * (2)实现ResourceLoaderAware 需重写 setResourceLoader。
 * (3)实现BeanNameAware 需重写 setBeanName 方法。
 *
 */
@Service
public class AwareService implements BeanNameAware,ResourceLoaderAware{
	
	private String beanName;
	private ResourceLoader loader;

	public void setResourceLoader(ResourceLoader loader) {
		this.loader = loader;
	}

	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}

	public void outputResult(){
		System.out.println("Bean 的名称为："+beanName);
		
		Resource resource = loader.getResource("classpath:test.txt");
		try {
			System.out.println("ResourceLoader 加载的文件内容为："+IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

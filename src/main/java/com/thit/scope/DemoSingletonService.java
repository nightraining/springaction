package com.thit.scope;

import org.springframework.stereotype.Service;
/**
 * 默认为Singleton,相当于@Scope("singleton")
 * Singleton:一个Spring容器只有一个Bean的实例，为Spring默认配置，全容器共享一个实例
 * @author xiangyang
 *
 */
@Service
public class DemoSingletonService {

}

package com.thit.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * 声明Scope为Prototype
 * Prototype:每次调用新建一个Bean实例。
 * @author 李争辉
 *
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {

}

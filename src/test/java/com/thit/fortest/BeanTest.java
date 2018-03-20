package com.thit.fortest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * SpringJUnit4ClassRunner 在Junit环境下提供Spring TestContest Framework的功能。
 * @ContextConfiguration 用来加载配置ApplicationContext，其中classes属性用来加载配置类。
 * @ActiveProfiles 用来声明活动的profile。
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={TestConfig.class})
@ActiveProfiles("prod")
public class BeanTest {

	@Autowired
	private TestBean testBean;
	
	@Test
	public void prodBeanShouldInject(){
		String expected = "from production profile";
		String actual = testBean.getContent();
		System.out.println(expected.equals(actual));
	}
}

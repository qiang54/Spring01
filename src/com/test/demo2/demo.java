package com.test.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 注入集合（list set map properties等
 * @author qiang
 *
 */
public class demo {

	@Test
	public void run(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		User u = (User) ac.getBean("user");
		System.out.println(u);
	}
	
}

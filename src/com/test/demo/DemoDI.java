package com.test.demo;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DemoDI {

	@Test
	public void run(){
		CustomerServiceImpl cs = new CustomerServiceImpl();
		cs.save();
	}
	
	/**
	 * 使用依赖注入
	 */
	@Test
	public void run1(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CustomerServiceImpl cs= (CustomerServiceImpl) ac.getBean("customerService");
		cs.save();
	}
}

package com.test.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	/**
	 * 有含参构造函数
	 */
	@Test
	public void run(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c= (Car) ac.getBean("car");
		System.out.println(c);
	}
	
	/**
	 * 含有引用，person中有上面car
	 */
	@Test
	public void run1(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("person");
		System.out.println(p);
	}
	/**
	 * 有set/get方法
	 */
	@Test
	public void run2(){
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car1 c = (Car1) ac.getBean("car1");
		System.out.println(c);
	}
}

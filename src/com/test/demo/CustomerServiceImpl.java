package com.test.demo;

public class CustomerServiceImpl {

	//使用依赖注入，需提供set方法
	private CustomerDaoImpl customerDao;
	
	public void setCustomerDao(CustomerDaoImpl customerDao) {
		this.customerDao = customerDao;
	}

	public void save(){
		
		System.out.println("Service...");
		//new CustomerDaoImpl().save();
		
		//使用依赖注入
		customerDao.save();
	}
}

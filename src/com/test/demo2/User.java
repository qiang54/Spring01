package com.test.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class User {

	private String [] arrs;
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	
	
	private List<String> list;
	public void setList(List<String> list) {
		this.list = list;
	}
	
	private Map<String,String > map;
	
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	
	private Properties pro;
	public void setPro(Properties pro) {
		this.pro = pro;
	}


	@Override
	public String toString() {
		return "User [arrs=" + Arrays.toString(arrs) + ", list=" + list + ", map=" + map + ", pro=" + pro + "]";
	}
	
}

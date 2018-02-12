package com.madhav.demo11;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean,DisposableBean{
	
	private String type;
	
	public String getType() {
		System.out.println("getType is called");
		return type;
	}

	public void setType(String type) {
		System.out.println("setType is called");
		this.type = type;
	}

	public void draw() {
		System.out.println("draw is called");
	}
	
	public void myInit() {
		System.out.println("myInit is called");
	}
	public void myDestroy() {
		System.out.println("myDestroy is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy is called");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet is called");
	}
}
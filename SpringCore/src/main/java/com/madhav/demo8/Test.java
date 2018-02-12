package com.madhav.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static Triangle getInstance(ApplicationContext context) {
		Triangle bean = context.getBean("triangle",Triangle.class);
		return bean;
	}
		

}

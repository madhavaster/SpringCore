package com.madhav.demo6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring6.xml");
		Triangle bean = context.getBean("triangle", Triangle.class);
		bean.draw();
	}
}
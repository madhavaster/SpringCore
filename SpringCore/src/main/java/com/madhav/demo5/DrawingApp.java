package com.madhav.demo5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring5.xml");
		Triangle bean = context.getBean("t2", Triangle.class);
		bean.draw();
	}
}
package com.madhav.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp1 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring1.xml");
		Shape bean = context.getBean("shape",Shape.class);
		System.out.println(bean.getClass().getName());
		bean.draw();
	}
}
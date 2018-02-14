package com.madhav.demo12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.ResourceBundleMessageSource;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring12.xml");
		Shape t=context.getBean("triangle",Triangle.class);
		t.draw();
		String message = context.getMessage("mrp", null, "default hyderabad", null);
		System.out.println(message);
	}
}
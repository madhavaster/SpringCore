package com.madhav.demo12;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring12.xml");
		Triangle t=context.getBean("triangle",Triangle.class);
		t.draw();
	}
}
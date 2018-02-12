package com.madhav.demo9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring9.xml");
		Triangle bean = context.getBean("triangle", Triangle.class);
		bean.draw();
	}
}

/*
 * triangle
 * inside setApplicatinoContext method
 * 0...0
 * 0....0
 */

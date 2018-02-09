package com.madhav.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.madhav.beans.HelloWorld;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
	}
}
package com.madhav.demo13;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class DrawingApp {
	public static void main(String[] args) {
		Triangle t=new ClassPathXmlApplicationContext("spring13.xml").getBean("triangle",Triangle.class);
		System.out.println(t.getClass().getName());
	}
}
package com.madhav.demo14;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AOPMain {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring14.xml");
		//Triangle bean = ctx.getBean("triangle", Triangle.class);
		Circle bean=ctx.getBean("circle",Circle.class);
		bean.m1();
	}
}
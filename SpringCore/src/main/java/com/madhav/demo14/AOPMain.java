package com.madhav.demo14;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AOPMain {
	public static void main(String[] args) {
		System.out.println("6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring14.xml");
		System.out.println("7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Triangle bean = ctx.getBean("triangle", Triangle.class);
		System.out.println("9>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		bean.m1();
		System.out.println("11>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		Circle bean1=ctx.getBean("circle",Circle.class);
		System.out.println("13>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		bean1.m1();
	}
}
/*
6>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
Feb 18, 2018 10:37:56 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@45283ce2: startup date [Sun Feb 18 22:37:56 IST 2018]; root of context hierarchy
Feb 18, 2018 10:37:56 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring14.xml]
log()
7>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
9>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
log()
triangle m1 is called
11>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
13>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
log()
circle m1 is called
*/
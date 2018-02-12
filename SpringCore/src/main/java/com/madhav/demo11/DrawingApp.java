package com.madhav.demo11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("spring11.xml");
		context.registerShutdownHook();
		Triangle bean = context.getBean("triangle", Triangle.class);
		bean.draw();
	}
}
/*
Feb 13, 2018 12:28:23 AM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@45ff54e6: startup date [Tue Feb 13 00:28:23 IST 2018]; root of context hierarchy
Feb 13, 2018 12:28:23 AM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring11.xml]
setType is called
afterPropertiesSet is called
myInit is called
draw is called
Feb 13, 2018 12:28:23 AM org.springframework.context.support.AbstractApplicationContext doClose
INFO: Closing org.springframework.context.support.ClassPathXmlApplicationContext@45ff54e6: startup date [Tue Feb 13 00:28:23 IST 2018]; root of context hierarchy
destroy is called
myDestroy is called

 */

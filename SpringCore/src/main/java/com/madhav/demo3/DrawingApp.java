package com.madhav.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		//Resource resource = new FileSystemResource("C:\\Users\\User\\git\\SpringCore\\SpringCore\\src\\main\\resources\\spring2.xml");
		//BeanFactory factory= new XmlBeanFactory(resource);
		ApplicationContext context= new ClassPathXmlApplicationContext("spring3.xml");
		Triangle bean = context.getBean("triangle", Triangle.class);
		//bean.setType("equilateral");
		bean.draw();
	}
}
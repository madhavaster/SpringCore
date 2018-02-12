package com.madhav.demo2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp {
	
	public static void main(String[] args) {
		Resource resource = new FileSystemResource("C:\\Users\\User\\git\\SpringCore\\SpringCore\\src\\main\\resources\\spring2.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		Triangle bean = factory.getBean("shape", Triangle.class);
		bean.draw();
	}
}
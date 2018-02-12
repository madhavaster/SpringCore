package com.madhav.demo10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring10.xml");
		Triangle bean = context.getBean("triangle", Triangle.class);
		System.out.println(bean.hashCode());
		bean.draw();
		Triangle bean2 = context.getBean("parenttriangle",Triangle.class);
		System.out.println(bean2.hashCode());
	}
}

/*
 * Feb 12, 2018 11:43:09 PM org.springframework.context.support.AbstractApplicationContext prepareRefresh
INFO: Refreshing org.springframework.context.support.ClassPathXmlApplicationContext@45ff54e6: startup date [Mon Feb 12 23:43:09 IST 2018]; root of context hierarchy
Feb 12, 2018 11:43:09 PM org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions
INFO: Loading XML bean definitions from class path resource [spring10.xml]
836514715
0.....0
10.....0
0.....10
Exception in thread "main" org.springframework.beans.factory.BeanIsAbstractException: Error creating bean with name 'parenttriangle': Bean definition is abstract
	at org.springframework.beans.factory.support.AbstractBeanFactory.checkMergedBeanDefinition(AbstractBeanFactory.java:1319)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:293)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:205)
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1091)
	at com.madhav.demo10.DrawingApp.main(DrawingApp.java:13)
output
 */
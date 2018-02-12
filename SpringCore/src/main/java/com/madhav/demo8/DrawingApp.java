package com.madhav.demo8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("spring8.xml");
		Triangle bean = context.getBean("triangle", Triangle.class);
		System.out.println(bean.hashCode());
		Triangle t = Test.getInstance(context);
		System.out.println(t.hashCode());
		bean.draw();
	}
}

/*output of this program:
 * 
 * 1690254271
 * 1440047379
 * 0....0
 */
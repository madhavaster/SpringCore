package com.madhav.demo9;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware{
	
	private Point pointA;
	private ApplicationContext context = null;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println(getPointA().getX()+"...."+getPointA().getY());
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		System.out.println("inside setApplicatinoContext method");
		this.context = context;
		Point bean = context.getBean("pointA",Point.class);
		System.out.println(bean.getX()+"..."+bean.getY());
	}
}
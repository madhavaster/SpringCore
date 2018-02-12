package com.madhav.demo10;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle{
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println(getPointA().getX()+"...."+getPointA().getY());
		System.out.println(getPointB().getX()+"...."+getPointB().getY());
		System.out.println(getPointC().getX()+"...."+getPointC().getY());
	}
}
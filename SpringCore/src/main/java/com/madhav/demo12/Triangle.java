package com.madhav.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Triangle implements Shape{
	private Point p;
	public Point getP() {
		return p;
	}
	@Autowired
	@Qualifier("p14")
	public void setP(Point p) {
		this.p = p;
	}
	@Override
	public void draw() {
		System.out.println(p.getX()+"...."+p.getY());
	}
	public Triangle() {
		System.out.println("constructor");
	}
}
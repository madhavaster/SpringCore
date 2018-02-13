package com.madhav.demo12;

import org.springframework.beans.factory.annotation.Autowired;

public class Triangle{
	@Autowired
	private Point p;
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	public void draw() {
		System.out.println(p.getX()+"...."+p.getY());
	}
	public Triangle() {
		System.out.println("constructor");
	}
}
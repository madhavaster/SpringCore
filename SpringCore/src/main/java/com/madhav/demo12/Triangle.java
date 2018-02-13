package com.madhav.demo12;

import org.springframework.beans.factory.annotation.Required;

public class Triangle{

	private Point p;
	public Point getP() {
		return p;
	}
	@Required
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
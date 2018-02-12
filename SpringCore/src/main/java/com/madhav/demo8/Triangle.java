package com.madhav.demo8;

import java.util.List;

public class Triangle{
	
	private Point pointA;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public void draw() {
		System.out.println(getPointA().getX()+"...."+getPointA().getY());
	}
}
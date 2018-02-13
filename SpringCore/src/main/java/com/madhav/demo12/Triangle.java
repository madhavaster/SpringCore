package com.madhav.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
	@Autowired
	private Point p;
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	@Override
	public void draw() {
		System.out.println(p.getX()+"...."+p.getY());
	}
}
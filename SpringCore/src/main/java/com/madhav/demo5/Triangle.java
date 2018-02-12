package com.madhav.demo5;

public class Triangle{
	
	public Point pointA;
	public Point pointB;
	public Point pointC;
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
		System.out.println("PointA is ("+pointA.getX()+" "+pointA.getY()+")");
		System.out.println("PointB is ("+pointB.getX()+" "+pointB.getY()+")");
		System.out.println("PointC is ("+pointC.getX()+" "+pointC.getY()+")");
	}
}
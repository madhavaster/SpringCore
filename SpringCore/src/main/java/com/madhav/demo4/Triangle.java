package com.madhav.demo4;

public class Triangle{

	private String type;
	private int height;
	public Triangle(String type,int height) {
		this.type = type;
		this.height = height;
	}

	public void draw() {
		System.out.println(this.type+" triangle is drawn with height "+this.height);
	}
}
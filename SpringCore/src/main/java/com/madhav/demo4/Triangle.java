package com.madhav.demo4;

public class Triangle{

	private String type;
	public Triangle(String type) {
		this.type = type;
	}

	public void draw() {
		System.out.println(this.type+" triangle draw method is called");
	}
}
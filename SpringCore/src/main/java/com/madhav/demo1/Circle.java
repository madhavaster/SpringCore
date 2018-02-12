package com.madhav.demo1;

public class Circle implements Shape{
	Circle(){
		System.out.println("Circle constructor");
	}

	@Override
	public void draw() {
		System.out.println("Circle object draw method is called");
	}
}
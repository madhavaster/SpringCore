package com.madhav.demo1;

public class Triangle implements Shape{
	Triangle(){
		System.out.println("constructor");
	}
	
	public void init(){
		System.out.println("init method is getting called");
	}

	@Override
	public void draw() {
		System.out.println("triangle draw method is called");
	}
}
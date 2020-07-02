package com.karunesh.design.pattern.desingprinciple.abstarctFactory;

public interface Shape {
	void draw();
}

class Circle implements Shape {

	@Override
	public void draw() {
	  System.out.println("Circle draw()");
	}
	
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Draw");
	}
	
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle Square");
	}
	
}
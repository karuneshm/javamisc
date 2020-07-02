package com.karunesh.design.pattern.desingprinciple.factoryConcrate;


interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::darw() method");	
	}
	
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Square::darw() method");	
	}
	
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::darw() method");	
	}
	
}


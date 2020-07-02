package com.karunesh.design.pattern.desingprinciple;

interface Shape {
	double calculateArea();
	
}


class Rectangle implements Shape  {
	
	private double length;
	private double width;
	
	@Override
	public double calculateArea() {
		return length*width;
	}
	
}


class circle implements Shape {
	private double radius;

	@Override
	public double calculateArea() {
		return (22/7) * radius * radius;
	}
	
}

class AreaCalculator {
	
	public double calculateAreaShape(Shape shape) {
		return shape.calculateArea();
	}
	
	
}

public class OpenClosedPrinciple {

	public static void main(String[] args) {
		

	}

}

package com.karunesh.design.pattern.desingprinciple.factoryabstract;

public class Client {

	public static void main(String[] args) {
		
		Shape shape1 = new CircleFactory().getShape();
		shape1.draw();
		
		shape1 = new RectangleFactory().getShape();
		shape1.draw();
		
		shape1 = new CircleFactory().getShape();
		shape1.draw();
		
		

	}

}

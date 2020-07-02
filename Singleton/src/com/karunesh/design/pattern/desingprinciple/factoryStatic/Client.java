package com.karunesh.design.pattern.desingprinciple.factoryStatic;

public class Client {

	public static void main(String[] args) {
		
		Shape shape = ShapeFactory.getShape("CIRCLE");
		shape.draw();
		shape = ShapeFactory.getShape("RECTANGLE");
		shape.draw();
		shape = ShapeFactory.getShape("SQUARE");
		shape.draw();

	}

}

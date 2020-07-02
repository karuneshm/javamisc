package com.karunesh.design.pattern.desingprinciple.factoryConcrate;

public class Client {

	public static void main(String[] args) {
		
		ShapeFactory shapeFacory = new ShapeFactory();
		Shape shape = shapeFacory.getShape("CIRCLE");
		shape.draw();
		shape = shapeFacory.getShape("RECTANGLE");
		shape.draw();
		shape = shapeFacory.getShape("SQUARE");
		shape.draw();

	}

}

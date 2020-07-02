package com.karunesh.design.pattern.desingprinciple.abstarctFactory;

public class ShapeFactory extends AbstractFactory {
	
	public Shape getShape(String shapeName) {
		if(shapeName ==  null) {
			return null;
		} else if(shapeName.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if(shapeName.equalsIgnoreCase("RECTANGLE")) {
			return new Circle();
		} else if(shapeName.equalsIgnoreCase("SQUARE")) {
			return new Circle();
		}
		return null;
	}

	@Override
	public Color getColor(String color) {
		
		return null;
	}

}

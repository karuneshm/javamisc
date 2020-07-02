package com.karunesh.design.pattern.desingprinciple.abstarctFactory;

public class Client {
	
	public static void main(String args[]) {
		AbstractFactory shapeFacory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFacory.getShape("Circle");
		shape1.draw();
		
		AbstractFactory colorFacory = FactoryProducer.getFactory("COLOR");
		Color color = colorFacory.getColor("RED");
		color.fill();
		
	}

}

package com.karunesh.design.pattern.desingprinciple.factoryabstract;

public abstract class AbstarctShapeFactory {
	
	protected abstract Shape factoryMethod();
	
	public Shape getShape() {
		return factoryMethod();
	}

}

class RectangleFactory extends AbstarctShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Rectangle();
	}
	
}
class SquareFactory extends AbstarctShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Square();
	}
	
}
class CircleFactory extends AbstarctShapeFactory {

	@Override
	protected Shape factoryMethod() {
		return new Circle();
	}
	
}

package com.karunesh.design.pattern.desingprinciple.builder;

public class Client {

	public static void main(String[] args) {
		
		System.out.println("Demo");
		
		Director director = new Director();
		
		BuilderInterface carBuilder = new Car();
		BuilderInterface motorBuilder = new MotorCycle();
		
		director.construct(carBuilder);
		Product p1 = carBuilder.getVehicle();
		p1.show();
		
		director.construct(motorBuilder);
		Product p2 = motorBuilder.getVehicle();
		p2.show();
		
		
		
		
		

	}

}

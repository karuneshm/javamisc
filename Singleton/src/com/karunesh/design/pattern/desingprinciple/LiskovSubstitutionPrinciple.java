package com.karunesh.design.pattern.desingprinciple;

abstract class Vehicle {
	public abstract int getSpeed();
	public abstract int getCubicle();
	public void check() {
		
	}
	
}

class Car extends Vehicle {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public int getCubicle() {
		return 0;
	}
	
}

class Bus extends Vehicle {

	@Override
	public int getSpeed() {
		return 0;
	}

	@Override
	public int getCubicle() {
		return 0;
	}
	
}
public class LiskovSubstitutionPrinciple {

	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.getSpeed();
		vehicle = new Bus();
		vehicle.getSpeed();

	}

}

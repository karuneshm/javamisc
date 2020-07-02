package com.karunesh.design.pattern.desingprinciple.factoryChallenge;

public class Client {

	public static void main(String[] args) {
		AnimalFactory animalFactory = new AnimalFactory();
		Animal animal = animalFactory.getAnimal("TIGER");
		animal.eat();
		animal.walk();
		animal = animalFactory.getAnimal("DUCK");
		animal.eat();
		animal.walk();

	}

}

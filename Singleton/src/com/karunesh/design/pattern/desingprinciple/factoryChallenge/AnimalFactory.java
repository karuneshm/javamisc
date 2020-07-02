package com.karunesh.design.pattern.desingprinciple.factoryChallenge;

public class AnimalFactory {
	
	public Animal getAnimal(String animalName) {
		if(animalName == null) {
			return null;
		} else if(animalName.equalsIgnoreCase("TIGER")) {
			return new Tiger();
		}else if(animalName.equalsIgnoreCase("DUCK")) {
			return new Duck();
		}
		
		return null;
	}

}

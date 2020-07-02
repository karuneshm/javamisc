package com.karunesh.design.pattern.desingprinciple.factoryChallenge;

interface Animal {
	
	void eat();
	
	void walk();

}


class Tiger implements Animal {

	@Override
	public void eat() {
		System.out.println("Tiger is eating");
	}

	@Override
	public void walk() {
		System.out.println("Tiger is walking");
		
	}
	
}


class Duck implements Animal {

	@Override
	public void eat() {
		System.out.println("Duck is eating");
		
	}

	@Override
	public void walk() {
		System.out.println("Duck is walking");
		
	}
	
}
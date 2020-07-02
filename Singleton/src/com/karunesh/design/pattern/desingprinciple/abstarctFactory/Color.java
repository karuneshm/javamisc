package com.karunesh.design.pattern.desingprinciple.abstarctFactory;

public interface Color {
	void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Red Color");
	}
	
}

class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Red Color");
	}
	
}

class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Red Color");
	}
	
}

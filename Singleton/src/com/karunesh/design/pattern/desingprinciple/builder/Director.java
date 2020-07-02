package com.karunesh.design.pattern.desingprinciple.builder;

public class Director {
	
	BuilderInterface myBuilder;
	
	public void construct(BuilderInterface builder) {
		myBuilder = builder;
		myBuilder.buildBody();
		myBuilder.insertWheels();
		myBuilder.AddHeadLights();	
	}
	

}

package com.karunesh.design.pattern.desingprinciple.decorator;

public abstract class Component {
	public abstract void doJob();
}

class ConcreteComponent extends Component {

	@Override
	public void doJob() {
		System.out.println("I m from a Concreate Component- I am closed for modifications");
	}
	
}

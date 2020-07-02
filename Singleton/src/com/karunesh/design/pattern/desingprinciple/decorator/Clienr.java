package com.karunesh.design.pattern.desingprinciple.decorator;

public class Clienr {
	

	public static void main(String[] args) {
	
		ConcreteComponent cc = new ConcreteComponent();
		
		ConcreateDecoratorExample1 example1 = new ConcreateDecoratorExample1();
		example1.SetTheComponent(cc);
		example1.doJob();
		
		ConcreateDecoratorExample2 example2 = new ConcreateDecoratorExample2();
		example2.SetTheComponent(example1);
		example2.doJob();
		
		

	}

}

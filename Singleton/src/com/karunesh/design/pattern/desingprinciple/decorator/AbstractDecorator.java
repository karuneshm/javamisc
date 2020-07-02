package com.karunesh.design.pattern.desingprinciple.decorator;

public abstract class AbstractDecorator extends Component {
	
	protected Component com;
	
	public void SetTheComponent(Component c) {
		com = c;
	}

	public void doJob() {
		if(com !=null) {
			com.doJob();
		}
	}
}

class ConcreateDecoratorExample1 extends AbstractDecorator {
	public void doJob() {
		super.doJob();
		System.out.println("I am from Example1");
	}
}

class ConcreateDecoratorExample2 extends AbstractDecorator {
	public void doJob() {
		System.out.println("Start Example2");
		super.doJob();
		System.out.println("I am from Example2");
		System.out.println("End");
	}
}

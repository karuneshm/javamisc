package com.karunesh.design.pattern.desingprinciple;


interface DisplayModule {
	public void display();
}

class Monitor implements DisplayModule {

	@Override
	public void display() {
		System.out.println("Display Through Monitor");
	}
	
}

class Projector implements DisplayModule {

	@Override
	public void display() {
		System.out.println("Display Through Projector");	
	}
	
}
public class Computer {
	
	DisplayModule dm;
	
	public void SetDisplayModule(DisplayModule dm) {
		this.dm = dm;
	}
	
	public void getDisplayModule() {
		dm.display();
	}

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Monitor monitor = new Monitor();
		Projector projector = new Projector();
		
		computer.SetDisplayModule(monitor);
		computer.getDisplayModule();
		computer.SetDisplayModule(projector);
		computer.getDisplayModule();
		
		
		

	}

}

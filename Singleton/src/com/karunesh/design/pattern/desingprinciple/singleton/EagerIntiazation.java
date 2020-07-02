package com.karunesh.design.pattern.desingprinciple.singleton;


class Singleton {
	
	private static volatile Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
		
	}
	
}


public class EagerIntiazation {

	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		System.out.println(instance.hashCode());
		Singleton instance2 = Singleton.getInstance();
		System.out.println(instance2.hashCode());

	}

}

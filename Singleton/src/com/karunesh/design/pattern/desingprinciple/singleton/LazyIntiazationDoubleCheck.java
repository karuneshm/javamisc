package com.karunesh.design.pattern.desingprinciple.singleton;


class DoubleCheckSingleton {
	
	private static volatile DoubleCheckSingleton instance;
	
	private DoubleCheckSingleton() {
		
	}
	
	public static DoubleCheckSingleton getInstance() {
		if(instance == null) {
			synchronized(DoubleCheckSingleton.class) {
				if(instance == null) {
					instance =  new DoubleCheckSingleton();
					
				}
			}
		}
		
		return instance;
		
	}
	
}


public class LazyIntiazationDoubleCheck {

	public static void main(String[] args) {
		DoubleCheckSingleton instance = DoubleCheckSingleton.getInstance();
		System.out.println(instance.hashCode());
		DoubleCheckSingleton instance2 = DoubleCheckSingleton.getInstance();
		System.out.println(instance2.hashCode());

	}

}

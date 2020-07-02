package com.karunesh.design.pattern.desingprinciple.singleton;




enum SingletonEnum {
	
	INSTANCE;
	
	int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
	
}


public class BillPughApproch {

	public static void main(String[] args) {
		SingletonEnum instance = SingletonEnum.INSTANCE;
		System.out.println(instance.hashCode());
		SingletonEnum instance2 = SingletonEnum.INSTANCE;
		System.out.println(instance2.hashCode());

	}

}

package com.karunesh.design.pattern.desingprinciple.singleton;


class SingletonBill {
	
	
	
	private SingletonBill() {
		
	}
	
	private static class SinlegtonHelper {
		private static final SingletonBill instance = new SingletonBill();
	}
	
	public static SingletonBill getInstance() {
		return SinlegtonHelper.instance;
	}
	
	
}


public class EnumApprochEnum {

	public static void main(String[] args) {
		SingletonBill instance = SingletonBill.getInstance();
		System.out.println(instance.hashCode());
		SingletonBill instance2 = SingletonBill.getInstance();
		System.out.println(instance2.hashCode());

	}

}

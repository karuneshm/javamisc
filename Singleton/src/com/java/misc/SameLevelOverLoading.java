package com.java.misc;

public class SameLevelOverLoading {
	
	public void m(String str) {
		System.out.println("String");
	}
//	public void m(StringBuffer buffer) {
//		System.out.println("StringBuffer");
//	}
	
	public void m(Integer buffer) {
		System.out.println("integer");
	}
	
	public void m(Object buffer) {
		System.out.println("Object");
	}
	
	public void m(int j, float...k) {
		
	}

	public static void main(String[] args) {
		
		SameLevelOverLoading over = new SameLevelOverLoading();
		//over.m(null);

	}

}

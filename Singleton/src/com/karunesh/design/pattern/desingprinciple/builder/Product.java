package com.karunesh.design.pattern.desingprinciple.builder;

import java.util.LinkedList;
import java.util.List;

public class Product {
	
	private List<String> parts;
	
	public Product () {
		parts = new LinkedList<String>();
	}
	
	public void add(String part) {
		parts.add(part);
	}
	
	public void show() {
		System.out.println("\n Product is completed as below");
		for(int i = 0; i<parts.size(); i++) {
			System.out.println(parts.get(i));
		}
	}

}

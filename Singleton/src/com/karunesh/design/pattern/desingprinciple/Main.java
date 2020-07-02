package com.karunesh.design.pattern.desingprinciple;


class RealPrinter {
	void print() {
		System.out.println("The Delegate");
	}
}

class Printer {
	RealPrinter printer = new RealPrinter();
	
	void print() {
		printer.print();
	}
	
}

public class Main {

	public static void main(String[] args) {
	  Printer printer = new Printer();
	  printer.print();

	}

}

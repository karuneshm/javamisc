

class A {
	public void m1() {
		System.out.println("m1 -A");
	}
	
	public void m2() {
		System.out.println("m2-");
	}
}

class B extends A {

	
	public void m1() {
		System.out.println("m1 -B");
	}
	
	public void m3() {
		System.out.println("m3 -B");
	}
	
}

public class inheritance {

	public static void main(String[] args) {
		A a = new B();
		a.m1();
		//a.m3();

	}

}

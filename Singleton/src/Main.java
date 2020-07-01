
public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Singleton instance = Singleton.getInstance();
		
		Singleton instance1 = Singleton.getInstance();
		System.out.println(instance.hashCode());
		
		
		System.out.println(instance1.hashCode());

	}

}

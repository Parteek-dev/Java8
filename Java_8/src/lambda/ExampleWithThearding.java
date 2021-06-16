package lambda;

public class ExampleWithThearding {

	public static void main(String[] args) {
		
		Runnable r = () -> {
			
			for (int i = 0; i<=5 ;i++) {
				System.out.println("Child Thead ");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
	
	for (int i = 0; i<=5 ;i++) {
		System.out.println("MAIN Thead ");
	}

}
}

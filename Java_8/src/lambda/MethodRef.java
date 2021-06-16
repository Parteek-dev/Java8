package lambda;

public class MethodRef {

	private static void m1() {
		for (int i = 0; i<=5 ;i++) {
			System.out.println("Child Thead ");
		}
	}
	
	private void m2() {
		for (int i = 0; i<=5 ;i++) {
			System.out.println("Child Thead ");
		}
	}
	
	public static void main(String[] args) {
		
		MethodRef mr = new MethodRef();
		
		//Runnable r = MethodRef::m1;
		Runnable r = mr::m2;
		
		Thread t = new Thread(r);
		t.start();
	
	for (int i = 0; i<=5 ;i++) {
		System.out.println("MAIN Thead ");
	}

	}

}

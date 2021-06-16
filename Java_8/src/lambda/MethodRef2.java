package lambda;

/**
 * 
 * @author Parteek.Kumar
 * for method reference arguments are must same rest all thing 
 * is allowed like return type and access modifier
 *
 */

interface Interf{
	public void m1();
}

class Demo{
	
	public static void m1() {
		
		System.out.println("Test in M1");
	}
	
	protected int m2() {
		
		System.out.println("Test in M2");
		return 0;
	}
}


public class MethodRef2 {
	
	public static void main(String[] args) {
	
		Demo demo = new Demo();
		//Interf i = () -> System.out.println("Hello lambda");
		//Interf i = Demo::m1;
		Interf i = demo::m2;
				
		i.m1();
	}

}
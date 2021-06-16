package lambda;

interface I1{
	public void m1();
}
@FunctionalInterface
interface I2{
	public void m2(int a , int b);
}

interface I3{
	public void m3(int a);
}

interface I4{
	public int m4(int a);
}

interface I5<T>{
	T m5(T a);
}

interface I6{
	boolean m6(int a);
}

interface I7{
	 void test();
}

public class Example1 {

	public static void main(String[] args) {

		I1 i1 = () -> System.out.println("Test basic lambda exp..");
		I2 i2 = (a,b) -> System.out.println("SUM.."+a+b);
		I3 i3 = a -> System.out.println("Single Param.."+a);
		I4 i4 = a -> a*a;
		I5<String> i5 = str ->{
			String res ="";
			for(int i = str.length()-1;i>=0;i--) {
				res += str.charAt(i);
			}
				
			return res;
		} ;

		I6 i6 = a -> a%2==0;
		
		I7 i7 = new I7() {

			@Override
			public void test() {
				I4 iTest = a -> a*a;	
				System.out.println("Lambda inside annoynous class = "+iTest.m4(6));						
			}
			
		};

		i1.m1();i2.m2(2,2);i3.m3(2);i7.test();
		
		

		System.out.println("Lambda Return.."+i4.m4(2));
		System.out.println("Lambda reverse.."+i5.m5("Parteek"));
		System.out.println("Lambda Check ture or false.."+i6.m6(2));
		
		
		
		
	}

}
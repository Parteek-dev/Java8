package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExampleWithCollections {

	public static void main(String[] args) {
		Comparator<Integer> c = (i1,i2) -> (i1>i2)?1:(i1<i2)?-1:0;
		ArrayList<Integer> al = new ArrayList<>();
		al.add(50);
		al.add(20);
		al.add(15);
		al.add(6);
		al.add(50);
		al.add(0);
		
		ArrayList<Employee> alEmp = new ArrayList<>();
		alEmp.add(new Employee(13, "Parteek"));
		alEmp.add(new Employee(500, "Anit"));
		alEmp.add(new Employee(50, "Rahul"));
		alEmp.add(new Employee(10, "Manoj"));
		alEmp.add(new Employee(111, "Dheeraj"));
		
		System.out.print("Before "+al);
		Collections.sort(al,c);
		System.out.print("After "+al);
		
		System.out.print("\nEmployee Object "+alEmp);
		Collections.sort(alEmp,(e1,e2) -> -e1.name.compareTo(e2.name));
		System.out.print("\nSort name desc "+alEmp);
		Collections.sort(alEmp,(e1,e2) -> (e1.eNbr>e2.eNbr)?1:(e1.eNbr<e2.eNbr)?-1:0);
		System.out.print("\nSort Employee Nbr "+alEmp);
		
	}

}

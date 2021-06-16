package lambda;

public class Employee {
	
	public String name;
	public int eNbr;
	
	 @Override
	public String toString() {
		return  name + "-" + eNbr;
	}

	Employee(int eNbr, String name) {
		 
		 this.eNbr = eNbr;
		 this.name = name;
			}

}

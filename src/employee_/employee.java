package employee_;

import person_.person;

public class employee extends person {
	String dept ;
	int empid;
	
	public void show () {
		setnanda("Deepak",27);
		print();
		System.out.println("Employee ID :-"+ this.empid +"Department:-" + this.dept);
	}

	public void setdande(String dept , int empid ) {
		this.dept = dept ;
		this.empid = empid ;
	}
}

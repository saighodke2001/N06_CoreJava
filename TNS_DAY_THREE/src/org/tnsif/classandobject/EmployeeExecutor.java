//Driver class
//Program to demonstrate class and object
package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating object
		Employee e=new Employee();
		e.empID=1001;
		e.empName="Sai";
		e.salary=50000;
		e.department="Comp";
		
		//method call
		e.display();
		
		
	}

}

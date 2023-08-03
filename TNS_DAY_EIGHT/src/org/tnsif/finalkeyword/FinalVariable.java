//program to demonstrate on final keyword with variable
package org.tnsif.finalkeyword;

public class FinalVariable {

	/*final variable must be initialized during declaration*/
	//final int x;
	
	final float SALARY=6790.899f;
	
	void print()
	{
		//We can't change the value of final variable
		//SALARY=23456.234f;
		
		System.out.println("Salary is:"+SALARY);
	}
}

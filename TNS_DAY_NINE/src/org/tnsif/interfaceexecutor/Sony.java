//program to demonstrate on interface
package org.tnsif.interfaceexecutor;

public interface Sony {
	/*By default all the variable inside the interface is public static 
	 * final*/
	int noOfChannales=8;
	
	//abstract method
	/*Bydefault all the methods inside the interface is abstract*/
	void display();
	
	
	//Core java8 provide static and default method
	static void accept()
	{
		System.out.println("Static method");
	}
	
	default void show()
	{
		System.out.println("Default method");
	}

}

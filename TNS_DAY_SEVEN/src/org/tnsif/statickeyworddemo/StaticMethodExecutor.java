//program to demonstrate on static keyword
package org.tnsif.statickeyworddemo;

public class StaticMethodExecutor {

	static float percentage=76.89f;
	//Static method
	/*
	 * if any method outside the main function and if you want to
	 * acess that method inside the main function ,make it as static*/
	static void displayScore(int score)
	{
		
		System.out.println("Score is:"+score);
		/*we can't use non-static variable inside static method*/
		System.out.println("Percentage is :"+percentage);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		displayScore(56);
	}

}

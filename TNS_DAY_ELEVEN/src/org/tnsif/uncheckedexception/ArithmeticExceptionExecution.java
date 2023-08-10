package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try block contains an exception code
		try {
			System.out.println(x/y);
		}
		//catch block is used to handle that exception
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
	}

}

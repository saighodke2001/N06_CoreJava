package org.tnsif.uncheckedexception;

public class CatchBlockDemo {

	static void print(int arr[])
	{
		try {
			System.out.println(arr[3]);
		}
		//We can use multiple catch block in program
		//child class exception-first priority to child class
		
		catch(ArithmeticException | NullPointerException e) {
			System.out.println(e);
		}
		/*catch(NullPointerException e)
		{
			System.out.println(e);
		}
		*/
		
		//parent class exception
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {12,3,14};
		print(arr);
		
	}

}

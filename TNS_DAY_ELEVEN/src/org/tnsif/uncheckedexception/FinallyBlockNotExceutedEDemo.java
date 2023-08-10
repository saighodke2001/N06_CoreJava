package org.tnsif.uncheckedexception;

public class FinallyBlockNotExceutedEDemo {

	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
			/*if try and catch block contains a System.exit(0);
			 * after the exception code linje, the finally block is not executed*/
			
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
			System.exit(0);
		}
		finally {
			/*When finally block contains an exception code,then
			 * finally block does not executed*/
			//System.out.println(13/0);
			System.out.println("Finally Block is Always Excecuted");
		}
		
		System.out.println("If Any Statement outside the block is always executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3};
		display(arr);

	}

}

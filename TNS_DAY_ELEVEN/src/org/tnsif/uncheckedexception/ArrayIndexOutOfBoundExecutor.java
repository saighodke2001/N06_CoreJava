package org.tnsif.uncheckedexception;

public class ArrayIndexOutOfBoundExecutor {

	
	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
		finally {
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

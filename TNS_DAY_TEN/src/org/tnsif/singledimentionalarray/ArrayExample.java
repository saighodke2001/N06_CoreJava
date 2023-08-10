package org.tnsif.singledimentionalarray;

//program to demonstrate on 1D array using compile time input
public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//array initialization at the compile time
		int arr[]= {66,33,21,6,1};
		
		System.out.println(arr[1]);
		System.out.println("Array elements are:");
		
		for(int x:arr)
		{
			System.out.println(x);
		}
		
		
		
	}

}

//Program to demonstrate on array using runtime input
//and find the largest element in array
package org.tnsif.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExampleRuntime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		
		
		System.out.println("Enter the size of array:");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		
		System.out.println("The array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
			
		}
		
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest Element is: "+max);
		
		Arrays.sort(arr);
		
		System.out.println("Element after sorting:");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		
		
		
	}

}

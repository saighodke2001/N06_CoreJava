//Printing the triplet in array whose sum is equal to zero
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class ArrayTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[],n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of element in array");
		n=s.nextInt();
		arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((arr[i]+arr[j]+arr[k])==0)
					{
						System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
					}
					
				}
			}
		}
			
		
		

}
}

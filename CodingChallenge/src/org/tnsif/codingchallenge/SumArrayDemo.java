package org.tnsif.codingchallenge;

import java.util.Scanner;

public class SumArrayDemo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[],sum=0,index[];
			System.out.println("Enter the no of element in array:");
			int no=s.nextInt();
			arr=new int[no];
			index=new int[no];
			
			for(int i=0;i<no;i++)
			{
				arr[i]=s.nextInt();
			}
			
			
			for(int i=0;i<no;i++)
			{
				sum=sum+arr[i];
			}
			
			for(int i=0;i<no;i++)
			{
				index[i]=sum-arr[i];
				System.out.print(index[i]+" ");
			}
			
		
		
		
	}

}

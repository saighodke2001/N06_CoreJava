package org.tnsif.codingchallenge;

import java.util.Scanner;

public class SumArrayDemo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arr[];
			System.out.println("Enter the no of element in array:");
			int no=s.nextInt();
			arr=new int[no];
			for(int i=0;i<no;i++)
			{
				arr[i]=s.nextInt();
			}
			
			
			int left[]=new int[arr.length];
			
			int right[]=new int[arr.length];
			
			left[0]=1;
			for(int j=1;j<arr.length;j++)
			{
				left[j]=left[j-1]+arr[j-1];
				
			}
				
			right[arr.length-1]=1;
			for(int j=arr.length-2;j>-1;j--)
			{
				right[j]=right[j+1]+arr[j+1];
			}
			
			int ans[]=new int[arr.length];
			for(int j=0;j<arr.length;j++)
			{
				ans[j]=left[j]+right[j];
				System.out.println(ans);
			}
			
			
			
		
		
		
	}

}

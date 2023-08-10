package org.tnsif.multidimensionalarray;

import java.util.Scanner;

public class TwoMDimentionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		//2D array declaration
		
		int arr[][]=new int[3][2];
		
		System.out.println("Enter the element in 2D array");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		
		
	}

}

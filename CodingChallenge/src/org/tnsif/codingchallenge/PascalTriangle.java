//Pascal triangle without using list
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class PascalTriangle {
	
	public static void pascal(int n)
	{
		for(int line=1;line<=n;line++)
		{
			int c=1;
			for(int i=1;i<=line;i++)
			{
				System.out.print(c+" ");
				c=c*(line-i)/i;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n=s.nextInt();
		
		pascal(n);
		
	
	}

}

/*Given an array nums of n integer where n is greater than 1 return an array output such 
 * that output (i= product of all the elements ofnums except nums of ith index)
input: [1,2,3,4]
output:24, 12, 8,6
*/

package org.tnsif.codingchallenge;

import java.util.Scanner;

public class MulArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
			System.out.println("Enter the no of element in array:");
			int n=s.nextInt();
			int arr[]=new int[n];
			int index[]=new int[n];
			int mul=1;
			for(int i=0;i<n;i++)
			{
				arr[i]=s.nextInt();
			}
		
			for(int i=0;i<n;i++)
			{
				mul=mul*arr[i];
			}
			
			for(int i=0;i<n;i++)
			{
				index[i]=mul/arr[i];
				System.out.print(index[i]+" ");
				
			}
		
		
	}

}

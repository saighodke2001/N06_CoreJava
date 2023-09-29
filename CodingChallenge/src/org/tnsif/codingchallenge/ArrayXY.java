/*Question: 
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:
Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7] 
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

Example 2:
Input: nums = [1,2,3,4,4,3,2,1], n = 4
Output: [1,4,2,3,3,2,4,1]

Example 3:
Input: nums = [1,1,2,2], n = 2
Output: [1,2,1,2]*/

package org.tnsif.codingchallenge;
import java.util.*;

public class ArrayXY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=s.nextInt();
		
		n=2*n;
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int i=0;
		int j=n/2;
		
		while(i<n/2 && j<n)
		{
			System.out.print(arr[i]+" ");
			i++;
			System.out.print(arr[j]+" ");
			j++;
		}
		
	}

}

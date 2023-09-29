/*Question : Given an array Arr[] of N integers. Find the contiguous
 *  sub-array(containing at least one number) which has the maximum sum
 *   and return its sum.

Input: N = 5, Arr[] = {1,2,3,-2,5}
Output: 9*/
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class KadanesAlgorithm {

	public static long largestSum(int arr[],int n)
	{
		int sum=arr[0];
		int max_sum=arr[0];
		
		for(int i=1;i<n;i++)
		{
			if(sum>=0)
			{
				sum=sum+arr[i];
			}
			max_sum=Math.max(max_sum, sum);
		}
		return max_sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=s.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the elements in array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		long sum=largestSum(arr,n);
		System.out.println(sum);

	}

}

/*
 * Given an array of integers nums and an integer target, 
 * return indices of the two numbers such that they add up to
 *  target.

You may assume that each input would have
 exactly one solution, and you may not use the same 
 element twice.

You can return the answer in any order.

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
*/
package org.tnsif.codingchallenge;

import java.util.Scanner;

public class TwoSum {
	public static void TwoSumNo(int[] arr, int n,int target) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]+arr[j]==target)
				{
					System.out.println(i+" "+j);
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("Entert the target:");
		int target=s.nextInt();
		
		TwoSumNo(arr,n,target);
		
	}

	

}

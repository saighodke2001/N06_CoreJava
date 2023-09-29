package com.tnsif.Multithreading;

public class Operation {

	public static int getFact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(Thread.currentThread());
		return fact;
	}
	
	public static boolean isPrime(int n)
	{
		boolean flag=true;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		System.out.println(Thread.currentThread());
		return flag;
		
		
	}
	
}

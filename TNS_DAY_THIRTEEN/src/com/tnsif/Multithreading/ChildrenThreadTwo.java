package com.tnsif.Multithreading;

public class ChildrenThreadTwo extends Thread{
	public void run()
	{
		System.out.println("Prime no is:"+Operation.isPrime(5));
	}

}

package com.tnsif.Multithreading;

public class ChildreanThreadOne  extends Thread{
	public void run()
	{
		System.out.println("Factorial of no is:"+Operation.getFact(4));
	}

}

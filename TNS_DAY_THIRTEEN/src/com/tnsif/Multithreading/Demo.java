package com.tnsif.Multithreading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("In Main"+Thread.currentThread());
		//System.out.println("Factorial of no is:"+Operation.getFact(4));
		
		ChildreanThreadOne t1=new ChildreanThreadOne();
		t1.start();
		ChildrenThreadTwo t2=new ChildrenThreadTwo();
		t2.start();
		try {
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		
		{
			System.out.println(e);
		}
		System.out.println("--------------------------------------------");
		//System.out.println("Factorial of no is:"+Operation.isPrime(5));
		//System.out.println("Is Prime no :"+Operation.isPrime(5));
		//System.out.println("Is Prime no :"+Operation.isPrime(50));
	}

}

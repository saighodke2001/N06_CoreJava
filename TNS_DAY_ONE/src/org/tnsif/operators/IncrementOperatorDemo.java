package org.tnsif.operators;

public class IncrementOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=23,y=6;
		int res=x++ + ++y;
		System.out.println("Result"+res);
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		
		int res2=x-- + --y;
		System.out.println("Result"+res2);
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		
	}

}

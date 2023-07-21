package org.tnsif.operators;
import java.util.*;
public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int num;
		System.out.println("Enter Number:");
		num=s.nextInt();
		
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("Result is:"+result);
	}

}

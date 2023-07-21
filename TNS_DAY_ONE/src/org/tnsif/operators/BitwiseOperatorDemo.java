package org.tnsif.operators;
import java.util.*;
public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two Numbers :");
		int n1=s.nextInt();
		int n2=s.nextInt();
		
		System.out.println("n1 & n2 :"+(n1&n2));
		System.out.println("n1 | n2 :"+(n1|n2));
		System.out.println("n1 ^ n2 :"+(n1^n2));
	}
	

}

package org.tnsif.decisionmaking;
import java.util.*;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age and weight");
		int age=s.nextInt();
		int weight=s.nextInt();
		
		if(age>=18 && weight>=50)
		{
			System.out.println("Eligible to Donate the blood");
		}
		else
		{
			System.out.println("Not Eligible to Donate the blood");
		}
	}

}

package org.tnsif.decisionmaking;
import java.util.*;
public class CascadedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Age1, Age2 and Age3 :");
		int age1=s.nextInt();
		int age2=s.nextInt();
		int age3=s.nextInt();
		
		if(age1>=age2 && age1>=age3)
		{
			System.out.println("Age1 is greater");
		}
		else if(age2>=age1 && age2>=age3)
		{
			System.out.println("Age2 is greater");
		}
		else
		{
			System.out.println("Age3 is greater");
		}
		
	}

}

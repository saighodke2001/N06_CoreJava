package org.tnsif.codingchallenge;
import java.util.*;

public class MovieTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the age and time :");
		int age=s.nextInt();
		double time=s.nextDouble();
		
		if(time==10.15 && age>13)
		{	
			System.out.println("$8.00");
			
		}
		else if(time==10.15 && age<13)
		{
			System.out.println("$4.00");
		}
		else if(time==13.30 && age>13)
		{
			System.out.println("$5.00");
		}
		else if(time==13.30 && age<13)
		{
			System.out.println("$2.00");
		}
		else if(time==18.00 || time==22.00 && age>13)
		{
			System.out.println("$8.00");
		}
		else if(time==18.00 || time==22.00 && age<13)
		{
			System.out.println("$4.00");
		}
		else
		{
			System.out.println("Enter Valid Movie Time!!");
		}
	}
		
}



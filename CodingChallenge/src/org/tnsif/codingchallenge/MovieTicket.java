package org.tnsif.codingchallenge;
import java.util.*;



public class MovieTicket {

	static void ticketPrice(int age, double time)
	{
		//adult
		if(age>13)
		{
			if(time>=13.30 && time<=17.59)
			{
				System.out.println("$5.00");
			}
			else
			{
				System.out.println("$8.00");
			}
		}
		//children
		else
		{
			if(time>=13.30 && time<=17.59)
			{
				System.out.println("$2.00");
			}
			else
			{
				System.out.println("$4.00");
			}
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the age and time :");
		int age=s.nextInt();
		double time=s.nextDouble();
		
		ticketPrice(age,time);
	}
		
}



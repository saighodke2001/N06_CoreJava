/* Ask the user for there birth year encoded as two digit(like "03") and for the current year asls encoded as two 
 * digit (like "23") .write a program to find the user current age in years*/
package org.tnsif.codingchallenge;
import java.util.*;

public class AgeCalculatorExecutor {
	
	
	static void calculateAge(int b,int c)
	{
		if(c>b)
		{
			System.out.println(c-b);
		}
		else
		{
			System.out.println((100-b)+c);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Birth year and Current year :");
		int b=s.nextInt();
		int c=s.nextInt();
		calculateAge(b,c);
		

	}

}

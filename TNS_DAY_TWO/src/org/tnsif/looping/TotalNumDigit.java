package org.tnsif.looping;
import java.util.*;
public class TotalNumDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a Number:");
		String num=s.next();
		
		int count=0;
		int n=num.length();
		
		for(int i=1;i<=n;i++)
		{
			count++;
		}
		System.out.println(count);
		
		
		
	}

}

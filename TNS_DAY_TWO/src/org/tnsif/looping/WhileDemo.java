package org.tnsif.looping;
import java.util.*;
public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		
		while(n>=1)
		{
			System.out.print(n+" ");
			n--;
		}
			
	}

}

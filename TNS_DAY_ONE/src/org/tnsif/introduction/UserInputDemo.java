//Program to demonstrate on User-Input
package org.tnsif.introduction;
import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		//String
		
		System.out.println("Enter a String");
		//next() 
		String str=s.next();
		System.out.println("String is "+str);
		
		System.out.println("Enter a String");
		//nextLine()
		String str1=s.nextLine();
		System.out.println("String is "+str1);
		
		
		
		//int
		System.out.println("Enter Integer");
		int num=s.nextInt();
		System.out.println("Integer is"+num);
		
		//char
		System.out.println("Enter a String");
		char c=s.next().charAt(0);
		System.out.println("Character at 0 index:"+c);
		
		
	}

}

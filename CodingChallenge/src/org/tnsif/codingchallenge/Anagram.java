package org.tnsif.codingchallenge;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	
	 static boolean isAnagram(String str1, String str2) {
		// TODO Auto-generated method stub
		 
		 str1=str1.toLowerCase();
		 str2=str2.toLowerCase();
		 
		 char a[]=str1.toCharArray();
		 char b[]=str2.toCharArray();
		 Arrays.sort(a);
		 Arrays.sort(b);
		 
		 if(a.length!=b.length)
		 {
			 return false;
		 }
		 
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		
		boolean ret=isAnagram(str1,str2);
		
		if(ret==true)
		{
			System.out.println("Is Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}
		
	
	}

	

}

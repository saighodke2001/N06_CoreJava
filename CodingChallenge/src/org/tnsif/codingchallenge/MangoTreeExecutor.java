/* Darshan is very much interested in gardening and hence he plants more
 * trees in his garden. he plants trees in a rectangular fashion with the order of rows and 
 * columns and numbers the trees in row wise order. he planted the mango tree in the first row
 * first column and last column so given the tree(t) no and row and column no(n) your task
 * is to find out whether a given tree is mango tree or not*/

package org.tnsif.codingchallenge;
import java.util.*;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
	}

}

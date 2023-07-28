/*There are n people standing in a circle waiting to be executed.
 * the counting out begins at some point in the circle and proceds
 * around the circle in a fixed direction.
 * in each step a certain no of people are skipped and the next person
 * is executed. the elemination proceeds around the circle(which is
 * becoming smaller and smaller are the executed people are removed),until 
 * only the last person remains, who is given freedom.
 * 
 * given:
 * the total no of person n and a number k which indicates that k-1 person
 * are skiped and k person is killed in a circle
 * the task is to choose person in the initial circle that survived*/

package org.tnsif.dayfourchallenge;
import java.util.*;

public class CircleSurvivedChallenge {

	static int survive(int n,int k)
	{
		if(n==1)
			return 1;
		else
			return (survive(n-1,k)+k-1)%n+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter a value for n and k:");
		int n=s.nextInt();
		int k=s.nextInt();
		
		System.out.println(survive(n,k));
		
	}

}

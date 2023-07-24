//Program to demonstrate switch case
package org.tnsif.decisionmaking;
import java.util.*;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Song no between 1-3:");
		int songno=s.nextInt();
		
		
		switch(songno)
		{
		case 1:
			System.out.println("Waka waka ");
			break;
			
		case 2:
			System.out.println("Taki Taki");
			break;
			
		case 3:
			System.out.println("Jai shree Ram");
			break;
			
		default:
			System.out.println("Wrong choice");
			break;
			
		}
		
	}

}

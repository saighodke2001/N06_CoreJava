package org.tnsif.codingchallenge;
import java.util.*;

public class Microwave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner s=new Scanner(System.in);
			System.out.println("Enter Atom and heating time:");
			int atom=s.nextInt();
			double heatTime=s.nextDouble();
			double total;
			
			switch(atom)
			{
			case 1:
				total=heatTime;
				System.out.println(total);
				break;
				
			case 2:
				total=heatTime+(heatTime/2);
				System.out.println(total);
				break;
				
			case 3:
				total=2*heatTime;
				System.out.println(total);
				break;
			
			default:
				System.out.println("Is not Recommended!");
			
			}	
}

}

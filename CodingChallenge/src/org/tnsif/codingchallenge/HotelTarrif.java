package org.tnsif.codingchallenge;
import java.util.*;
public class HotelTarrif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		int month, rent,day, total,total1;
		
		System.out.println("Enter month No. rent and days:");
		month=s.nextInt();
		rent=s.nextInt();
		day=s.nextInt();
		
		switch(month)
		{
		case 4:
			total1=rent*20/100;
			total=rent*day+total1;
			System.out.println(total);
			break;
			
		case 5:
			total1=rent*20/100;
			total=rent*day+total1;
			System.out.println(total);
			break;
			
		case 6:
			total1=rent*20/100;
			total=rent*day+total1;
			System.out.println(total);
			break;
		case 11:
			total1=rent*20/100;
			total=rent*day+total1;
			System.out.println(total);
			break;
		case 12:
			total1=rent*20/100;
			total=rent*day+total1;
			System.out.println(total);
			break;
		
		default:
			total=rent*day;
			System.out.println(total);
			
			
			
			
		}
		
		
		
	}

}

package org.tnsif.thiskeyworddemo;

class Team
{
	int size;
	Team()
	{
		//calling parameterized Constructor
		this(7);
		System.out.println("Default Constructor");
	}
	
	Team(int size)
	{
		System.out.println("Parameterized Constructor:"+size);
	}
}
public class ThisKeyWordDemoThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team t=new Team();

		
	}

}

package org.tnsif.uncheckedexception;

public class ThrowandThrowsKeywordDemo {

	static void isEligible(int age, int weight)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Person is Eligible to donate the blood");
		}
		else
		{
			//throw keyword is used to throw the excetion explicitly
			throw new ArithmeticException("Criteria is not Satisfied");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int age=15;
		int weight=40;
		
		try
		{
			isEligible(age,weight);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}

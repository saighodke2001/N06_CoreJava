package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutor  {

	public static void main(String[] args) //throws LoginCredentials
	{
		
		Scanner s=new Scanner(System.in);
		String userid=s.nextLine();
		String password=s.nextLine();
		
		try {
			if(userid.equals("Sai") && password.equals("Pass@123"))
			{
				System.out.println("Credentials are Matched!!");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}

		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception Handled: "+e);
		}
	}

}

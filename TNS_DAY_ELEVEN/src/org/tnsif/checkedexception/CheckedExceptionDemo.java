package org.tnsif.checkedexception;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream f=new FileInputStream("C:\\Users\\Shree\\Downloads\\BE Final Year Project Topic.txt");
			System.out.println("File is Exists!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Handled!"+e);
		}
}

}

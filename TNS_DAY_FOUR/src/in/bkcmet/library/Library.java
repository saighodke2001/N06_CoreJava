//Program to demonstrate on Access specifier
package in.bkcmet.library;

public class Library {
	public String libraryName;
	private long userId;
	String bookName;
	
	//public method
	public void displayPublic()
	{
		System.out.println("Library Name:"+libraryName);
	}
	
	//private method
	private void displayPrivate()
	{
		System.out.println("User id:"+userId);
	}
	
	//default method
	 void displayDefault()
	{
		System.out.println("Book Name:"+bookName);
	}
	

}

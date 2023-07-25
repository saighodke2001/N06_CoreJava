//program to demonstrate on defzult and parameterized constructor
package org.tnsif.classandobject;

//class declaration
public class Library {
	
	public long noOfBooks;
	public String authorname;
	public String bookName;
	public  double price;
	
	//Default constructor
	public Library() {
		
		System.out.println("Default Constructor");
	}


	//Parameterized Constructor
	public Library(long noOfBooks, String authorname, String bookName, double price) {
		super();
		this.noOfBooks = noOfBooks;
		this.authorname = authorname;
		this.bookName = bookName;
		this.price = price;
		System.out.println("Parameterized Constructor");
	}


	@Override
	public String toString() {
		return "Library [noOfBooks=" + noOfBooks + ", authorname=" + authorname + ", bookName=" + bookName + ", price="
				+ price + "]";
	}
	
	

}

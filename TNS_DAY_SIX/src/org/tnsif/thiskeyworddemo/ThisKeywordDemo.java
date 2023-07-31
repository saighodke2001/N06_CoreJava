//this keyword is used to refer current instance of the class
package org.tnsif.thiskeyworddemo;

class Account
{
	long accountNo;
	
	void display()
	{
		System.out.println(accountNo);
	}
	
	void setData(long accountNo)
	{
		this.accountNo=accountNo;
	}
}

public class ThisKeywordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account a=new Account();
		a.setData(1234567823);
		a.display();
		
	}

}

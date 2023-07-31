package org.tnsif.thiskeyworddemo;


class Bank
{
	long accountNo;
	
	Bank(long accountNo)
	{
		this.accountNo=accountNo;
		
		
		
		

	}
	void display()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank(12345678);
		b.display();
	}

}

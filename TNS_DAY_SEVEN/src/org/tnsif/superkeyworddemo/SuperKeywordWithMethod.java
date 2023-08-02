package org.tnsif.superkeyworddemo;

class MET
{
	String ownerName="Chagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is:"+ownerName);
	}
}

class BKC extends MET
{
	String ownerName="Shefali Bhujbal";
	void displayName()
	{
		/*if parent class and child class  method name are same and
		 * if you want to access that method inside child class then use
		 * super.methodName();*/
		
		super.displayName();
		System.out.println("Owner is:"+ownerName);
	}
}
public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BKC b=new BKC();
		b.displayName();
	}

}

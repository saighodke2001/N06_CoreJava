package org.tnsif.superkeyworddemo;


class Google
{
	String ceo;

	public Google(String ceo) {
		System.out.println("CEO is:"+ceo);
	}
	

	
}

class Gmail extends Google
{

	String userid;

	public Gmail(String ceo, String userid) {
		//calling to parent class Parameterized constructor
		super(ceo);
		this.userid = userid;
		System.out.println("UserId is:"+userid);
	}
	
	
	
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gmail c=new Gmail("Sundar Pichai","abc@gmail.com");

	}

}

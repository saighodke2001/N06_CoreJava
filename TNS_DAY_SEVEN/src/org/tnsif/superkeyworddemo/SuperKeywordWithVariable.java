package org.tnsif.superkeyworddemo;

class Building
{
	int floors=23;
	String name="Astha";
	
	
	
}
class Flat extends Building
{
	String name="Sai Ghodke";
	
	void print()
	{	
		/* If parent class and child class variable name are same
		 * and if you want to access parent class variable inside child class 
		 * then we used super keyword*/
		System.out.println(super.name);
		System.out.println(name);
		
	}
}
public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flat f=new Flat();
		
		f.print();
	}

}

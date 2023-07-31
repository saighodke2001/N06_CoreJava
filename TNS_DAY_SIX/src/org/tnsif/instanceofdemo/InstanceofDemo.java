package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode="RBISONGPA01";
	
}

class SBI extends RBI
{
	public SBI()
	{
		//super.ifscCode="RBISONGPA01";
		String ifscCode="SBIN0002161";
		System.out.println(ifscCode);
		System.out.println(super.ifscCode);
		
		/*
		 * If Parent class and child class variable name are same, in such case, 
		 * use super.variablename to access variable of parent class inside the child class*/
	}
	
	
}
public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			SBI s=new SBI();
			System.out.println(s instanceof SBI);
			System.out.println(s instanceof RBI);
			
	}

}

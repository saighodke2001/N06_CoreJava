package org.tnsif.encapsulation;

public class EncapsulationExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HDFC h=new HDFC();
		h.setAccType("Saving Account");
		h.setAccountNo(12345678);
		h.setAtmCardNo(1234567);
		h.setPinNo(1234);
		
		
		System.out.println("Account no is:"+h.getAccountNo());
		//below line will call toString Method
		System.out.println(h);
		
	}

}

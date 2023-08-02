package org.tnsif.statickeyworddemo;

public class StaticBlockExecutor {

	
	static String name;
	//only static variable can be initialize in static block
	static {
		
		name="Sai";
		System.out.println("Name is:"+name);

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Main  function is static anfd hence it call method without creating  anything*/
	}

}

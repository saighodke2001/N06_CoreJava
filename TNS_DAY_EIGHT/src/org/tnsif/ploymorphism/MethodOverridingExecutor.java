package org.tnsif.ploymorphism;

class CM
{
	static void corruption(String str1,float amount1)
	{
		System.out.println(str1+" Corrupt the amount of "+amount1);
	}
}

class MLA extends CM
{
	static void corruption(String str2,float amount2)
	{
		CM.corruption("Ajit Pawar", 546357.333f);
		System.out.println(str2+" Corrupt the amount of "+amount2);
	}
	
}
public class MethodOverridingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MLA.corruption("ABC XYZ", 345477.5677f);
		
	}

}

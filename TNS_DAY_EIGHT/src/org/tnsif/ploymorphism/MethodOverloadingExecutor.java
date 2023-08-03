package org.tnsif.ploymorphism;


class Bollywood
{
	//method overloading in terms of by passing the diff no of parameter
	static String showCouple(String str1,String str2)
	{
		return str1+" Loves "+str2;
	}
	
	static String showCouple(String str1,String str2,String str3)
	{
		return str1+" Loves "+str2+" hates "+str3;
	}
}
public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bollywood b=new Bollywood();
		System.out.println(b.showCouple("Salman", "Aishwarya"));
		System.out.println(b.showCouple("Salman","Aishwarya","Katrina"));
	}

}

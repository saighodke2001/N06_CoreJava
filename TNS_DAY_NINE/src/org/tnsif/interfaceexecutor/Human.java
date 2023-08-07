package org.tnsif.interfaceexecutor;

public class Human implements ColdDrinks,AlcohalDrinks {

	@Override
	public void showDrink() {
		// TODO Auto-generated method stub
		System.out.println(coldDrinkName +" "+ alcoholType+" "+brand);
	}

}

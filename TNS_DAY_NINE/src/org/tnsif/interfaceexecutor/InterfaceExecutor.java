package org.tnsif.interfaceexecutor;


//driver class
public class InterfaceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//We can not create the object of an interface
		
		SonySub s=new SonySub();
		s.display();
		s.show();
		Sony.accept();
		
		//functional interface
		Isro i=new Isro();
		i.status();
		
		Human h=new Human();
		h.showDrink();
		
		
	}

}

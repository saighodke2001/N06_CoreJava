package org.tnsif.singledimentionalarray;

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employees arr[]=new Employees[3];
		arr[0]=new Employees(101,"Sai",670000.00);
		arr[1]=new Employees(102,"Rahul",770000.00);
		arr[2]=new Employees(103,"Avinash",680000.00);
		
		for(int i=0;i<3;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
	}

}

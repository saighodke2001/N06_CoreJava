package org.tnsif.statickeyworddemo;

class Employee
{
	private int empid;
	private String name;
	private static String companyName="TNSIF";
	
	//getter and setter
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	
	void display()
	{
		System.out.println("Emp Id :"+this.getEmpid()+" "+"EmpName : "+this.getName()+" "+"Company Name :"+this.getCompanyName());
	}
	
	
	
	
}
public class StaticVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.setEmpid(1);
		e.setName("Sai");
		
		e.display();
		
		Employee e1=new Employee();
		e1.setEmpid(2);
		e1.setName("Sara");
		
		e1.display();
	}

}

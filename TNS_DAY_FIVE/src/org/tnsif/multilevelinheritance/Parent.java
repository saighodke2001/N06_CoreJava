package org.tnsif.multilevelinheritance;

//parent class
public class Parent extends GrandParent {

	private String pname;
	private long parentproperty;
	
	//getter and setter
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getParentproperty() {
		return parentproperty;
	}
	public void setParentproperty(long parentproperty) {
		this.parentproperty = parentproperty;
	}
	public Parent(String surname, long property,String pname,long parentproperty) {
		super(surname, property);
		// TODO Auto-generated constructor stub
		
		this.pname=pname;
		this.parentproperty=parentproperty;
	}
	@Override
	public String toString() {
		return "Parent [pname=" + pname + ", parentproperty=" + parentproperty + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
	
	
	
	
	
	
}

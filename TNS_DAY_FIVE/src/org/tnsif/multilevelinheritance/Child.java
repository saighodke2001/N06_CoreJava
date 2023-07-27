package org.tnsif.multilevelinheritance;

public class Child extends Parent {

	private String cname;
	private long childproperty;
	
	//getter and setter
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getChildproperty() {
		return childproperty;
	}
	public void setChildproperty(long childproperty) {
		this.childproperty = childproperty;
	}
	
	//parameterized constructor
	public Child(String surname, long property, String pname, long parentproperty,String cname,long childproperty) {
		super(surname, property, pname, parentproperty);
		// TODO Auto-generated constructor stub
		
		this.cname=cname;
		this.childproperty=childproperty;
	}
	@Override
	public String toString() {
		return "Child [cname=" + cname + ", childproperty=" + childproperty + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	
}

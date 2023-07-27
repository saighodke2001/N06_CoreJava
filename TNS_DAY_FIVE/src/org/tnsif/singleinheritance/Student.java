package org.tnsif.singleinheritance;

public class Student extends Citizen {

	private int rollno;
	private String collegeName;
	
	//getter setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public Student(String city, int pincode, String area, long adarNo,int rollno,String collegeName) {
		super(city, pincode, area, adarNo);
		// TODO Auto-generated constructor stub
		
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
}

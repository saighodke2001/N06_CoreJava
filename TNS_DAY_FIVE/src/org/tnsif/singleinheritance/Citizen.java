package org.tnsif.singleinheritance;

public class Citizen {

	//private data members
	
	private String city;
	private int pincode;
	private String area;
	private long adarNo;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public long getAdarNo() {
		return adarNo;
	}
	public void setAdarNo(long adarNo) {
		this.adarNo = adarNo;
	}
	
	//toString method
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adarNo=" + adarNo + "]";
	}
	
	//default constructor
	public Citizen() {
		System.out.println("Citizen-Parent Class");
	}
	
	//parameterized constructor
	public Citizen(String city, int pincode, String area, long adarNo) {
		super(); //it call default constructor
		this.city = city;
		this.pincode = pincode;
		this.area = area;
		this.adarNo = adarNo;
	}
	
	
	
	
	
	
}

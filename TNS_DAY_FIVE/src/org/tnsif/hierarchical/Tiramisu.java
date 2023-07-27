package org.tnsif.hierarchical;

public class Tiramisu extends Android{

	
	private int varsion;
	
	
	public int getVarsion() {
		return varsion;
	}


	public void setVarsion(int varsion) {
		this.varsion = varsion;
	}


	public Tiramisu(String brand, String slotType,int version) {
		super(brand, slotType);
		// TODO Auto-generated constructor stub
		
		this.varsion=version;
		
	}


	@Override
	public String toString() {
		return "Tiramisu [varsion=" + varsion + ", toString()=" + super.toString() + "]";
	}
	

	
	
}

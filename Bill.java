package oop.indwes.entites;

public class Bill {
	
	private double billAmount; // Bill amount
	private String billType; //Name of bill
	
	public Bill(String billType, double billAmount) {
		this.billType = billType;
		this.billAmount = billAmount;
	}
	
	public Bill(int billAmount) {
		this.billAmount = billAmount;
	}

	public String toString() {
		return("The " + billType + " bill is $" + billAmount +".");
	}
	
	public double getBillAmount() {
		return billAmount;
	}
	
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	
	public String getBillType() {
		return billType;
	}
	
	public void setBillType(String billType) {
		this.billType = billType;
		
	}

	
}

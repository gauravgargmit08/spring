package com.term.model;


public class DisplayQuote {
	
	private double premium;
	private String location;
	private String tobacco;
	private double amount;
	private int insurance_type;
	private String tenure;
	private String companyName;
	
	public DisplayQuote(){
	}
	
	public DisplayQuote(double premium, String location, String tobacco,
			double amount, int insurance_type, String tenure, String companyName) {
		super();
		this.premium = premium;
		this.location = location;
		this.tobacco = tobacco;
		this.amount = amount;
		this.insurance_type = insurance_type;
		this.tenure = tenure;
		this.companyName = companyName;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getTobacco() {
		return tobacco;
	}
	public void setTobacco(String tobacco) {
		this.tobacco = tobacco;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getInsurance_type() {
		return insurance_type;
	}
	public void setInsurance_type(int insurance_type) {
		this.insurance_type = insurance_type;
	}
	public String getTenure() {
		return tenure;
	}
	public void setTenure(String tenure) {
		this.tenure = tenure;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}

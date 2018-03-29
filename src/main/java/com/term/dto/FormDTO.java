package com.term.dto;

public class FormDTO {
	

	private int age;
	private String location;
	private String tobacco;
	private double amount;
	private int insurance_type;
	private String tenure;
	
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	
	
	public FormDTO(){
	}
	
	public FormDTO(int age, String location, String tobacco, double amount,
			int insurance_type, String tenure) {
		super();
		this.age = age;
		this.location = location;
		this.tobacco = tobacco;
		this.amount = amount;
		this.insurance_type = insurance_type;
		this.tenure = tenure;
	}

}

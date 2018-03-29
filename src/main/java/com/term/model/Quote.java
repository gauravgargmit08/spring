package com.term.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="quotes_info")
public class Quote {


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	
	public Quote(int id, String location, String tobacco, double amount,
			int insurance_type, String tenure, String companyName,
			int basePremium) {
		super();
		this.id = id;
		this.location = location;
		this.tobacco = tobacco;
		this.amount = amount;
		this.insurance_type = insurance_type;
		this.tenure = tenure;
		this.companyName = companyName;
		this.basepremium = basePremium;
	}


	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column
	private String location;
	@Column
	private String tobacco;
	@Column
	private double amount;
	@Column
	private int insurance_type;
	
	@Column
	private String tenure;
	
	@Column(name="companyname")
	private String companyName;
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getBasepremium() {
		return basepremium;
	}

	public void setBasepremium(int basepremium) {
		this.basepremium = basepremium;
	}


	@Column(name="basepremium")
	private int basepremium;
	
	
	
	public Quote() {
	}
	
	
}

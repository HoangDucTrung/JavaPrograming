package com.trunghd;

public class VipPerson {
	private String name;
	private double creditLimt;
	private String emailAddress;
	
	public VipPerson() {
		this("Default name", 50000.00,"default@email.com");
	}
	
	public VipPerson(String name, double creditLimt) {
		this(name, creditLimt, "unknown@email.com");
	}

	public VipPerson(String name, double creditLimt, String emailAddress) {
		super();
		this.name = name;
		this.creditLimt = creditLimt;
		this.emailAddress = emailAddress;
	}

	public double getCreditLimt() {
		return creditLimt;
	}

	public void setCreditLimt(double creditLimt) {
		this.creditLimt = creditLimt;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

package com.wf.ibs.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Beneficiary {

	private String bank;
	private String samebank;
	private String otherbank;
	@NotNull(message="AccountNumber is required")
	@Size(min=5,max=12) 
	@Pattern(regexp="^[0-9]*$")
	private String AccountNumber;
	private String FirstName;
	private String LastName;
	@Size(min=10, max=12) 
	private String PhoneNumber;
	@NotEmpty @Email
	private String EmailID;
	
	
	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getSamebank() {
		return samebank;
	}
	public void setSamebank(String samebank) {
		this.samebank = samebank;
	}
	public String getOtherbank() {
		return otherbank;
	}
	public void setOtherbank(String otherbank) {
		this.otherbank = otherbank;
	}
	public String getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		AccountNumber = accountNumber;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
	
}

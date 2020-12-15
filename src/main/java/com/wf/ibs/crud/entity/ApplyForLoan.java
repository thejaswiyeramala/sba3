package com.wf.ibs.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ApplyForLoan {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique AI value 
	private Long loanid;
	private String loanType;
	private String loanDuration;
	private String loanAmount;
	private String loanDescription;
	
	/*
	 * @OneToOne(mappedBy="ApplyForLoan") private PayEMI id;
	 */
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(String loanDuration) {
		this.loanDuration = loanDuration;
	}
	public String getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(String loanAmount) {
		this.loanAmount = loanAmount;
	}
	public String getLoanDescription() {
		return loanDescription;
	}
	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}
	public Long getLoanid() {
		return loanid;
	}
	public void setLoanid(Long loanid) {
		this.loanid = loanid;
	}
	/*
	 * public PayEMI getId() { return id; } public void setId(PayEMI id) { this.id =
	 * id; }
	 */
}

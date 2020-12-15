package com.wf.ibs.crud.dto;

import javax.validation.constraints.NotNull;

public class LoansManagementOutputDto {
	private Long id;
	private String loanType;
	private String loanDuration;
	@NotNull(message="Amount is required")
	private String loanAmount;
	private String loanDescription;
	private String pickDate;
	private String CardNumber;
	private String expiryDate;
	@NotNull(message="CVV is required")
	private String CVV;
	@NotNull(message="Amount is required")
	private String enterAmount;
	private String cardType;
	@NotNull(message="loanID is required")
	private String loanID;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoanID() {
		return loanID;
	}
	public void setLoanID(String loanID) {
		this.loanID = loanID;
	}
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
	public String getPickDate() {
		return pickDate;
	}
	public void setPickDate(String pickDate) {
		this.pickDate = pickDate;
	}
	public String getCardNumber() {
		return CardNumber;
	}
	public void setCardNumber(String cardNumber) {
		CardNumber = cardNumber;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getCVV() {
		return CVV;
	}
	public void setCVV(String cVV) {
		CVV = cVV;
	}
	public String getEnterAmount() {
		return enterAmount;
	}
	public void setEnterAmount(String enterAmount) {
		this.enterAmount = enterAmount;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
}

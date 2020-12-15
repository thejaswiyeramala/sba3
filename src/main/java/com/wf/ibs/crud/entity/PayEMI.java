package com.wf.ibs.crud.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class PayEMI {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique AI value 
	private Long id;
	private String pickDate;
	private String CardNumber;
	private String expiryDate;
	private String CVV;
	private String enterAmount;
	private String cardType;
	
	/*
	 * @OneToOne(cascade=CascadeType.ALL) private ApplyForLoan loanid;
	 */
	/*
	 * public ApplyForLoan getApplyForLoan() { return loanid; } public void
	 * setApplyForLoan(ApplyForLoan applyForLoan) { this.loanid = applyForLoan; }
	 */
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

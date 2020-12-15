package com.wf.ibs.crud.dto;

import javax.validation.constraints.NotNull;

public class PayEMIOutputDto {
	private Long id;
	private String pickDate;
	private String CardNumber;
	private String expiryDate;
	@NotNull(message="CVV is required")
	private String CVV;
	@NotNull(message="Amount is required")
	private String enterAmount;
	private String cardType;
	
	
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

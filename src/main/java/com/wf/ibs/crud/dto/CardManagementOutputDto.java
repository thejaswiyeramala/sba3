package com.wf.ibs.crud.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CardManagementOutputDto {
	private Long id;
	private String cardCategory;
	private String cardType;
	@NotNull(message="existingPin is required")
	@Size(min=5,max=12)
	private String existingPin;
	@NotNull(message="newPin is required")
	@Size(min=5,max=12)
	private String newPin;
	@NotNull(message="pickDate is required")
	private String pickDate;
	@NotNull(message="cardNumber is required")
	private String cardNumber;
	private String reason;
	@NotNull(message="cardRequestID is required")
	private String cardRequestID;
	private String comments;
	@NotNull(message="UCI is required")
	private String UCI;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	

	public String getCardRequestID() {
		return cardRequestID;
	}
	public void setCardRequestID(String cardRequestID) {
		this.cardRequestID = cardRequestID;
	}
	public String getUCI() {
		return UCI;
	}
	public void setUCI(String uCI) {
		UCI = uCI;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getPickDate() {
		return pickDate;
	}
	public void setPickDate(String pickDate) {
		this.pickDate = pickDate;
	}
	public String getExistingPin() {
		return existingPin;
	}
	public void setExistingPin(String existingPin) {
		this.existingPin = existingPin;
	}
	public String getNewPin() {
		return newPin;
	}
	public void setNewPin(String newPin) {
		this.newPin = newPin;
	}
	public String getCardCategory() {
	return cardCategory;
}
public void setCardCategory(String cardCategory) {
	this.cardCategory = cardCategory;
}
public String getCardType() {
	return cardType;
}
public void setCardType(String cardType) {
	this.cardType = cardType;
}


}

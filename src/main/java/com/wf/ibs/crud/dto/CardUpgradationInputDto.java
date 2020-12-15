package com.wf.ibs.crud.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CardUpgradationInputDto {
	private Long id;
	private String cardCategory;
	private String cardType;
	private String cardNumber;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
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

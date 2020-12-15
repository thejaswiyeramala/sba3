package com.wf.ibs.crud.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ApplyCardInputDto {
	private Long id;
	private String cardCategory;
	private String cardType;
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

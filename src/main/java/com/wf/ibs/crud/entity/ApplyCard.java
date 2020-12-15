package com.wf.ibs.crud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class ApplyCard {
	@Id  // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // unique AI value 
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

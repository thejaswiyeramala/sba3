package com.wf.ibs.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.CardManagementInputDto;
import com.wf.ibs.crud.dto.CardManagementOutputDto;
import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.CardManagement;
import com.wf.ibs.crud.repository.CardManagementRepository;

// @Component
@Service
public class CardManagementServiceImpl implements CardManagementService {
	
	@Autowired
	private CardManagementRepository cardManagementRepository;

	private CardManagementOutputDto convertEntityToOutputDto(CardManagement cardManagement) {
		CardManagementOutputDto cardManagementOutputDto = new CardManagementOutputDto();
		cardManagementOutputDto.setId(cardManagement.getId());
		cardManagementOutputDto.setExistingPin(cardManagement.getExistingPin());
		cardManagementOutputDto.setNewPin(cardManagement.getNewPin());
		cardManagementOutputDto.setPickDate(cardManagement.getPickDate());
		cardManagementOutputDto.setCardNumber(cardManagement.getCardNumber());
		cardManagementOutputDto.setCardRequestID(cardManagement.getCardRequestID());
		cardManagementOutputDto.setUCI(cardManagement.getUCI());
		return cardManagementOutputDto;
	}
	
	private CardManagement convertInputDtoToEntity(CardManagementInputDto cardManagementInputDto) {
		CardManagement cardManagement = new CardManagement();
		cardManagement.setExistingPin(cardManagementInputDto.getExistingPin());
		cardManagement.setNewPin(cardManagementInputDto.getNewPin());
		cardManagement.setPickDate(cardManagementInputDto.getPickDate());
		cardManagement.setCardNumber(cardManagementInputDto.getCardNumber());
		cardManagement.setCardRequestID(cardManagementInputDto.getCardRequestID());
		cardManagement.setUCI(cardManagementInputDto.getUCI());
		return cardManagement;
	}
	
	private CardManagement convertApplyCardToEntity(CardManagementInputDto cardManagementInputDto) {
		CardManagement cardManagement = new CardManagement();
		cardManagement.setCardCategory(cardManagementInputDto.getCardCategory());
		cardManagement.setCardType(cardManagementInputDto.getCardType());
		return cardManagement;
	}
	
	private CardManagementOutputDto convertApplyCardToOutputDto(CardManagement cardManagement) {
		CardManagementOutputDto cardManagementOutputDto = new CardManagementOutputDto();
		cardManagementOutputDto.setCardCategory(cardManagement.getCardCategory());
		cardManagementOutputDto.setCardType(cardManagement.getCardType());
		return cardManagementOutputDto;
	}

	@Override
	public List<CardManagementOutputDto> fetchAllDetails() {
		List<CardManagement> cardManagement = this.cardManagementRepository.findAll();
		List<CardManagementOutputDto> cardManagementDto = 
				cardManagement.stream()
						 .map(this :: convertEntityToOutputDto)
						 .collect(Collectors.toList());
		return cardManagementDto;
	}

	@Override
	public CardManagementOutputDto fetchSingleDetail(Long id) {
		if(this.cardManagementRepository.existsById(id)) {
			CardManagement cardManagement = this.cardManagementRepository.findById(id).orElse(null);
			CardManagementOutputDto cardManagementOutputDto = this.convertEntityToOutputDto(cardManagement);
			return cardManagementOutputDto;
		}
		return null;
	}

	@Override
	public CardManagementOutputDto saveDetails(CardManagementInputDto cardManagementInputDto) {
		CardManagement cardManagement = this.convertInputDtoToEntity(cardManagementInputDto);
		CardManagement newCardManagement = this.cardManagementRepository.save(cardManagement);
		CardManagementOutputDto cardManagementOutputDto =  this.convertEntityToOutputDto(newCardManagement);
		return cardManagementOutputDto;
	}
	
	@Override
	public CardManagementOutputDto applyForCard(CardManagementInputDto cardManagementInputDto) {
		CardManagement cardManagement = this.convertApplyCardToEntity(cardManagementInputDto);
		CardManagement newCardManagement = this.cardManagementRepository.save(cardManagement);
		CardManagementOutputDto cardManagementOutputDto =  this.convertApplyCardToOutputDto(newCardManagement);
		return cardManagementOutputDto;
	}

	@Override
	public CardManagementOutputDto updateDetails(Long id, CardManagementInputDto cardManagementInputDto) {
		if(this.cardManagementRepository.existsById(id)) {
			CardManagement cardManagement = this.convertInputDtoToEntity(cardManagementInputDto);
			cardManagement.setId(id);
			CardManagement updatedDetail = this.cardManagementRepository.save(cardManagement);
			CardManagementOutputDto cardManagementOutputDto =  this.convertEntityToOutputDto(updatedDetail);
			return cardManagementOutputDto;
		}
		return null;

	}

	@Override
	public CardManagementOutputDto deleteDetails(Long id) {
		if(this.cardManagementRepository.existsById(id)) {
			CardManagementOutputDto cardManagementOutputDto = this.fetchSingleDetail(id);
			this.cardManagementRepository.deleteById(id);
			return cardManagementOutputDto;
		}
		return null;

	}

}

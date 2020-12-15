package com.wf.ibs.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.ibs.crud.dto.CardUpgradationInputDto;
import com.wf.ibs.crud.dto.CardUpgradationOutputDto;
import com.wf.ibs.crud.entity.CardUpgradation;
import com.wf.ibs.crud.repository.CardUpgradationRepository;


// @Component
@Service
public class CardUpgradationServiceImpl implements CardUpgradationService {
	
	@Autowired
	private CardUpgradationRepository cardUpgradationRepository;

	
	private CardUpgradation convertCardUpgradationInputDtoToEntity(CardUpgradationInputDto cardUpgradationInputDto) {
		CardUpgradation cardUpgradation = new CardUpgradation();
		cardUpgradation.setCardCategory(cardUpgradationInputDto.getCardCategory());
		cardUpgradation.setCardNumber(cardUpgradationInputDto.getCardNumber());
		cardUpgradation.setCardType(cardUpgradationInputDto.getCardType());
		return cardUpgradation;
	}
	private CardUpgradationOutputDto convertCardUpgradationEntityToOutputDto(CardUpgradation cardUpgradation) {
		CardUpgradationOutputDto cardUpgradationOutputDto = new CardUpgradationOutputDto();
		cardUpgradationOutputDto.setCardCategory(cardUpgradation.getCardCategory());
		cardUpgradationOutputDto.setCardNumber(cardUpgradation.getCardNumber());
		cardUpgradationOutputDto.setCardType(cardUpgradation.getCardType());
		return cardUpgradationOutputDto;
	}

	@Override
	public List<CardUpgradationOutputDto> fetchAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CardUpgradationOutputDto fetchSingleDetail(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CardUpgradationOutputDto saveDetails(CardUpgradationInputDto cardUpgradationInputDto) {
		CardUpgradation cardUpgradation=this.convertCardUpgradationInputDtoToEntity(cardUpgradationInputDto);
		CardUpgradation newCardUpgradation=this.cardUpgradationRepository.save(cardUpgradation);
		CardUpgradationOutputDto cardUpgradationOutputDto=this.convertCardUpgradationEntityToOutputDto(newCardUpgradation);
		return cardUpgradationOutputDto;
	}
	@Override
	public CardUpgradationOutputDto updateDetails(Long id, CardUpgradationInputDto cardUpgradationInputDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CardUpgradationOutputDto deleteDetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}

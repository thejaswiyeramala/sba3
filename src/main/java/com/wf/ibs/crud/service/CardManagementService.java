package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.CardManagementInputDto;
import com.wf.ibs.crud.dto.CardManagementOutputDto;

public interface CardManagementService {

	public List<CardManagementOutputDto> fetchAllDetails();
	public CardManagementOutputDto fetchSingleDetail(Long id);
	public CardManagementOutputDto saveDetails(CardManagementInputDto cardManagementInputDto);
	public CardManagementOutputDto updateDetails(Long id, CardManagementInputDto cardManagementInputDto);
	public CardManagementOutputDto deleteDetails(Long id);
	public CardManagementOutputDto applyForCard(CardManagementInputDto cardManagementInputDto);
}

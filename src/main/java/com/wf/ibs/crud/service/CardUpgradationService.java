package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.ApplyCardInputDto;
import com.wf.ibs.crud.dto.ApplyCardOutputDto;
import com.wf.ibs.crud.dto.CardUpgradationInputDto;
import com.wf.ibs.crud.dto.CardUpgradationOutputDto;

public interface CardUpgradationService {

	public List<CardUpgradationOutputDto> fetchAllDetails();
	public CardUpgradationOutputDto fetchSingleDetail(Long id);
	public CardUpgradationOutputDto saveDetails(CardUpgradationInputDto cardUpgradationInputDto);
	public CardUpgradationOutputDto updateDetails(Long id, CardUpgradationInputDto cardUpgradationInputDto);
	public CardUpgradationOutputDto deleteDetails(Long id);
}

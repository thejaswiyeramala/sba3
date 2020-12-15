package com.wf.ibs.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.ibs.crud.dto.ApplyCardInputDto;
import com.wf.ibs.crud.dto.ApplyCardOutputDto;
import com.wf.ibs.crud.dto.ApplyForLoanInputDto;
import com.wf.ibs.crud.dto.ApplyForLoanOutputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.CardManagementInputDto;
import com.wf.ibs.crud.dto.CardManagementOutputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.dto.LoansManagementOutputDto;
import com.wf.ibs.crud.entity.ApplyCard;
import com.wf.ibs.crud.entity.ApplyForLoan;
import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.CardManagement;
import com.wf.ibs.crud.entity.Loans;
import com.wf.ibs.crud.repository.ApplyCardRepository;
import com.wf.ibs.crud.repository.ApplyLoanRepository;
import com.wf.ibs.crud.repository.CardManagementRepository;
import com.wf.ibs.crud.repository.LoansManagementRepository;

// @Component
@Service
public class ApplyCardServiceImpl implements ApplyCardService {
	
	@Autowired
	private ApplyCardRepository applyCardRepository;

	
	private ApplyCard convertApplyCardInputDtoToEntity(ApplyCardInputDto applyCardInputDto) {
		ApplyCard applyCard = new ApplyCard();
		applyCard.setCardCategory(applyCardInputDto.getCardCategory());
		applyCardInputDto.setCardType(applyCardInputDto.getCardType());
		return applyCard;
	}
	private ApplyCardOutputDto convertApplyCardEntityToOutputDto(ApplyCard applyCard) {
		ApplyCardOutputDto applyCardOutputDto = new ApplyCardOutputDto();
		applyCardOutputDto.setCardCategory(applyCard.getCardCategory());
		applyCardOutputDto.setCardType(applyCard.getCardType());
		return applyCardOutputDto;
	}

	@Override
	public List<ApplyCardOutputDto> fetchAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ApplyCardOutputDto fetchSingleDetail(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ApplyCardOutputDto saveDetails(ApplyCardInputDto applyCardInputDto) {
		ApplyCard applyCard = this.convertApplyCardInputDtoToEntity(applyCardInputDto);
		ApplyCard newApplyCard = this.applyCardRepository.save(applyCard);
		ApplyCardOutputDto applyCardOutputDto =  this.convertApplyCardEntityToOutputDto(newApplyCard);
						return applyCardOutputDto;
	}
	@Override
	public ApplyCardOutputDto updateDetails(Long id, ApplyCardInputDto ApplyCardInputDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ApplyCardOutputDto deleteDetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}


}

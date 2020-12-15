package com.wf.ibs.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.ibs.crud.dto.ApplyForLoanInputDto;
import com.wf.ibs.crud.dto.ApplyForLoanOutputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.CardManagementInputDto;
import com.wf.ibs.crud.dto.CardManagementOutputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.dto.LoansManagementOutputDto;
import com.wf.ibs.crud.entity.ApplyForLoan;
import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.CardManagement;
import com.wf.ibs.crud.entity.Loans;
import com.wf.ibs.crud.repository.ApplyLoanRepository;
import com.wf.ibs.crud.repository.CardManagementRepository;
import com.wf.ibs.crud.repository.LoansManagementRepository;

// @Component
@Service
public class ApplyForLoanServiceImpl implements ApplyForLoanService {
	
	@Autowired
	private ApplyLoanRepository applyLoanRepository;

	
	private ApplyForLoan convertApplyLoanInputDtoToEntity(ApplyForLoanInputDto applyForLoanInputDto) {
		ApplyForLoan applyForLoan = new ApplyForLoan();
		applyForLoan.setLoanType(applyForLoanInputDto.getLoanType());
		applyForLoan.setLoanDuration(applyForLoanInputDto.getLoanDuration());
		applyForLoan.setLoanAmount(applyForLoanInputDto.getLoanAmount());
		applyForLoan.setLoanDescription(applyForLoanInputDto.getLoanDescription());
		return applyForLoan;
	}
	private ApplyForLoanOutputDto convertApplyLoanEntityToOutputDto(ApplyForLoan applyForLoan) {
		ApplyForLoanOutputDto applyForLoanOutputDto = new ApplyForLoanOutputDto();
		applyForLoanOutputDto.setLoanType(applyForLoan.getLoanType());
		applyForLoanOutputDto.setLoanDuration(applyForLoan.getLoanDuration());
		applyForLoanOutputDto.setLoanAmount(applyForLoan.getLoanAmount());
		applyForLoanOutputDto.setLoanDescription(applyForLoan.getLoanDescription());
		return applyForLoanOutputDto;
	}

	@Override
	public ApplyForLoanOutputDto saveDetails(ApplyForLoanInputDto applyForLoanInputDto) {
		ApplyForLoan applyForLoan = this.convertApplyLoanInputDtoToEntity(applyForLoanInputDto);
		ApplyForLoan newApplyForLoan = this.applyLoanRepository.save(applyForLoan);
		ApplyForLoanOutputDto applyForLoanOutputDto =  this.convertApplyLoanEntityToOutputDto(newApplyForLoan);
						return applyForLoanOutputDto;
	}


	@Override
	public ApplyForLoanOutputDto updateDetails(Long id, ApplyForLoanInputDto applyForLoanInputDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<ApplyForLoanOutputDto> fetchAllDetails() {
		List<ApplyForLoan> applyForLoan = this.applyLoanRepository.findAll();
		List<ApplyForLoanOutputDto> applyForLoanOutputDto = 
				applyForLoan.stream()
						 .map(this :: convertApplyLoanEntityToOutputDto)
						 .collect(Collectors.toList());
		return applyForLoanOutputDto;	}
	@Override
	public ApplyForLoanOutputDto fetchSingleDetail(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ApplyForLoanOutputDto deleteDetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}

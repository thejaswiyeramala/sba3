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
public class LoanManagementServiceImpl implements LoansManagementService {
	
	@Autowired
	private LoansManagementRepository loansManagementRepository;
	private ApplyLoanRepository applyLoanRepository;

	private LoansManagementOutputDto convertEntityToOutputDto(Loans loans) {
		LoansManagementOutputDto loansManagementOutputDto = new LoansManagementOutputDto();
		loansManagementOutputDto.setId(loans.getId());
		loansManagementOutputDto.setCardNumber(loans.getCardType());
		loansManagementOutputDto.setCardNumber(loans.getCardNumber());
		loansManagementOutputDto.setLoanType(loans.getLoanType());
		loansManagementOutputDto.setLoanDuration(loans.getLoanDuration());
		loansManagementOutputDto.setLoanAmount(loans.getLoanAmount());
		loansManagementOutputDto.setPickDate(loans.getPickDate());
		loansManagementOutputDto.setExpiryDate(loans.getExpiryDate());
		loansManagementOutputDto.setLoanDescription(loans.getLoanDescription());
		loansManagementOutputDto.setCVV(loans.getCVV());
		loansManagementOutputDto.setEnterAmount(loans.getEnterAmount());
		loansManagementOutputDto.setLoanDescription(loans.getLoanDescription());
		return loansManagementOutputDto;
	}
	
	private Loans convertInputDtoToEntity(LoansManagementInputDto LoansManagementInputDto) {
		Loans loans = new Loans();
		loans.setId(LoansManagementInputDto.getId());
		loans.setCardNumber(LoansManagementInputDto.getCardType());
		loans.setCardNumber(LoansManagementInputDto.getCardNumber());
		loans.setLoanType(LoansManagementInputDto.getLoanType());
		loans.setLoanDuration(LoansManagementInputDto.getLoanDuration());
		loans.setLoanAmount(LoansManagementInputDto.getLoanAmount());
		loans.setPickDate(LoansManagementInputDto.getPickDate());
		loans.setExpiryDate(LoansManagementInputDto.getExpiryDate());
		loans.setLoanDescription(LoansManagementInputDto.getLoanDescription());
		loans.setCVV(LoansManagementInputDto.getCVV());
		loans.setEnterAmount(LoansManagementInputDto.getEnterAmount());
		loans.setLoanDescription(LoansManagementInputDto.getLoanDescription());
		return loans;
	}
	
	private ApplyForLoan convertApplyLoanInputDtoToEntity(LoansManagementInputDto LoansManagementInputDto) {
		ApplyForLoan applyForLoan = new ApplyForLoan();
		applyForLoan.setLoanType(LoansManagementInputDto.getLoanType());
		applyForLoan.setLoanDuration(LoansManagementInputDto.getLoanDuration());
		applyForLoan.setLoanAmount(LoansManagementInputDto.getLoanAmount());
		applyForLoan.setLoanDescription(LoansManagementInputDto.getLoanDescription());
		return applyForLoan;
	}
	private LoansManagementOutputDto convertApplyLoanEntityToOutputDto(ApplyForLoan applyForLoan) {
		LoansManagementOutputDto loansManagementOutputDto = new LoansManagementOutputDto();
		loansManagementOutputDto.setLoanType(applyForLoan.getLoanType());
		loansManagementOutputDto.setLoanDuration(applyForLoan.getLoanDuration());
		loansManagementOutputDto.setLoanAmount(applyForLoan.getLoanAmount());
		loansManagementOutputDto.setLoanDescription(applyForLoan.getLoanDescription());
		return loansManagementOutputDto;
	}
	@Override
	public List<LoansManagementOutputDto> fetchAllDetails() {
				List<Loans> loans = this.loansManagementRepository.findAll();
				List<LoansManagementOutputDto> LoansDto = 
						loans.stream()
								 .map(this :: convertEntityToOutputDto)
								 .collect(Collectors.toList());
				return LoansDto;	
				}

	@Override
	public LoansManagementOutputDto fetchSingleDetail(Long id) {
		if(this.loansManagementRepository.existsById(id)) {
			Loans loans = this.loansManagementRepository.findById(id).orElse(null);
			LoansManagementOutputDto loansManagementOutputDto = this.convertEntityToOutputDto(loans);
			return loansManagementOutputDto;
		}
		return null;

	}

	@Override
	public LoansManagementOutputDto saveDetails(LoansManagementInputDto loansManagementInputDto) {
		Loans loans = this.convertInputDtoToEntity(loansManagementInputDto);
		Loans newLoans = this.loansManagementRepository.save(loans);
		LoansManagementOutputDto loansManagementOutputDto =  this.convertEntityToOutputDto(newLoans);
						return loansManagementOutputDto;	
	}

	@Override
	public LoansManagementOutputDto updateDetails(Long id, LoansManagementInputDto loansManagementInputDto) {
		if(this.loansManagementRepository.existsById(id)) {
			Loans loans = this.convertInputDtoToEntity(loansManagementInputDto);
			loans.setId(id);
			Loans updatedDetail = this.loansManagementRepository.save(loans);
			LoansManagementOutputDto loansManagementOutputDto =  this.convertEntityToOutputDto(updatedDetail);
			return loansManagementOutputDto;
		}
		return null;

	}

	@Override
	public LoansManagementOutputDto deleteDetails(Long id) {
		if(this.loansManagementRepository.existsById(id)) {
			// get the copy of record to be deleted
			LoansManagementOutputDto loansManagementOutputDto = this.fetchSingleDetail(id);
			this.loansManagementRepository.deleteById(id);
			return loansManagementOutputDto;
		}
		return null;
	}

	@Override
	public LoansManagementOutputDto saveLoanDetails(LoansManagementInputDto loansManagementInputDto) {
		ApplyForLoan applyForLoan = this.convertApplyLoanInputDtoToEntity(loansManagementInputDto);
		ApplyForLoan newApplyForLoan = this.applyLoanRepository.save(applyForLoan);
		LoansManagementOutputDto loansManagementOutputDto =  this.convertApplyLoanEntityToOutputDto(newApplyForLoan);
						return loansManagementOutputDto;
	}
}

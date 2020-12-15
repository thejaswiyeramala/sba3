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
import com.wf.ibs.crud.dto.PayEMIInputDto;
import com.wf.ibs.crud.dto.PayEMIOutputDto;
import com.wf.ibs.crud.entity.ApplyForLoan;
import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.CardManagement;
import com.wf.ibs.crud.entity.Loans;
import com.wf.ibs.crud.entity.PayEMI;
import com.wf.ibs.crud.repository.ApplyLoanRepository;
import com.wf.ibs.crud.repository.CardManagementRepository;
import com.wf.ibs.crud.repository.LoansManagementRepository;
import com.wf.ibs.crud.repository.PayEMIRepository;

// @Component
@Service
public class PayEMIForLoanServiceImpl implements PayEMIForLoanService {
	
	@Autowired
	private PayEMIRepository payEMIRepository;

	
	private PayEMI convertPayEMIInputDtoToEntity(PayEMIInputDto payEMIInputDto) {
		PayEMI PayEMI = new PayEMI();
		PayEMI.setPickDate(payEMIInputDto.getPickDate());
		PayEMI.setCardNumber(payEMIInputDto.getCardNumber());
		PayEMI.setCardType(payEMIInputDto.getCardType());
		PayEMI.setCVV(payEMIInputDto.getCVV());
		PayEMI.setEnterAmount(payEMIInputDto.getEnterAmount());
		PayEMI.setExpiryDate(payEMIInputDto.getExpiryDate());
		return PayEMI;
	}
	private PayEMIOutputDto convertPayEMIEntityToOutputDto(PayEMI payEMI) {
		PayEMIOutputDto payEMIOutputDto = new PayEMIOutputDto();
		payEMIOutputDto.setCardNumber(payEMI.getCardNumber());
		payEMIOutputDto.setCardType(payEMI.getCardType());
		payEMIOutputDto.setCVV(payEMI.getCVV());
		payEMIOutputDto.setEnterAmount(payEMI.getEnterAmount());
		payEMIOutputDto.setExpiryDate(payEMI.getExpiryDate());
		payEMIOutputDto.setPickDate(payEMI.getPickDate());
		return payEMIOutputDto;
	}

	@Override
	public PayEMIOutputDto saveDetails(PayEMIInputDto payEMIInputDto) {
		PayEMI PayEMI = this.convertPayEMIInputDtoToEntity(payEMIInputDto);
		PayEMI newPayEMI=this.payEMIRepository.save(PayEMI);
		PayEMIOutputDto payEMIOutputDto =this.convertPayEMIEntityToOutputDto(newPayEMI);
		return payEMIOutputDto;
	}
	@Override
	public PayEMIOutputDto updateDetails(Long id, PayEMIInputDto payEMIInputDto) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PayEMIOutputDto deleteDetails(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<PayEMIOutputDto> fetchAllDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public PayEMIOutputDto fetchSingleDetail(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}

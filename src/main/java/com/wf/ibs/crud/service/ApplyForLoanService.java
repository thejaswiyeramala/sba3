package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.ApplyForLoanInputDto;
import com.wf.ibs.crud.dto.ApplyForLoanOutputDto;
import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.dto.LoansManagementOutputDto;

public interface ApplyForLoanService {

	public List<ApplyForLoanOutputDto> fetchAllDetails();
	public ApplyForLoanOutputDto fetchSingleDetail(Long id);
	public ApplyForLoanOutputDto saveDetails(ApplyForLoanInputDto applyForLoanInputDto);
	public ApplyForLoanOutputDto updateDetails(Long id, ApplyForLoanInputDto applyForLoanInputDto);
	public ApplyForLoanOutputDto deleteDetails(Long id);
}

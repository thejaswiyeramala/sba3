package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.dto.LoansManagementOutputDto;

public interface LoansManagementService {

	public List<LoansManagementOutputDto> fetchAllDetails();
	public LoansManagementOutputDto fetchSingleDetail(Long id);
	public LoansManagementOutputDto saveDetails(LoansManagementInputDto loansManagementInputDto);
	public LoansManagementOutputDto saveLoanDetails(LoansManagementInputDto loansManagementInputDto);
	public LoansManagementOutputDto updateDetails(Long id, LoansManagementInputDto loansManagementInputDto);
	public LoansManagementOutputDto deleteDetails(Long id);
}

package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.ApplyForLoanInputDto;
import com.wf.ibs.crud.dto.ApplyForLoanOutputDto;
import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.dto.LoansManagementOutputDto;
import com.wf.ibs.crud.dto.PayEMIInputDto;
import com.wf.ibs.crud.dto.PayEMIOutputDto;

public interface PayEMIForLoanService {

	public List<PayEMIOutputDto> fetchAllDetails();
	public PayEMIOutputDto fetchSingleDetail(Long id);
	public PayEMIOutputDto saveDetails(PayEMIInputDto payEMIInputDto);
	public PayEMIOutputDto updateDetails(Long id, PayEMIInputDto payEMIInputDto);
	public PayEMIOutputDto deleteDetails(Long id);
}

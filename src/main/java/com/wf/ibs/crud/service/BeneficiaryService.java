package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;

public interface BeneficiaryService {

	public List<BeneficiaryOutputDto> fetchAllDetails();
	public BeneficiaryOutputDto fetchSingleDetail(Long id);
	public BeneficiaryOutputDto saveDetails(BeneficiaryInputDto beneficiaryInputDto);
	public BeneficiaryOutputDto updateDetails(Long id, BeneficiaryInputDto beneficiaryInputDto);
	public BeneficiaryOutputDto deleteDetails(Long id);
}

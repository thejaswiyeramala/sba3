package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.ApplyCardInputDto;
import com.wf.ibs.crud.dto.ApplyCardOutputDto;

public interface ApplyCardService {

	public List<ApplyCardOutputDto> fetchAllDetails();
	public ApplyCardOutputDto fetchSingleDetail(Long id);
	public ApplyCardOutputDto saveDetails(ApplyCardInputDto applyCardInputDto);
	public ApplyCardOutputDto updateDetails(Long id, ApplyCardInputDto ApplyCardInputDto);
	public ApplyCardOutputDto deleteDetails(Long id);
}

package com.wf.ibs.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.EmployeeInputDto;
import com.wf.ibs.crud.dto.EmployeeOutputDto;
import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.Employee;
import com.wf.ibs.crud.repository.BeneficiaryRepository;

// @Component
@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {

	// injecting a dependency
	@SuppressWarnings("unused")
	@Autowired
	private BeneficiaryRepository beneficiaryrepository;
	
	// utility method
	@SuppressWarnings("unused")
	private BeneficiaryOutputDto convertbeneficiaryEntityToOutputDto(Beneficiary beneficiary) {
		BeneficiaryOutputDto beneficiaryOutputDto = new BeneficiaryOutputDto();
		beneficiaryOutputDto.setFirstName(beneficiary.getFirstName());
		beneficiaryOutputDto.setId(beneficiary.getId());
		beneficiaryOutputDto.setLastName(beneficiary.getLastName());
		beneficiaryOutputDto.setAccountNumber(beneficiary.getLastName());
		beneficiaryOutputDto.setPhoneNumber(beneficiary.getPhoneNumber());
		beneficiaryOutputDto.setEmailID(beneficiary.getEmailID());
		beneficiaryOutputDto.setId(beneficiary.getId());
		return beneficiaryOutputDto;
	}
	
	@SuppressWarnings("unused")
	private Beneficiary convertInputDtoToEntity(BeneficiaryInputDto beneficiaryInputDto) {
		Beneficiary beneficiary = new Beneficiary();
		beneficiary.setAccountNumber(beneficiaryInputDto.getAccountNumber());
		beneficiary.setFirstName(beneficiaryInputDto.getFirstName());
		beneficiary.setLastName(beneficiaryInputDto.getLastName());
		beneficiary.setPhoneNumber(beneficiaryInputDto.getPhoneNumber());
		beneficiary.setEmailID(beneficiaryInputDto.getEmailID());
		beneficiary.setId(beneficiaryInputDto.getId());
		return beneficiary;
	}

	@Override
	public List<BeneficiaryOutputDto> fetchAllDetails() {
		// TODO Auto-generated method stub
		List<Beneficiary> beneficiary = this.beneficiaryrepository.findAll();
		List<BeneficiaryOutputDto> BeneficiaryDto = 
				beneficiary.stream()
						 .map(this :: convertbeneficiaryEntityToOutputDto)
						 .collect(Collectors.toList());
		return BeneficiaryDto;
	}

	@Override
	public BeneficiaryOutputDto fetchSingleDetail(Long id) {
		if(this.beneficiaryrepository.existsById(id)) {
			Beneficiary beneficiary = this.beneficiaryrepository.findById(id).orElse(null);
			BeneficiaryOutputDto beneficiaryOutputDto = this.convertbeneficiaryEntityToOutputDto(beneficiary);
			return beneficiaryOutputDto;
		}
		return null;
	}

	@Override
	public BeneficiaryOutputDto saveDetails(BeneficiaryInputDto beneficiaryInputDto) {
		// convert dto into entity
		Beneficiary beneficiary = this.convertInputDtoToEntity(beneficiaryInputDto);
				// save into DB, returns newly added record
		Beneficiary newBeneficiary = this.beneficiaryrepository.save(beneficiary);
				// convert entity into dto
		BeneficiaryOutputDto beneficiaryOutputDto =  this.convertbeneficiaryEntityToOutputDto(newBeneficiary);
				return beneficiaryOutputDto;	
				}

	@Override
	public BeneficiaryOutputDto updateDetails(Long id, BeneficiaryInputDto beneficiaryInputDto) {
		if(this.beneficiaryrepository.existsById(id)) {
			// convert input dto into entity
			Beneficiary beneficiary = this.convertInputDtoToEntity(beneficiaryInputDto);
			// assign the id to employee
			beneficiary.setId(id);
			// save into DB, returns newly added record
			// save : PK (id) is null or empty:insert or else update
			Beneficiary updatedDetail = this.beneficiaryrepository.save(beneficiary);
			// convert entity into dto
			BeneficiaryOutputDto beneficiaryOutputDto =  this.convertbeneficiaryEntityToOutputDto(updatedDetail);
			return beneficiaryOutputDto;
		}
		return null;
	}

	@Override
	public BeneficiaryOutputDto deleteDetails(Long id) {
		if(this.beneficiaryrepository.existsById(id)) {
			// get the copy of record to be deleted
			BeneficiaryOutputDto beneficiaryOutputDto = this.fetchSingleDetail(id);
			this.beneficiaryrepository.deleteById(id);
			return beneficiaryOutputDto;
		}
		return null;
	}

	
}

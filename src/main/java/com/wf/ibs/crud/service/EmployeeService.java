package com.wf.ibs.crud.service;

import java.util.List;

import com.wf.ibs.crud.dto.EmployeeInputDto;
import com.wf.ibs.crud.dto.EmployeeOutputDto;

public interface EmployeeService {

	public List<EmployeeOutputDto> fetchAllEmployees();
	public EmployeeOutputDto fetchSingleEmployee(Long id);
	public EmployeeOutputDto saveEmployee(EmployeeInputDto employeeInputDto);
	public EmployeeOutputDto updateEmployee(Long id, EmployeeInputDto employeeInputDto);
	public EmployeeOutputDto deleteEmployee(Long id);
}

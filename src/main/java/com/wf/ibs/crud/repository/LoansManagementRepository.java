package com.wf.ibs.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.Employee;
import com.wf.ibs.crud.entity.Loans;

//@Component
@Repository
public interface LoansManagementRepository 
		extends JpaRepository<Loans, Long>{
}

/*
 * Custom DB implementation
 * 
 * 1. Naming Convention : add a appropriatley named mehtod in interface, 
 * 						  implementation would be provided internally
 * 2. Query Implementation : explicit query 
 * 						   : Not a std sql query : JPQL
 * 3. Custom interface with custom method(s), implementation class that define logic of those method
 * 			plugin that interface with current interface
 * 
 */

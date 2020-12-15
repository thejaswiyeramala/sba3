package com.wf.ibs.crud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.wf.ibs.crud.entity.ApplyForLoan;
import com.wf.ibs.crud.entity.Beneficiary;
import com.wf.ibs.crud.entity.Employee;
import com.wf.ibs.crud.entity.Loans;
import com.wf.ibs.crud.entity.PayEMI;

//@Component
@Repository
public interface PayEMIRepository 
		extends JpaRepository<PayEMI, Long>{
}

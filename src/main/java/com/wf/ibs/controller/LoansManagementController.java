package com.wf.ibs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wf.ibs.crud.dto.ApplyForLoanInputDto;
import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.dto.PayEMIInputDto;
import com.wf.ibs.crud.service.ApplyForLoanService;
import com.wf.ibs.crud.service.LoansManagementService;
import com.wf.ibs.crud.service.PayEMIForLoanService;
import com.wf.ibs.model.Student;


@RequestMapping("/LoanManagement")
@Controller
public class LoansManagementController {
	@Autowired
	private ApplyForLoanService applyService;
	@Autowired
	private PayEMIForLoanService payEMIService;
		@RequestMapping("/Loans") 
		public String cardManagement() {
			return"Loan";
		}
		@RequestMapping("/applyLoan") 
		public String applyLoan(Model model) {
			ApplyForLoanInputDto applyForLoanInputDto=new ApplyForLoanInputDto();
			model.addAttribute("applyForLoanInputDto", applyForLoanInputDto);	
			return "Loans_CustomerLogin";
		}
		
		@RequestMapping("/detailsSave") 
		public String detailsSave(@Valid @ModelAttribute ApplyForLoanInputDto applyForLoanInputDto,BindingResult result,Model model) {
			if(result.hasErrors()) {
				System.out.println(result);
				return "Loans_CustomerLogin";
			}
			applyService.saveDetails(applyForLoanInputDto);
			//model.addAttribute("applyForLoanInputDto", applyForLoanInputDto); 
			return"Loan";
		}
		@RequestMapping("/payEMI") 
		public String payEMI(Model model) {
			PayEMIInputDto payEMIInputDto=new PayEMIInputDto();
			model.addAttribute("payEMIInputDto", payEMIInputDto);	
			return "payEMI";
		}
		
		@RequestMapping("/payEMISave") 
		public String payEMISave(@Valid @ModelAttribute PayEMIInputDto payEMIInputDto,BindingResult result,Model model) {
			if(result.hasErrors()) {
				System.out.println(result);
				return "payEMI";
			}
			payEMIService.saveDetails(payEMIInputDto);
			return"Loan";
		}
}

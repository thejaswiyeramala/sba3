package com.wf.ibs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.CardManagementInputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.service.BeneficiaryService;
import com.wf.ibs.crud.service.CardManagementService;
import com.wf.ibs.crud.service.LoansManagementService;
import com.wf.ibs.model.Beneficiary;


@RequestMapping("/customer")
@Controller
public class CustomerController {
	@Autowired
	private BeneficiaryService service;
	
	/*
	 * @Autowired private CardManagementService cardservice;
	 * 
	 * @Autowired private LoansManagementService loansservice;
	 * 
	 */	/*
	 * @RequestMapping(value="/login", method=RequestMethod.GET) public String
	 * ibsLogin(Model model) { IBSLogin ibsLogin = new IBSLogin();
	 * model.addAttribute("ibsLogin", ibsLogin); return "ibs-login"; }
	 */
	
	/*
	 * @RequestMapping(value="/login", method=RequestMethod.POST) public String
	 * ibsLoginValidate(@Valid @ModelAttribute("ibsLogin") IBSLogin ibsLogin,
	 * BindingResult result) { if (result.hasErrors()) { return "ibs-login"; } else
	 * return "redirect:/customer/home"; }
	 * 
	 * @RequestMapping(value="/home", method=RequestMethod.GET) public String
	 * ibsHome(Model model) { IBSHome ibsHome = new IBSHome();
	 * model.addAttribute("ibsHome", ibsHome); return "ibs-home";
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/home", method=RequestMethod.POST) public String
	 * ibsHomeValidation(@Valid @ModelAttribute("ibsHome") IBSHome ibsHome,
	 * BindingResult result) { if (result.hasErrors()) { return "ibs-home"; } else
	 * return "ibs-home"; }
	 * 
	 * @RequestMapping(value="/acct-summary", method=RequestMethod.GET) public
	 * String acctSummary() { return "acct-summary"; }
	 * 
	 * @RequestMapping(value="/create-acct", method=RequestMethod.GET) public String
	 * acctCreate(Model model) { AccountCreation acctCreate = new AccountCreation();
	 * model.addAttribute("acctCreate", acctCreate); return "create-acct"; }
	 * 
	 * @RequestMapping(value="/create-acct", method=RequestMethod.POST) public
	 * String acctCreateConfirm(@Valid @ModelAttribute("acctCreate") AccountCreation
	 * acctCreate, BindingResult result) {
	 * 
	 * if (result.hasErrors()) { return "create-acct"; } else return
	 * "account-confirm";
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/check-balance", method=RequestMethod.GET) public
	 * String chkBalance(Model model) { CheckBalance chkBalance = new
	 * CheckBalance(); model.addAttribute("chkBalance", chkBalance); return
	 * "check-balance"; }
	 * 
	 * @RequestMapping(value="/check-balance", method=RequestMethod.POST) public
	 * String chkBalanceConfirm(@Valid @ModelAttribute("chkBalance") CheckBalance
	 * chkBalance, BindingResult result) {
	 * 
	 * if (result.hasErrors()) { return "check-balance"; } else return
	 * "check-balance";
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/request-stmt") public String requestStmt() { return
	 * "request-stmt"; }
	 * 
	 * @RequestMapping(value="/transfer-funds", method=RequestMethod.GET) public
	 * String transferFunds(Model model) { FundsTransfer fundsTransfer = new
	 * FundsTransfer(); model.addAttribute("fundsTransfer", fundsTransfer); return
	 * "transfer-funds"; }
	 * 
	 * @RequestMapping(value="/transfer-funds", method=RequestMethod.POST) public
	 * String transferFundsSuccess(@Valid @ModelAttribute("fundsTransfer")
	 * FundsTransfer fundsTransfer, BindingResult result) {
	 * 
	 * if (result.hasErrors()) { return "transfer-funds"; } else return
	 * "fundTransfer-success";
	 * 
	 * }
	 * 
	 * @RequestMapping(value="/bill-payments", method=RequestMethod.GET) public
	 * String billPayments(Model model) { BillPayments billPayments = new
	 * BillPayments(); model.addAttribute("billPayments", billPayments); return
	 * "bill-payments"; }
	 * 
	 * @RequestMapping(value="/bill-payments", method=RequestMethod.POST) public
	 * String billPaymentSuccess(@Valid @ModelAttribute("billPayments") BillPayments
	 * billPayments, BindingResult result) {
	 * 
	 * if (result.hasErrors()) { return "bill-payments"; } else return
	 * "billPayment-success"; }
	 * 
	 * @RequestMapping(value="/service-prov", method=RequestMethod.GET) public
	 * String serviceProvider(Model model) { ServiceProvider serviceProv = new
	 * ServiceProvider(); model.addAttribute("serviceProv", serviceProv); return
	 * "service-provider"; }
	 * 
	 * @RequestMapping(value="/servProv-confirm") public String
	 * serviceProvConfirm(@Valid @ModelAttribute("serviceProv") ServiceProvider
	 * serviceProv, BindingResult result) {
	 * 
	 * if (result.hasErrors()) { return "service-provider"; } else return
	 * "servProv-confirm";
	 * 
	 * }
	 */
	@RequestMapping("/beneficiaryhome") 
	public String beneficiaryhome(Model model) {
		BeneficiaryInputDto beneficiaryInputDto=new BeneficiaryInputDto();
		model.addAttribute("beneficiaryInputDto", beneficiaryInputDto);		
		return "beneficiary-home";
	}
	
	@RequestMapping("/addDetails") 
	public String addDetails(Model model) {
		BeneficiaryInputDto beneficiaryInputDto=new BeneficiaryInputDto();
		model.addAttribute("beneficiaryInputDto", beneficiaryInputDto);	
		return "beneficiary";
	}
	
	// @ModelAttribute will save param value into model object
		@RequestMapping("/Details")
		public String saveProfile(@Valid @ModelAttribute BeneficiaryInputDto beneficiaryInputDto,BindingResult result,Model model) {
			if(result.hasErrors()) {
				System.out.println(result);
				return "beneficiary";
			}
			service.saveDetails(beneficiaryInputDto);
			return "beneficiary-details";
		}
		
		@RequestMapping("/modifyDetails")
		public String modifyDetails(Model model) {
			BeneficiaryInputDto beneficiaryInputDto=new BeneficiaryInputDto();
			model.addAttribute("beneficiaryInputDto", beneficiaryInputDto);
			return "modifybeneficiary"; 
			}
		@RequestMapping("/saveDetails")
		public String saveDetails(@Valid @ModelAttribute BeneficiaryInputDto beneficiaryInputDto,BindingResult result,Model model,Long id) {
			if(result.hasErrors()) {
				System.out.println(result);
				return "modifybeneficiary";
			}
			service.updateDetails(id, beneficiaryInputDto);
			return "beneficiary-details";
		}
		
		/*
		 * @RequestMapping("/cardManagement") public String cardManagement(Model model)
		 * { CardManagementInputDto cardManagementInputDto=new CardManagementInputDto();
		 * model.addAttribute("cardManagementInputDto", cardManagementInputDto); return
		 * "cardManagement/cardManagement_CustomerLogin"; }
		 * 
		 * 
		 * @RequestMapping("/cardstatement") public String cardstatement(Model model){
		 * CardManagementInputDto cardManagementInputDto=new CardManagementInputDto();
		 * model.addAttribute("cardManagementInputDto", cardManagementInputDto); return
		 * "Cardstatement"; }
		 * 
		 * @RequestMapping("/loanManagement") public String loanManagement(Model model)
		 * { LoansManagementInputDto loansManagementInputDto=new
		 * LoansManagementInputDto(); model.addAttribute("loansManagementInputDto",
		 * loansManagementInputDto); return "Loans_CustomerLogin"; }
		 * 
		 * @RequestMapping("/saveLoanDetails") public String
		 * saveLoanDetails(@Valid @ModelAttribute LoansManagementInputDto
		 * loansManagementInputDto,BindingResult result) { if(result.hasErrors()) {
		 * System.out.println(result); return "Loans_CustomerLogin"; } return
		 * "Cardstatement"; }
		 * 
		 * 
		 */		 
		
		/*
		 * @RequestMapping("/cardManagement") // /student/home public String
		 * cardManagement(Model model,@ModelAttribute CardManagement
		 * CardManagement,@Valid BindingResult result) { //CardManagement
		 * CardManagement=new CardManagement(); model.addAttribute("CardManagement",
		 * CardManagement); return "CardManagement_CustomerLogin"; }
		 * 
		 * @RequestMapping("/loans") // /student/home public String loans(Model model) {
		 * Loans Loans=new Loans(); model.addAttribute("Loans", Loans); return
		 * "Loans_CustomerLogin"; }
		 * 
		 * @RequestMapping("/loanDetails") public String
		 * loanDetails(@Valid @ModelAttribute Loans Loans,BindingResult result) {
		 * if(result.hasErrors()) { System.out.println(result); return
		 * "Loans_CustomerLogin"; } return "Loans_BankLogin"; }
		 */

		
}

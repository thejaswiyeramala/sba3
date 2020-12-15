package com.wf.ibs.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wf.ibs.crud.dto.ApplyCardInputDto;
import com.wf.ibs.crud.dto.BeneficiaryInputDto;
import com.wf.ibs.crud.dto.BeneficiaryOutputDto;
import com.wf.ibs.crud.dto.CardManagementInputDto;
import com.wf.ibs.crud.dto.CardUpgradationInputDto;
import com.wf.ibs.crud.dto.LoansManagementInputDto;
import com.wf.ibs.crud.service.ApplyCardService;
import com.wf.ibs.crud.service.BeneficiaryService;
import com.wf.ibs.crud.service.CardManagementService;
import com.wf.ibs.crud.service.CardUpgradationService;
import com.wf.ibs.crud.service.LoansManagementService;
import com.wf.ibs.model.Beneficiary;


@RequestMapping("/cardManagemt")
@Controller
public class CardMangementController {
	@Autowired
	private ApplyCardService applyCardService;
	@Autowired
	private CardUpgradationService cardUpgradationService;
		@RequestMapping("/Home") 
		public String cardManagement() {
			return "cardManagement/cardManagement_CustomerLogin";
		}
		@RequestMapping("/applyCard")
		public String applyCard(Model model) {
			ApplyCardInputDto applyCardInputDto=new ApplyCardInputDto();
			model.addAttribute("applyCardInputDto", applyCardInputDto);
			return "cardManagement/applyForCard";
		}
		@RequestMapping("/saveCard")
		public String saveCard(@ModelAttribute ApplyCardInputDto applyCardInputDto,BindingResult result,Model model) {
			if(result.hasErrors()) {
				System.out.println(result);
				return "cardManagement/applyForCard";
			}
			applyCardService.saveDetails(applyCardInputDto);
			return"cardManagement/cardManagement_CustomerLogin";
		}
		@RequestMapping("/cardUpgrade")
		public String cardUpgrade(Model model) {
			CardUpgradationInputDto cardUpgradationInputDto=new CardUpgradationInputDto();
			model.addAttribute("cardUpgradationInputDto", cardUpgradationInputDto);
			return "cardManagement/cardUpgradation";
		}
		@RequestMapping("/cardUpgradeSave")
		public String cardUpgradeSave(@ModelAttribute CardUpgradationInputDto cardUpgradationInputDto,BindingResult result,Model model) {
			if(result.hasErrors()) {
				System.out.println(result);
				return "cardManagement/cardUpgradation";
			}
			cardUpgradationService.saveDetails(cardUpgradationInputDto);
			return"cardManagement/cardManagement_CustomerLogin";
		}

		
		  
}

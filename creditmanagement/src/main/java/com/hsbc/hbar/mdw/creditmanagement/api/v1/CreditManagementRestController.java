package com.hsbc.hbar.mdw.creditmanagement.api.v1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.hbar.mdw.creditmanagement.model.CreditManagement;
import com.hsbc.hbar.mdw.creditmanagement.service.CreditManagementService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/CreditManagement")
@Slf4j
public class CreditManagementRestController {
	@Autowired CreditManagementService creditManagementService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<CreditManagement> getAllCreditManagements() {
		log.info("Llamada a getAllCreditManagements en CreditManagementRestController");
		return creditManagementService.getAllCreditManagements();
	}
	
	@GetMapping(value = "/{id}/Retrieve")
	public @ResponseBody Optional<CreditManagement> getCreditManagementById(@PathVariable("id") Long id) {
		log.info("getCreditManagementById en CreditManagementRestController");
		return creditManagementService.getCreditManagementById(id);
	}
	
	@PostMapping(path = "/Evaluate", produces = "application/json")
	public @ResponseBody CreditManagement addCreditManagement(@RequestBody CreditManagement creditManagement) {
		log.info("Llamada a addCreditManagement en CreditManagementRestController");
		return creditManagementService.addCreditManagement(creditManagement);
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody String delCreditManagement(@PathVariable("id") Long id) {
		log.info("delCreditManagement en CreditManagementRestController");
		return creditManagementService.delCreditManagement(id);
	}
	
	@PutMapping(path = "/", produces = "application/json")
	public @ResponseBody CreditManagement updCreditManagement(@RequestBody CreditManagement creditManagement) {
		log.info("updCreditManagement en CreditManagementRestController");
		return creditManagementService.updCreditManagement(creditManagement);
	}
	
	@GetMapping(value = "/VerifyCustomerCredit/{id}")
	public @ResponseBody String VerifyCustomerCredit(@PathVariable("id") Long id) {
		log.info("VerifyCustomerCredit en CreditManagementRestController");
		return "Credit Aproved for customer "+id;
	}
	
}

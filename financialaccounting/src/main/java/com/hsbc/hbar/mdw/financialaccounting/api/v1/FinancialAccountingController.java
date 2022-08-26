package com.hsbc.hbar.mdw.financialaccounting.api.v1;

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

import com.hsbc.hbar.mdw.financialaccounting.model.FinancialAccounting;
import com.hsbc.hbar.mdw.financialaccounting.service.FinancialAccountingService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/FinancialAccounting")
@Slf4j
public class FinancialAccountingController {
	@Autowired FinancialAccountingService customerService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<FinancialAccounting> getAllCustomers() {
		log.info("getAllCustomers en CustomerRestController");
		return customerService.getAllCustomers();
	}
	
	@GetMapping(value = "/VerifyFinancialAccounting/{id}")
	public @ResponseBody String VerifyFinancialAccounting(@PathVariable("id") Long id) {
		log.info("VerifyFinancialAccounting en FinancialAccountingController");
		return "Financial Accounting Verified for customer "+id;
	}
	

}

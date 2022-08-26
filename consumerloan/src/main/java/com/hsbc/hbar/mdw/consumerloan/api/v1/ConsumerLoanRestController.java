package com.hsbc.hbar.mdw.consumerloan.api.v1;

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

import com.hsbc.hbar.mdw.consumerloan.model.ConsumerLoan;
import com.hsbc.hbar.mdw.consumerloan.service.ConsumerLoanService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/ConsumerLoan")
@Slf4j
public class ConsumerLoanRestController {
	@Autowired ConsumerLoanService customerService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<ConsumerLoan> getAllConsumerLoan() {
		log.info("getAllConsumerLoan en ConsumerLoanRestController");
		return customerService.getAllConsumerLoan();
	}
	
	@GetMapping(value = "/{id}")
	public @ResponseBody Optional<ConsumerLoan> getConsumerLoanById(@PathVariable("id") Long id) {
		log.info("getConsumerLoanById en ConsumerLoanRestController");
		return customerService.getConsumerLoanById(id);
	}
	
	@PostMapping(path = "/", produces = "application/json")
	public @ResponseBody ConsumerLoan addConsumerLoan(@RequestBody ConsumerLoan customer) {
		log.info("addConsumerLoan en ConsumerLoanRestController");
		return customerService.addConsumerLoan(customer);
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody String delConsumerLoan(@PathVariable("id") Long id) {
		log.info("delConsumerLoan en ConsumerLoanRestController");
		return customerService.delConsumerLoan(id);
	}
	
	@PutMapping(path = "/", produces = "application/json")
	public @ResponseBody ConsumerLoan updConsumerLoan(@RequestBody ConsumerLoan customer) {
		log.info("updConsumerLoan en ConsumerLoanRestController");
		return customerService.updConsumerLoan(customer);
	}
	
	@GetMapping(value = "/GenerateLoan/{id}")
	public @ResponseBody String GenerateLoan(@PathVariable("id") Long id) {
		log.info("GenerateLoan en ConsumerLoanRestController");
		return "Loan Generated for customer "+id;
	}

}

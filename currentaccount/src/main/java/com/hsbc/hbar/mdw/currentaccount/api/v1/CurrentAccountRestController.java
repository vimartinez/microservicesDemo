package com.hsbc.hbar.mdw.currentaccount.api.v1;

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

import com.hsbc.hbar.mdw.currentaccount.model.CurrentAccount;
import com.hsbc.hbar.mdw.currentaccount.service.CurrentAccountService;


import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/currentaccount")
@Slf4j
public class CurrentAccountRestController {
@Autowired CurrentAccountService currentAccountService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<CurrentAccount> getAllCurrentAccounts() {
		log.info("getAllCurrentAccounts en CurrentAccountRestController");
		return currentAccountService.getAllCurrentAccounts();
	}
	
	@GetMapping(value = "/{id}")
	public @ResponseBody Optional<CurrentAccount> getCurrentAccountById(@PathVariable("id") Long id) {
		log.info("getCurrentAccountById en CurrentAccountRestController");
		return currentAccountService.getCurrentAccountById(id);
	}
	
	@GetMapping(value = "/customer/{id}")
	public @ResponseBody Optional<CurrentAccount> getCurrentAccountByCustomerId(@PathVariable("id") Long id) {
		log.info("getCurrentAccountByCustomerId en CurrentAccountRestController");
		return currentAccountService.getCurrentAccountByCustomerId(id);
	}
	@PostMapping(path = "/initiate", produces = "application/json")
	public @ResponseBody CurrentAccount addCurrentAccount(@RequestBody CurrentAccount currentAccount) {
		log.info("addCurrentAccount en CurrentAccountRestController");
		return currentAccountService.addCurrentAccount(currentAccount);
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody String delCurrentAccount(@PathVariable("id") Long id) {
		log.info("delCurrentAccount en CurrentAccountRestController");
		return currentAccountService.delCustomer(id);
	}
	
	@PutMapping(path = "/{id}/update", produces = "application/json")
	public @ResponseBody CurrentAccount updCurrentAccount(@RequestBody CurrentAccount currentAccount) {
		log.info("updCurrentAccount en CurrentAccountRestController");
		return currentAccountService.updCurrentAccount(currentAccount);
	}
}

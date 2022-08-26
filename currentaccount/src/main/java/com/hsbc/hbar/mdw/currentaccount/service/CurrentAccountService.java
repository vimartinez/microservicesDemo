package com.hsbc.hbar.mdw.currentaccount.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.hbar.mdw.currentaccount.model.CurrentAccount;
import com.hsbc.hbar.mdw.currentaccount.repository.CurrentAccountRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CurrentAccountService {
	@Autowired
	CurrentAccountRepository currentAccountRepository;

	public List<CurrentAccount> getAllCurrentAccounts() {
		log.info("getAllCurrentAccounts en CurrentAccountService");
		return currentAccountRepository.findAll();
	}

	public Optional<CurrentAccount> getCurrentAccountById(Long id) {
		log.info("getCurrentAccountById en CurrentAccountService");
		return currentAccountRepository.findById(id);
	}

	public CurrentAccount addCurrentAccount(CurrentAccount currentAccount) {
		log.info("addCurrentAccount en CurrentAccountService");
		return currentAccountRepository.save(currentAccount);
	}

	public CurrentAccount updCurrentAccount(CurrentAccount currentAccount) {
		log.info("updCurrentAccount en CurrentAccountService");
		return currentAccountRepository.save(currentAccount);
	}

	public String delCustomer(Long id) {
		log.info("delCustomer en CurrentAccountService");
		currentAccountRepository.deleteById(id);
		return "Cuenta Corriente id="+ Long.toString(id, 10) +" eliminada";
	}

	public Optional<CurrentAccount> getCurrentAccountByCustomerId(Long id) {
		log.info("getCurrentAccountByCustomerId en CurrentAccountService");
		return currentAccountRepository.findByClientNumber(id);
	}

}

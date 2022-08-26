package com.hsbc.hbar.mdw.financialaccounting.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.hbar.mdw.financialaccounting.model.FinancialAccounting;
import com.hsbc.hbar.mdw.financialaccounting.repository.FinancialAccountingRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class FinancialAccountingService {
	
	@Autowired 
	private FinancialAccountingRepository customerRepository;
	


	public List<FinancialAccounting> getAllCustomers() {
		log.info("getAllCustomers en CustomerService");
		return customerRepository.findAll();
	}


}

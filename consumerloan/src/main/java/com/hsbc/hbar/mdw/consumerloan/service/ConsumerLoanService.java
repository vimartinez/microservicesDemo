package com.hsbc.hbar.mdw.consumerloan.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.hbar.mdw.consumerloan.model.ConsumerLoan;
import com.hsbc.hbar.mdw.consumerloan.repository.ConsumerLoanRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsumerLoanService {
	
	@Autowired 
	private ConsumerLoanRepository customerRepository;
	


	public List<ConsumerLoan> getAllConsumerLoan() {
		log.info("getAllCustomers en CustomerService");
		return customerRepository.findAll();
	}

	public Optional<ConsumerLoan> getConsumerLoanById(Long id) {
		log.info("getCustomerById en CustomerService");
		return customerRepository.findById(id);
	}

	public ConsumerLoan addConsumerLoan(ConsumerLoan customer) {
		log.info("addCustomer en CustomerService");
		return customerRepository.save(customer);
	}

	public String delConsumerLoan(Long id) {
		log.info("delCustomer en CustomerService");
		//Customer customer = customerRepository.findById(id)
		//		.orElseThrow(() -> new CustomeroNotFoundException("Cliente id="+ Long.toString(id, 10) +" no encontrado, No se eliminó ningún registro"));
		//customerRepository.delete(customer);
		customerRepository.deleteById(id);
		return "Cliene id="+ Long.toString(id, 10) +"eliminado";
	}

	public ConsumerLoan updConsumerLoan(ConsumerLoan customer) {
		// TODO verificar si existe customer, actualizar solo los campos que no son null
		log.info("updCustomer en CustomerService");
		return customerRepository.save(customer);
	}

}

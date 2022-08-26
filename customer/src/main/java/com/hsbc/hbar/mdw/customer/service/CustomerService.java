package com.hsbc.hbar.mdw.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hsbc.hbar.mdw.VO.CurrentAccount;
import com.hsbc.hbar.mdw.customer.model.Customer;
import com.hsbc.hbar.mdw.customer.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {
	
	private static final String CurrentAccountAPI = "http://CURRENT-ACCOUNT-API/currentaccount/customer/";
	
	@Autowired 
	private CustomerRepository customerRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	public List<Customer> getAllCustomers() {
		log.info("getAllCustomers en CustomerService");
		return customerRepository.findAll();
	}

	public Optional<Customer> getCustomerById(Long id) {
		log.info("getCustomerById en CustomerService");
		return customerRepository.findById(id);
	}

	public Customer addCustomer(Customer customer) {
		log.info("addCustomer en CustomerService");
		return customerRepository.save(customer);
	}

	public String delCustomer(Long id) {
		log.info("delCustomer en CustomerService");
		//Customer customer = customerRepository.findById(id)
		//		.orElseThrow(() -> new CustomeroNotFoundException("Cliente id="+ Long.toString(id, 10) +" no encontrado, No se eliminó ningún registro"));
		//customerRepository.delete(customer);
		customerRepository.deleteById(id);
		return "Cliene id="+ Long.toString(id, 10) +"eliminado";
	}

	public Customer updCustomer(Customer customer) {
		// TODO verificar si existe customer, actualizar solo los campos que no son null
		log.info("updCustomer en CustomerService");
		return customerRepository.save(customer);
	}

	public Optional<CurrentAccount> getCustomegetAllCurrentAccountsByUserIdrById(Long id) {
		CurrentAccount currentAccount = restTemplate.getForObject(CurrentAccountAPI+id, CurrentAccount.class);
		return Optional.of(currentAccount);
	}

}

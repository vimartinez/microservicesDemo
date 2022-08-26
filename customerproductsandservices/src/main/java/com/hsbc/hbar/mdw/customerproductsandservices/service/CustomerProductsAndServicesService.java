package com.hsbc.hbar.mdw.customerproductsandservices.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.hbar.mdw.customerproductsandservices.model.CustomerProductsAndServices;
import com.hsbc.hbar.mdw.customerproductsandservices.repository.CustomerProductsAndServicesRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerProductsAndServicesService {
	
	@Autowired 
	private CustomerProductsAndServicesRepository customerRepository;
	


	public List<CustomerProductsAndServices> getAllCustomerProductsAndServices() {
		log.info("getAllCustomers en CustomerService");
		return customerRepository.findAll();
	}

	public Optional<CustomerProductsAndServices> getCustomerProductsAndServicesById(Long id) {
		log.info("getCustomerById en CustomerService");
		return customerRepository.findById(id);
	}

	public CustomerProductsAndServices addCustomerProductsAndServices(CustomerProductsAndServices customer) {
		log.info("addCustomer en CustomerService");
		return customerRepository.save(customer);
	}

	public String delCustomerProductsAndServices(Long id) {
		log.info("delCustomer en CustomerService");
		//Customer customer = customerRepository.findById(id)
		//		.orElseThrow(() -> new CustomeroNotFoundException("Cliente id="+ Long.toString(id, 10) +" no encontrado, No se eliminó ningún registro"));
		//customerRepository.delete(customer);
		customerRepository.deleteById(id);
		return "Cliene id="+ Long.toString(id, 10) +"eliminado";
	}

	public CustomerProductsAndServices updCustomerProductsAndServices(CustomerProductsAndServices customer) {
		// TODO verificar si existe customer, actualizar solo los campos que no son null
		log.info("updCustomer en CustomerService");
		return customerRepository.save(customer);
	}

}

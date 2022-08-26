package com.hsbc.hbar.mdw.customer.api.v1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.hbar.mdw.VO.CurrentAccount;
import com.hsbc.hbar.mdw.customer.model.Customer;
import com.hsbc.hbar.mdw.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerRestController {
	@Autowired CustomerService customerService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<Customer> getAllCustomers() {
		log.info("getAllCustomers en CustomerRestController");
		return customerService.getAllCustomers();
	}
	
	@GetMapping(value = "/{id}")
	public @ResponseBody Optional<Customer> getCustomerById(@PathVariable("id") Long id) {
		log.info("getCustomerById en CustomerRestController");
		return customerService.getCustomerById(id);
	}
	
	@GetMapping(value = "/{id}/currentacconunts")
	public @ResponseBody Optional<CurrentAccount> getAllCurrentAccountsByUserId(@PathVariable("id") Long id) {
		log.info("getAllCurrentAccountsByUserId en CustomerRestController");
		return customerService.getCustomegetAllCurrentAccountsByUserIdrById(id);
	}
	
	@PostMapping(path = "/", produces = "application/json")
	public @ResponseBody Customer addCustomer(@RequestBody Customer customer) {
		log.info("addCustomer en CustomerRestController");
		return customerService.addCustomer(customer);
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody String delCustomer(@PathVariable("id") Long id) {
		log.info("delCustomer en CustomerRestController");
		return customerService.delCustomer(id);
	}
	
	@PutMapping(path = "/", produces = "application/json")
	public @ResponseBody Customer updCustomer(@RequestBody Customer customer) {
		log.info("updCustomer en CustomerRestController");
		return customerService.updCustomer(customer);
	}
	

}

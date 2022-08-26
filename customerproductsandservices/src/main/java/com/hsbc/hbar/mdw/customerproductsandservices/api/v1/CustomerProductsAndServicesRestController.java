package com.hsbc.hbar.mdw.customerproductsandservices.api.v1;

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

import com.hsbc.hbar.mdw.customerproductsandservices.model.CustomerProductsAndServices;
import com.hsbc.hbar.mdw.customerproductsandservices.service.CustomerProductsAndServicesService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/CustomerProductsAndServices")
@Slf4j
public class CustomerProductsAndServicesRestController {
	@Autowired CustomerProductsAndServicesService customerService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<CustomerProductsAndServices> getAllCustomerProductsAndServices() {
		log.info("getAllCustomerProductsAndServices en CustomerProductsAndServicesRestController");
		return customerService.getAllCustomerProductsAndServices();
	}
	
	@GetMapping(value = "/{id}")
	public @ResponseBody Optional<CustomerProductsAndServices> getCustomerProductsAndServicesById(@PathVariable("id") Long id) {
		log.info("	public en CustomerProductsAndServicesRestController");
		return customerService.getCustomerProductsAndServicesById(id);
	}
	
	@PostMapping(path = "/", produces = "application/json")
	public @ResponseBody CustomerProductsAndServices addCustomerProductsAndServices(@RequestBody CustomerProductsAndServices customer) {
		log.info("addCustomerProductsAndServices en CustomerProductsAndServicesRestController");
		return customerService.addCustomerProductsAndServices(customer);
	}
	
	@DeleteMapping(path = "/{id}", produces = "application/json")
	public @ResponseBody String delCustomerProductsAndServices(@PathVariable("id") Long id) {
		log.info("delCustomerProductsAndServices en CustomerProductsAndServicesRestController");
		return customerService.delCustomerProductsAndServices(id);
	}
	
	@PutMapping(path = "/", produces = "application/json")
	public @ResponseBody CustomerProductsAndServices updCustomerProductsAndServices(@RequestBody CustomerProductsAndServices customer) {
		log.info("updCustomerProductsAndServices en CustomerProductsAndServicesRestController");
		return customerService.updCustomerProductsAndServices(customer);
	}
	
	@GetMapping(value = "/AddProduct/{id}")
	public @ResponseBody String AddProduct(@PathVariable("id") Long id) {
		log.info("AddProduct en CustomerProductsAndServicesRestController");
		return "Product Added for customer "+id;
	}
	

}

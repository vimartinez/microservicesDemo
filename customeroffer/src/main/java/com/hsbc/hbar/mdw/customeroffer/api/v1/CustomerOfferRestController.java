package com.hsbc.hbar.mdw.customeroffer.api.v1;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.hbar.mdw.customeroffer.model.CustomerOffer;
import com.hsbc.hbar.mdw.customeroffer.service.CustomerOfferService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/CustomerOffer")
@Slf4j
public class CustomerOfferRestController {
	@Autowired CustomerOfferService customerOfferService;
	
	@GetMapping(value = "/", produces = "application/json")
	public @ResponseBody List<CustomerOffer> getAllCustomerOffers() {
		log.info("Llamado a getAllCustomerOffers en CustomerOfferService");
		return customerOfferService.getAllCustomerOffers();
	}
	
	
	@PostMapping(path = "/Initiate", produces = "application/json")
	public @ResponseBody CustomerOffer addCustomerOffer(@RequestBody CustomerOffer customerOffer) {
		log.info("Llamada a addCustomerOffer en CustomerOfferRestController");
		return customerOfferService.addCustomerOffer(customerOffer);
	}
	
	@PostMapping(path = "/GenerateLoan/{id}", produces = "application/json")
	public @ResponseBody String addCustomerLoan(@PathVariable("id") Long clientId) {
		log.info("Llamada a addCustomerLoan en CustomerOfferRestController");
		return customerOfferService.addCustomerLoan(clientId);
	}

}

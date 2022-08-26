package com.hsbc.hbar.mdw.customeroffer.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hsbc.hbar.mdw.customeroffer.model.CustomerOffer;
import com.hsbc.hbar.mdw.customeroffer.repository.CustomerOfferRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerOfferService {
	
	private static final String CREDITMANAGEMENTAPI = "http://CREDIT-MANAGEMENT-API/CreditManagement/";
	private static final String FINANCIALACCOUNTINGAPI = "http://FINANCIAL-ACCOUNTING-API/FinancialAccounting/";
	private static final String CUSTOMERPRODANDSERVICESAPI = "http://CUSTOMER-PRODSANDSERV-API/CustomerProductsAndServices/";
	private static final String CONSUMERLOANAPI = "http://CONSUMER-LOAN-API/ConsumerLoan/";
	
	@Autowired 
	private CustomerOfferRepository customerOfferRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	

	public List<CustomerOffer> getAllCustomerOffers() {
		log.info("Llamada a getAllCustomerOffers en CustomerOfferService");
		return customerOfferRepository.findAll();
	}


	public CustomerOffer addCustomerOffer(CustomerOffer customerOffer) {
		log.info("addCustomerOffer en CustomerOfferService");
		return customerOfferRepository.save(customerOffer);
	}


	public String addCustomerLoan(Long id) {
		String res;
		log.info("addCustomerLoan en CustomerOfferService");
		log.info("Consultando Credit Management API");
		res =  restTemplate.getForObject(CREDITMANAGEMENTAPI+"VerifyCustomerCredit/"+id, String.class);
		res +=  restTemplate.getForObject(FINANCIALACCOUNTINGAPI+"VerifyFinancialAccounting/"+id, String.class);
		res +=  restTemplate.getForObject(CUSTOMERPRODANDSERVICESAPI+"AddProduct/"+id, String.class);
		res +=  restTemplate.getForObject(CONSUMERLOANAPI+"GenerateLoan/"+id, String.class);
		return res;
	}


}

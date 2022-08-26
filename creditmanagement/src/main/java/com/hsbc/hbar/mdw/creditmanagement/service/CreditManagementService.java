package com.hsbc.hbar.mdw.creditmanagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hsbc.hbar.mdw.creditmanagement.model.CreditManagement;
import com.hsbc.hbar.mdw.creditmanagement.repository.CreditManagementRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CreditManagementService {
	
	@Autowired 
	private CreditManagementRepository creditManagementRepository;
	


	public List<CreditManagement> getAllCreditManagements() {
		log.info("getAllCreditManagements en CreditManagementService");
		return creditManagementRepository.findAll();
	}

	public Optional<CreditManagement> getCreditManagementById(Long id) {
		log.info("getCreditManagementById en CreditManagementService");
		return creditManagementRepository.findById(id);
	}

	public CreditManagement addCreditManagement(CreditManagement creditManagement) {
		log.info("addCreditManagement en CreditManagementService");
		return creditManagementRepository.save(creditManagement);
	}

	public String delCreditManagement(Long id) {
		log.info("Llamada a delCreditManagement en CreditManagementService");
		//Customer customer = customerRepository.findById(id)
		//		.orElseThrow(() -> new CustomeroNotFoundException("Cliente id="+ Long.toString(id, 10) +" no encontrado, No se eliminó ningún registro"));
		//customerRepository.delete(customer);
		creditManagementRepository.deleteById(id);
		return "CreditManagement id="+ Long.toString(id, 10) +"eliminado";
	}

	public CreditManagement updCreditManagement(CreditManagement customer) {
		// TODO verificar si existe y actualizar solo los campos que no son null
		log.info("Llamada a updCustomer en CreditManagementService");
		return creditManagementRepository.save(customer);
	}




}

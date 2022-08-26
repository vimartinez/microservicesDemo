package com.hsbc.hbar.mdw.customerproductsandservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.customerproductsandservices.model.CustomerProductsAndServices;

public interface CustomerProductsAndServicesRepository extends JpaRepository<CustomerProductsAndServices, Long> {

}

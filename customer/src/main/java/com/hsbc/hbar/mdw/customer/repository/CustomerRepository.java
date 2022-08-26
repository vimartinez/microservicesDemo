package com.hsbc.hbar.mdw.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.customer.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}

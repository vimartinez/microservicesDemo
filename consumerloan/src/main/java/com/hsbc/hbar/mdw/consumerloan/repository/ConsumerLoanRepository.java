package com.hsbc.hbar.mdw.consumerloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.consumerloan.model.ConsumerLoan;

public interface ConsumerLoanRepository extends JpaRepository<ConsumerLoan, Long> {

}

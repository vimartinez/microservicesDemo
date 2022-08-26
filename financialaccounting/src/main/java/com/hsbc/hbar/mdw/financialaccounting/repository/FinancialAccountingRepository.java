package com.hsbc.hbar.mdw.financialaccounting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.financialaccounting.model.FinancialAccounting;

public interface FinancialAccountingRepository extends JpaRepository<FinancialAccounting, Long> {

}

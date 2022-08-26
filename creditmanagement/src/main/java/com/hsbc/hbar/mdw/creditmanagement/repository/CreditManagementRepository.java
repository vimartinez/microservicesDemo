package com.hsbc.hbar.mdw.creditmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.creditmanagement.model.CreditManagement;

public interface CreditManagementRepository extends JpaRepository<CreditManagement, Long> {

}

package com.hsbc.hbar.mdw.currentaccount.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.currentaccount.model.CurrentAccount;

public interface CurrentAccountRepository extends JpaRepository<CurrentAccount, Long> {

	Optional<CurrentAccount> findByClientNumber(Long id);

}

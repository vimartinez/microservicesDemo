package com.hsbc.hbar.mdw.customeroffer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.hbar.mdw.customeroffer.model.CustomerOffer;

public interface CustomerOfferRepository extends JpaRepository<CustomerOffer, Long> {

}
